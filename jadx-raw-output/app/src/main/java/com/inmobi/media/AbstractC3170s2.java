package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3170s2 implements InterfaceC3326y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f25289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3316xn f25290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.l f25291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wk.a f25292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f25294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ee f25295g;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(AbstractC3170s2 abstractC3170s2, ContinuationImpl continuationImpl) throws Throwable {
        C3071o2 c3071o2;
        wk.a aVar;
        abstractC3170s2.getClass();
        if (continuationImpl instanceof C3071o2) {
            c3071o2 = (C3071o2) continuationImpl;
            int i10 = c3071o2.f24946d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3071o2.f24946d = i10 - Integer.MIN_VALUE;
            } else {
                c3071o2 = new C3071o2(abstractC3170s2, continuationImpl);
            }
        } else {
            c3071o2 = new C3071o2(abstractC3170s2, continuationImpl);
        }
        Object obj = c3071o2.f24944b;
        Object objF = sj.a.f();
        int i11 = c3071o2.f24946d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = abstractC3170s2.f25292d;
            c3071o2.f24943a = aVar2;
            c3071o2.f24946d = 1;
            if (aVar2.a(null, c3071o2) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3071o2.f24943a;
            kotlin.c.b(obj);
        }
        try {
            Bn bnC = abstractC3170s2.c();
            C3284wg c3284wg = bnC.f22435a;
            c3284wg.f25651f.set(true);
            H6.a(c3284wg.f25650e);
            c3284wg.f25650e = null;
            H6.a(bnC.f22438d.f22480a);
            bnC.f22438d.f22480a = null;
            H6.a(bnC.f22439e);
            bnC.f22439e = null;
            abstractC3170s2.f25295g.b();
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(AbstractC3170s2 abstractC3170s2, ContinuationImpl continuationImpl) throws Throwable {
        C3096p2 c3096p2;
        wk.a aVar;
        abstractC3170s2.getClass();
        if (continuationImpl instanceof C3096p2) {
            c3096p2 = (C3096p2) continuationImpl;
            int i10 = c3096p2.f25032d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3096p2.f25032d = i10 - Integer.MIN_VALUE;
            } else {
                c3096p2 = new C3096p2(abstractC3170s2, continuationImpl);
            }
        } else {
            c3096p2 = new C3096p2(abstractC3170s2, continuationImpl);
        }
        Object obj = c3096p2.f25030b;
        Object objF = sj.a.f();
        int i11 = c3096p2.f25032d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = abstractC3170s2.f25292d;
            c3096p2.f25029a = aVar2;
            c3096p2.f25032d = 1;
            if (aVar2.a(null, c3096p2) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3096p2.f25029a;
            kotlin.c.b(obj);
        }
        try {
            if (abstractC3170s2.f25293e.get()) {
                abstractC3170s2.f25295g.a();
            } else {
                abstractC3170s2.f25295g.b();
            }
            if (abstractC3170s2.f25293e.get()) {
                C3284wg c3284wg = abstractC3170s2.c().f22435a;
                c3284wg.f25651f.set(false);
                c3284wg.a();
            } else {
                C3284wg c3284wg2 = abstractC3170s2.c().f22435a;
                c3284wg2.f25647b.setValue(Mn.HIDDEN);
                c3284wg2.f25651f.set(true);
                H6.a(c3284wg2.f25650e);
                c3284wg2.f25650e = null;
            }
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    public abstract Bn c();

    public AbstractC3170s2(nk.l0 l0Var, C3241un c3241un, C3316xn c3316xn, qk.l lVar) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(c3241un, "viewabilityModel");
        ck.p.j(c3316xn, "viewabilityCriteria");
        ck.p.j(lVar, "lifecycleObserver");
        this.f25289a = l0Var;
        this.f25290b = c3316xn;
        this.f25291c = lVar;
        this.f25292d = wk.g.b(false, 1, null);
        this.f25293e = new AtomicBoolean(false);
        this.f25295g = new Ee(l0Var, c3241un);
    }

    @Override // com.inmobi.media.InterfaceC3326y8
    public final void a() {
        this.f25293e.set(false);
        this.f25295g.b();
        Bn bnC = c();
        C3284wg c3284wg = bnC.f22435a;
        c3284wg.f25651f.set(true);
        H6.a(c3284wg.f25650e);
        c3284wg.f25650e = null;
        H6.a(bnC.f22438d.f22480a);
        bnC.f22438d.f22480a = null;
        H6.a(bnC.f22439e);
        bnC.f22439e = null;
        H6.a(this.f25294f);
        this.f25294f = null;
    }

    @Override // com.inmobi.media.InterfaceC3326y8
    public final qk.c b() {
        if (this.f25294f == null) {
            this.f25294f = nk.j.d(this.f25289a, null, null, new C3046n2(this.f25291c, null, this), 3, null);
            mj.r rVar = mj.r.f64562a;
        }
        Bn bnC = c();
        if (bnC.f22439e == null) {
            C3284wg c3284wg = bnC.f22435a;
            c3284wg.a();
            bnC.f22439e = nk.j.d(bnC.f22436b.f22549a, null, null, new C3366zn(c3284wg.f25647b, null, bnC), 3, null);
            mj.r rVar2 = mj.r.f64562a;
        }
        return qk.e.z(qk.e.B(bnC.f22437c, new C3121q2(this, null)), new C3145r2(this, null));
    }
}
