package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class K4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55446a = "sessions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55447b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55448c = "id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55449d = "start_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55450e = "report_request_parameters";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55451f = "server_time_offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f55452g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55453h = "obtained_before_first_sync";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4564u7 f55454i = new C4564u7(null, 1, 0 == true ? 1 : 0);

    public final C4539t7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55448c)));
            int i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55452g));
            Wk wk2 = Wk.FOREGROUND;
            boolean z10 = true;
            if (i10 != 0) {
                wk2 = Wk.BACKGROUND;
                if (i10 != 1) {
                    wk2 = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f55450e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55449d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55451f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f55453h)) != 1) {
                z10 = false;
            }
            return new C4539t7(lValueOf, wk2, string, new C4514s7(lValueOf2, lValueOf3, Boolean.valueOf(z10)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        Iterator it;
        Long l10;
        String str;
        Long l11;
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = sQLiteDatabase.query(this.f55446a, null, null, null, null, null, null, String.valueOf(this.f55447b));
            while (cursorQuery.moveToNext()) {
                try {
                    C4539t7 c4539t7A = a(cursorQuery);
                    if (c4539t7A != null && (l10 = c4539t7A.f57703a) != null && l10.longValue() >= 0 && c4539t7A.f57704b != null && (str = c4539t7A.f57705c) != null && str.length() != 0 && (l11 = c4539t7A.f57706d.f57651a) != null && l11.longValue() > 0) {
                        arrayList.add(this.f55454i.fromModel(c4539t7A));
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f55446a);
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f55446a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
        }
    }
}
