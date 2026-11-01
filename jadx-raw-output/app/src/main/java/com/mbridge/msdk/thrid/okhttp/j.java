package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpec.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f37863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f37864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f37865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f37866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f37867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f37868j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f37871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f37872d;

    /* JADX INFO: compiled from: ConnectionSpec.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f37874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f37875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37876d;

        public a(boolean z10) {
            this.f37873a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f37873a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f37493a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f37873a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f37875c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f37873a = jVar.f37869a;
            this.f37874b = jVar.f37871c;
            this.f37875c = jVar.f37872d;
            this.f37876d = jVar.f37870b;
        }

        public a a(String... strArr) {
            if (this.f37873a) {
                if (strArr.length != 0) {
                    this.f37874b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f37873a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f37415a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f37873a) {
                this.f37876d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    public List<g> a() {
        String[] strArr = this.f37871c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f37869a;
    }

    static {
        g gVar = g.f37464n1;
        g gVar2 = g.f37467o1;
        g gVar3 = g.f37470p1;
        g gVar4 = g.f37473q1;
        g gVar5 = g.f37476r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f37434d1;
        g gVar8 = g.f37425a1;
        g gVar9 = g.f37437e1;
        g gVar10 = g.f37455k1;
        g gVar11 = g.f37452j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f37863e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f37448i0, g.f37451j0, g.G, g.K, g.f37453k};
        f37864f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f37865g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f37866h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f37867i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f37868j = new a(false).a();
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f37871c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f37426b, sSLSocket.getEnabledCipherSuites(), this.f37871c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f37872d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f37521q, sSLSocket.getEnabledProtocols(), this.f37872d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f37426b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f37872d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f37871c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean c() {
        return this.f37870b;
    }

    public List<d0> d() {
        String[] strArr = this.f37872d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f37869a;
        if (z10 != jVar.f37869a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f37871c, jVar.f37871c) && Arrays.equals(this.f37872d, jVar.f37872d) && this.f37870b == jVar.f37870b);
    }

    public int hashCode() {
        if (this.f37869a) {
            return ((((Arrays.hashCode(this.f37871c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f37872d)) * 31) + (!this.f37870b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f37869a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f37871c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f37872d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f37870b + ")";
    }

    public j(a aVar) {
        this.f37869a = aVar.f37873a;
        this.f37871c = aVar.f37874b;
        this.f37872d = aVar.f37875c;
        this.f37870b = aVar.f37876d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f37869a) {
            return false;
        }
        String[] strArr = this.f37872d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f37521q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f37871c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f37426b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
