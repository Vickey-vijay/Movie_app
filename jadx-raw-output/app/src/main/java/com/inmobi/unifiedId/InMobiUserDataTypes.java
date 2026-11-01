package com.inmobi.unifiedId;

import ck.p;

/* JADX INFO: loaded from: classes4.dex */
public final class InMobiUserDataTypes {
    private final String md5;
    private final String sha1;
    private final String sha256;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25890c;

        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f25888a, this.f25889b, this.f25890c);
        }

        public final Builder md5(String str) {
            this.f25888a = str;
            return this;
        }

        public final Builder sha1(String str) {
            this.f25889b = str;
            return this;
        }

        public final Builder sha256(String str) {
            this.f25890c = str;
            return this;
        }
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    public final String component1() {
        return this.md5;
    }

    public final String component2() {
        return this.sha1;
    }

    public final String component3() {
        return this.sha256;
    }

    public final InMobiUserDataTypes copy(String str, String str2, String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        return p.e(this.md5, inMobiUserDataTypes.md5) && p.e(this.sha1, inMobiUserDataTypes.sha1) && p.e(this.sha256, inMobiUserDataTypes.sha256);
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "InMobiUserDataTypes(md5=" + this.md5 + ", sha1=" + this.sha1 + ", sha256=" + this.sha256 + ")";
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public InMobiUserDataTypes(String str, String str2, String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }
}
