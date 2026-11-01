package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import ck.p;

/* JADX INFO: compiled from: LeaveCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class LeaveCustomAudienceRequest {
    private final AdTechIdentifier buyer;
    private final String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) obj;
        return p.e(this.buyer, leaveCustomAudienceRequest.buyer) && p.e(this.name, leaveCustomAudienceRequest.name);
    }

    public LeaveCustomAudienceRequest(AdTechIdentifier adTechIdentifier, String str) {
        p.j(adTechIdentifier, "buyer");
        p.j(str, "name");
        this.buyer = adTechIdentifier;
        this.name = str;
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.buyer.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
