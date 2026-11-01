package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Nd implements InterfaceC3482g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O9 f27104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3386b0 f27105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X1 f27106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3657q1 f27107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3577lc f27108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Tf f27109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private P8 f27110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private P8.a f27111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Nd> f27112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RewardedAdInfo f27113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Od f27114k;

    public Nd(O9 o10, InterfaceC3386b0 interfaceC3386b0, X1 x10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar, Map<String, Nd> map) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(interfaceC3386b0, "adNetworkShow");
        ck.p.j(x10, "auctionDataReporter");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(interfaceC3577lc, "networkDestroyAPI");
        ck.p.j(tf2, "threadManager");
        ck.p.j(p10, "sessionDepthService");
        ck.p.j(aVar, "sessionDepthServiceEditor");
        ck.p.j(map, "retainer");
        this.f27104a = o10;
        this.f27105b = interfaceC3386b0;
        this.f27106c = x10;
        this.f27107d = interfaceC3657q1;
        this.f27108e = interfaceC3577lc;
        this.f27109f = tf2;
        this.f27110g = p10;
        this.f27111h = aVar;
        this.f27112i = map;
        String strF = o10.f();
        ck.p.i(strF, "adInstance.instanceId");
        String strE = this.f27104a.e();
        ck.p.i(strE, "adInstance.id");
        this.f27113j = new RewardedAdInfo(strF, strE);
        C3446e6 c3446e6 = new C3446e6();
        this.f27104a.a(c3446e6);
        c3446e6.a(this);
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        ck.p.j(rewardedAdInfo, "<set-?>");
        this.f27113j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.f27113j;
    }

    public final Od c() {
        return this.f27114k;
    }

    public final boolean d() {
        boolean zA = this.f27105b.a(this.f27104a);
        InterfaceC3530j1.a.f29183a.a(zA).a(this.f27107d);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Nd nd2) {
        ck.p.j(nd2, "this$0");
        Od od2 = nd2.f27114k;
        if (od2 != null) {
            od2.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Nd nd2) {
        ck.p.j(nd2, "this$0");
        Od od2 = nd2.f27114k;
        if (od2 != null) {
            od2.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Nd nd2) {
        ck.p.j(nd2, "this$0");
        Od od2 = nd2.f27114k;
        if (od2 != null) {
            od2.onRewardedAdShown();
        }
    }

    public final void a(Od od2) {
        this.f27114k = od2;
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3530j1.a.f29183a.f(new InterfaceC3604n1[0]).a(this.f27107d);
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidClick() {
        InterfaceC3530j1.a.f29183a.a().a(this.f27107d);
        this.f27109f.a(new Runnable() { // from class: com.ironsource.pi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.b(this.f30465b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidDismiss() {
        this.f27112i.remove(this.f27113j.getAdId());
        InterfaceC3530j1.a.f29183a.a(new InterfaceC3604n1[0]).a(this.f27107d);
        this.f27109f.a(new Runnable() { // from class: com.ironsource.ri
            @Override // java.lang.Runnable
            public final void run() {
                Nd.c(this.f30634b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidReward(String str, int i10) {
        C3584m1.u uVar = new C3584m1.u("Virtual Item");
        C3584m1.t tVar = new C3584m1.t(1);
        C3584m1.q qVar = new C3584m1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.f27104a.g());
        ck.p.i(strA, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC3530j1.a.f29183a.c(uVar, tVar, qVar, new C3584m1.y(strA)).a(this.f27107d);
        this.f27109f.a(new Runnable() { // from class: com.ironsource.qi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.d(this.f30567b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3482g6
    public void onAdInstanceDidShow() {
        P8 p10 = this.f27110g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC3530j1.a.f29183a.b(new C3584m1.w(p10.a(aVar))).a(this.f27107d);
        this.f27111h.b(aVar);
        this.f27106c.b("onAdInstanceDidShow");
        this.f27109f.a(new Runnable() { // from class: com.ironsource.oi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.e(this.f30372b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Nd nd2) {
        ck.p.j(nd2, "this$0");
        Od od2 = nd2.f27114k;
        if (od2 != null) {
            od2.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f27112i.put(this.f27113j.getAdId(), this);
        if (!this.f27105b.a(this.f27104a)) {
            a(C3813z5.f31697a.t());
        } else {
            InterfaceC3530j1.a.f29183a.d(new InterfaceC3604n1[0]).a(this.f27107d);
            this.f27105b.a(activity, this.f27104a);
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
        this.f27112i.remove(this.f27113j.getAdId());
        InterfaceC3530j1.a.f29183a.a(new C3584m1.j(ironSourceError.getErrorCode()), new C3584m1.k(ironSourceError.getErrorMessage())).a(this.f27107d);
        this.f27109f.a(new Runnable() { // from class: com.ironsource.si
            @Override // java.lang.Runnable
            public final void run() {
                Nd.a(this.f31233b, ironSourceError);
            }
        });
    }

    public /* synthetic */ Nd(O9 o10, InterfaceC3386b0 interfaceC3386b0, X1 x10, InterfaceC3657q1 interfaceC3657q1, InterfaceC3577lc interfaceC3577lc, Tf tf2, P8 p10, P8.a aVar, Map map, int i10, ck.i iVar) {
        this(o10, interfaceC3386b0, x10, interfaceC3657q1, (i10 & 16) != 0 ? new C3595mc() : interfaceC3577lc, (i10 & 32) != 0 ? V7.f27797a : tf2, (i10 & 64) != 0 ? Lb.f26968s.d().s() : p10, (i10 & 128) != 0 ? Lb.f26968s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd nd2, IronSourceError ironSourceError) {
        ck.p.j(nd2, "this$0");
        ck.p.j(ironSourceError, "$error");
        Od od2 = nd2.f27114k;
        if (od2 != null) {
            od2.onRewardedAdFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        Tf.a(this.f27109f, new Runnable() { // from class: com.ironsource.ni
            @Override // java.lang.Runnable
            public final void run() {
                Nd.a(this.f30320b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd nd2) {
        ck.p.j(nd2, "this$0");
        InterfaceC3530j1.d.f29206a.b().a(nd2.f27107d);
        nd2.f27108e.a(nd2.f27104a);
    }
}
