package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.C4140dd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4140dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f56589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4603vl f56590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f56592d;

    public static final void a(C4140dd c4140dd, List list) {
        Rj rj2 = AbstractC4452pj.f57520a;
        C4191fd c4191fd = new C4191fd(c4140dd.f56590b, c4140dd.f56591c, c4140dd.f56592d, list);
        rj2.getClass();
        rj2.a(new Fj(c4191fd));
    }

    public C4140dd(IHandlerExecutor iHandlerExecutor, AbstractC4695zd abstractC4695zd, String str, SystemTimeProvider systemTimeProvider) {
        this.f56589a = iHandlerExecutor;
        this.f56590b = abstractC4695zd;
        this.f56591c = str;
        this.f56592d = systemTimeProvider;
    }

    public final void a(final ArrayList arrayList) {
        this.f56589a.execute(new Runnable() { // from class: af.c0
            @Override // java.lang.Runnable
            public final void run() {
                C4140dd.a(this.f3549b, arrayList);
            }
        });
    }
}
