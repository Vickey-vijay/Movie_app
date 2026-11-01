package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3617ne {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30310c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30311d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30312e = 2080;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30313f = 2090;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30314g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30315h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30317b;

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public C3617ne(int i10, String str) {
        ck.p.j(str, "errorMessage");
        this.f30316a = i10;
        this.f30317b = str;
    }

    public final int a() {
        return this.f30316a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3617ne)) {
            return false;
        }
        C3617ne c3617ne = (C3617ne) obj;
        return this.f30316a == c3617ne.f30316a && ck.p.e(this.f30317b, c3617ne.f30317b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3617ne(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        int errorCode = ironSourceError.getErrorCode();
        String errorMessage = ironSourceError.getErrorMessage();
        ck.p.i(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public final C3617ne a(int i10, String str) {
        ck.p.j(str, "errorMessage");
        return new C3617ne(i10, str);
    }

    public final String b() {
        return this.f30317b;
    }

    public final int c() {
        return this.f30316a;
    }

    public final String d() {
        return this.f30317b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f30316a) * 31) + this.f30317b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f30316a + ", errorMessage=" + this.f30317b + ")";
    }

    public static /* synthetic */ C3617ne a(C3617ne c3617ne, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3617ne.f30316a;
        }
        if ((i11 & 2) != 0) {
            str = c3617ne.f30317b;
        }
        return c3617ne.a(i10, str);
    }
}
