package com.monetization.ads.quality.base.state;

import ck.p;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;

/* JADX INFO: loaded from: classes5.dex */
public interface AdQualityVerificationState {

    public static final class Blocked implements AdQualityVerificationState {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Blocked)) {
                return false;
            }
            ((Blocked) obj).getClass();
            return p.e(null, null);
        }

        public final AdQualityVerificationBlockingReasons getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Blocked(reason=" + ((Object) null) + ")";
        }
    }

    public static final class Error implements AdQualityVerificationState {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            ((Error) obj).getClass();
            return p.e(null, null);
        }

        public final AdQualityVerificationError getError() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Error(error=" + ((Object) null) + ")";
        }
    }

    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShouldBeBlockedOnDisplay)) {
                return false;
            }
            ((ShouldBeBlockedOnDisplay) obj).getClass();
            return p.e(null, null);
        }

        public final AdQualityVerificationBlockingReasons getReason() {
            return null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + ((Object) null) + ")";
        }
    }
}
