package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class yu extends SQLiteOpenHelper {
    public final Context ouw;

    public yu(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ouw = context;
    }

    private static ArrayList<String> lh(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static void ouw(SQLiteDatabase sQLiteDatabase) {
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw.vt(pno.vt().f11815ra.vt()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu.lh(pno.vt().f11815ra.ouw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra.lh(pno.vt().f11815ra.yu()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le.ouw(pno.vt().f11815ra.fkw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.le.le.vt());
    }

    private static void vt(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListLh = lh(sQLiteDatabase);
        if (arrayListLh.size() > 0) {
            Iterator<String> it = arrayListLh.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ouw(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            if (i10 > i11) {
                vt(sQLiteDatabase);
                ouw(sQLiteDatabase);
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                return;
            }
            ouw(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}
