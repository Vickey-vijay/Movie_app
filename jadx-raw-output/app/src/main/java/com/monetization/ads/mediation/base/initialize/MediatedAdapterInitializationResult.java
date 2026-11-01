package com.monetization.ads.mediation.base.initialize;

import ck.p;

/* JADX INFO: loaded from: classes5.dex */
public interface MediatedAdapterInitializationResult {

    public static final class Failure implements MediatedAdapterInitializationResult {
        private final int errorCode;
        private final String errorMessage;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.errorCode == failure.errorCode && p.e(this.errorMessage, failure.errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
        }

        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }
}
