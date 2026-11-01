package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class Z6 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f56272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4304jn f56273c;

    public Z6(Context context, String str, C4304jn c4304jn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC4637x5.f57914b);
        this.f56273c = c4304jn;
        this.f56271a = str;
        this.f56272b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f56273c.f57056a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        C4304jn c4304jn = this.f56273c;
        if (i10 <= i11) {
            c4304jn.getClass();
            return;
        }
        try {
            c4304jn.f57057b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c4304jn.f57056a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10;
        C4304jn c4304jn = this.f56273c;
        c4304jn.getClass();
        if (i11 > i10) {
            z10 = false;
            for (int i12 = i10 + 1; i12 <= i11; i12++) {
                try {
                    Collection collection = (Collection) c4304jn.f57058c.f57557a.get(Integer.valueOf(i12));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } else {
            z10 = true;
        }
        if ((!c4304jn.f57059d.a(sQLiteDatabase)) || z10) {
            try {
                c4304jn.f57057b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c4304jn.f57056a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f56272b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f56271a);
            Rj rj2 = AbstractC4452pj.f57520a;
            rj2.getClass();
            rj2.a(new C4477qj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f56272b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f56271a);
            Rj rj2 = AbstractC4452pj.f57520a;
            rj2.getClass();
            rj2.a(new C4477qj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C4304jn c4304jn = this.f56273c;
        c4304jn.getClass();
        try {
            InterfaceC4330kn interfaceC4330kn = c4304jn.f57059d;
            if (interfaceC4330kn != null && !interfaceC4330kn.a(sQLiteDatabase)) {
                try {
                    c4304jn.f57057b.runScript(sQLiteDatabase);
                } catch (Throwable unused) {
                }
                c4304jn.f57056a.runScript(sQLiteDatabase);
            }
        } catch (Throwable unused2) {
        }
    }
}
