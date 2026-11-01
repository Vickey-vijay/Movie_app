package com.yandex.mobile.ads.common;

import ck.i;
import ck.p;
import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BidderTokenRequestConfiguration {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdapterIdentity f51016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f51017b;

    public static final class AppOpenAd extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f51018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f51019d;

        public AppOpenAd(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f51018c = adapterIdentity;
            this.f51019d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppOpenAd)) {
                return false;
            }
            AppOpenAd appOpenAd = (AppOpenAd) obj;
            return p.e(this.f51018c, appOpenAd.f51018c) && p.e(this.f51019d, appOpenAd.f51019d);
        }

        public int hashCode() {
            return this.f51019d.hashCode() + (this.f51018c.hashCode() * 31);
        }

        public String toString() {
            return "AppOpenAd(adapterIdentity=" + this.f51018c + ", parameters=" + this.f51019d + ")";
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.f51019d;
        }
    }

    public static final class Banner extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f51020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final BannerAdSize f51021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f51022e;

        public Banner(AdapterIdentity adapterIdentity, BannerAdSize bannerAdSize, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f51020c = adapterIdentity;
            this.f51021d = bannerAdSize;
            this.f51022e = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return p.e(this.f51020c, banner.f51020c) && p.e(this.f51021d, banner.f51021d) && p.e(this.f51022e, banner.f51022e);
        }

        public int hashCode() {
            int iHashCode = this.f51020c.hashCode() * 31;
            BannerAdSize bannerAdSize = this.f51021d;
            return this.f51022e.hashCode() + ((iHashCode + (bannerAdSize == null ? 0 : bannerAdSize.hashCode())) * 31);
        }

        public String toString() {
            return "Banner(adapterIdentity=" + this.f51020c + ", bannerAdSize=" + this.f51021d + ", parameters=" + this.f51022e + ")";
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public BannerAdSize getBannerAdSize() {
            return this.f51021d;
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.f51022e;
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final AdapterIdentity f51023e = new AdapterIdentity("unknown", "0.0.0");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdType f51024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AdapterIdentity f51025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BannerAdSize f51026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f51027d = kotlin.collections.a.j();

        public final BidderTokenRequestConfiguration build() {
            AdapterIdentity adapterIdentity = this.f51025b;
            if (adapterIdentity == null) {
                adapterIdentity = f51023e;
            }
            switch (a.f51037a[this.f51024a.ordinal()]) {
                case 1:
                    return new Banner(adapterIdentity, this.f51026c, this.f51027d);
                case 2:
                    return new Interstitial(adapterIdentity, this.f51027d);
                case 3:
                    return new Rewarded(adapterIdentity, this.f51027d);
                case 4:
                    return new Native(adapterIdentity, this.f51027d);
                case 5:
                    return new AppOpenAd(adapterIdentity, this.f51027d);
                case 6:
                    return new Interstitial(adapterIdentity, this.f51027d);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final Builder setBannerAdSize(BannerAdSize bannerAdSize) {
            this.f51026c = bannerAdSize;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f51027d = map;
            return this;
        }

        public Builder(AdType adType) {
            this.f51024a = adType;
        }
    }

    public static final class Interstitial extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f51028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f51029d;

        public Interstitial(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f51028c = adapterIdentity;
            this.f51029d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj;
            return p.e(this.f51028c, interstitial.f51028c) && p.e(this.f51029d, interstitial.f51029d);
        }

        public int hashCode() {
            return this.f51029d.hashCode() + (this.f51028c.hashCode() * 31);
        }

        public String toString() {
            return "Interstitial(adapterIdentity=" + this.f51028c + ", parameters=" + this.f51029d + ")";
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.f51029d;
        }
    }

    public static final class Native extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f51030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f51031d;

        public Native(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f51030c = adapterIdentity;
            this.f51031d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Native)) {
                return false;
            }
            Native r10 = (Native) obj;
            return p.e(this.f51030c, r10.f51030c) && p.e(this.f51031d, r10.f51031d);
        }

        public int hashCode() {
            return this.f51031d.hashCode() + (this.f51030c.hashCode() * 31);
        }

        public String toString() {
            return "Native(adapterIdentity=" + this.f51030c + ", parameters=" + this.f51031d + ")";
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.f51031d;
        }
    }

    public static final class Rewarded extends BidderTokenRequestConfiguration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdapterIdentity f51032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f51033d;

        public Rewarded(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.f51032c = adapterIdentity;
            this.f51033d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rewarded)) {
                return false;
            }
            Rewarded rewarded = (Rewarded) obj;
            return p.e(this.f51032c, rewarded.f51032c) && p.e(this.f51033d, rewarded.f51033d);
        }

        public int hashCode() {
            return this.f51033d.hashCode() + (this.f51032c.hashCode() * 31);
        }

        public String toString() {
            return "Rewarded(adapterIdentity=" + this.f51032c + ", parameters=" + this.f51033d + ")";
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.f51033d;
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map, i iVar) {
        this(adapterIdentity, map);
    }

    public BannerAdSize getBannerAdSize() {
        return null;
    }

    public abstract Map<String, String> getParameters();

    private BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map) {
        this.f51016a = adapterIdentity;
        this.f51017b = map;
    }
}
