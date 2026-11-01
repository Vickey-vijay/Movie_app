package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f14872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f14873b;

    public u(c0 c0Var, Exception exc) {
        this.f14872a = c0Var;
        this.f14873b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f14872a;
        if (c0Var != null) {
            c0Var.a(this.f14873b, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
