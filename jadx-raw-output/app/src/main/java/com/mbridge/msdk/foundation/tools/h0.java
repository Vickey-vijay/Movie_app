package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: NetManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f35311a;

    public static synchronized ConnectivityManager a() {
        try {
            if (f35311a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                f35311a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        return f35311a;
    }
}
