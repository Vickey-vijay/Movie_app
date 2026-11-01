package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http2Codec.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f37690f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", CreativeInfoManager.f43854b, "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f37691g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", CreativeInfoManager.f43854b, "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f37692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.g f37693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f37694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f37695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f37696e;

    /* JADX INFO: compiled from: Http2Codec.java */
    public class a extends com.mbridge.msdk.thrid.okio.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f37698c;

        public a(s sVar) {
            super(sVar);
            this.f37697b = false;
            this.f37698c = 0L;
        }

        private void a(IOException iOException) {
            if (this.f37697b) {
                return;
            }
            this.f37697b = true;
            f fVar = f.this;
            fVar.f37693b.a(false, fVar, this.f37698c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB > 0) {
                    this.f37698c += jB;
                }
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        return this.f37695d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f37694c.flush();
    }

    public static List<c> b(y yVar) {
        com.mbridge.msdk.thrid.okhttp.r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f37659f, yVar.e()));
        arrayList.add(new c(c.f37660g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f37662i, strA));
        }
        arrayList.add(new c(c.f37661h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f37690f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.f37695d != null) {
            return;
        }
        i iVarA = this.f37694c.a(b(yVar), yVar.a() != null);
        this.f37695d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f37692a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f37695d.l().a(this.f37692a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f37695d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f37692a = aVar;
        this.f37693b = gVar;
        this.f37694c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f37696e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f37695d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        a0.a aVarA = a(this.f37695d.j(), this.f37696e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static a0.a a(com.mbridge.msdk.thrid.okhttp.r rVar, w wVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(":status")) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f37691g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f37617b).a(kVarA.f37618c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f37693b;
        gVar.f37578f.responseBodyStart(gVar.f37577e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f37695d.e())));
    }
}
