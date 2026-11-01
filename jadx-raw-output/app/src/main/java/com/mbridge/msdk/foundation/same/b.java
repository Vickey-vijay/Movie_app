package com.mbridge.msdk.foundation.same;

/* JADX INFO: compiled from: MBridgeRefactor.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f34917b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f34918a = null;

    public static b b() {
        if (f34917b == null) {
            synchronized (b.class) {
                if (f34917b == null) {
                    f34917b = new b();
                }
            }
        }
        return f34917b;
    }

    public Boolean a() {
        return this.f34918a;
    }

    private b() {
    }
}
