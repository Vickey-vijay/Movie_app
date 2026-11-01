package com.inmobi.media;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H6 {
    public static final boolean a(String str) {
        return str == null || lk.a0.k1(str).toString().length() == 0 || !(lk.x.R(str, "http://", false, 2, null) || lk.x.R(str, "https://", false, 2, null));
    }

    public static final void a(HandlerThread handlerThread, String str) {
        ck.p.j(handlerThread, "<this>");
        ck.p.j(str, "name");
        try {
            handlerThread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }

    public static final void a(kotlinx.coroutines.g gVar) {
        if (gVar == null || !gVar.isActive()) {
            return;
        }
        kotlinx.coroutines.g.a.a(gVar, null, 1, null);
    }
}
