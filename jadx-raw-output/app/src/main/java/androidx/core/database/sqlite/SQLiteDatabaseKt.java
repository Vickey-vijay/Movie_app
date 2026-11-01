package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import bk.l;
import ck.n;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDatabaseKt {
    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            n.b(1);
            sQLiteDatabase.endTransaction();
            n.a(1);
        }
    }

    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z10, l<? super SQLiteDatabase, ? extends T> lVar) {
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            n.b(1);
            sQLiteDatabase.endTransaction();
            n.a(1);
        }
    }
}
