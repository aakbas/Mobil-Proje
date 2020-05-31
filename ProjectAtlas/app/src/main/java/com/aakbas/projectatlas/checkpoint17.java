package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkpoint17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint17);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Button btnRelation=(Button) findViewById(R.id.btnCheckpoint19) ;
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=17");
        int KaraIX=cursor.getColumnIndex("karaRelation");
        int relationCheck=0;
        while (cursor.moveToNext()){
            relationCheck=cursor.getInt(KaraIX);
        }
        if(relationCheck==4){
            btnRelation.setEnabled(true);
        }
        else{
            btnRelation.setEnabled(false);
        }
    }

    public void checkpoint18(View view){
        Intent intent=new Intent(checkpoint17.this,checkpoint18.class);
        startActivity(intent);
    }
    public void checkpoint19(View view){
        Intent intent=new Intent(checkpoint17.this,checkpoint19.class);
        startActivity(intent);
    }
    public void checkpoint20(View view){
        Intent intent=new Intent(checkpoint17.this,checkpoint20.class);
        startActivity(intent);
    }

}
