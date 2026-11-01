package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdFormat f15241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15242b;

    public c(e eVar, AdFormat adFormat) {
        this.f15242b = eVar;
        this.f15241a = adFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            QueryInfo.generate(o.f18599a, this.f15241a, e.a(this.f15242b), new b(this));
        } catch (Throwable th2) {
            IAlog.a("Error in resolveDVTokens", th2, new Object[0]);
        }
    }
}
