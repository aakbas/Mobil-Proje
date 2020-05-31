package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class checkpoint21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint21);
    }
     public void Checkpoint22(View view){
         Random r = new Random();
         int roll = r.nextInt(100 - 1) + 1;
         if(roll >40){
             Intent intent=new Intent(checkpoint21.this,checkpoint22.class);
             startActivity(intent);
         }
         else{
             Intent intent=new Intent(checkpoint21.this,GameOver2.class);
             startActivity(intent);
         }
     }
     public void Checkpoint23(View view){
         Random r = new Random();
         int roll = r.nextInt(100 - 1) + 1;
         if(roll >10){
             Intent intent=new Intent(checkpoint21.this,checkpoint22.class);
             startActivity(intent);
         }
         else{
             Intent intent=new Intent(checkpoint21.this,GameOver2.class);
             startActivity(intent);
         }
     }

}
