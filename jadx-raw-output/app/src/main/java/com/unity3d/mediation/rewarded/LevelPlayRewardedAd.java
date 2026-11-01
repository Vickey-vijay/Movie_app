package com.unity3d.mediation.rewarded;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.i;
import ck.p;
import com.ironsource.C3415cb;
import com.ironsource.C3518i6;
import com.ironsource.C3621o0;
import com.ironsource.C3667qb;
import com.ironsource.C3815z7;
import com.ironsource.E0;
import com.ironsource.InterfaceC3710t4;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: loaded from: classes5.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3667qb f45349b;

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private Companion() {
        }

        public final boolean isPlacementCapped(String str) {
            p.j(str, "placementName");
            return C3415cb.f28339n.a(str, LevelPlay.AdFormat.REWARDED);
        }
    }

    public static final class Config implements C3415cb.b {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Double f45350a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Double f45351a;

            public final Config build() {
                return new Config(this.f45351a);
            }

            public final Builder setBidFloor(double d10) {
                this.f45351a = Double.valueOf(d10);
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = config.f45350a;
            }
            return config.copy(d10);
        }

        public final Double component1() {
            return this.f45350a;
        }

        public final Config copy(Double d10) {
            return new Config(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && p.e(this.f45350a, ((Config) obj).f45350a);
        }

        public int hashCode() {
            Double d10 = this.f45350a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f45350a + ")";
        }

        public Config(Double d10) {
            this.f45350a = d10;
        }

        @Override // com.ironsource.C3415cb.b
        public Double getBidFloor() {
            return this.f45350a;
        }

        public /* synthetic */ Config(Double d10, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : d10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String str) {
        this(str, Config.Companion.empty());
        p.j(str, "adUnitId");
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public final void showAd(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String str, Config config) {
        this(str, new C3415cb.c(new C3621o0(IronSource.a.REWARDED_VIDEO, E0.b.MEDIATION), new C3518i6(), Lb.f26968s.d(), new InterfaceC3710t4.a(), C3815z7.f31705a, config));
        p.j(str, "adUnitId");
        p.j(config, "config");
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f45349b.a();
    }

    public final String getAdUnitId() {
        return this.f45348a;
    }

    public final boolean isAdReady() {
        return this.f45349b.b();
    }

    public final void loadAd() {
        this.f45349b.c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f45349b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity, String str) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f45349b.a(activity, str);
    }

    public LevelPlayRewardedAd(String str, C3415cb.c cVar) {
        p.j(str, "adUnitId");
        p.j(cVar, "payload");
        IronLog.API.info("adUnitId: " + str + ", config: " + cVar.c());
        this.f45348a = str;
        this.f45349b = new C3667qb(str, cVar.c(), cVar.b(), cVar.a(), cVar.f(), cVar.d(), cVar.e());
    }
}
