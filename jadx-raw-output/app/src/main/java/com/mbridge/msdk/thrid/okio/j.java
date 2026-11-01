package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: GzipSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f38048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f38049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f38050d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38047a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f38051e = new CRC32();

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f38036a;
        while (true) {
            long j12 = oVar.f38071c - oVar.f38070b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f38074f;
        }
        while (j11 > 0) {
            int i10 = (int) (((long) oVar.f38070b) + j10);
            int iMin = (int) Math.min(oVar.f38071c - i10, j11);
            this.f38051e.update(oVar.f38069a, i10, iMin);
            j11 -= (long) iMin;
            oVar = oVar.f38074f;
            j10 = 0;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f38047a == 0) {
            d();
            this.f38047a = 1;
        }
        if (this.f38047a == 1) {
            long j11 = cVar.f38037b;
            long jB = this.f38050d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            this.f38047a = 2;
        }
        if (this.f38047a == 2) {
            h();
            this.f38047a = 3;
            if (!this.f38048b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private void d() throws IOException {
        this.f38048b.e(10L);
        byte bF = this.f38048b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f38048b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f38048b.readShort());
        this.f38048b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f38048b.e(2L);
            if (z10) {
                a(this.f38048b.a(), 0L, 2L);
            }
            long jG = this.f38048b.a().g();
            this.f38048b.e(jG);
            if (z10) {
                a(this.f38048b.a(), 0L, jG);
            }
            this.f38048b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f38048b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f38048b.a(), 0L, jA + 1);
            }
            this.f38048b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f38048b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f38048b.a(), 0L, jA2 + 1);
            }
            this.f38048b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f38048b.g(), (short) this.f38051e.getValue());
            this.f38051e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f38048b.e(), (int) this.f38051e.getValue());
        a("ISIZE", this.f38048b.e(), (int) this.f38049c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38050d.close();
    }

    public j(s sVar) {
        if (sVar != null) {
            Inflater inflater = new Inflater(true);
            this.f38049c = inflater;
            e eVarA = l.a(sVar);
            this.f38048b = eVarA;
            this.f38050d = new k(eVarA, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f38048b.b();
    }
}
