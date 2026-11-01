package com.ironsource;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3823zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U8.a f31747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<TestSuiteActivity> f31748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f31749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<LevelPlayBannerAdView> f31750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<LevelPlayInterstitialAd> f31751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<LevelPlayRewardedAd> f31752f;

    public final void a(Hf hf2) {
        ck.p.j(hf2, "loadAdConfig");
        this.f31747a.a(hf2);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f31751e;
        String strA = hf2.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new Ef());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void b(Hf hf2) {
        ck.p.j(hf2, "loadAdConfig");
        this.f31747a.a(hf2);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f31752f;
        String strA = hf2.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new Nf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f31751e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f31752f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public C3823zf(TestSuiteActivity testSuiteActivity, Handler handler) {
        ck.p.j(testSuiteActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(handler, "handler");
        this.f31747a = Lb.f26968s.a().c();
        this.f31748b = new WeakReference<>(testSuiteActivity);
        this.f31749c = handler;
        this.f31750d = new AtomicReference<>();
        this.f31751e = new AtomicReference<>();
        this.f31752f = new AtomicReference<>();
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f31751e.get();
            ck.p.i(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f31752f.get();
            ck.p.i(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        ck.p.j(testSuiteActivity, "$testSuiteActivity");
        ck.p.j(levelPlayBannerAdView, "$it");
        testSuiteActivity.getContainer().removeView(levelPlayBannerAdView);
    }

    public final void a(Hf hf2, String str, int i10, int i11) {
        ck.p.j(hf2, "loadAdConfig");
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.f31747a.a(hf2);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Kf.f26939a.b(str, i10, i11)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f31750d;
            String strA = hf2.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new Af());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    private final TestSuiteActivity b() {
        return this.f31748b.get();
    }

    public final void a(double d10) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.f31750d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f31749c.post(new Runnable() { // from class: com.ironsource.jn
            @Override // java.lang.Runnable
            public final void run() {
                C3823zf.a(testSuiteActivityB, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView) {
        ck.p.j(testSuiteActivity, "$testSuiteActivity");
        ck.p.j(levelPlayBannerAdView, "$banner");
        testSuiteActivity.getContainer().addView(levelPlayBannerAdView, Pf.f27382a.a((Context) testSuiteActivity));
    }

    public final void a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.f31750d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f31749c.post(new Runnable() { // from class: com.ironsource.in
            @Override // java.lang.Runnable
            public final void run() {
                C3823zf.b(testSuiteActivityB, andSet);
            }
        });
    }
}
