package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21646b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21647a;

    private g() {
    }

    public static g b() {
        return f21646b;
    }

    public Context a() {
        return this.f21647a;
    }

    public void a(Context context) {
        this.f21647a = context != null ? context.getApplicationContext() : null;
    }
}
