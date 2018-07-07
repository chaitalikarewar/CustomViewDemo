package com.example.felix_its.customeviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends Activity {
    DatePicker datePicker;
    Button btnChangeDate;
    TextView txtLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        txtLabel=(TextView)findViewById(R.id.txtLabel);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        btnChangeDate=(Button)findViewById(R.id.btnChangeDate);

        txtLabel.setText("Current Date: "+getCurrentDate());

        btnChangeDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                txtLabel.setText("Change Date: "+getCurrentDate());
            }

        });

    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((datePicker.getMonth() + 1)+"/");//month is 0 based
        builder.append(datePicker.getDayOfMonth()+"/");
        builder.append(datePicker.getYear());
        return builder.toString();
    }
}
