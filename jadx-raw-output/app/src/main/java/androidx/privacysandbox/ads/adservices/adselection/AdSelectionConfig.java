package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import ck.p;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AdSelectionConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AdSelectionConfig {
    private final AdSelectionSignals adSelectionSignals;
    private final List<AdTechIdentifier> customAudienceBuyers;
    private final Uri decisionLogicUri;
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;
    private final AdTechIdentifier seller;
    private final AdSelectionSignals sellerSignals;
    private final Uri trustedScoringSignalsUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return p.e(this.seller, adSelectionConfig.seller) && p.e(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && p.e(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && p.e(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && p.e(this.sellerSignals, adSelectionConfig.sellerSignals) && p.e(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && p.e(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    public AdSelectionConfig(AdTechIdentifier adTechIdentifier, Uri uri, List<AdTechIdentifier> list, AdSelectionSignals adSelectionSignals, AdSelectionSignals adSelectionSignals2, Map<AdTechIdentifier, AdSelectionSignals> map, Uri uri2) {
        p.j(adTechIdentifier, "seller");
        p.j(uri, "decisionLogicUri");
        p.j(list, "customAudienceBuyers");
        p.j(adSelectionSignals, "adSelectionSignals");
        p.j(adSelectionSignals2, "sellerSignals");
        p.j(map, "perBuyerSignals");
        p.j(uri2, "trustedScoringSignalsUri");
        this.seller = adTechIdentifier;
        this.decisionLogicUri = uri;
        this.customAudienceBuyers = list;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = adSelectionSignals2;
        this.perBuyerSignals = map;
        this.trustedScoringSignalsUri = uri2;
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return (((((((((((this.seller.hashCode() * 31) + this.decisionLogicUri.hashCode()) * 31) + this.customAudienceBuyers.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.sellerSignals.hashCode()) * 31) + this.perBuyerSignals.hashCode()) * 31) + this.trustedScoringSignalsUri.hashCode();
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }
}
