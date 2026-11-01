package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class BannerAdRequest extends b<BannerAdRequest> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List<AdSize> f69284i;

    public static class Builder extends c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        @Override // sg.bigo.ads.api.c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    public BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.f69284i = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.f69284i.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final /* synthetic */ b a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(this.f69319a, new ArrayList(this.f69284i), this.f69320b);
        bannerAdRequest.a(this.f69326h.f69327a);
        bannerAdRequest.f69321c = this.f69321c;
        bannerAdRequest.f69325g = this.f69325g;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final sg.bigo.ads.api.core.c b() {
        sg.bigo.ads.api.core.c cVarB = super.b();
        if (cVarB != null) {
            return cVarB;
        }
        if (this.f69284i.isEmpty()) {
            return new sg.bigo.ads.api.core.c(1001, 10003, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b
    public int c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put("ad_size", sg.bigo.ads.ad.banner.a.a(this.f69284i));
        return map;
    }
}
