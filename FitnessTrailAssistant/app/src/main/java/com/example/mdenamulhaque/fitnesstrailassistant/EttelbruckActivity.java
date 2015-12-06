package com.example.mdenamulhaque.fitnesstrailassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EttelbruckActivity extends AppCompatActivity {
    /*public static RadioGroup radio_group;
    public static RadioButton radio_b;
    public static Button bt_show;*/
    //public  RadioGroup genderRadioGroup;

    /*private RadioGroup rdg;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private RadioButton radio5;
    private RadioButton radio6;
    private RadioButton radio7;
    private String selectedType="";
    private Button Search;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ettelbruck);

        //genderRadioGroup = (RadioGroup) findViewById(R.id.radioGroup_1);

        //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        //final  String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();


        /*radio_group=(RadioGroup) findViewById(R.id.radioGroup_1);
        bt_show=(Button)findViewById(R.id.button2_show_itinerary1);
        int selected_id=radio_group.getCheckedRadioButtonId();
        radio_b=(RadioButton)findViewById(selected_id);*/


        //Button btn = (Button) findViewById(R.id.button2_show_itinerary1);
        /*btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //enter code here for your control and
                Intent intent = new Intent(getApplicationContext(), your.class);
                intent.putExtra("radioGroup1Selected", selectedRadioValue);
                intent.putExtra("radioGroup2Selected", selectedRadioValue2);
                startActivity(intent);
            }
        });*/

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EttelbruckActivity.this, MapEttelbruck.class);
                intent.putExtra("radioGroup1Selected", selectedRadioValue);
                //intent.putExtra("radioGroup2Selected", selectedRadioValue2);
                startActivity(intent);
            }
        });*/
    }


    public void clickShowItinerary1(View view){
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();
        //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        //int checked = rg.getCheckedRadioButtonId();


        /*boolean checked = ((RadioButton) view).isChecked();

        String str; // store the text corresponding to  the RadioButton which is clicked

        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    str = "button1Text";
                break;
            case R.id.radioButton2:
                if (checked) str = "button2Text";
                break;
            case R.id.radioButton3:
                if (checked) str = "button3Text";
                break;
        }*/
        /*Bundle b = new Bundle();
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("gender", radioButton.getText().toString());*/

        /*radio_group=(RadioGroup) findViewById(R.id.radioGroup_1);
        bt_show=(Button)findViewById(R.id.button2_show_itinerary1);
        int selected_id=radio_group.getCheckedRadioButtonId();
        //radio_b=(RadioButton)findViewById(selected_id);*/
        //Toast.makeText(EttelbruckActivity.this,radio_b.getText().toString(),Toast.LENGTH_LONG);
        //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup_1);
        //String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();

        Intent mapEttelbruckIntent=new Intent(EttelbruckActivity.this,MapEttelbruck.class);
        //mapEttelbruckIntent.putExtra("radioGroup1Selected",selectedRadioValue);
        mapEttelbruckIntent.putExtra("radioGroup1Selected", selectedRadioValue);
        //mapEttelbruckIntent.putExtra("checked", checked);
        //mapEttelbruckIntent.putExtras(b);
        startActivity(mapEttelbruckIntent);

        /*choice = (String)county.getSelectedItem();
        int id = ((RadioGroup)findViewById( R.id.radio_group )).getCheckedRadioButtonId();
        atmos = getAtmos( id );*/





   }

}
