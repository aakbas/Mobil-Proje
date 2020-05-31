package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class checkpoint20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint20);
    }
    public void Run(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >85){
            Intent intent=new Intent(checkpoint20.this,checkpoint21.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint20.this,GameOver1.class);
            startActivity(intent);
        }

    }
}
