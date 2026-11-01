package com.mbridge.msdk.thrid.okhttp;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CacheControl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f37383n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f37384o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f37391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f37392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f37393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f37394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f37395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f37396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f37397m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f37385a = z10;
        this.f37386b = z11;
        this.f37387c = i10;
        this.f37388d = i11;
        this.f37389e = z12;
        this.f37390f = z13;
        this.f37391g = z14;
        this.f37392h = i12;
        this.f37393i = i13;
        this.f37394j = z15;
        this.f37395k = z16;
        this.f37396l = z17;
        this.f37397m = str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x0133 A[SYNTHETIC] */
    public static c a(r rVar) {
        int i10;
        int iA;
        String strTrim;
        int iA2;
        String strTrim2;
        int iB = rVar.b();
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iA3 = -1;
        int iA4 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iA5 = -1;
        int iA6 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        for (int i11 = 0; i11 < iB; i11++) {
            String strA = rVar.a(i11);
            String strB = rVar.b(i11);
            if (strA.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strB;
                }
                for (i10 = 0; i10 < strB.length(); i10 = iA2) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                    strTrim = strB.substring(i10, iA).trim();
                    if (iA != strB.length() || strB.charAt(iA) == ',' || strB.charAt(iA) == ';') {
                        iA2 = iA + 1;
                        strTrim2 = null;
                    } else {
                        int iB2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.b(strB, iA + 1);
                        if (iB2 >= strB.length() || strB.charAt(iB2) != '\"') {
                            iA2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, iB2, ",;");
                            strTrim2 = strB.substring(iB2, iA2).trim();
                        } else {
                            int i12 = iB2 + 1;
                            int iA7 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i12, "\"");
                            strTrim2 = strB.substring(i12, iA7);
                            iA2 = iA7 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z12 = true;
                    } else if ("max-age".equalsIgnoreCase(strTrim)) {
                        iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z13 = true;
                    } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(strTrim)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z18 = true;
                    }
                }
            } else {
                if (strA.equalsIgnoreCase("Pragma")) {
                }
            }
            z10 = false;
            while (i10 < strB.length()) {
                iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                strTrim = strB.substring(i10, iA).trim();
                if (iA != strB.length()) {
                    iA2 = iA + 1;
                    strTrim2 = null;
                } else {
                    iA2 = iA + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z11 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z12 = true;
                } else if ("max-age".equalsIgnoreCase(strTrim)) {
                    iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                    iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                } else if ("private".equalsIgnoreCase(strTrim)) {
                    z13 = true;
                } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(strTrim)) {
                    z14 = true;
                } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                    z15 = true;
                } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                    iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                    iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                    z16 = true;
                } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                    z17 = true;
                } else if ("immutable".equalsIgnoreCase(strTrim)) {
                    z18 = true;
                }
            }
        }
        return new c(z11, z12, iA3, iA4, z13, z14, z15, iA5, iA6, z16, z17, z18, !z10 ? null : str);
    }

    public boolean b() {
        return this.f37389e;
    }

    public boolean c() {
        return this.f37390f;
    }

    public int d() {
        return this.f37387c;
    }

    public int e() {
        return this.f37392h;
    }

    public int f() {
        return this.f37393i;
    }

    public boolean g() {
        return this.f37391g;
    }

    public boolean h() {
        return this.f37385a;
    }

    public boolean i() {
        return this.f37386b;
    }

    public boolean j() {
        return this.f37394j;
    }

    public String toString() {
        String str = this.f37397m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f37397m = strA;
        return strA;
    }

    /* JADX INFO: compiled from: CacheControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37400c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37401d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37402e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f37405h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f37401d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a b() {
            this.f37398a = true;
            return this;
        }

        public a c() {
            this.f37403f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f37385a = aVar.f37398a;
        this.f37386b = aVar.f37399b;
        this.f37387c = aVar.f37400c;
        this.f37388d = -1;
        this.f37389e = false;
        this.f37390f = false;
        this.f37391g = false;
        this.f37392h = aVar.f37401d;
        this.f37393i = aVar.f37402e;
        this.f37394j = aVar.f37403f;
        this.f37395k = aVar.f37404g;
        this.f37396l = aVar.f37405h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f37385a) {
            sb2.append("no-cache, ");
        }
        if (this.f37386b) {
            sb2.append("no-store, ");
        }
        if (this.f37387c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f37387c);
            sb2.append(", ");
        }
        if (this.f37388d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f37388d);
            sb2.append(", ");
        }
        if (this.f37389e) {
            sb2.append("private, ");
        }
        if (this.f37390f) {
            sb2.append("public, ");
        }
        if (this.f37391g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f37392h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f37392h);
            sb2.append(", ");
        }
        if (this.f37393i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f37393i);
            sb2.append(", ");
        }
        if (this.f37394j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f37395k) {
            sb2.append("no-transform, ");
        }
        if (this.f37396l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
