package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: CrashANRHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f6284a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f6285c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f6286b;

    public static f a(Context context) {
        if (f6284a == null) {
            synchronized (f.class) {
                if (f6284a == null) {
                    f6284a = new f(context);
                }
            }
        }
        return f6284a;
    }

    public static g b() {
        return f6285c;
    }

    public final void c() {
        this.f6286b.a();
    }

    public final void d() {
        this.f6286b.b();
    }

    private f(@NonNull Context context) {
        this.f6286b = new b(context);
        g gVar = new g();
        f6285c = gVar;
        gVar.a();
    }

    public final b a() {
        return this.f6286b;
    }
}
