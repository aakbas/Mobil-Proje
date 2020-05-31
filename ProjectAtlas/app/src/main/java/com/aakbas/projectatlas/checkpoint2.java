package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class checkpoint2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint2);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=2,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=0");

    }

    public void Checkpoint4(View view){
        Intent intent=new Intent(checkpoint2.this,checkpoint4.class);
        startActivity(intent);

    }
    public void  Checkpoint5(View view){
        Intent intent=new Intent(checkpoint2.this,checkpoint5.class);
        startActivity(intent);

    }



}
