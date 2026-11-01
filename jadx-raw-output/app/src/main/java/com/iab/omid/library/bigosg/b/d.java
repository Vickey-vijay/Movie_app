package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f21247a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21248b;

    private d() {
    }

    public static d a() {
        return f21247a;
    }

    public void a(Context context) {
        this.f21248b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f21248b;
    }
}
