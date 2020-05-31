package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class checkpoint22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint22);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Button btnKaraRelation=(Button) findViewById(R.id.btnKaraRelation) ;
        Button btnHankRelation=(Button) findViewById(R.id.btnHankRelation);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=17");
        int KaraIX=cursor.getColumnIndex("karaRelation");
        int HankIX=cursor.getColumnIndex("hankRelation");
        int KaraRelationCheck=0;
        int HankRelationCheck=0;
        while (cursor.moveToNext()){
            KaraRelationCheck=cursor.getInt(KaraIX);
            HankRelationCheck=cursor.getInt(HankIX);
        }
        if(KaraRelationCheck==4){
            btnKaraRelation.setEnabled(true);
        }
        else{
            btnKaraRelation.setEnabled(false);
        }
        if(HankRelationCheck==2){
            btnHankRelation.setEnabled(true);
        }else{
            btnHankRelation.setEnabled(false);
        }
    }
    public void HankRelation(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >25){
            Intent intent=new Intent(checkpoint22.this,GoodEnding.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint22.this,BadEnding.class);
            startActivity(intent);
        }
    }
    public void KaraRelation(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >60){
            Intent intent=new Intent(checkpoint22.this,GoodEnding.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint22.this,BadEnding.class);
            startActivity(intent);
        }
    }
    public void defaultChoice(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >50){
            Intent intent=new Intent(checkpoint22.this,GoodEnding.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint22.this,BadEnding.class);
            startActivity(intent);
        }
    }
}
