package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: MBridgeVolleyManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f38187b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f38188a;

    public static l a() {
        if (f38187b == null) {
            synchronized (l.class) {
                if (f38187b == null) {
                    f38187b = new l();
                }
            }
        }
        return f38187b;
    }

    public u b() {
        if (this.f38188a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f38188a = uVarA;
            uVarA.b();
        }
        return this.f38188a;
    }

    private l() {
    }
}
