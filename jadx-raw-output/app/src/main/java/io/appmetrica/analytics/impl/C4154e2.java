package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.C4154e2;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4154e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4242hc f56629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f56630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56632d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f56633e = new Runnable() { // from class: af.e0
        @Override // java.lang.Runnable
        public final void run() {
            C4154e2.a(this.f3553b);
        }
    };

    public static final void a(C4154e2 c4154e2) {
        C4268ic c4268ic = c4154e2.f56629a.f56900a;
        C4650xi c4650xi = c4268ic.f55384h;
        c4650xi.f57940c.a(c4268ic.f55378b.f55334a);
    }

    public C4154e2(C4242hc c4242hc, IHandlerExecutor iHandlerExecutor, long j10) {
        this.f56629a = c4242hc;
        this.f56630b = iHandlerExecutor;
        this.f56631c = j10;
    }
}
