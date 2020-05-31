package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class checkpoint18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint18);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Button btnRelation=(Button) findViewById(R.id.btnCheckpoint20a) ;
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=18");
        int KaraIX=cursor.getColumnIndex("karaRelation");
        int relationCheck=0;
        while (cursor.moveToNext()){
            relationCheck=cursor.getInt(KaraIX);
        }
        if(relationCheck>=2){
            btnRelation.setEnabled(true);
        }
        else{
            btnRelation.setEnabled(false);
        }
    }
    public void btnLie(View view){
        Random r = new Random();
        int roll = r.nextInt(100 - 1) + 1;
        if(roll >20){
            Intent intent=new Intent(checkpoint18.this,checkpoint21.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(checkpoint18.this,GameOver1.class);
            startActivity(intent);
        }

    }
    public void btnRelation(View view){
        Toast.makeText(getApplicationContext(),"Kara sana yardım etti...",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(checkpoint18.this,checkpoint21.class);
        startActivity(intent);
    }
}
