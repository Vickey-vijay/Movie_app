package com.applovin.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6811g;

    public a0(String str, int i10) {
        this.f6809e = str;
        this.f6810f = i10;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f6811g = z10;
        if (z10) {
            this.f6805a = a(strArrSplit[0]);
            this.f6806b = a(strArrSplit[1]);
            this.f6807c = a(strArrSplit[2]);
            this.f6808d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f6805a = "";
        this.f6806b = "";
        this.f6807c = "";
        this.f6808d = "";
    }

    public boolean a(Object obj) {
        return obj instanceof a0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public String a() {
        return this.f6808d;
    }

    public String b() {
        return this.f6805a;
    }

    public String c() {
        return this.f6806b;
    }

    public String d() {
        return this.f6809e;
    }

    public String e() {
        return this.f6807c;
    }

    public int f() {
        return this.f6810f;
    }

    public boolean g() {
        return this.f6805a.equals("applovin.com");
    }

    public boolean h() {
        return this.f6811g;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f6805a) || !a0Var.c().equals(this.f6806b) || !a0Var.e().equals(this.f6807c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.f6808d);
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String strB = b();
        int iHashCode4 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        String strC = c();
        int i10 = (iHashCode + 59) * 59;
        if (strC == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = strC.hashCode();
        }
        int i11 = i10 + iHashCode2;
        String strE = e();
        int i12 = i11 * 59;
        if (strE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = strE.hashCode();
        }
        int i13 = i12 + iHashCode3;
        String strA = a();
        int i14 = i13 * 59;
        if (strA != null) {
            iHashCode4 = strA.hashCode();
        }
        return i14 + iHashCode4;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
