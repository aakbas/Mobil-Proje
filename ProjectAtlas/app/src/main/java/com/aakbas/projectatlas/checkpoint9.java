package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class checkpoint9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint9);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=9,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0");
    }

    public void Checkpoint9A(View view){
        Intent intent =new Intent(checkpoint9.this,checkpoint9a.class);
        startActivity(intent);
    }
    public void Checkpoint9B(View view){
        Intent intent =new Intent(checkpoint9.this,checkpoint9a.class);
        startActivity(intent);
    }
}
