package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class Tg implements InterfaceC4158e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4079b4 f55925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f55926c = C4418oa.k().w().d();

    public final void a(Q5 q10, Bundle bundle) {
        if (q10.m()) {
            return;
        }
        this.f55926c.execute(new RunnableC4375mh(this.f55924a, q10, bundle, this.f55925b));
    }

    public Tg(Context context, C4079b4 c4079b4) {
        this.f55924a = context;
        this.f55925b = c4079b4;
    }

    public final void a(Q3 q10, Q5 q11, C4462q4 c4462q4) {
        this.f55925b.a(q10, c4462q4).a(q11, c4462q4);
        this.f55925b.a(q10.f55769b, q10.f55770c, q10.f55771d);
    }
}
