package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: OkHTTPFileDownloadTask.java */
/* JADX INFO: loaded from: classes9.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f33334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f33335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f33336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f33337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f33338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f33339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f33340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f33341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33343j;

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private boolean a(int i10, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        return i10 == 206;
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        boolean z10 = !a(i10, this.f33337d);
        boolean z11 = (a0Var == null || this.f33335b == null || i10 != 206 || a0Var.d() == null || this.f33335b.l() <= 0 || a0Var.d().k() == this.f33335b.l() - this.f33335b.g()) ? false : true;
        if (z10 && z11) {
            this.f33335b.a(0L);
            this.f33335b.b(0L);
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33334a)) {
                this.f33334a.remove(str2, str);
            }
            this.f33337d = null;
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f33336c.e()));
        }
        b0 b0VarD = a0Var.d();
        this.f33341h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            dVar.a(new IOException("response body is null"));
            this.f33335b.b(0L);
            this.f33335b.a(0L);
            return dVar;
        }
        long jK = this.f33341h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f33342i = strA;
        this.f33335b.a(strA);
        if (jK <= 0) {
            dVar.a(new IOException("response content length is null"));
            return dVar;
        }
        if (this.f33335b.l() == 0) {
            this.f33335b.b(jK);
        }
        InputStream inputStreamD = this.f33341h.d();
        this.f33339f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            dVar.a(new IOException("response inputStream is null"));
            return dVar;
        }
        this.f33336c.a(this.f33335b.l());
        this.f33335b.c(this.f33336c);
        return a(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01b1  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        this.f33338e = new com.mbridge.msdk.config.component.load.downloader.d();
        if (this.f33335b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            this.f33338e.a(true);
            return this.f33338e;
        }
        long jL = this.f33335b.l();
        long jG = this.f33335b.g();
        com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG);
        if (jL != 0 && jG != 0 && jL == jG) {
            this.f33338e.b(true);
            return this.f33338e;
        }
        String strE = this.f33336c.e();
        String strD = this.f33336c.d();
        long jK = this.f33335b.k();
        long jC = this.f33335b.c();
        long jH = this.f33335b.h();
        long jM = this.f33335b.m();
        String str = String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(jG));
        try {
            v.b bVarS = l.c().d().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v vVarA = bVarS.b(jC, timeUnit).a(new MBridgeHostnameVerifier(strD)).d(jH, timeUnit).e(jM, timeUnit).a(Math.max(0L, jK), timeUnit).b(true).a();
            y.a aVarA = new y.a().b(strD).a(new com.mbridge.msdk.thrid.okhttp.c.a().b().a()).a("Connection", "close").a(Command.HTTP_HEADER_RANGE, str).a("User-Agent");
            String str2 = Command.DEFAULT_USER_AGENT;
            com.mbridge.msdk.thrid.okhttp.d dVarA = vVarA.a(aVarA.a("User-Agent", Command.DEFAULT_USER_AGENT).a());
            a0 a0VarD = null;
            try {
                try {
                    a0VarD = dVarA.d();
                    try {
                        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD) && !com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD.d())) {
                            int iK = a0VarD.k();
                            if (a0VarD.n()) {
                                this.f33338e = a(strE, strD, a0VarD, iK);
                                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                                com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                                if (!dVarA.h()) {
                                    dVarA.cancel();
                                }
                                return this.f33338e;
                            }
                            this.f33338e.a(new IOException("responseCode " + iK));
                            com.mbridge.msdk.config.component.load.downloader.d dVar = this.f33338e;
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            return dVar;
                            a(str2, strD, e);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            return this.f33338e;
                        }
                        this.f33338e.a(new IOException("response is null"));
                        com.mbridge.msdk.config.component.load.downloader.d dVar2 = this.f33338e;
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        return dVar2;
                    } catch (Exception e10) {
                        e = e10;
                        a(str2, strD, e);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                    }
                } catch (Throwable th2) {
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33339f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33340g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33341h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = strE;
            }
        } catch (Exception e12) {
            a(strE, strD, e12);
            this.f33338e.b(false);
            return this.f33338e;
        }
    }

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f33335b = dVar;
        this.f33337d = bVar;
        this.f33334a = cVar;
        this.f33336c = bVar2;
    }

    private void a(String str, String str2, Exception exc) {
        try {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33334a) && com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33335b)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this.f33334a.remove(str2, str);
                    com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(str));
                }
                this.f33335b.a(0L);
                this.f33335b.b(0L);
            }
        } catch (Exception e10) {
            q0.b(IDownloadTask.TAG, e10.getMessage(), e10);
        }
        this.f33338e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar;
        com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
        this.f33343j = System.currentTimeMillis();
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f33337d)) {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33336c.d(), str, this.f33343j, 0L, System.currentTimeMillis(), this.f33335b.l(), this.f33342i, 0, "");
            this.f33337d = bVarA;
            this.f33334a.a(bVarA);
        } else {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA2 = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33337d.c(), this.f33337d.e(), this.f33337d.b(), this.f33337d.i(), this.f33337d.h(), this.f33337d.g(), this.f33342i, 0, this.f33337d.d());
            this.f33337d = bVarA2;
            this.f33334a.a(bVarA2, str);
        }
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.f33340g = aVarB;
        aVarB.seek(this.f33335b.g());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f33339f.read(bArr);
            if (i10 == -1) {
                dVar = dVar2;
                break;
            }
            this.f33340g.write(bArr, 0, i10);
            d dVar3 = this.f33335b;
            dVar3.a(dVar3.g() + ((long) i10));
            this.f33340g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f33335b.l(), this.f33335b.g());
            dVar = dVar2;
            a(this.f33335b, this.f33336c, this.f33335b.g(), this.f33335b.l(), iA);
            if (this.f33336c.c() != 100 && iA >= this.f33336c.c()) {
                break;
            }
            if (this.f33335b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
                dVar.a(true);
                break;
            }
            dVar2 = dVar;
        }
        l.c().b().a(str2, str, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33336c.d(), this.f33336c.e(), this.f33343j, System.currentTimeMillis(), 0L, this.f33335b.l(), this.f33342i, 0, ""));
        try {
            if (this.f33335b.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED && this.f33335b.l() == this.f33335b.g()) {
                String strC = com.mbridge.msdk.config.component.common.file.a.c(this.f33336c.e());
                this.f33336c.a(strC);
                this.f33334a.a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33336c.d(), this.f33336c.e(), this.f33343j, System.currentTimeMillis(), System.currentTimeMillis(), this.f33335b.l(), this.f33342i, 1, strC), this.f33336c.e());
            }
        } catch (Throwable th2) {
            q0.b(IDownloadTask.TAG, th2.getMessage(), th2);
        }
        if (!dVar.b()) {
            dVar.b(true);
        }
        return dVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}
