package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import okhttp3.Dispatcher;

/* JADX INFO: loaded from: classes5.dex */
public abstract class A9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Dispatcher f22349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Dispatcher f22350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nk.l0 f22351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nk.l0 f22352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nk.l0 f22353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nk.l0 f22354f;

    static {
        Object value = AbstractC3075o6.f24957b.getValue();
        ck.p.i(value, "getValue(...)");
        f22349a = new Dispatcher((ExecutorService) value);
        Object value2 = AbstractC3075o6.f24956a.getValue();
        ck.p.i(value2, "getValue(...)");
        f22350b = new Dispatcher((ExecutorService) value2);
        Object value3 = AbstractC3075o6.f24958c.getValue();
        ck.p.i(value3, "getValue(...)");
        f22351c = kotlinx.coroutines.d.a(nk.l1.c((ExecutorService) value3).plus(nk.j2.b(null, 1, null)));
        Object value4 = AbstractC3075o6.f24959d.getValue();
        ck.p.i(value4, "getValue(...)");
        f22352d = kotlinx.coroutines.d.a(nk.l1.c((ExecutorService) value4).plus(nk.j2.b(null, 1, null)));
        Object value5 = AbstractC3075o6.f24961f.getValue();
        ck.p.i(value5, "getValue(...)");
        f22353e = kotlinx.coroutines.d.a(nk.l1.c((ExecutorService) value5).plus(nk.j2.b(null, 1, null)));
        f22354f = kotlinx.coroutines.d.a(nk.l1.b((Wb) AbstractC3075o6.f24960e.getValue()).plus(nk.j2.b(null, 1, null)));
    }
}
