package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class is implements ks {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f78782e = {"id", C3426d4.i.W, "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f78783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f78784b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f78786d;

    @Override // yads.ks
    public final boolean a() {
        SQLiteDatabase readableDatabase = this.f78783a.getReadableDatabase();
        String str = this.f78785c;
        str.getClass();
        return qd3.a(readableDatabase, 1, str) != -1;
    }

    @Override // yads.ks
    public final void b() throws v30 {
        w30 w30Var = this.f78783a;
        String str = this.f78785c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = w30Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i10 = qd3.f81835a;
                try {
                    if (ib3.a(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e10) {
                    throw new v30(e10);
                }
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e11) {
            throw new v30(e11);
        }
    }

    public is(jn0 jn0Var) {
        this.f78783a = jn0Var;
    }

    @Override // yads.ks
    public final void a(long j10) {
        String hexString = Long.toHexString(j10);
        this.f78785c = hexString;
        this.f78786d = "ExoPlayerCacheIndex" + hexString;
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws v30 {
        if (this.f78784b.size() == 0) {
            try {
                SQLiteDatabase readableDatabase = this.f78783a.getReadableDatabase();
                String str = this.f78785c;
                str.getClass();
                if (qd3.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f78783a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.f78785c;
                        str2.getClass();
                        qd3.a(writableDatabase, 1, str2, 1);
                        String str3 = this.f78786d;
                        str3.getClass();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                        writableDatabase.execSQL("CREATE TABLE " + this.f78786d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f78783a.getReadableDatabase();
                String str4 = this.f78786d;
                str4.getClass();
                Cursor cursorQuery = readableDatabase2.query(str4, f78782e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i10 = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new hs(i10, string, ls.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i10, string);
                    } catch (Throwable th3) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorQuery.close();
                return;
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new v30(e10);
            }
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void b(HashMap map) throws v30 {
        try {
            SQLiteDatabase writableDatabase = this.f78783a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                String str = this.f78785c;
                str.getClass();
                qd3.a(writableDatabase, 1, str, 1);
                String str2 = this.f78786d;
                str2.getClass();
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.execSQL("CREATE TABLE " + this.f78786d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                for (hs hsVar : map.values()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jc0 jc0Var = hsVar.f78343e;
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    Set<Map.Entry> setEntrySet = jc0Var.f78972b.entrySet();
                    dataOutputStream.writeInt(setEntrySet.size());
                    for (Map.Entry entry : setEntrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", Integer.valueOf(hsVar.f78339a));
                    contentValues.put(C3426d4.i.W, hsVar.f78340b);
                    contentValues.put("metadata", byteArray);
                    String str3 = this.f78786d;
                    str3.getClass();
                    writableDatabase.replaceOrThrow(str3, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                this.f78784b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new v30(e10);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z10) {
        if (z10) {
            this.f78784b.delete(hsVar.f78339a);
        } else {
            this.f78784b.put(hsVar.f78339a, null);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f78784b.put(hsVar.f78339a, hsVar);
    }

    @Override // yads.ks
    public final void a(HashMap map) throws v30 {
        if (this.f78784b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f78783a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < this.f78784b.size(); i10++) {
                try {
                    hs hsVar = (hs) this.f78784b.valueAt(i10);
                    if (hsVar == null) {
                        int iKeyAt = this.f78784b.keyAt(i10);
                        String str = this.f78786d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        jc0 jc0Var = hsVar.f78343e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> setEntrySet = jc0Var.f78972b.entrySet();
                        dataOutputStream.writeInt(setEntrySet.size());
                        for (Map.Entry entry : setEntrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(hsVar.f78339a));
                        contentValues.put(C3426d4.i.W, hsVar.f78340b);
                        contentValues.put("metadata", byteArray);
                        String str2 = this.f78786d;
                        str2.getClass();
                        writableDatabase.replaceOrThrow(str2, null, contentValues);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.f78784b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new v30(e10);
        }
    }
}
