package i0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f0.k;
import f0.o;

/* JADX INFO: compiled from: DatabaseSourceInfoStorage.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends SQLiteOpenHelper implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f54044b = {"_id", "url", "length", "mime"};

    @Override // i0.b
    public void a(String str, o oVar) {
        k.a(str, oVar);
        boolean z10 = get(str) != null;
        ContentValues contentValuesB = b(oVar);
        if (z10) {
            getWritableDatabase().update("SourceInfo", contentValuesB, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValuesB);
        }
    }

    public a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        k.c(context);
    }

    public final ContentValues b(o oVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", oVar.f52820a);
        contentValues.put("length", Long.valueOf(oVar.f52821b));
        contentValues.put("mime", oVar.f52822c);
        return contentValues;
    }

    public final o c(Cursor cursor) {
        return new o(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // i0.b
    public o get(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        k.c(str);
        o oVarC = null;
        try {
            cursorQuery = getReadableDatabase().query("SourceInfo", f54044b, "url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        oVarC = c(cursorQuery);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return oVarC;
        } catch (Throwable th4) {
            th2 = th4;
            cursorQuery = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        k.c(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }
}
