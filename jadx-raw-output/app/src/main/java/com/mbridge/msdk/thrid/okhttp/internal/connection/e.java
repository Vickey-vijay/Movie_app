package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: RouteException.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f37560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f37561b;

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f37560a, (Throwable) iOException);
        this.f37561b = iOException;
    }

    public IOException d() {
        return this.f37560a;
    }

    public IOException g() {
        return this.f37561b;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f37560a = iOException;
        this.f37561b = iOException;
    }
}
