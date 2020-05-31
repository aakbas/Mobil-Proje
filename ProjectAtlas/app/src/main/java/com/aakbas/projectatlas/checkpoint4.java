package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class checkpoint4 extends AppCompatActivity {
    int counter=5;
    int activityCheck=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_checkpoint4);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=4,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=0");

           activityCheck=0;
        final TextView counttime=findViewById(R.id.counttime);
     final CountDownTimer countdown= new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                counttime.setText(String.valueOf(counter));
                counter--;
                if (activityCheck == 1) {
                    this.cancel();
                }
            }

            @Override

            public void onFinish() {

                    Intent intent=new Intent(checkpoint4.this,checkpoint6.class);
                    intent.putExtra("eventCheck",1);
                    intent.putExtra("slowCheck",1);
                    startActivity(intent);
                     //event kontrol eklenicek!!!!!

            }
        }.start();



    }


    public void RigthChoice(View view){

        Intent intent=new Intent(checkpoint4.this,checkpoint6.class);
        intent.putExtra("eventCheck",0);
        intent.putExtra("slowCheck",1);
        startActivity(intent);
        activityCheck=1;
       checkpoint4.this.finish();


    }
    public void EventChoice(View view){

        Intent intent=new Intent(checkpoint4.this,checkpoint6.class);
        intent.putExtra("eventCheck",1);
        intent.putExtra("slowCheck",1);
        activityCheck=1;
        // event query ekle!
        startActivity(intent);
        checkpoint4.this.finish();
    }
}
