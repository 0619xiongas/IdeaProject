package com.example.sqlite;

//用于操作数据库的增删改查

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.example.*;

import java.net.ContentHandler;

public class Dao {

    private final DatabaseHelper mhelper;


    public Dao(Context context){
        //创建数据库
        mhelper = new DatabaseHelper(context);
    }
    //产生num1-num2之间的伪随机数
    public int GetEvenNum(int num1,int num2){
        int s=(int)num1+(int)(Math.random()*(num2-num1));
        return s;
    }

/*
    public void insert(){};;
    public void delete(){}
    public void update(){}
*/

    //如果前面设置一个变量  就控制
    public Question query_one() {
        SQLiteDatabase db = mhelper.getWritableDatabase();
        Question q = new Question();
        Cursor cursor = db.query(Constants.TABLE_NAME_one, null, null, null, null, null, null);
        while (cursor.moveToFirst() != false) {
            int random = GetEvenNum(1, 75);
            if (cursor.moveToPosition(random) != false) {
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setA(cursor.getString(2));
                q.setB(cursor.getString(3));
                q.setC(cursor.getString(4));
                q.setD(cursor.getString(5));
                q.setAnwser(cursor.getString(6));
                cursor.close();
                db.close();
            }
        }
        return q;
    }
    public Question query_two(){
        SQLiteDatabase db = mhelper.getWritableDatabase();
        Question q = new Question();
        Cursor cursor = db.query(Constants.TABLE_NAME_two,null,null,null,null,null,null);
        while (cursor.moveToFirst() != false){
            int random =GetEvenNum(1,43);
            if(cursor.moveToPosition(random)!=false){
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setA(cursor.getString(2));
                q.setB(cursor.getString(3));
                q.setC(cursor.getString(4));
                q.setD(cursor.getString(5));
                q.setAnwser(cursor.getString(6));
                cursor.close();
                db.close();
            }
        }
        return q;
    }
    

    public Question query_three(){
        SQLiteDatabase db = mhelper.getWritableDatabase();
        Question q = new Question();
        Cursor cursor = db.query(Constants.TABLE_NAME_three,null,null,null,null,null,null);
        while (cursor.moveToFirst() != false){
            int random =GetEvenNum(1,57);
            if(cursor.moveToPosition(random)!=false){
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setA(cursor.getString(2));
                q.setB(cursor.getString(3));
                q.setC(cursor.getString(4));
                q.setD(cursor.getString(5));
                q.setAnwser(cursor.getString(6));
                cursor.close();
                db.close();
            }
        }
        return q;
    }
    public Question query_four(){
        SQLiteDatabase db = mhelper.getWritableDatabase();
        Question q = new Question();
        Cursor cursor = db.query(Constants.TABLE_NAME_four,null,null,null,null,null,null);
        while (cursor.moveToFirst() != false){
            int random =GetEvenNum(1,43);
            if(cursor.moveToPosition(random)!=false){
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setA(cursor.getString(2));
                q.setB(cursor.getString(3));
                q.setC(cursor.getString(4));
                q.setD(cursor.getString(5));
                q.setAnwser(cursor.getString(6));
                cursor.close();
                db.close();
            }
        }
        return  q;
    }
    public Question show(String table){
        SQLiteDatabase db = mhelper.getWritableDatabase();
        Question q = new Question();
        Cursor cursor = db.query(table,null,null,null,null,null,null);
        while (cursor.moveToFirst() != false){
            int random =GetEvenNum(1,10);
            if(cursor.moveToPosition(random)!=false){
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setA(cursor.getString(2));
                q.setB(cursor.getString(3));
                q.setC(cursor.getString(4));
                q.setD(cursor.getString(5));
                q.setAnwser(cursor.getString(6));
                cursor.close();
                db.close();
            }
        }
        return  q;
    }
}
