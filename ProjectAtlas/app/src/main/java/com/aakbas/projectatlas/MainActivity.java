package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int loadCheck=0;
        Button btnLoadGame=(Button) findViewById(R.id.btnLoadGame);
           btnLoadGame.setEnabled(false);
        try {
            SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS savedata (saveID INT,checkpoint INT,hankRelation INT,karaRelation INT,northRelation INT,oracleRelation INT,eventCheck INT)");


            Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);


            int checkpointIx=cursor.getColumnIndex("checkpoint");

            while (cursor.moveToNext()){
                System.out.println("deneme:"+cursor.getInt(checkpointIx));
                loadCheck=cursor.getInt(checkpointIx);
            }

            System.out.println("kontrol:"+loadCheck);
            if (loadCheck>1)
            {
                btnLoadGame.setEnabled(true);
            }
            else{
                btnLoadGame.setEnabled(false);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }


    public void NewGame(View view){

        Intent intent=new Intent(MainActivity.this,checkpoint1.class);
        startActivity(intent);

    }

    public void LoadGame(View view){
        int checkpoint=0;
        SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
        int checkpointIX=cursor.getColumnIndex("karaRelation");

        while (cursor.moveToNext()){
            checkpoint=cursor.getInt(checkpointIX);
        }
        if(checkpoint<10){
            Intent intent=new Intent(MainActivity.this,checkpoint1.class);
            startActivity(intent);
        }else if(checkpoint<=17){
            Intent intent=new Intent(MainActivity.this,checkpoint11.class);
            startActivity(intent);
        }else{
            Intent intent=new Intent(MainActivity.this,checkpoint1.class);
            startActivity(intent);
        }

    }

    public void AboutMe(View view){
        Intent intent=new Intent(MainActivity.this,AboutMe.class);
        startActivity(intent);

    }




}
