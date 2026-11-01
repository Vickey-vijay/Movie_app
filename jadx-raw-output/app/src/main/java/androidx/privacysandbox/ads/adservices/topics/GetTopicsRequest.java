package androidx.privacysandbox.ads.adservices.topics;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: GetTopicsRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetTopicsRequest {
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    /* JADX INFO: compiled from: GetTopicsRequest.kt */
    public static final class Builder {
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        public final GetTopicsRequest build() {
            if (this.adsSdkName.length() > 0) {
                return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final Builder setAdsSdkName(String str) {
            p.j(str, "adsSdkName");
            this.adsSdkName = str;
            return this;
        }

        public final Builder setShouldRecordObservation(boolean z10) {
            this.shouldRecordObservation = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public GetTopicsRequest(String str, boolean z10) {
        p.j(str, "adsSdkName");
        this.adsSdkName = str;
        this.shouldRecordObservation = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return p.e(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation;
    }

    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    public final boolean shouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
