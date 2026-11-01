package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.runtime.j;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: AbsDAO.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6394b = "_id";

    public abstract ContentValues a(T t10);

    public abstract HashMap<String, String> a();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f6393a);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapA = a();
            for (String str : mapA.keySet()) {
                sb2.append(str);
                sb2.append(Z7.f27998r);
                sb2.append(mapA.get(str));
                sb2.append(StringUtils.COMMA);
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append(")");
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (Throwable th2) {
            c.a();
            j.a(th2, "NPTH_CATCH");
        }
    }

    public a(String str) {
        this.f6393a = str;
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t10) {
        if (sQLiteDatabase == null || t10 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f6393a, null, a(t10));
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }
}
