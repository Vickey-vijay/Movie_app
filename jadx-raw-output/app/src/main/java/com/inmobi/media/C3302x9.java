package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3302x9 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2974k5 f25711a;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302x9(C2974k5 c2974k5) {
        super(c2974k5.f24650a, "com.im_11.1.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        ck.p.j(c2974k5, "databaseConfig");
        this.f25711a = c2974k5;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Nj nj2) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + nj2.f23252a + com.ironsource.Z7.f27998r + nj2.f23253b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f25711a.getClass();
        return "com.im_11.1.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.f25711a.f24651b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (Nj) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f25711a.f24652c == 2 && sQLiteDatabase != null) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }
}
