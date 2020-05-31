package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class checkpoint12 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint12);
        Button btnTanit=(Button)findViewById(R.id.btnCheckpoint14);
        Button btnYardim=(Button)findViewById(R.id.btnCheckpoint16);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=11");
        int KaraIX=cursor.getColumnIndex("karaRelation");
        int relationCheck=0;
        while (cursor.moveToNext()){
            relationCheck=cursor.getInt(KaraIX);
        }
        if(relationCheck>=2){
            btnTanit.setEnabled(false);
        }
        else{
            btnYardim.setEnabled(false);
        }
    }
    public void Checkpoint14(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >70){
            Intent intent=new Intent(checkpoint12.this,checkpoint14.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint12.this,checkpoint15.class);
            startActivity(intent);
        }
    }
    public void Checkpoint15(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll>80){
         Intent intent=new Intent(checkpoint12.this,checkpoint14.class);
         startActivity(intent);

        }
        else{
           Intent intent=new Intent(checkpoint12.this,checkpoint15.class);
           startActivity(intent);
        }
    }
    public void Checkpoint16(View view){
        Intent intent=new Intent(checkpoint12.this,checkpoint16.class);
        startActivity(intent);
    }
}
