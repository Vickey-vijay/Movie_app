package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f22050b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22051a;

    private f() {
    }

    public static f b() {
        return f22050b;
    }

    public Context a() {
        return this.f22051a;
    }

    public void a(Context context) {
        this.f22051a = context != null ? context.getApplicationContext() : null;
    }
}
