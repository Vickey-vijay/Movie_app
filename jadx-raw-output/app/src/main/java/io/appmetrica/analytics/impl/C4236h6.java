package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4236h6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f56877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vg f56878b;

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f56877a;
        Vg vg2 = this.f56878b;
        C4419ob c4419ob = vg2.f56030c;
        Consumer consumer = vg2.f56032e;
        Context context = vg2.f56028a;
        if (C4059aa.f56344c == null) {
            synchronized (ck.s.b(C4059aa.class)) {
                if (C4059aa.f56344c == null) {
                    C4059aa.f56344c = new C4059aa(context);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        C4059aa c4059aa = C4059aa.f56344c;
        if (c4059aa == null) {
            ck.p.B("INSTANCE");
            c4059aa = null;
        }
        executor.execute(new Uf(file, c4419ob, c4419ob, consumer, c4059aa, vg2.f56029b));
    }

    public C4236h6(Context context, InterfaceC4158e6 interfaceC4158e6, EnumC4112cb enumC4112cb, InterfaceC4096bl interfaceC4096bl, Executor executor, String str) {
        this.f56877a = executor;
        this.f56878b = new Vg(context, interfaceC4158e6, enumC4112cb, interfaceC4096bl);
    }
}
