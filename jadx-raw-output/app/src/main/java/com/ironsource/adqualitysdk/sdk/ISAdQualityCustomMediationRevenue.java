package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes10.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final double f36;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityAdType f37;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f38;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f39;

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f40;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private double f42;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f43 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityAdType f41 = ISAdQualityAdType.UNKNOWN;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f43, this.f41, this.f42, this.f40, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f41 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f43 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f40 = str;
            return this;
        }

        public Builder setRevenue(double d10) {
            this.f42 = d10;
            return this;
        }
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str, byte b10) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d10, str);
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str) {
        this.f38 = iSAdQualityMediationNetwork;
        this.f37 = iSAdQualityAdType;
        this.f36 = d10;
        this.f39 = str;
    }

    public ISAdQualityAdType getAdType() {
        return this.f37;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f38;
    }

    public String getPlacement() {
        return this.f39;
    }

    public double getRevenue() {
        return this.f36;
    }
}
