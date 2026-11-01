package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f22185b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22186a;

    private g() {
    }

    public static g b() {
        return f22185b;
    }

    public Context a() {
        return this.f22186a;
    }

    public void a(Context context) {
        this.f22186a = context != null ? context.getApplicationContext() : null;
    }
}
