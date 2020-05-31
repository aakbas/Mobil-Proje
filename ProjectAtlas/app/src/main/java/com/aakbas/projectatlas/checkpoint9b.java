package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class checkpoint9b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint9b);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=9,hankRelation=0,karaRelation=2,northRelation=0,oracleRelation=0,eventCheck=0");
        Toast.makeText(getApplicationContext(),"Kara Bunu Hatırlayacak...",Toast.LENGTH_LONG).show();

    }

    public void Checkpoint11(View view){
        Intent intent=new Intent(checkpoint9b.this,checkpoint11.class);
        startActivity(intent);
    }
}
