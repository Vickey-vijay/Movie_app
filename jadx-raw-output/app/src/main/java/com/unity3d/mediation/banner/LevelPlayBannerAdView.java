package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3815z7;
import com.ironsource.Fa;
import com.ironsource.W2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fa f45333a;

    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LevelPlayAdSize f45334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Double f45335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f45336c;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private LevelPlayAdSize f45337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Double f45338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f45339c;

            public final Config build() {
                return new Config(this.f45337a, this.f45338b, this.f45339c);
            }

            public final Builder setAdSize(LevelPlayAdSize levelPlayAdSize) {
                p.j(levelPlayAdSize, C3426d4.i.O);
                this.f45337a = levelPlayAdSize;
                return this;
            }

            public final Builder setPlacementName(String str) {
                p.j(str, "placementName");
                this.f45339c = str;
                return this;
            }

            public final Builder setBidFloor(double d10) {
                this.f45338b = Double.valueOf(d10);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            private Companion() {
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                levelPlayAdSize = config.f45334a;
            }
            if ((i10 & 2) != 0) {
                d10 = config.f45335b;
            }
            if ((i10 & 4) != 0) {
                str = config.f45336c;
            }
            return config.copy(levelPlayAdSize, d10, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f45334a;
        }

        public final Double component2() {
            return this.f45335b;
        }

        public final String component3() {
            return this.f45336c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            return new Config(levelPlayAdSize, d10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return p.e(this.f45334a, config.f45334a) && p.e(this.f45335b, config.f45335b) && p.e(this.f45336c, config.f45336c);
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f45334a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d10 = this.f45335b;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str = this.f45336c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Config(adSize=" + this.f45334a + ", bidFloor=" + this.f45335b + ", placementName=" + this.f45336c + ")";
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            this.f45334a = levelPlayAdSize;
            this.f45335b = d10;
            this.f45336c = str;
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f45334a;
        }

        public final Double getBidFloor() {
            return this.f45335b;
        }

        public final String getPlacementName() {
            return this.f45336c;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : levelPlayAdSize, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        p.j(context, GAMConfig.KEY_CONTEXT);
    }

    private final Fa a(String str, Config config) {
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        W2 w2A = a(context);
        addView(w2A);
        return new Fa(C3815z7.f31705a.a(), str, w2A, config, null, 16, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.j(context, GAMConfig.KEY_CONTEXT);
    }

    public final void destroy() {
        this.f45333a.b();
    }

    public final String getAdId() {
        String string = this.f45333a.c().toString();
        p.i(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f45333a.d();
    }

    public final String getAdUnitId() {
        return this.f45333a.e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f45333a.f();
    }

    public final String getPlacementName() {
        return this.f45333a.g();
    }

    public final void loadAd() {
        this.f45333a.i();
    }

    public final void pauseAutoRefresh() {
        this.f45333a.j();
    }

    public final void resumeAutoRefresh() {
        this.f45333a.k();
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f45333a.a(levelPlayBannerAdViewListener);
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.j(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> pairA = Fa.f26519n.a(context, attributeSet);
        this.f45333a = a(pairA.component1(), pairA.component2());
    }

    private final W2 a(Context context) {
        W2 w10 = new W2(context);
        w10.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String str) {
        this(context, str, Config.Companion.empty());
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String str, Config config) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "adUnitId");
        p.j(config, "config");
        IronLog.API.info("adUnitId: " + str + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f45333a = a(str, config);
    }
}
