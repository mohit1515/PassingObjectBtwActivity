package com.example.mohit.passingobjectbtwactivity93;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ename, edesig,enumb;
    Button bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ename = findViewById(R.id.edtname);
        edesig = findViewById(R.id.edtdesig);
        enumb = findViewById(R.id.edtnumber);
        bttn = findViewById(R.id.btnsub);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ename.getText().toString().trim();
                String designation = edesig.getText().toString().trim();
                String number = enumb.getText().toString().trim();

                Student s= new Student(name, designation, number);

                Intent intent =new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("Stu_key", (Parcelable) s);
                startActivity(intent);
            }
        });
    }
}
