package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21505b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21506a;

    private g() {
    }

    public static g b() {
        return f21505b;
    }

    public Context a() {
        return this.f21506a;
    }

    public void a(Context context) {
        this.f21506a = context != null ? context.getApplicationContext() : null;
    }
}
