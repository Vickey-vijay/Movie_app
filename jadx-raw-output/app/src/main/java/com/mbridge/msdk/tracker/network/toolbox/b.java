package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BasicNetwork.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements com.mbridge.msdk.tracker.network.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f38253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f38254b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    @Override // com.mbridge.msdk.tracker.network.m
    public q a(t<?> tVar) throws b0 {
        IOException iOException;
        g gVarA;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p pVarB = b(tVar);
        while (true) {
            Collections.emptyList();
            try {
                gVarA = this.f38253a.a(tVar, f.a(tVar.d()));
                try {
                    int iD = gVarA.d();
                    a(pVarB, iD);
                    List<com.mbridge.msdk.tracker.network.g> listC = gVarA.c();
                    if (iD == 304) {
                        return k.a(tVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = gVarA.a();
                    byte[] bArrA = inputStreamA != null ? k.a(inputStreamA, gVarA.b(), this.f38254b, pVarB) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - jElapsedRealtime, tVar, bArrA, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        a(pVarB, 1, null);
                        return new q(iD, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e10) {
                        e = e10;
                        bArr = bArrA;
                        iOException = e;
                        a(pVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                        k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVarA, bArr));
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                }
            } catch (IOException e12) {
                iOException = e12;
                gVarA = null;
                bArr = null;
            }
            a(pVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVarA, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.f38253a = aVar;
        this.f38254b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    private static p b(t<?> tVar) {
        boolean z10;
        if (tVar != null) {
            try {
                if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Exception unused) {
                return null;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        p pVar = new p(tVar.p(), tVar.g() == 0 ? "GET" : "POST");
        pVar.d("queue");
        pVar.e(tVar.d("local_id"));
        pVar.a(tVar.d("ad_type"));
        pVar.i(tVar.r());
        tVar.a(pVar);
        return pVar;
    }

    private static void a(p pVar, int i10, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i10);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i10) {
        if (pVar != null) {
            try {
                pVar.b(i10);
            } catch (Exception unused) {
            }
        }
    }
}
