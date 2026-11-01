package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import ck.i;
import ck.p;
import com.mbridge.msdk.foundation.entity.b;
import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: CustomAudience.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CustomAudience {
    private final Instant activationTime;
    private final List<AdData> ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    /* JADX INFO: compiled from: CustomAudience.kt */
    public static final class Builder {
        private Instant activationTime;
        private List<AdData> ads;
        private Uri biddingLogicUri;
        private AdTechIdentifier buyer;
        private Uri dailyUpdateUri;
        private Instant expirationTime;
        private String name;
        private TrustedBiddingData trustedBiddingData;
        private AdSelectionSignals userBiddingSignals;

        public Builder(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list) {
            p.j(adTechIdentifier, "buyer");
            p.j(str, "name");
            p.j(uri, "dailyUpdateUri");
            p.j(uri2, "biddingLogicUri");
            p.j(list, b.JSON_KEY_ADS);
            this.buyer = adTechIdentifier;
            this.name = str;
            this.dailyUpdateUri = uri;
            this.biddingLogicUri = uri2;
            this.ads = list;
        }

        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        public final Builder setActivationTime(Instant instant) {
            p.j(instant, "activationTime");
            this.activationTime = instant;
            return this;
        }

        public final Builder setAds(List<AdData> list) {
            p.j(list, b.JSON_KEY_ADS);
            this.ads = list;
            return this;
        }

        public final Builder setBiddingLogicUri(Uri uri) {
            p.j(uri, "biddingLogicUri");
            this.biddingLogicUri = uri;
            return this;
        }

        public final Builder setBuyer(AdTechIdentifier adTechIdentifier) {
            p.j(adTechIdentifier, "buyer");
            this.buyer = adTechIdentifier;
            return this;
        }

        public final Builder setDailyUpdateUri(Uri uri) {
            p.j(uri, "dailyUpdateUri");
            this.dailyUpdateUri = uri;
            return this;
        }

        public final Builder setExpirationTime(Instant instant) {
            p.j(instant, "expirationTime");
            this.expirationTime = instant;
            return this;
        }

        public final Builder setName(String str) {
            p.j(str, "name");
            this.name = str;
            return this;
        }

        public final Builder setTrustedBiddingData(TrustedBiddingData trustedBiddingData) {
            p.j(trustedBiddingData, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingData;
            return this;
        }

        public final Builder setUserBiddingSignals(AdSelectionSignals adSelectionSignals) {
            p.j(adSelectionSignals, "userBiddingSignals");
            this.userBiddingSignals = adSelectionSignals;
            return this;
        }
    }

    public CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData) {
        p.j(adTechIdentifier, "buyer");
        p.j(str, "name");
        p.j(uri, "dailyUpdateUri");
        p.j(uri2, "biddingLogicUri");
        p.j(list, b.JSON_KEY_ADS);
        this.buyer = adTechIdentifier;
        this.name = str;
        this.dailyUpdateUri = uri;
        this.biddingLogicUri = uri2;
        this.ads = list;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return p.e(this.buyer, customAudience.buyer) && p.e(this.name, customAudience.name) && p.e(this.activationTime, customAudience.activationTime) && p.e(this.expirationTime, customAudience.expirationTime) && p.e(this.dailyUpdateUri, customAudience.dailyUpdateUri) && p.e(this.userBiddingSignals, customAudience.userBiddingSignals) && p.e(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && p.e(this.ads, customAudience.ads);
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final List<AdData> getAds() {
        return this.ads;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i10, i iVar) {
        this(adTechIdentifier, str, uri, uri2, list, (i10 & 32) != 0 ? null : instant, (i10 & 64) != 0 ? null : instant2, (i10 & 128) != 0 ? null : adSelectionSignals, (i10 & 256) != 0 ? null : trustedBiddingData);
    }
}
