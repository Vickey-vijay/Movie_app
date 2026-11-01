package x3;

import g5.k0;
import g5.t;
import java.io.IOException;
import java.util.Arrays;
import q3.l;
import q3.m;
import q3.n;
import q3.s;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g5.j f74286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f74287o;

    /* JADX INFO: compiled from: FlacReader.java */
    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f74288a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f74289b = -1;

        public a() {
        }

        @Override // x3.g
        public long a(q3.h hVar) throws InterruptedException, IOException {
            long j10 = this.f74289b;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f74289b = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f74288a = j10;
        }

        @Override // x3.g
        public s createSeekMap() {
            g5.a.f(this.f74288a != -1);
            return new n(b.this.f74286n, this.f74288a);
        }

        @Override // x3.g
        public void startSeek(long j10) {
            g5.a.e(b.this.f74286n.f53103k);
            long[] jArr = b.this.f74286n.f53103k.f53105a;
            this.f74289b = jArr[k0.h(jArr, j10, true, true)];
        }
    }

    public static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // x3.i
    public long e(t tVar) {
        if (n(tVar.f53154a)) {
            return m(tVar);
        }
        return -1L;
    }

    @Override // x3.i
    public boolean h(t tVar, long j10, i.b bVar) {
        byte[] bArr = tVar.f53154a;
        if (this.f74286n == null) {
            this.f74286n = new g5.j(bArr, 17);
            bVar.f74326a = this.f74286n.i(Arrays.copyOfRange(bArr, 9, tVar.d()), null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.f74287o = new a();
            this.f74286n = this.f74286n.c(m.g(tVar));
            return true;
        }
        if (!n(bArr)) {
            return true;
        }
        a aVar = this.f74287o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f74327b = this.f74287o;
        }
        return false;
    }

    public final int m(t tVar) {
        int i10 = (tVar.f53154a[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            tVar.M(4);
            tVar.F();
        }
        int iJ = l.j(tVar, i10);
        tVar.L(0);
        return iJ;
    }

    public static boolean o(t tVar) {
        if (tVar.a() >= 5 && tVar.y() == 127 && tVar.A() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // x3.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f74286n = null;
            this.f74287o = null;
        }
    }
}
