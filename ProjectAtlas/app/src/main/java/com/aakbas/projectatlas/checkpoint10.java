package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class checkpoint10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint10);
        int eventCheck=0;
        TextView eventText=(TextView) findViewById(R.id.txtShoeEvent);
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        int eventCheckIx=cursor.getColumnIndex("eventCheck");
        while (cursor.moveToNext()){
            eventCheck=cursor.getInt(eventCheckIx);
        }

        if (eventCheck==0){
            eventText.setVisibility(TextView.INVISIBLE);
        }else{
            eventText.setVisibility(TextView.VISIBLE);
        }


        database.execSQL("UPDATE savedata SET saveID=1,checkpoint=10,hankRelation=2,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=0");
        Toast.makeText(getApplicationContext(),"Hank Bunu Hatırlayacak...",Toast.LENGTH_LONG).show();

    }
    public void Checkpoint11(View view){
        Intent intent=new Intent(checkpoint10.this,checkpoint11.class);
        startActivity(intent);
    }
}
