package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helloworld3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld3_layout);

        Button startHelloworld2Activity=(Button) findViewById(R.id.start_helloworld2_activity);
        startHelloworld2Activity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(helloworld3.this, helloworld2.class);
                startActivity(intent);
            }
        });

        Button startHelloworld1Activity=(Button) findViewById(R.id.start_helloworld1_activity);
        startHelloworld1Activity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(helloworld3.this, helloworld1.class);
                startActivity(intent);
            }
        });
    }
}
