package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21375b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21376a;

    private g() {
    }

    public static g b() {
        return f21375b;
    }

    public Context a() {
        return this.f21376a;
    }

    public void a(Context context) {
        this.f21376a = context != null ? context.getApplicationContext() : null;
    }
}
