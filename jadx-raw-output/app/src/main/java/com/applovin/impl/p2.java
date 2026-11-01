package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8709d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8713d;

        public p2 a() {
            return new p2(this.f8710a, this.f8711b, this.f8712c, this.f8713d);
        }

        public a b(int i10) {
            this.f8712c = i10;
            return this;
        }

        public a a(int i10) {
            this.f8713d = i10;
            return this;
        }

        public a b(String str) {
            this.f8710a = str;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f8710a + ", signature=" + this.f8711b + ", responseCode=" + this.f8712c + ", nonce=" + this.f8713d + ")";
        }

        public a a(String str) {
            this.f8711b = str;
            return this;
        }
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public static a a() {
        return new a();
    }

    public int b() {
        return this.f8709d;
    }

    public int c() {
        return this.f8708c;
    }

    public String d() {
        return this.f8707b;
    }

    public String e() {
        return this.f8706a;
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public p2(String str, String str2, int i10, int i11) {
        this.f8706a = str;
        this.f8707b = str2;
        this.f8708c = i10;
        this.f8709d = i11;
    }

    public int hashCode() {
        int iHashCode;
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int i10 = iC * 59;
        int iHashCode2 = 43;
        if (strE == null) {
            iHashCode = 43;
        } else {
            iHashCode = strE.hashCode();
        }
        int i11 = i10 + iHashCode;
        String strD = d();
        int i12 = i11 * 59;
        if (strD != null) {
            iHashCode2 = strD.hashCode();
        }
        return i12 + iHashCode2;
    }
}
