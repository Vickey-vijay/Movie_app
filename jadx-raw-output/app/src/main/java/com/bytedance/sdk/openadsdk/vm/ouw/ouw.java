package com.bytedance.sdk.openadsdk.vm.ouw;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ouw extends SQLiteOpenHelper {
    private static volatile ouw vt;
    public final Context ouw;

    public static SQLiteDatabase ouw() {
        try {
            ouw ouwVarLh = lh();
            if (ouwVarLh == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = ouwVarLh.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase vt() {
        try {
            ouw ouwVarLh = lh();
            if (ouwVarLh == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = ouwVarLh.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    private ouw(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ouw = context;
    }

    private static ouw lh() {
        if (vt == null) {
            synchronized (ouw.class) {
                if (vt == null) {
                    vt = new ouw(com.bytedance.sdk.openadsdk.vm.ouw.ouw());
                }
            }
        }
        return vt;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            ko.vt("MonitorSQLiteOpenHelper", "onDowngradeold:" + i10 + " new:" + i11);
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                ouw(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        ko.vt("MonitorSQLiteOpenHelper", "onUpgradeold:" + i10 + " new:" + i11);
    }

    private static void ouw(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListVt = vt(sQLiteDatabase);
        if (arrayListVt.size() > 0) {
            Iterator<String> it = arrayListVt.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }
    }

    private static ArrayList<String> vt(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception e10) {
            qbp.lh("MonitorSQLiteOpenHelper", e10.getMessage());
        }
        return arrayList;
    }
}
