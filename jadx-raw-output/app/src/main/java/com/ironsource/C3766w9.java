package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3766w9 implements InterfaceC3482g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O9 f31523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3386b0 f31524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X1 f31525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3657q1 f31526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3577lc f31527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Tf f31528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private P8 f31529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private P8.a f31530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, C3766w9> f31531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterstitialAdInfo f31532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC3783x9 f31533k;

    public C3766w9(O9 o10, InterfaceC3386b0 interfaceC3386b0, X1 x10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar, Map<String, C3766w9> map) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(interfaceC3386b0, "adNetworkShow");
        ck.p.j(x10, "auctionDataReporter");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(interfaceC3577lc, "networkDestroyAPI");
        ck.p.j(tf2, "threadManager");
        ck.p.j(p10, "sessionDepthService");
        ck.p.j(aVar, "sessionDepthServiceEditor");
        ck.p.j(map, "retainer");
        this.f31523a = o10;
        this.f31524b = interfaceC3386b0;
        this.f31525c = x10;
        this.f31526d = interfaceC3657q1;
        this.f31527e = interfaceC3577lc;
        this.f31528f = tf2;
        this.f31529g = p10;
        this.f31530h = aVar;
        this.f31531i = map;
        String strF = o10.f();
        ck.p.i(strF, "adInstance.instanceId");
        String strE = this.f31523a.e();
        ck.p.i(strE, "adInstance.id");
        this.f31532j = new InterstitialAdInfo(strF, strE);
        C3446e6 c3446e6 = new C3446e6();
        this.f31523a.a(c3446e6);
        c3446e6.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        ck.p.j(interstitialAdInfo, "<set-?>");
        this.f31532j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.f31532j;
    }

    public final InterfaceC3783x9 c() {
        return this.f31533k;
    }

    public final boolean d() {
        boolean zA = this.f31524b.a(this.f31523a);
        InterfaceC3530j1.a.f29183a.a(zA).a(this.f31526d);
        return zA;
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidReward(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3766w9 c3766w9) {
        ck.p.j(c3766w9, "this$0");
        InterfaceC3783x9 interfaceC3783x9 = c3766w9.f31533k;
        if (interfaceC3783x9 != null) {
            interfaceC3783x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3766w9 c3766w9) {
        ck.p.j(c3766w9, "this$0");
        InterfaceC3783x9 interfaceC3783x9 = c3766w9.f31533k;
        if (interfaceC3783x9 != null) {
            interfaceC3783x9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC3783x9 interfaceC3783x9) {
        this.f31533k = interfaceC3783x9;
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3530j1.a.f29183a.f(new InterfaceC3604n1[0]).a(this.f31526d);
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidClick() {
        InterfaceC3530j1.a.f29183a.a().a(this.f31526d);
        this.f31528f.a(new Runnable() { // from class: com.ironsource.gm
            @Override // java.lang.Runnable
            public final void run() {
                C3766w9.b(this.f29032b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidDismiss() {
        this.f31531i.remove(this.f31532j.getAdId());
        InterfaceC3530j1.a.f29183a.a(new InterfaceC3604n1[0]).a(this.f31526d);
        this.f31528f.a(new Runnable() { // from class: com.ironsource.jm
            @Override // java.lang.Runnable
            public final void run() {
                C3766w9.c(this.f29302b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidShow() {
        P8 p10 = this.f31529g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC3530j1.a.f29183a.b(new C3584m1.w(p10.a(aVar))).a(this.f31526d);
        this.f31530h.b(aVar);
        this.f31525c.b("onAdInstanceDidShow");
        this.f31528f.a(new Runnable() { // from class: com.ironsource.km
            @Override // java.lang.Runnable
            public final void run() {
                C3766w9.d(this.f29385b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3766w9 c3766w9) {
        ck.p.j(c3766w9, "this$0");
        InterfaceC3783x9 interfaceC3783x9 = c3766w9.f31533k;
        if (interfaceC3783x9 != null) {
            interfaceC3783x9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f31531i.put(this.f31532j.getAdId(), this);
        if (!this.f31524b.a(this.f31523a)) {
            a(C3813z5.f31697a.t());
        } else {
            InterfaceC3530j1.a.f29183a.d(new InterfaceC3604n1[0]).a(this.f31526d);
            this.f31524b.a(activity, this.f31523a);
        }
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void a(String str) {
        a(C3813z5.f31697a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f31531i.remove(this.f31532j.getAdId());
        InterfaceC3530j1.a.f29183a.a(new C3584m1.j(ironSourceError.getErrorCode()), new C3584m1.k(ironSourceError.getErrorMessage())).a(this.f31526d);
        this.f31528f.a(new Runnable() { // from class: com.ironsource.hm
            @Override // java.lang.Runnable
            public final void run() {
                C3766w9.a(this.f29107b, ironSourceError);
            }
        });
    }

    public /* synthetic */ C3766w9(O9 o10, InterfaceC3386b0 interfaceC3386b0, X1 x10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar, Map map, int i10, ck.i iVar) {
        this(o10, interfaceC3386b0, x10, interfaceC3657q1, (i10 & 16) != 0 ? new C3595mc() : interfaceC3577lc, (i10 & 32) != 0 ? V7.f27797a : tf2, (i10 & 64) != 0 ? Lb.f26968s.d().s() : p10, (i10 & 128) != 0 ? Lb.f26968s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3766w9 c3766w9, IronSourceError ironSourceError) {
        ck.p.j(c3766w9, "this$0");
        ck.p.j(ironSourceError, "$error");
        InterfaceC3783x9 interfaceC3783x9 = c3766w9.f31533k;
        if (interfaceC3783x9 != null) {
            interfaceC3783x9.onAdInstanceDidFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        Tf.a(this.f31528f, new Runnable() { // from class: com.ironsource.im
            @Override // java.lang.Runnable
            public final void run() {
                C3766w9.a(this.f29175b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3766w9 c3766w9) {
        ck.p.j(c3766w9, "this$0");
        InterfaceC3530j1.d.f29206a.b().a(c3766w9.f31526d);
        c3766w9.f31527e.a(c3766w9.f31523a);
    }
}
