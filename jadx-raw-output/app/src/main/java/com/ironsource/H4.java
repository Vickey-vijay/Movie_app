package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26704a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f26705b = new Object();

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sQLiteOpenHelper) {
        ck.p.j(sQLiteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sQLiteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(H4 h10, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h10.a(z10, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean z10, SQLiteOpenHelper sQLiteOpenHelper) {
        SQLiteDatabase readableDatabase;
        ck.p.j(sQLiteOpenHelper, "sqliteOpenHelper");
        synchronized (f26705b) {
            try {
                if (z10) {
                    readableDatabase = sQLiteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sQLiteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readableDatabase;
    }
}
