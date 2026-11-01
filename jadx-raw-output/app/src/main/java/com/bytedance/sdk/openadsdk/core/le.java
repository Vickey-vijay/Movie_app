package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class le {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final Object f12698lh = new Object();
    private lh ouw;
    private Context vt;

    public class lh {
        public SQLiteDatabase ouw = null;

        private synchronized boolean fkw() {
            SQLiteDatabase sQLiteDatabase;
            sQLiteDatabase = this.ouw;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public final synchronized void lh() {
            ouw();
            SQLiteDatabase sQLiteDatabase = this.ouw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public final synchronized void ouw() {
            try {
                synchronized (le.f12698lh) {
                    SQLiteDatabase sQLiteDatabase = this.ouw;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        le leVar = le.this;
                        SQLiteDatabase writableDatabase = leVar.new ouw(le.ouw(leVar)).getWritableDatabase();
                        this.ouw = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", th2.getMessage());
                if (fkw()) {
                    throw th2;
                }
            }
        }

        public final synchronized void vt() {
            ouw();
            SQLiteDatabase sQLiteDatabase = this.ouw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public final synchronized void yu() {
            ouw();
            SQLiteDatabase sQLiteDatabase = this.ouw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public lh() {
        }

        public final synchronized void ouw(String str) throws SQLException {
            try {
                ouw();
                this.ouw.execSQL(str);
            } catch (Throwable th2) {
                if (fkw()) {
                    throw th2;
                }
            }
        }

        public final synchronized Cursor ouw(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                ouw();
                cursorQuery = this.ouw.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", th2.getMessage());
                vt vtVar = new vt(le.this, (byte) 0);
                if (fkw()) {
                    throw th2;
                }
                cursorQuery = vtVar;
            }
            return cursorQuery;
        }

        public final synchronized int ouw(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                ouw();
                iUpdate = this.ouw.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", e10.getMessage());
                if (fkw()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public final synchronized long ouw(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                ouw();
                jReplace = this.ouw.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", e10.getMessage());
                if (fkw()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public final synchronized int ouw(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                ouw();
                iDelete = this.ouw.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", e10.getMessage());
                if (fkw()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public class ouw extends SQLiteOpenHelper {
        public final Context ouw;

        public ouw(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.ouw = context;
        }

        private static void ouw(SQLiteDatabase sQLiteDatabase) {
            com.bytedance.sdk.component.utils.ko.vt("DBHelper", "initDB........");
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.yu.ouw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.cf.vt());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.rn.ouw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.ko.ouw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.tc.vt.ouw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.vm.vt());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ouw.vt.vt.lh());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.cf.ouw.lh.lh());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.zih.ouw());
        }

        private static void vt(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase.execSQL("ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase.execSQL("ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0");
            sQLiteDatabase.execSQL("ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0");
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0039 A[PHI: r1
  0x0039: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:19:0x0037, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        private static ArrayList<String> yu(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
            return arrayList;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    lh(sQLiteDatabase);
                    Context unused = le.this.vt;
                    ouw(sQLiteDatabase);
                    com.bytedance.sdk.component.utils.ko.vt("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                com.bytedance.sdk.component.utils.ko.vt("DBHelper", "onUpgrade....Database version upgrade.....old:" + i10 + ",new:" + i11);
                if (i10 > i11) {
                    lh(sQLiteDatabase);
                    Context unused = le.this.vt;
                    ouw(sQLiteDatabase);
                    com.bytedance.sdk.component.utils.ko.vt("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                } else {
                    Context unused2 = le.this.vt;
                    ouw(sQLiteDatabase);
                }
                switch (i10) {
                    case 1:
                        com.bytedance.sdk.component.utils.ko.vt("DBHelper", "onUpgrade.....perform table creation.....");
                        vt(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        vt(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.rn.ouw());
                        vt(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.ouw.vt.vt.lh());
                        vt(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.yu.ko.ouw());
                        vt(sQLiteDatabase);
                        break;
                    case 6:
                        vt(sQLiteDatabase);
                        break;
                }
            } catch (Throwable unused3) {
            }
            if (i10 < 11) {
                try {
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.cf.ouw.lh.yu());
                    sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
                    sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
                    sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
                    sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("DBHelper", th2.getMessage());
                }
            }
        }

        private static void lh(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListYu = yu(sQLiteDatabase);
            if (arrayListYu.size() > 0) {
                Iterator<String> it = arrayListYu.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                ouw(sQLiteDatabase);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("DBHelper", th2.getMessage());
            }
        }
    }

    public class vt extends AbstractCursor {
        private vt() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final boolean isNull(int i10) {
            return true;
        }

        public /* synthetic */ vt(le leVar, byte b10) {
            this();
        }
    }

    public lh ouw() {
        return this.ouw;
    }

    public static /* synthetic */ Context ouw(le leVar) {
        Context context = leVar.vt;
        return context == null ? zih.ouw() : context;
    }

    public le(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = zih.ouw();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.vt = applicationContext;
            if (this.ouw == null) {
                this.ouw = new lh();
            }
        } catch (Throwable unused) {
        }
    }
}
