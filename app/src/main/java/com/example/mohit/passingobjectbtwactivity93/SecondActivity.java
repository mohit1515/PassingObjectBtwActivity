package com.example.mohit.passingobjectbtwactivity93;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tname, tdesig, tnumb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tname = findViewById(R.id.txtname);
        tdesig = findViewById(R.id.txtdesig);
        tnumb = findViewById(R.id.txtnum);

        //getting object which is passing from first activity
        Student s =getIntent().getParcelableExtra("Stu_name");
        String name = s.getName();
        String desig = s.getDesig();
        String number = s.getNumber();

        tname.setText(name);
        tdesig.setText(desig);
        tnumb.setText(number);

    }
}
