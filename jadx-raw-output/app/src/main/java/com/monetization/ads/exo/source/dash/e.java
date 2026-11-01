package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import yads.bg1;
import yads.bn1;
import yads.c30;
import yads.eg1;
import yads.f30;
import yads.fc2;
import yads.fg1;
import yads.hb3;
import yads.hm1;
import yads.ib3;
import yads.ih1;
import yads.ob2;
import yads.p11;
import yads.q30;
import yads.qb2;
import yads.vf1;
import yads.yf1;
import yads.zf1;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f42928b;

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42928b;
        iVar.getClass();
        long j12 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        vf1 vf1Var = new vf1();
        iVar.f42937n.getClass();
        bn1 bn1Var = iVar.f42940q;
        bn1Var.a(vf1Var, new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
    }

    public e(i iVar) {
        this.f42928b = iVar;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        long j12;
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42928b;
        iVar.getClass();
        long j13 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        vf1 vf1Var = new vf1();
        iVar.f42937n.getClass();
        bn1 bn1Var = iVar.f42940q;
        bn1Var.b(vf1Var, new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
        c30 c30Var = (c30) qb2Var.f81797f;
        c30 c30Var2 = iVar.H;
        int size = c30Var2 == null ? 0 : c30Var2.f76137m.size();
        long j14 = ((fc2) c30Var.f76137m.get(0)).f77350b;
        int i10 = 0;
        while (i10 < size && ((fc2) iVar.H.f76137m.get(i10)).f77350b < j14) {
            i10++;
        }
        if (c30Var.f76128d) {
            if (size - i10 > c30Var.f76137m.size()) {
                ih1.d("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = iVar.N;
                j12 = -9223372036854775807L;
                if (j15 != -9223372036854775807L && c30Var.f76132h * 1000 <= j15) {
                    ih1.d("DashMediaSource", "Loaded stale dynamic manifest: " + c30Var.f76132h + ", " + iVar.N);
                } else {
                    iVar.M = 0;
                }
            }
            int i11 = iVar.M;
            iVar.M = i11 + 1;
            if (i11 < iVar.f42937n.a(qb2Var.f81794c)) {
                iVar.D.postDelayed(iVar.f42945v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new f30();
                return;
            }
        }
        j12 = -9223372036854775807L;
        iVar.H = c30Var;
        iVar.I = c30Var.f76128d & iVar.I;
        iVar.J = j10 - j11;
        iVar.K = j10;
        synchronized (iVar.f42943t) {
            if (qb2Var.f81793b.f83341a == iVar.F) {
                Uri uri2 = iVar.H.f76135k;
                if (uri2 == null) {
                    uri2 = qb2Var.f81795d.f82098c;
                }
                iVar.F = uri2;
            }
        }
        if (size == 0) {
            c30 c30Var3 = iVar.H;
            if (c30Var3.f76128d) {
                hb3 hb3Var = c30Var3.f76133i;
                if (hb3Var != null) {
                    String str = hb3Var.f78171a;
                    if (!ib3.a(str, "urn:mpeg:dash:utc:direct:2014") && !ib3.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!ib3.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !ib3.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!ib3.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !ib3.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!ib3.a(str, "urn:mpeg:dash:utc:ntp:2014") && !ib3.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    iVar.a(new IOException("Unsupported UTC timing scheme"));
                                    return;
                                } else {
                                    iVar.g();
                                    return;
                                }
                            }
                            qb2 qb2Var2 = new qb2(iVar.f42949z, Uri.parse(hb3Var.f78172b), 5, new h());
                            iVar.A.a(qb2Var2, new g(iVar), 1);
                            bn1 bn1Var2 = iVar.f42940q;
                            Uri uri3 = qb2Var2.f81793b.f83341a;
                            Collections.emptyMap();
                            bn1Var2.c(new vf1(), new hm1(qb2Var2.f81794c, -1, null, 0, null, bn1Var2.a(j12), bn1Var2.a(j12)));
                            return;
                        }
                        qb2 qb2Var3 = new qb2(iVar.f42949z, Uri.parse(hb3Var.f78172b), 5, new d());
                        iVar.A.a(qb2Var3, new g(iVar), 1);
                        bn1 bn1Var3 = iVar.f42940q;
                        Uri uri4 = qb2Var3.f81793b.f83341a;
                        Collections.emptyMap();
                        bn1Var3.c(new vf1(), new hm1(qb2Var3.f81794c, -1, null, 0, null, bn1Var3.a(j12), bn1Var3.a(j12)));
                        return;
                    }
                    try {
                        iVar.L = ib3.f(hb3Var.f78172b) - iVar.K;
                        iVar.a(true);
                        return;
                    } catch (ob2 e10) {
                        iVar.a(e10);
                        return;
                    }
                }
                iVar.g();
                return;
            }
            iVar.a(true);
            return;
        }
        iVar.O += i10;
        iVar.a(true);
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zf1 zf1Var;
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42928b;
        iVar.getClass();
        long j12 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        vf1 vf1Var = new vf1();
        iVar.f42937n.getClass();
        if (!(iOException instanceof ob2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof p11) && !(iOException instanceof eg1)) {
            int i11 = q30.f81691c;
            Throwable cause = iOException;
            while (true) {
                if (cause != null) {
                    if ((cause instanceof q30) && ((q30) cause).f81692b == 2008) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    cause = cause.getCause();
                } else {
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                    break;
                }
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        if (jMin == -9223372036854775807L) {
            zf1Var = fg1.f77389e;
        } else {
            zf1Var = new zf1(0, jMin);
        }
        int i12 = zf1Var.f85378a;
        boolean z10 = true ^ (i12 == 0 || i12 == 1);
        bn1 bn1Var = iVar.f42940q;
        bn1Var.a(vf1Var, new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)), iOException, z10);
        if (z10) {
            iVar.f42937n.getClass();
        }
        return zf1Var;
    }
}
