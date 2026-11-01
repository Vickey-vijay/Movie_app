package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f14961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14965f = new ArrayList();

    public final String toString() {
        q qVar = this.f14960a;
        if (qVar == q.FAILED) {
            Throwable th2 = this.f14961b;
            return "Open result: Failed! error: " + (th2 != null ? th2.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.f14962c;
    }

    public b(String str, q qVar, String str2, Exception exc) {
        this.f14963d = str;
        this.f14960a = qVar;
        this.f14962c = str2;
        this.f14961b = exc;
    }
}
