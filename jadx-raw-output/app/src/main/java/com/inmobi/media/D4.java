package com.inmobi.media;

import com.inmobi.media.D4;
import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextData f22495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22497c = D4.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L4 f22498d = new L4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22499e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f22500f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f22501g = new AtomicBoolean();

    public final void a() {
        ck.p.i(this.f22497c, "TAG");
        ContextData contextData = this.f22495a;
        if (contextData != null) {
            K4.f22996a.a(contextData.getEnabled());
        }
        if (K4.e() && !this.f22500f.getAndSet(true)) {
            this.f22499e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.f22499e / ((long) 1000));
        }
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.f22501g.get() || (contextData = this.f22495a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        L4 l10 = this.f22498d;
        l10.getClass();
        ck.p.j(advertisedContent, "<set-?>");
        l10.f23050a = advertisedContent;
        ck.p.i(this.f22497c, "TAG");
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.f22501g.get() || (contextData = this.f22495a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.f22498d.f23051b = bidderId.longValue();
        ck.p.i(this.f22497c, "TAG");
    }

    public final void e() {
        ContextData contextData;
        if (this.f22501g.get() || (contextData = this.f22495a) == null) {
            return;
        }
        this.f22498d.f23055f = contextData.getCasAdTypeId();
        ck.p.i(this.f22497c, "TAG");
    }

    public final void f() {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23056g = 1;
        ck.p.i(this.f22497c, "TAG");
    }

    public final void g() {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23058i = 1;
        ck.p.i(this.f22497c, "TAG");
    }

    public final void h() {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23057h = 1;
        ck.p.i(this.f22497c, "TAG");
    }

    public final void i() {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23054e = this.f22496b;
        ck.p.i(this.f22497c, "TAG");
    }

    public D4(ContextData contextData, long j10) {
        this.f22495a = contextData;
        this.f22496b = j10;
    }

    public final void b() {
        if (!K4.e()) {
            ck.p.i(this.f22497c, "TAG");
            return;
        }
        if (!this.f22500f.get()) {
            ck.p.i(this.f22497c, "TAG");
            return;
        }
        a((int) (System.currentTimeMillis() - this.f22499e));
        if (this.f22501g.getAndSet(true)) {
            ck.p.i(this.f22497c, "TAG");
            return;
        }
        ck.p.i(this.f22497c, "TAG");
        Runnable runnable = new Runnable() { // from class: b7.j
            @Override // java.lang.Runnable
            public final void run() {
                D4.a(this.f4993b);
            }
        };
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public final void a(long j10) {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23052c = j10;
        ck.p.i(this.f22497c, "TAG");
    }

    public final void a(int i10) {
        if (this.f22501g.get()) {
            return;
        }
        this.f22498d.f23053d = i10;
        ck.p.i(this.f22497c, "TAG");
    }

    public static final void a(D4 d10) {
        K4 k10 = K4.f22996a;
        L4 l10 = d10.f22498d;
        ck.p.j(l10, "contextualDataModel");
        synchronized (k10) {
            ck.p.i("K4", "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long expiryTime = jCurrentTimeMillis - ((long) (K4.c().getContextualData().getExpiryTime() * 1000));
            K4.a(expiryTime, K4.c().getContextualData().getMaxAdRecords() - 1);
            String string = M4.a(l10, K4.c().getContextualData().getSkipFields()).toString();
            ck.p.i(string, "toString(...)");
            W5 w10 = new W5(X5.a(string, K4.f23000e), jCurrentTimeMillis);
            K4.f22998c.add(w10);
            Object objClone = K4.f22998c.clone();
            ck.p.h(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            K4.f22999d = (LinkedList) objClone;
            nk.i.b(null, new I4(w10, expiryTime, null), 1, null);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
