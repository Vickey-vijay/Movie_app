package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3571l6 extends A implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private WeakReference<InterfaceC3589m6> f29400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private C3570l5 f29401y;

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new S6().a(new String[]{Q6.f27472u}).optJSONObject(Q6.f27472u);
        if (jSONObjectOptJSONObject == null) {
            return nj.s.k();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(Q6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return nj.s.k();
        }
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapD = nj.l0.d();
        for (String str : I()) {
            List listN0 = lk.a0.N0(str, new String[]{"="}, false, 2, 2, null);
            if (listN0.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listN0.get(0);
                mapD.put("custom_" + str2, (String) listN0.get(1));
            }
        }
        return nj.l0.c(mapD);
    }

    private final void K() {
        if (v()) {
            f().e().h().l("closed after failure");
            return;
        }
        this.f29401y = new C3570l5();
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC3589m6 interfaceC3589m6 = this.f29400x.get();
        if (interfaceC3589m6 != null) {
            interfaceC3589m6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        if (v()) {
            f().e().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C3570l5.a(this.f29401y);
        LevelPlayReward levelPlayRewardA = Lb.f26968s.d().B().a(k(), n().i().b().c());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = M4.f27037a.a();
        }
        f().e().a().a(k(), levelPlayRewardA.getName(), levelPlayRewardA.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC3589m6 interfaceC3589m6 = this.f29400x.get();
        if (interfaceC3589m6 != null) {
            interfaceC3589m6.a(this, levelPlayRewardA);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        InterfaceC3589m6 interfaceC3589m6 = this.f29400x.get();
        if (interfaceC3589m6 != null) {
            interfaceC3589m6.a(this);
        }
    }

    @Override // com.ironsource.A
    public void a(J j10) {
        ck.p.j(j10, "adInstancePresenter");
        j10.a(this);
    }

    @Override // com.ironsource.A
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objG).destroyAd(n().g());
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3571l6(W0 w10, B b10, H h10, InterfaceC3589m6 interfaceC3589m6) {
        super(w10, b10, h10, interfaceC3589m6);
        ck.p.j(w10, "adTools");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        ck.p.j(interfaceC3589m6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f29400x = new WeakReference<>(interfaceC3589m6);
    }

    private final void O() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.P();
    }

    public final void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (g() instanceof AdapterAdFullScreenInterface) {
                Object objG = g();
                ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "showAd - exception = " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(A0.h(n().h()), str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.cl
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.a(this.f28370b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.zk
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.b(this.f31774b);
            }
        });
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> map) {
        ck.p.j(map, "extraData");
        super.onAdOpened(map);
        a(new Runnable() { // from class: com.ironsource.bl
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.c(this.f28279b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.al
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.d(this.f28209b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.el
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.e(this.f28804b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.dl
            @Override // java.lang.Runnable
            public final void run() {
                C3571l6.f(this.f28705b);
            }
        });
    }

    @Override // com.ironsource.A
    public void A() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            Object objG = g();
            ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
            ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getActiveContext(), this);
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "this$0");
        c3571l6.K();
    }
}
