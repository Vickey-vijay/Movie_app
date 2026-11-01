package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21119b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21120a;

    private g() {
    }

    public static g b() {
        return f21119b;
    }

    public Context a() {
        return this.f21120a;
    }

    public void a(Context context) {
        this.f21120a = context != null ? context.getApplicationContext() : null;
    }
}
