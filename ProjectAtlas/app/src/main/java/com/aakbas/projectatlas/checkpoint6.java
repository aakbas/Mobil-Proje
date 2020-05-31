package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkpoint6 extends AppCompatActivity {
    int eventCheck=0;
    int slowCheck=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint6);
        Button btnBisiklet=(Button) findViewById(R.id.btnCheckpoint7);
        Intent i=getIntent();
        eventCheck=0;
        slowCheck=0;
        eventCheck=i.getIntExtra("eventCheck",0);
        slowCheck=i.getIntExtra("slowCheck",0);
        System.out.println("aaaa:"+eventCheck);
        try{


            SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
            Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
            if (eventCheck == 0) {
                database.execSQL("UPDATE savedata SET saveID=1,checkpoint=6,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=0");
                System.out.println("hızlı deneme");
            }
            else{
                database.execSQL("UPDATE savedata SET saveID=1,checkpoint=6,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=1");
                System.out.println("event deneme");

            }


            if(slowCheck!=0){
                btnBisiklet.setEnabled(false);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public void Checkpoint7(View view){
        Intent intent=new Intent(checkpoint6.this,checkpoint7.class);
        startActivity(intent);
    }
    public void Checkpoint8(View view){
        Intent intent=new Intent(checkpoint6.this,checkpoint8.class);
        startActivity(intent);
    }








}
