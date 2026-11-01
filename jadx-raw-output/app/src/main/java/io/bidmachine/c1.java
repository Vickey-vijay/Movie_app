package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AuctionResultImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements AuctionResult {

    @Nullable
    private final String[] adDomains;

    @Nullable
    private final String cid;

    @Nullable
    private final CreativeFormat creativeFormat;

    @NonNull
    private final String creativeId;

    @NonNull
    private final Map<String, String> customParams;

    @Nullable
    private final String deal;

    @Nullable
    private final String demandSource;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    private final String f59095id;

    @NonNull
    private final String networkKey;

    @NonNull
    private final Map<String, String> networkParams;
    private final double price;

    @NonNull
    private Map<String, String> createCustomParams(@Nullable AdExtension adExtension) {
        HashMap map = new HashMap();
        if (adExtension != null) {
            try {
                map.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @NonNull
    @VisibleForTesting
    public Map<String, String> createClientParams(@Nullable HeaderBiddingAd headerBiddingAd) {
        Map<String, String> clientParamsMap;
        HashMap map = new HashMap();
        if (headerBiddingAd != null && (clientParamsMap = headerBiddingAd.getClientParamsMap()) != null) {
            map.putAll(clientParamsMap);
        }
        return map;
    }

    @Override // io.bidmachine.models.AuctionResult
    @Nullable
    public String[] getAdDomains() {
        return this.adDomains;
    }

    @Override // io.bidmachine.models.AuctionResult
    @Nullable
    public String getCid() {
        return this.cid;
    }

    @Override // io.bidmachine.models.AuctionResult
    @Nullable
    public CreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @Override // io.bidmachine.models.AuctionResult
    @NonNull
    public String getCreativeId() {
        return this.creativeId;
    }

    @Override // io.bidmachine.models.AuctionResult
    @NonNull
    public Map<String, String> getCustomParams() {
        return this.customParams;
    }

    @Override // io.bidmachine.models.AuctionResult
    @Nullable
    public String getDeal() {
        return this.deal;
    }

    @Override // io.bidmachine.models.AuctionResult
    @Nullable
    public String getDemandSource() {
        return this.demandSource;
    }

    @Override // io.bidmachine.models.AuctionResult
    @NonNull
    public String getId() {
        return this.f59095id;
    }

    @Override // io.bidmachine.models.AuctionResult
    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    @Override // io.bidmachine.models.AuctionResult
    @NonNull
    public Map<String, String> getNetworkParams() {
        return this.networkParams;
    }

    @Override // io.bidmachine.models.AuctionResult
    public double getPrice() {
        return this.price;
    }

    @NonNull
    public String toString() {
        return "id=" + this.f59095id + ", demandSource=" + this.demandSource + ", price=" + this.price + ", creativeId=" + this.creativeId + ", cid=" + this.cid;
    }

    public c1(@NonNull AdsType adsType, @NonNull Response.Seatbid seatbid, @NonNull Response.Seatbid.Bid bid, @NonNull Ad ad2, @NonNull NetworkAdapter networkAdapter, @Nullable AdExtension adExtension) {
        this.f59095id = bid.getId();
        this.demandSource = seatbid.getSeat();
        this.price = bid.getPrice();
        this.deal = bid.getDeal();
        this.creativeId = ad2.getId();
        this.cid = bid.getCid();
        if (ad2.getAdomainCount() > 0) {
            this.adDomains = (String[]) ad2.getAdomainList().toArray(new String[0]);
        } else {
            this.adDomains = null;
        }
        this.customParams = createCustomParams(adExtension);
        this.networkKey = networkAdapter.getKey();
        this.networkParams = createClientParams(adsType.obtainHeaderBiddingAd(ad2));
        this.creativeFormat = identifyCreativeFormat(ad2);
    }

    @Nullable
    @VisibleForTesting
    public static CreativeFormat identifyCreativeFormat(@NonNull Ad ad2) {
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            if (!display.hasBanner() && TextUtils.isEmpty(display.getAdm())) {
                if (display.hasNative()) {
                    return CreativeFormat.Native;
                }
                return null;
            }
            return CreativeFormat.Banner;
        }
        if (ad2.hasVideo()) {
            return CreativeFormat.Video;
        }
        return null;
    }
}
