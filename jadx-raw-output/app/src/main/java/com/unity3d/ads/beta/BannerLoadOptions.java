package com.unity3d.ads.beta;

import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: BannerLoadOptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BannerLoadOptions {
    private final String adMarkup;
    private final Pair<Integer, Integer> bannerSize;
    private final Map<String, String> extras;
    private final BannerShowListener listener;
    private final String placementId;

    /* JADX INFO: compiled from: BannerLoadOptions.kt */
    public static final class Builder {
        private String adMarkup;
        private final Pair<Integer, Integer> bannerSize;
        private Map<String, String> extras;
        private BannerShowListener listener;
        private final String placementId;

        public Builder(String str, Pair<Integer, Integer> pair) {
            p.j(str, "placementId");
            p.j(pair, "bannerSize");
            this.placementId = str;
            this.bannerSize = pair;
        }

        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        public final Builder withAdMarkup(String str) {
            p.j(str, "adMarkup");
            this.adMarkup = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            p.j(map, "extras");
            this.extras = map;
            return this;
        }

        public final Builder withListener(BannerShowListener bannerShowListener) {
            p.j(bannerShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.listener = bannerShowListener;
            return this;
        }
    }

    public BannerLoadOptions(String str, Pair<Integer, Integer> pair, String str2, Map<String, String> map, BannerShowListener bannerShowListener) {
        p.j(str, "placementId");
        p.j(pair, "bannerSize");
        this.placementId = str;
        this.bannerSize = pair;
        this.adMarkup = str2;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Pair<Integer, Integer> getBannerSize() {
        return this.bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ BannerLoadOptions(String str, Pair pair, String str2, Map map, BannerShowListener bannerShowListener, int i10, i iVar) {
        this(str, pair, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : bannerShowListener);
    }
}
