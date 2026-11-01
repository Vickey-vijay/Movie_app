package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: InflaterSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f38052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f38053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38055d;

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f38055d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f38053b.inflate(oVarB.f38069a, oVarB.f38071c, (int) Math.min(j10, 8192 - oVarB.f38071c));
                if (iInflate > 0) {
                    oVarB.f38071c += iInflate;
                    long j11 = iInflate;
                    cVar.f38037b += j11;
                    return j11;
                }
                if (!this.f38053b.finished() && !this.f38053b.needsDictionary()) {
                }
                h();
                if (oVarB.f38070b != oVarB.f38071c) {
                    return -1L;
                }
                cVar.f38036a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    private void h() throws IOException {
        int i10 = this.f38054c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f38053b.getRemaining();
        this.f38054c -= remaining;
        this.f38052a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f38055d) {
            return;
        }
        this.f38053b.end();
        this.f38055d = true;
        this.f38052a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f38053b.needsInput()) {
            return false;
        }
        h();
        if (this.f38053b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f38052a.f()) {
            return true;
        }
        o oVar = this.f38052a.a().f38036a;
        int i10 = oVar.f38071c;
        int i11 = oVar.f38070b;
        int i12 = i10 - i11;
        this.f38054c = i12;
        this.f38053b.setInput(oVar.f38069a, i11, i12);
        return false;
    }

    public k(e eVar, Inflater inflater) {
        if (eVar != null) {
            if (inflater != null) {
                this.f38052a = eVar;
                this.f38053b = inflater;
                return;
            }
            throw new IllegalArgumentException("inflater == null");
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f38052a.b();
    }
}
