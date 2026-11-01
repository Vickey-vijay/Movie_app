package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3469fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7 f28896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3415cb f28897b;

    /* JADX INFO: renamed from: com.ironsource.fb$a */
    public static final class a implements InterfaceC3774x0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3774x0
        public AbstractC3757w0 a(boolean z10, C3476g0 c3476g0) {
            ck.p.j(c3476g0, "adProperties");
            return F9.f26512z.a(c3476g0, C3469fb.this.f28896a.e().a(), z10);
        }
    }

    public C3469fb(String str, C3415cb.b bVar, C3621o0 c3621o0, C3518i6 c3518i6, L7 l10, InterfaceC3710t4 interfaceC3710t4, C3815z7 c3815z7) {
        ck.p.j(str, "adUnitId");
        ck.p.j(bVar, "config");
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3518i6, "adControllerFactory");
        ck.p.j(l10, IronSourceConstants.EVENTS_PROVIDER);
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(c3815z7, "idFactory");
        this.f28896a = l10;
        this.f28897b = new C3415cb(LevelPlay.AdFormat.INTERSTITIAL, str, bVar, c3621o0, c3518i6, a(), l10, interfaceC3710t4, c3815z7);
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f28897b.a(levelPlayInterstitialAdListener != null ? C3487gb.b(levelPlayInterstitialAdListener) : null);
    }

    public final String b() {
        String string = this.f28897b.e().toString();
        ck.p.i(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f28897b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f28897b.n();
    }

    public final void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f28897b.a(activity, str);
    }

    private final InterfaceC3774x0 a() {
        return new a();
    }
}
