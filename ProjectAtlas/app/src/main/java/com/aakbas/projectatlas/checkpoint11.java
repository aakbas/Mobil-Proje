package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class checkpoint11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint11);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=11");
    }

    public void Checkpoint13(View view){
        Intent intent=new Intent(checkpoint11.this,checkpoint13.class);
        startActivity(intent);
    }
    public void Checkpoint12(View view){
        Intent intent=new Intent(checkpoint11.this,checkpoint12.class);
        startActivity(intent);
    }

}
