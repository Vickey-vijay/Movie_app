package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class Fa implements InterfaceC3759w2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f26519n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f26520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2 f26522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LevelPlayBannerAdView.Config f26523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3621o0 f26524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U8 f26525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f26526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LevelPlayBannerAdViewListener f26527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f26528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Ca f26529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f26530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3489gd f26531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26532m;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final Pair<String, LevelPlayBannerAdView.Config> a(Context context, AttributeSet attributeSet) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            String str = "";
            if (attributeSet == null) {
                return mj.h.a("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            ck.p.i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                int i10 = R.styleable.LevelPlayBannerAdView_bidFloor;
                if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(i10, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return mj.h.a(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public Fa(UUID uuid, String str, W2 w10, LevelPlayBannerAdView.Config config, C3621o0 c3621o0) {
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str, "adUnitId");
        ck.p.j(w10, "bannerContainer");
        ck.p.j(config, "config");
        ck.p.j(c3621o0, "adTools");
        this.f26520a = uuid;
        this.f26521b = str;
        this.f26522c = w10;
        this.f26523d = config;
        this.f26524e = c3621o0;
        this.f26525f = Lb.f26968s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f26526g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f26528i = placementName == null ? "" : placementName;
        c3621o0.e().a(new C3602n(IronSource.a.BANNER, uuid, str));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            c3621o0.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Fa fa2) {
        ck.p.j(fa2, "this$0");
        if (!fa2.f26532m) {
            IronLog.INTERNAL.warning(C3621o0.a(fa2.f26524e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (fa2.f26529j == null) {
            IronLog.INTERNAL.warning(C3621o0.a(fa2.f26524e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C3768wb.a(fa2.f26524e, new Runnable() { // from class: com.ironsource.uh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.b(this.f31429b);
            }
        }, 0L, 2, (Object) null);
        Ca ca2 = fa2.f26529j;
        if (ca2 != null) {
            ca2.c();
        }
        fa2.f26529j = null;
        fa2.f26530k = null;
        fa2.f26527h = null;
    }

    private final boolean h() {
        if (this.f26521b.length() == 0) {
            String string = this.f26520a.toString();
            ck.p.i(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.f26521b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.f26524e.g()) {
            String string2 = this.f26520a.toString();
            ck.p.i(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.f26521b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        C3379ab c3379abA = Lb.f26968s.d().e().a();
        if (c3379abA != null && c3379abA.a(this.f26521b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.f26520a.toString();
            ck.p.i(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.f26521b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f26524e.d(new Runnable() { // from class: com.ironsource.gi
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(this.f29025b);
            }
        });
    }

    public final UUID c() {
        return this.f26520a;
    }

    public final LevelPlayAdSize d() {
        return this.f26526g;
    }

    public final String e() {
        return this.f26521b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.f26527h;
    }

    public final String g() {
        return this.f26528i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f26524e.d(new Runnable() { // from class: com.ironsource.wh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.c(this.f31559b);
            }
        });
    }

    public final void j() {
        mj.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final Ca ca2 = this.f26529j;
        if (ca2 != null) {
            this.f26524e.d(new Runnable() { // from class: com.ironsource.fi
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(this.f28945b, ca2);
                }
            });
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f26530k = Boolean.FALSE;
        }
    }

    public final void k() {
        mj.r rVar;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final Ca ca2 = this.f26529j;
        if (ca2 != null) {
            this.f26524e.d(new Runnable() { // from class: com.ironsource.ei
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.b(this.f28800b, ca2);
                }
            });
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f26530k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Fa fa2) {
        ck.p.j(fa2, "this$0");
        if (fa2.f26532m) {
            IronLog.INTERNAL.warning(C3621o0.a(fa2.f26524e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        fa2.f26532m = true;
        if (fa2.h()) {
            Ca caA = fa2.a();
            fa2.f26529j = caA;
            Boolean bool = fa2.f26530k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    caA.f();
                } else {
                    caA.d();
                }
            }
            caA.b();
        }
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void d(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.ci
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(levelPlayAdInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void e(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.di
            @Override // java.lang.Runnable
            public final void run() {
                Fa.c(levelPlayAdInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Fa fa2) {
        ck.p.j(fa2, "this$0");
        fa2.f26522c.removeAllViews();
        ViewParent parent = fa2.f26522c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(fa2.f26522c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Fa fa2, Ca ca2) {
        ck.p.j(fa2, "this$0");
        ck.p.j(ca2, "$it");
        fa2.f26524e.e().f().c();
        ca2.f();
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void b(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.yh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.b(levelPlayAdInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(levelPlayAdInfo);
        }
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f26524e.d(new Runnable() { // from class: com.ironsource.ai
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(this.f28202b, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fa fa2, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        ck.p.j(fa2, "this$0");
        fa2.f26527h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Fa fa2, Ca ca2) {
        ck.p.j(fa2, "this$0");
        ck.p.j(ca2, "$it");
        fa2.f26524e.e().f().b();
        ca2.d();
    }

    public /* synthetic */ Fa(UUID uuid, String str, W2 w10, LevelPlayBannerAdView.Config config, C3621o0 c3621o0, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? C3815z7.f31705a.a() : uuid, str, w10, config, (i10 & 16) != 0 ? new C3621o0(IronSource.a.BANNER, E0.b.MEDIATION) : c3621o0);
    }

    private final Ca a() {
        C3489gd c3489gd;
        this.f26531l = this.f26524e.a(this.f26528i);
        Context context = this.f26522c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f26520a;
        String str = this.f26521b;
        C3489gd c3489gd2 = this.f26531l;
        C3489gd c3489gd3 = null;
        if (c3489gd2 == null) {
            ck.p.B("bannerPlacement");
            c3489gd = null;
        } else {
            c3489gd = c3489gd2;
        }
        J2 j10 = new J2(uuid, str, c3489gd, this.f26526g, null, null, this.f26525f.a(), this.f26523d.getBidFloor(), 48, null);
        this.f26524e.e().a(new C0(this.f26524e, j10, null, 4, null));
        ISBannerSize iSBannerSizeA = this.f26524e.a(j10.h());
        E5 e5E = this.f26524e.e();
        C3621o0 c3621o0 = this.f26524e;
        C3489gd c3489gd4 = this.f26531l;
        if (c3489gd4 == null) {
            ck.p.B("bannerPlacement");
        } else {
            c3489gd3 = c3489gd4;
        }
        e5E.a(new Y2(c3621o0, iSBannerSizeA, c3489gd3.c()));
        return new Ca(this, this.f26524e, j10, this.f26522c);
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void c(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.xh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.d(levelPlayAdInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void a(final LevelPlayAdInfo levelPlayAdInfo, final boolean z10) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.vh
            @Override // java.lang.Runnable
            public final void run() {
                Fa.a(z10, levelPlayAdInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z10, LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z10 + " adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f26524e.e(new Runnable() { // from class: com.ironsource.bi
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Fa fa2) {
        ck.p.j(levelPlayAdError, "$it");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(levelPlayAdError);
        }
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void a(final LevelPlayAdInfo levelPlayAdInfo, final LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f26524e.e(new Runnable() { // from class: com.ironsource.zh
                @Override // java.lang.Runnable
                public final void run() {
                    Fa.a(levelPlayAdInfo, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(levelPlayAdError, "$it");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + levelPlayAdInfo + " error: " + levelPlayAdError);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(levelPlayAdInfo, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo levelPlayAdInfo, Fa fa2) {
        ck.p.j(levelPlayAdInfo, "$adInfo");
        ck.p.j(fa2, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + levelPlayAdInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = fa2.f26527h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3759w2
    public void a(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26524e.e(new Runnable() { // from class: com.ironsource.th
            @Override // java.lang.Runnable
            public final void run() {
                Fa.e(levelPlayAdInfo, this);
            }
        });
    }
}
