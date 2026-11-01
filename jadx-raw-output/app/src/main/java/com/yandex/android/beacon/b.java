package com.yandex.android.beacon;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import ck.i;
import ck.l;
import ck.p;
import com.yandex.div.internal.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SendBeaconDb.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0452b f45792b = new C0452b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f45793c = {"_id", "url", "headers", "add_timestamp", "payload"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f45794d = a.f45795b;

    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public /* synthetic */ class a implements c, l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f45795b = new a();

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && (obj instanceof l)) {
                return p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // ck.l
        public final e<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, b.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.yandex.android.beacon.b.c
        public final b a(Context context, String str) {
            return new b(context, str);
        }
    }

    /* JADX INFO: renamed from: com.yandex.android.beacon.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public static final class C0452b {
        public C0452b() {
        }

        public /* synthetic */ C0452b(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SendBeaconDb.kt */
    public interface c {
        b a(Context context, String str);
    }

    public b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        Assert.assertTrue(context instanceof Application);
    }

    @WorkerThread
    public boolean h(com.yandex.android.beacon.a.C0451a c0451a) throws IOException {
        if (c0451a == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int iDelete = writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(c0451a.f())});
            yj.b.a(writableDatabase, null);
            return iDelete != 0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(writableDatabase, th2);
                throw th3;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 == 1) {
            sQLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }

    @WorkerThread
    public com.yandex.android.beacon.a.C0451a a(Uri uri, Map<String, String> map, long j10, JSONObject jSONObject) throws IOException {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("url", uri.toString());
        contentValues.put("headers", nd.a.b(map));
        contentValues.put("add_timestamp", Long.valueOf(j10));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long jInsert = writableDatabase.insert("items", null, contentValues);
            yj.b.a(writableDatabase, null);
            return new com.yandex.android.beacon.a.C0451a(uri, map, jSONObject, j10, jInsert);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(writableDatabase, th2);
                throw th3;
            }
        }
    }

    @WorkerThread
    public List<com.yandex.android.beacon.a.C0451a> d() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor cursorQuery = null;
        try {
            cursorQuery = readableDatabase.query("items", f45793c, null, null, null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    arrayList.add(e(cursorQuery));
                }
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            readableDatabase.close();
        }
    }

    public final com.yandex.android.beacon.a.C0451a e(Cursor cursor) {
        return new com.yandex.android.beacon.a.C0451a(Uri.parse(cursor.getString(1)), nd.a.a(cursor.getString(2)), f(cursor, 4), cursor.getLong(3), cursor.getLong(0));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    public final JSONObject f(Cursor cursor, int i10) {
        boolean z10;
        String strG = g(cursor, i10);
        if (strG == null) {
            return null;
        }
        if (strG.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        try {
            return new JSONObject(strG);
        } catch (JSONException e10) {
            Assert.fail("Payload parsing exception: " + e10);
            return null;
        }
    }

    public final String g(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}
