package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: compiled from: NpthDataManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f6390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f6391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f6392c;

    public static a a() {
        if (f6390a == null) {
            synchronized (a.class) {
                if (f6390a == null) {
                    f6390a = new a();
                }
            }
        }
        return f6390a;
    }

    private void b() {
        if (this.f6391b == null) {
            a(e.g());
        }
    }

    private a() {
    }

    public final synchronized void a(Context context) {
        try {
            this.f6392c = new b(context).getWritableDatabase();
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
        this.f6391b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f6391b;
        if (bVar != null) {
            bVar.a(this.f6392c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f6391b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f6392c, str);
    }
}
