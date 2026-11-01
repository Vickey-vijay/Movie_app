package androidx.privacysandbox.ads.adservices.adselection;

import ck.p;

/* JADX INFO: compiled from: ReportImpressionRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ReportImpressionRequest {
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        return this.adSelectionId == reportImpressionRequest.adSelectionId && p.e(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig);
    }

    public ReportImpressionRequest(long j10, AdSelectionConfig adSelectionConfig) {
        p.j(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j10;
        this.adSelectionConfig = adSelectionConfig;
    }

    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.adSelectionConfig.hashCode();
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }
}
