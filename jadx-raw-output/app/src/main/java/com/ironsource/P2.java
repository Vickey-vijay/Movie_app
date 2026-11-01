package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class P2 implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O9 f27309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3555k8 f27310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W1 f27311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3657q1 f27312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3577lc f27313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Tf f27314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P8 f27315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final P8.a f27316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BannerAdInfo f27317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<Q2> f27318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WeakReference<FrameLayout> f27319k;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ck.p.j(view, "v");
            C3520i8 size = P2.this.d().getSize();
            ((FrameLayout) view).addView(P2.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ck.p.j(view, "v");
            ((FrameLayout) view).removeAllViews();
        }
    }

    public P2(O9 o10, C3555k8 c3555k8, W1 w10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(c3555k8, "container");
        ck.p.j(w10, "auctionDataReporter");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(interfaceC3577lc, "networkDestroyAPI");
        ck.p.j(tf2, "threadManager");
        ck.p.j(p10, "sessionDepthService");
        ck.p.j(aVar, "sessionDepthServiceEditor");
        this.f27309a = o10;
        this.f27310b = c3555k8;
        this.f27311c = w10;
        this.f27312d = interfaceC3657q1;
        this.f27313e = interfaceC3577lc;
        this.f27314f = tf2;
        this.f27315g = p10;
        this.f27316h = aVar;
        String strF = o10.f();
        ck.p.i(strF, "adInstance.instanceId");
        String strE = o10.e();
        ck.p.i(strE, "adInstance.id");
        this.f27317i = new BannerAdInfo(strF, strE);
        this.f27318j = new WeakReference<>(null);
        this.f27319k = new WeakReference<>(null);
        Jc jc2 = new Jc();
        o10.a(jc2);
        jc2.a(this);
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        ck.p.j(bannerAdInfo, "<set-?>");
        this.f27317i = bannerAdInfo;
    }

    public final void b(WeakReference<FrameLayout> weakReference) {
        ck.p.j(weakReference, "value");
        this.f27319k = weakReference;
        FrameLayout frameLayout = weakReference.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final BannerAdInfo c() {
        return this.f27317i;
    }

    public final C3555k8 d() {
        return this.f27310b;
    }

    public final WeakReference<Q2> e() {
        return this.f27318j;
    }

    public final WeakReference<FrameLayout> f() {
        return this.f27319k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 p10) {
        ck.p.j(p10, "this$0");
        Q2 q10 = p10.f27318j.get();
        if (q10 != null) {
            q10.onBannerAdShown();
        }
    }

    public final void a(WeakReference<Q2> weakReference) {
        ck.p.j(weakReference, "<set-?>");
        this.f27318j = weakReference;
    }

    @Override // com.ironsource.C2
    public void onBannerClick() {
        InterfaceC3530j1.a.f29183a.a().a(this.f27312d);
        this.f27314f.a(new Runnable() { // from class: com.ironsource.ui
            @Override // java.lang.Runnable
            public final void run() {
                P2.b(this.f31430b);
            }
        });
    }

    @Override // com.ironsource.C2
    public void onBannerShowSuccess() {
        P8 p10 = this.f27315g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC3530j1.a.f29183a.f(new C3584m1.w(p10.a(aVar))).a(this.f27312d);
        this.f27316h.b(aVar);
        this.f27311c.b("onBannerShowSuccess");
        this.f27314f.a(new Runnable() { // from class: com.ironsource.vi
            @Override // java.lang.Runnable
            public final void run() {
                P2.c(this.f31492b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(P2 p10) {
        ck.p.j(p10, "this$0");
        InterfaceC3530j1.d.f29206a.b().a(p10.f27312d);
        p10.f27313e.a(p10.f27309a);
    }

    public final void b() {
        Tf.a(this.f27314f, new Runnable() { // from class: com.ironsource.ti
            @Override // java.lang.Runnable
            public final void run() {
                P2.a(this.f31333b);
            }
        }, 0L, 2, null);
    }

    public final void finalize() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 p10) {
        ck.p.j(p10, "this$0");
        Q2 q10 = p10.f27318j.get();
        if (q10 != null) {
            q10.onBannerAdClicked();
        }
    }

    private final a a() {
        return new a();
    }

    public /* synthetic */ P2(O9 o10, C3555k8 c3555k8, W1 w10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar, int i10, ck.i iVar) {
        this(o10, c3555k8, w10, interfaceC3657q1, (i10 & 16) != 0 ? new C3595mc() : interfaceC3577lc, (i10 & 32) != 0 ? V7.f27797a : tf2, (i10 & 64) != 0 ? Lb.f26968s.d().s() : p10, (i10 & 128) != 0 ? Lb.f26968s.a().h() : aVar);
    }
}
