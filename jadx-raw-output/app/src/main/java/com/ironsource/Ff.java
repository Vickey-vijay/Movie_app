package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3823zf f26539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gf f26540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8 f26541c;

    @JavascriptInterface
    public final void loadBannerAd(String str, boolean z10, boolean z11, String str2, int i10, int i11) {
        ck.p.j(str, "adNetwork");
        ck.p.j(str2, UnifiedMediationParams.KEY_DESCRIPTION);
        loadBannerAd(null, str, z10, z11, str2, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, boolean z10, boolean z11) {
        ck.p.j(str, "adNetwork");
        loadInterstitialAd(null, str, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, boolean z10, boolean z11) {
        ck.p.j(str, "adNetwork");
        loadRewardedVideoAd(null, str, z10, z11);
    }

    public Ff(C3823zf c3823zf, V8 v10, Gf gf2) {
        ck.p.j(c3823zf, "adsManager");
        ck.p.j(v10, "uiLifeCycleListener");
        ck.p.j(gf2, "javaScriptEvaluator");
        this.f26539a = c3823zf;
        this.f26540b = gf2;
        this.f26541c = v10;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f26540b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f26539a.a(d10);
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f26539a.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Pf.f27382a.a(Boolean.valueOf(this.f26539a.c())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Pf.f27382a.a(Boolean.valueOf(this.f26539a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String str2, boolean z10, boolean z11, String str3, int i10, int i11) {
        ck.p.j(str2, "adNetwork");
        ck.p.j(str3, UnifiedMediationParams.KEY_DESCRIPTION);
        this.f26539a.a(new Hf(str2, z10, Boolean.valueOf(z11), str), str3, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String str2, boolean z10, boolean z11) {
        ck.p.j(str2, "adNetwork");
        this.f26539a.a(new Hf(str2, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String str2, boolean z10, boolean z11) {
        ck.p.j(str2, "adNetwork");
        this.f26539a.b(new Hf(str2, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f26541c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f26539a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f26539a.f();
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f26541c.onClosed();
    }
}
