package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rc0 implements np3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f82181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f82182f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w30 f82184b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82186d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82183a = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f82185c = new Object();

    static {
        int[] iArr = {3, 4};
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        f82181e = sb2.toString();
        f82182f = new String[]{"id", "mime_type", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i10 = ib3.f78556a;
        for (String str2 : str.split(StringUtils.COMMA, -1)) {
            String[] strArrSplit = str2.split("\\.", -1);
            if (strArrSplit.length != 3) {
                throw new IllegalStateException();
            }
            arrayList.add(new v33(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }

    public final gj0 b(String str) throws v30 {
        a();
        try {
            Cursor cursorA = a("id = ?", new String[]{str});
            try {
                if (cursorA.getCount() == 0) {
                    cursorA.close();
                    return null;
                }
                cursorA.moveToNext();
                gj0 gj0VarA = a(cursorA);
                cursorA.close();
                return gj0VarA;
            } catch (Throwable th2) {
                if (cursorA != null) {
                    try {
                        cursorA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLiteException e10) {
            throw new v30(e10);
        }
        throw new v30(e10);
    }

    public rc0(i33 i33Var, int i10) {
        this.f82184b = i33Var;
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f82184b.getWritableDatabase().update(this.f82183a, contentValues, null, null);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public static gj0 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        pj0 pj0Var = new pj0(string, uri, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        nj0 nj0Var = new nj0();
        nj0Var.f80677a = cursor.getLong(13);
        nj0Var.f80678b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new gj0(pj0Var, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, nj0Var);
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f82185c) {
            if (this.f82186d) {
                return;
            }
            try {
                int iA = qd3.a(this.f82184b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f82184b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        qd3.a(writableDatabase, 0, "", 3);
                        if (iA == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f82183a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f82183a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((gj0) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f82186d = true;
            } catch (Throwable th3) {
                throw new v30(th3);
            }
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f82184b.getWritableDatabase().update(this.f82183a, contentValues, "state = 2", null);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.f82184b.getReadableDatabase().query(this.f82183a, f82182f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public static gj0 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        pj0 pj0Var = new pj0(string, uri, string3, arrayListA, blob, cursor.getString(4), cursor.getBlob(5));
        nj0 nj0Var = new nj0();
        nj0Var.f80677a = cursor.getLong(13);
        nj0Var.f80678b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new gj0(pj0Var, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, nj0Var);
    }

    public final ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!ib3.a(sQLiteDatabase, this.f82183a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f82183a, new String[]{"id", "title", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(b(cursorQuery));
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void a(gj0 gj0Var) {
        a();
        try {
            a(gj0Var, this.f82184b.getWritableDatabase());
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(gj0 gj0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = gj0Var.f77816a.f81426f;
        if (bArr == null) {
            bArr = ib3.f78561f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", gj0Var.f77816a.f81422b);
        contentValues.put("mime_type", gj0Var.f77816a.f81424d);
        contentValues.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, gj0Var.f77816a.f81423c.toString());
        List list = gj0Var.f77816a.f81425e;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            v33 v33Var = (v33) list.get(i10);
            sb2.append(v33Var.f83733b);
            sb2.append('.');
            sb2.append(v33Var.f83734c);
            sb2.append('.');
            sb2.append(v33Var.f83735d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", gj0Var.f77816a.f81427g);
        contentValues.put("data", gj0Var.f77816a.f81428h);
        contentValues.put("state", Integer.valueOf(gj0Var.f77817b));
        contentValues.put("start_time_ms", Long.valueOf(gj0Var.f77818c));
        contentValues.put("update_time_ms", Long.valueOf(gj0Var.f77819d));
        contentValues.put("content_length", Long.valueOf(gj0Var.f77820e));
        contentValues.put("stop_reason", Integer.valueOf(gj0Var.f77821f));
        contentValues.put("failure_reason", Integer.valueOf(gj0Var.f77822g));
        contentValues.put("percent_downloaded", Float.valueOf(gj0Var.f77823h.f80678b));
        contentValues.put("bytes_downloaded", Long.valueOf(gj0Var.f77823h.f80677a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f82183a, null, contentValues);
    }

    public final void a(int i10, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f82184b.getWritableDatabase().update(this.f82183a, contentValues, f82181e + " AND id = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }
}
