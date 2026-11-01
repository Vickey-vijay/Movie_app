package com.monetization.ads.quality.base.model.configuration;

import ck.p;

/* JADX INFO: loaded from: classes8.dex */
public final class AdQualityVerifierAdapterConfiguration {
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        return p.e(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    public int hashCode() {
        return Boolean.hashCode(this.debug) + ((Long.hashCode(this.verificationTimeoutInSec) + (this.apiKey.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + ")";
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public AdQualityVerifierAdapterConfiguration(String str, long j10, boolean z10) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j10;
        this.debug = z10;
    }
}
