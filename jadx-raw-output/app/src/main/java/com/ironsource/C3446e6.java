package com.ironsource;

import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3446e6 implements Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3464f6 f28737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<InterfaceC3482g6> f28738b = new WeakReference<>(null);

    public final void a(InterfaceC3464f6 interfaceC3464f6) {
        ck.p.j(interfaceC3464f6, "loadListener");
        this.f28737a = interfaceC3464f6;
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowSuccess() {
    }

    /* JADX INFO: renamed from: com.ironsource.e6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28739a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f28740b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC3482g6 interfaceC3482g6) {
        ck.p.j(interfaceC3482g6, "showListener");
        this.f28738b = new WeakReference<>(interfaceC3482g6);
    }

    @Override // com.ironsource.Kc
    public void onInterstitialAdRewarded(String str, int i10) {
        InterfaceC3482g6 interfaceC3482g6 = this.f28738b.get();
        if (interfaceC3482g6 != null) {
            interfaceC3482g6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClick() {
        InterfaceC3482g6 interfaceC3482g6 = this.f28738b.get();
        if (interfaceC3482g6 != null) {
            interfaceC3482g6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClose() {
        InterfaceC3482g6 interfaceC3482g6 = this.f28738b.get();
        if (interfaceC3482g6 != null) {
            interfaceC3482g6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC3482g6 interfaceC3482g6;
        if (!ck.p.e(str, "impressions") || (interfaceC3482g6 = this.f28738b.get()) == null) {
            return;
        }
        interfaceC3482g6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadFailed(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        InterfaceC3464f6 interfaceC3464f6 = this.f28737a;
        if (interfaceC3464f6 != null) {
            interfaceC3464f6.a(str);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadSuccess(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        InterfaceC3464f6 interfaceC3464f6 = this.f28737a;
        if (interfaceC3464f6 != null) {
            interfaceC3464f6.a(o10);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialOpen() {
        InterfaceC3482g6 interfaceC3482g6 = this.f28738b.get();
        if (interfaceC3482g6 != null) {
            interfaceC3482g6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowFailed(String str) {
        InterfaceC3482g6 interfaceC3482g6 = this.f28738b.get();
        if (interfaceC3482g6 != null) {
            interfaceC3482g6.a(str);
        }
    }
}
