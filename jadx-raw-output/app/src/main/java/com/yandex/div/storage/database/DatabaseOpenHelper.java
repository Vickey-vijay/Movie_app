package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: compiled from: DatabaseOpenHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface DatabaseOpenHelper {

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface CreateCallback {
        void onCreate(Database database);
    }

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface Database extends Closeable {
        void beginTransaction();

        SQLiteStatement compileStatement(String str);

        void endTransaction();

        void execSQL(String str);

        Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6);

        Cursor rawQuery(String str, String[] strArr);

        void setTransactionSuccessful();
    }

    /* JADX INFO: compiled from: DatabaseOpenHelper.kt */
    public interface UpgradeCallback {
        void onUpgrade(Database database, int i10, int i11);
    }

    Database getReadableDatabase();

    Database getWritableDatabase();
}
