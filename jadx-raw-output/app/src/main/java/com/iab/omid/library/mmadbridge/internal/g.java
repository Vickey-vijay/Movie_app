package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21916b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21917a;

    private g() {
    }

    public static g b() {
        return f21916b;
    }

    public Context a() {
        return this.f21917a;
    }

    public void a(Context context) {
        this.f21917a = context != null ? context.getApplicationContext() : null;
    }
}
