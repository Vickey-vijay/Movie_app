package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21781b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21782a;

    private g() {
    }

    public static g b() {
        return f21781b;
    }

    public Context a() {
        return this.f21782a;
    }

    public void a(Context context) {
        this.f21782a = context != null ? context.getApplicationContext() : null;
    }
}
