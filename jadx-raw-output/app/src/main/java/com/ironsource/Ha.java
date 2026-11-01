package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ha implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2 f26731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J2 f26734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Ea f26735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N2 f26736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3755vf f26737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3710t4 f26738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M0 f26739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC3791y0 f26740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private O2 f26741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Ra f26742m;

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ha.this.n().onAdLeftApplication();
        }

        public void b() {
            Ha.this.n().k();
        }

        public void c() {
            Ha.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ha.this.n().onAdClicked();
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r g() {
            a();
            return mj.r.f64562a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r h() {
            c();
            return mj.r.f64562a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ mj.r j() {
            b();
            return mj.r.f64562a;
        }
    }

    public static final class b implements M0 {
        @Override // com.ironsource.M0
        public void a(C3706t0 c3706t0) {
            ck.p.j(c3706t0, "adUnitCallback");
            Ha.this.m().a(c3706t0);
        }

        public b() {
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Ha.this.m().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC3791y0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC3791y0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            Ha.this.n().onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3791y0
        public void c(IronSourceError ironSourceError) {
            Ha.this.n().d(ironSourceError);
        }
    }

    public static final class d extends Lambda implements bk.a<mj.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f26747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC3515i3 f26748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L2 l10, AbstractC3515i3 abstractC3515i3) {
            super(0);
            this.f26747b = l10;
            this.f26748c = abstractC3515i3;
        }

        public final void a() {
            Ha.this.a(this.f26747b, this.f26748c);
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ mj.r invoke() {
            a();
            return mj.r.f64562a;
        }
    }

    public static final class e extends Lambda implements bk.a<mj.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f26750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f26751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L2 l10, Long l11) {
            super(0);
            this.f26750b = l10;
            this.f26751c = l11;
        }

        public final void a() {
            Ha ha2 = Ha.this;
            ha2.a((Ra) new La(ha2, this.f26750b, this.f26751c));
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ mj.r invoke() {
            a();
            return mj.r.f64562a;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f26753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC3515i3 f26754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f26755d;

        public static final class a extends Lambda implements bk.a<mj.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ha f26756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L2 f26757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC3515i3 f26758c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ha ha2, L2 l10, AbstractC3515i3 abstractC3515i3) {
                super(0);
                this.f26756a = ha2;
                this.f26757b = l10;
                this.f26758c = abstractC3515i3;
            }

            public final void a() {
                this.f26756a.a(this.f26757b, this.f26758c);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ mj.r invoke() {
                a();
                return mj.r.f64562a;
            }
        }

        public static final class b extends Lambda implements bk.a<mj.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ha f26759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L2 f26760b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Long f26761c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ha ha2, L2 l10, Long l11) {
                super(0);
                this.f26759a = ha2;
                this.f26760b = l10;
                this.f26761c = l11;
            }

            public final void a() {
                Ha ha2 = this.f26759a;
                ha2.a((Ra) new La(ha2, this.f26760b, this.f26761c));
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ mj.r invoke() {
                a();
                return mj.r.f64562a;
            }
        }

        public f(L2 l10, AbstractC3515i3 abstractC3515i3, Long l11) {
            this.f26753b = l10;
            this.f26754c = abstractC3515i3;
            this.f26755d = l11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ha.this.k().getViewTreeObserver().isAlive()) {
                Ha.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (rg.a(Ha.this.k(), new Rect())) {
                C3768wb.a((C3768wb) Ha.this.a(), AbstractRunnableC3526ie.f29164a.a(new a(Ha.this, this.f26753b, this.f26754c)), 0L, 2, (Object) null);
            } else {
                C3768wb.a((C3768wb) Ha.this.a(), AbstractRunnableC3526ie.f29164a.a(new b(Ha.this, this.f26753b, this.f26755d)), 0L, 2, (Object) null);
            }
        }
    }

    public Ha(C3621o0 c3621o0, W2 w10, long j10, long j11, J2 j12, Ea ea2, N2 n10, InterfaceC3755vf interfaceC3755vf, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(w10, "bannerContainer");
        ck.p.j(j12, "bannerAdProperties");
        ck.p.j(ea2, "strategyListener");
        ck.p.j(n10, "bannerAdUnitFactory");
        ck.p.j(interfaceC3755vf, "taskScheduler");
        ck.p.j(interfaceC3710t4, "timeProvider");
        this.f26730a = c3621o0;
        this.f26731b = w10;
        this.f26732c = j10;
        this.f26733d = j11;
        this.f26734e = j12;
        this.f26735f = ea2;
        this.f26736g = n10;
        this.f26737h = interfaceC3755vf;
        this.f26738i = interfaceC3710t4;
        this.f26739j = new b();
        this.f26740k = new c();
        this.f26741l = new a();
        this.f26742m = new Ja(this, false, 2, null);
    }

    public final C3621o0 a() {
        return this.f26730a;
    }

    public final void b(Ea ea2) {
        ck.p.j(ea2, "<set-?>");
        this.f26735f = ea2;
    }

    public final void a(M0 m10) {
        ck.p.j(m10, "<set-?>");
        this.f26739j = m10;
    }

    @Override // com.ironsource.Da
    public void b() {
        this.f26742m.b();
    }

    @Override // com.ironsource.Da
    public void c() {
        this.f26742m.c();
    }

    @Override // com.ironsource.Da
    public void d() {
        this.f26742m.d();
    }

    public final O2 e() {
        return this.f26741l;
    }

    @Override // com.ironsource.Da
    public void f() {
        this.f26742m.f();
    }

    public final M0 g() {
        return this.f26739j;
    }

    public final InterfaceC3791y0 h() {
        return this.f26740k;
    }

    public final J2 i() {
        return this.f26734e;
    }

    public final N2 j() {
        return this.f26736g;
    }

    public final W2 k() {
        return this.f26731b;
    }

    public final long l() {
        return this.f26732c;
    }

    public final Ra m() {
        return this.f26742m;
    }

    public final Ea n() {
        return this.f26735f;
    }

    public final InterfaceC3755vf o() {
        return this.f26737h;
    }

    public final InterfaceC3710t4 p() {
        return this.f26738i;
    }

    public final long q() {
        return this.f26733d;
    }

    public final void r() {
        this.f26730a.e().h().h("Banner view is not visible");
    }

    public final void a(InterfaceC3791y0 interfaceC3791y0) {
        ck.p.j(interfaceC3791y0, "<set-?>");
        this.f26740k = interfaceC3791y0;
    }

    public final void a(O2 o10) {
        ck.p.j(o10, "<set-?>");
        this.f26741l = o10;
    }

    public final void a(Ra ra2) {
        ck.p.j(ra2, "<set-?>");
        this.f26742m = ra2;
    }

    public final void a(String str) {
        ck.p.j(str, "message");
        this.f26730a.e().h().f("Banner Reload Strategy - " + str);
    }

    public final void a(C3706t0 c3706t0, L2 l10, L2 l11, AbstractC3515i3 abstractC3515i3, boolean z10, Long l12) {
        mj.r rVar;
        ck.p.j(c3706t0, "adUnitCallback");
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(abstractC3515i3, "reloadReason");
        l10.a(this.f26731b.getViewBinder(), this.f26740k);
        LevelPlayAdInfo levelPlayAdInfoC = c3706t0.c();
        if (levelPlayAdInfoC != null) {
            this.f26735f.onAdLoaded(levelPlayAdInfoC);
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error(C3621o0.a(this.f26730a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l11 != null) {
            l11.a(false);
        }
        if (z10) {
            this.f26742m = new Na(this, l10);
        } else {
            a(l10, abstractC3515i3, l12);
        }
    }

    public /* synthetic */ Ha(C3621o0 c3621o0, W2 w10, long j10, long j11, J2 j12, Ea ea2, N2 n10, InterfaceC3755vf interfaceC3755vf, InterfaceC3710t4 interfaceC3710t4, int i10, ck.i iVar) {
        this(c3621o0, w10, j10, j11, j12, ea2, n10, (i10 & 128) != 0 ? new W6(X6.a(c3621o0.a())) : interfaceC3755vf, interfaceC3710t4);
    }

    public final void a(IronSourceError ironSourceError, L2 l10, AbstractC3515i3 abstractC3515i3, boolean z10, boolean z11, Long l11) {
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(abstractC3515i3, "reloadReason");
        this.f26735f.b(ironSourceError);
        if (z11) {
            this.f26742m = new Na(this, l10);
        } else if (z10) {
            a(l10, abstractC3515i3, l11);
        } else {
            a(l10, abstractC3515i3);
        }
    }

    public final void a(final L2 l10, final AbstractC3515i3 abstractC3515i3, final Long l11) {
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(abstractC3515i3, "reloadReason");
        C3768wb.a(this.f26730a, new Runnable() { // from class: com.ironsource.hi
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(this.f29099b, l10, abstractC3515i3, l11);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ha ha2, L2 l10, AbstractC3515i3 abstractC3515i3, Long l11) {
        ck.p.j(ha2, "this$0");
        ck.p.j(l10, "$currentAdUnit");
        ck.p.j(abstractC3515i3, "$reloadReason");
        if (rg.a(ha2.f26731b, new Rect())) {
            C3768wb.a((C3768wb) ha2.f26730a, AbstractRunnableC3526ie.f29164a.a(ha2.new d(l10, abstractC3515i3)), 0L, 2, (Object) null);
        } else if (!ha2.f26731b.getViewTreeObserver().isAlive()) {
            C3768wb.a((C3768wb) ha2.f26730a, AbstractRunnableC3526ie.f29164a.a(ha2.new e(l10, l11)), 0L, 2, (Object) null);
        } else {
            ha2.f26731b.getViewTreeObserver().addOnGlobalLayoutListener(ha2.new f(l10, abstractC3515i3, l11));
        }
    }

    public final void a(L2 l10, AbstractC3515i3 abstractC3515i3) {
        ck.p.j(l10, "currentAdUnit");
        ck.p.j(abstractC3515i3, "reloadReason");
        L2 l2A = this.f26736g.a(false);
        Oa oa2 = new Oa(this, l10, l2A, this.f26738i.a());
        a(abstractC3515i3);
        this.f26742m = oa2;
        l2A.a(this.f26739j);
    }

    private final void a(AbstractC3515i3 abstractC3515i3) {
        this.f26730a.e().h().a(abstractC3515i3.c(), abstractC3515i3.b(), abstractC3515i3.a());
    }

    @Override // com.ironsource.Da
    public void a(Ea ea2) {
        ck.p.j(ea2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26735f = ea2;
    }
}
