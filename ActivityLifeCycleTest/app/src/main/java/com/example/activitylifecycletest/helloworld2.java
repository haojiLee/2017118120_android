package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helloworld2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld2_layout);

        Button startHelloworld3Activity=(Button) findViewById(R.id.start_helloworld3_activity);
        startHelloworld3Activity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(helloworld2.this, helloworld3.class);
                startActivity(intent);
            }
        });

        Button startHelloworld1Activity=(Button) findViewById(R.id.start_helloworld1_activity);
        startHelloworld1Activity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(helloworld2.this, helloworld1.class);
                startActivity(intent);
            }
        });
    }
}
