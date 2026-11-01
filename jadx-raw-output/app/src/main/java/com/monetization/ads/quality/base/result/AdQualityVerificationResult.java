package com.monetization.ads.quality.base.result;

import ck.p;
import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;

/* JADX INFO: loaded from: classes9.dex */
public interface AdQualityVerificationResult {

    public static final class NotVerified implements AdQualityVerificationResult {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotVerified)) {
                return false;
            }
            ((NotVerified) obj).getClass();
            return p.e(null, null);
        }

        public final AdQualityVerificationError getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "NotVerified(reason=" + ((Object) null) + ")";
        }
    }

    public static final class Verified implements AdQualityVerificationResult {
        private final AdQualityVerificationStateFlow verifiedAd;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && p.e(this.verifiedAd, ((Verified) obj).verifiedAd);
        }

        public int hashCode() {
            return this.verifiedAd.hashCode();
        }

        public String toString() {
            return "Verified(verifiedAd=" + this.verifiedAd + ")";
        }

        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.verifiedAd;
        }
    }

    public static final class WaitingForVerification implements AdQualityVerificationResult {
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForVerification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 393213194;
        }

        public String toString() {
            return "WaitingForVerification";
        }

        private WaitingForVerification() {
        }
    }
}
