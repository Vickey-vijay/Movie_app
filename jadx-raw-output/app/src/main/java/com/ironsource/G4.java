package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class G4 extends SQLiteOpenHelper implements H7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static G4 f26575f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26576g = " TEXT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26577h = " INTEGER";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26578i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H4 f26579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26583e;

    public static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f26584a = "events";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26585b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f26586c = "eventid";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f26587d = "timestamp";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f26588e = "type";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f26589f = "data";
    }

    public G4(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f26579a = new H4();
        this.f26580b = 4;
        this.f26581c = 400;
        this.f26582d = "DROP TABLE IF EXISTS events";
        this.f26583e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized G4 a(Context context, String str, int i10) {
        if (f26575f == null) {
            f26575f = new G4(context, str, i10);
        }
        return f26575f;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[Catch: all -> 0x0043, PHI: r0
  0x0031: PHI (r0v2 android.database.sqlite.SQLiteDatabase) = (r0v1 android.database.sqlite.SQLiteDatabase), (r0v3 android.database.sqlite.SQLiteDatabase) binds: [B:13:0x002f, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0013, B:14:0x0031, B:12:0x002b, B:19:0x0039, B:21:0x003f, B:22:0x0042, B:10:0x001b, B:5:0x000a), top: B:26:0x0002, inners: #1, #2 }] */
    @Override // com.ironsource.H7
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        String[] strArr = {str};
        try {
            sQLiteDatabaseA = a(true);
            sQLiteDatabaseA.delete("events", "type = ?", strArr);
            if (sQLiteDatabaseA.isOpen()) {
                sQLiteDatabaseA.close();
            }
        } catch (Throwable th2) {
            try {
                C3676r4.d().a(th2);
                Log.e("IronSource", "Exception while clearing events: ", th2);
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            } catch (Throwable th3) {
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
                throw th3;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    @Override // com.ironsource.H7
    public synchronized void a(List<C5> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseA = a(true);
                    try {
                        Iterator<C5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            C3676r4.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (Throwable th3) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[Catch: all -> 0x00b6, PHI: r11
  0x0099: PHI (r11v2 android.database.sqlite.SQLiteDatabase) = (r11v1 android.database.sqlite.SQLiteDatabase), (r11v3 android.database.sqlite.SQLiteDatabase) binds: [B:39:0x0097, B:26:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:22:0x0064, B:24:0x006a, B:25:0x006d, B:40:0x0099, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:45:0x00a1, B:47:0x00a7, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:32:0x0078), top: B:60:0x0001, inners: #3 }] */
    @Override // com.ironsource.H7
    public synchronized ArrayList<C5> a(String str) {
        ArrayList<C5> arrayList;
        SQLiteDatabase sQLiteDatabaseA;
        arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            sQLiteDatabaseA = a(false);
            try {
                cursorQuery = sQLiteDatabaseA.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        int columnIndex = cursorQuery.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i10 = cursorQuery.getInt(columnIndex);
                            int columnIndex2 = cursorQuery.getColumnIndex("timestamp");
                            if (columnIndex2 >= 0) {
                                long j10 = cursorQuery.getLong(columnIndex2);
                                int columnIndex3 = cursorQuery.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new C5(i10, j10, cursorQuery.getString(columnIndex3)));
                                    cursorQuery.moveToNext();
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    C3676r4.d().a(th);
                    Log.e("IronSource", "Exception while loading events: ", th);
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (Throwable th3) {
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseA = null;
        }
        return arrayList;
    }

    private ContentValues a(C5 c10, String str) {
        if (c10 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c10.c()));
        contentValues.put("timestamp", Long.valueOf(c10.d()));
        contentValues.put("type", str);
        contentValues.put("data", c10.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z10) throws Throwable {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return this.f26579a.a(true, this);
                }
                return this.f26579a.a(false, this);
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                i10++;
                if (i10 < 4) {
                    SystemClock.sleep(i10 * 400);
                } else {
                    throw th2;
                }
            }
        }
    }
}
