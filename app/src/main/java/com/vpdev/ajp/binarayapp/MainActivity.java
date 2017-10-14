package com.vpdev.ajp.binarayapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText editText_javanum ;
    private Button convert_button ;
    private TextView result_Textview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //bind layout and activity
        //binding variables
        editText_javanum= (EditText) findViewById(R.id.edittext_number);
        convert_button=(Button)findViewById(R.id.button_convert);
        result_Textview=(TextView)findViewById(R.id.textview_result);
        // creating a OnclickListener for the convert_button
       View.OnClickListener click_convert=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert() ;

            }
        };
        convert_button.setOnClickListener(click_convert) ;//setting the button OnclickListener .


    }
    public void convert()// void that converts and displays the converted decimal number to binary
    {
        String Number ;
        String result ;
        Number=editText_javanum.getText().toString().trim();
        result=Integer.toBinaryString(Integer.parseInt(Number));
        result_Textview.setText(result);

    }

}
