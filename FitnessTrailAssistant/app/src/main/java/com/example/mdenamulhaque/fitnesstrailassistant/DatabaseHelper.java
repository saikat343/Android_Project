package com.example.mdenamulhaque.fitnesstrailassistant;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MDENAMULHAQUE on 16/12/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="FitnessTrailDb.db";
    public static final String TABLE_NAME="ettelbruck_table";
    public static final String col_1="ID";
    public static final String col_2="START_LATITUDE";
    public static final String col_3="START_LONGITUDE";
    public static final String col_4="FINISH_LATITUDE";
    public static final String col_5="FINISH_LONGITUDE";
    public static final String col_6="END_LATITUDE";
    public static final String col_7="END_LONGITUDE";
    public static final String col_8="TRACK_ROUTE";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //------Use for database create----------//
        //SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,START_LATITUDE TEXT,START_LONGITUDE TEXT,FINISH_LATITUDE TEXT,FINISH_LONGITUDE TEXT,END_LATITUDE TEXT,END_LONGITUDE TEXT,TRACK_ROUTE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }

    public  boolean insertData(String start_lat,String finish_lat,String end_lat,String finishing_point,String track_route){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col_2,start_lat);
        contentValues.put(col_4,finish_lat);
        contentValues.put(col_6,end_lat);
        contentValues.put(col_7,finishing_point);
        contentValues.put(col_8,track_route);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if (result== -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;

    }

}
