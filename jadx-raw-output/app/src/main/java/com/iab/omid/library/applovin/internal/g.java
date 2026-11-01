package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f20984b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20985a;

    private g() {
    }

    public static g b() {
        return f20984b;
    }

    public Context a() {
        return this.f20985a;
    }

    public void a(Context context) {
        this.f20985a = context != null ? context.getApplicationContext() : null;
    }
}
