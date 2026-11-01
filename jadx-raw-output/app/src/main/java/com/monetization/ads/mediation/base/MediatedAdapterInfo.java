package com.monetization.ads.mediation.base;

import ck.i;

/* JADX INFO: loaded from: classes8.dex */
public final class MediatedAdapterInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42975c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f42977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f42978c;

        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f42976a, this.f42977b, this.f42978c, null);
        }

        public final Builder setAdapterVersion(String str) {
            this.f42976a = str;
            return this;
        }

        public final Builder setNetworkName(String str) {
            this.f42977b = str;
            return this;
        }

        public final Builder setNetworkSdkVersion(String str) {
            this.f42978c = str;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, i iVar) {
        this(str, str2, str3);
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f42973a = str;
        this.f42974b = str2;
        this.f42975c = str3;
    }

    public final String getAdapterVersion() {
        return this.f42973a;
    }

    public final String getNetworkName() {
        return this.f42974b;
    }

    public final String getNetworkSdkVersion() {
        return this.f42975c;
    }
}
