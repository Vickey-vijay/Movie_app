package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: MBSDKContext.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f34598t;

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }

    public static c n() {
        if (f34598t == null) {
            synchronized (c.class) {
                if (f34598t == null) {
                    f34598t = new c();
                }
            }
        }
        return f34598t;
    }

    private c() {
    }
}
