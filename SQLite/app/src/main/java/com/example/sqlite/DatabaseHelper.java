package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     *
     * @param context 上下文
     * @name    数据库名称
     * @factory  游标工厂
     * @version   版本号
     */
    public DatabaseHelper(Context context) {
        super(context,Constants.DATABASE_NAME,null,Constants.VERSION_CODE);
    }


    //第一次创建数据库被调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建时的回调
        //创建字段
        throw new Error("Unresolved compilation problems: The import android cannot be resolved");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //升级数据库时的回调

    }
}
