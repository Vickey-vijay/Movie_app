package f5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.ironsource.Z7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f52841c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3.a f52842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52843b;

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public final Cursor c() {
        g5.a.e(this.f52843b);
        return this.f52842a.getReadableDatabase().query(this.f52843b, f52841c, null, null, null, null, null);
    }

    @WorkerThread
    public void f(String str) throws DatabaseIOException {
        g5.a.e(this.f52843b);
        try {
            this.f52842a.getWritableDatabase().delete(this.f52843b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void g(Set<String> set) throws DatabaseIOException {
        g5.a.e(this.f52843b);
        try {
            SQLiteDatabase writableDatabase = this.f52842a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f52843b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void h(String str, long j10, long j11) throws DatabaseIOException {
        g5.a.e(this.f52843b);
        try {
            SQLiteDatabase writableDatabase = this.f52842a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f52843b, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public c(n3.a aVar) {
        this.f52842a = aVar;
    }

    @WorkerThread
    public static void delete(n3.a aVar, long j10) throws DatabaseIOException {
        String hexString = Long.toHexString(j10);
        try {
            String strD = d(hexString);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                n3.c.c(writableDatabase, 2, hexString);
                a(writableDatabase, strD);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public Map<String, b> b() throws DatabaseIOException {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put(cursorC.getString(0), new b(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } catch (Throwable th2) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @WorkerThread
    public void e(long j10) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j10);
            this.f52843b = d(hexString);
            if (n3.c.b(this.f52842a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f52842a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    n3.c.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f52843b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f52843b + Z7.f27998r + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
