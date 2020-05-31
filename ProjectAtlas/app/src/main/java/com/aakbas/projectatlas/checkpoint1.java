package com.aakbas.projectatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class checkpoint1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkpoint1);

        try{
         SQLiteDatabase database=this.openOrCreateDatabase("SAVE",MODE_PRIVATE,null);
            Cursor cursor=database.rawQuery("SELECT * FROM savedata",null);
            int checkpointIx=cursor.getColumnIndex("checkpoint");
            int saveCheck=0;
            while (cursor.moveToNext()){
                saveCheck=cursor.getInt(checkpointIx);
                System.out.println("deneme:"+cursor.getInt(checkpointIx));
            }

            if(saveCheck>=1){
              database.execSQL("CREATE TABLE IF NOT EXISTS savedata (saveID INT,checkpoint INT,hankRelation INT,karaRelation INT,northRelation INT,oracleRelation INT,eventCheck INT)");
                 database.execSQL("UPDATE savedata SET saveID=1,checkpoint=1,hankRelation=0,karaRelation=0,northRelation=0,oracleRelation=0,eventCheck=0");

            }
            else{
               database.execSQL("CREATE TABLE IF NOT EXISTS savedata (saveID INT,checkpoint INT,hankRelation INT,karaRelation INT,northRelation INT,oracleRelation INT,eventCheck INT)");
                 database.execSQL("INSERT INTO savedata (saveID,checkpoint,hankRelation,karaRelation,northRelation,oracleRelation,eventCheck) VALUES (1,1,0,0,0,0,0)" );
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }





    }

    public void Checkpoint2(View view){

        Intent intent=new Intent(checkpoint1.this,checkpoint2.class);


        startActivity(intent);

    }
    public void Checkpoint3(View view){


       Intent intent=new Intent(checkpoint1.this,checkpoint3.class);

       startActivity(intent);
    }

}
