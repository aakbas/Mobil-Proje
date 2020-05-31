package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class checkpoint8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint8);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=8,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0");

    }

    public void BusOptFast(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;

        if(roll>60){
            Intent intent=new Intent(checkpoint8.this,checkpoint9.class);
            startActivity(intent);
        }else{
            Intent intent=new Intent(checkpoint8.this,checkpoint10.class);
            startActivity(intent);
        }


    }
    public void BusOptSlow(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;

        if(roll>50){
            Intent intent=new Intent(checkpoint8.this,checkpoint9.class);
            startActivity(intent);
        }else{
            Intent intent=new Intent(checkpoint8.this,checkpoint10.class);
            startActivity(intent);
        }


    }
}
