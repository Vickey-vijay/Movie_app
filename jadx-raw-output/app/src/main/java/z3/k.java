package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f86058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q3.u f86059d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Format f86064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f86066k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.t f86056a = new g5.t(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86060e = 0;

    @Override // z3.m
    public void packetFinished() {
    }

    @Override // z3.m
    public void seek() {
        this.f86060e = 0;
        this.f86061f = 0;
        this.f86062g = 0;
    }

    public final void d() {
        byte[] bArr = this.f86056a.f53154a;
        if (this.f86064i == null) {
            Format formatG = m3.n.g(bArr, this.f86058c, this.f86057b, null);
            this.f86064i = formatG;
            this.f86059d.a(formatG);
        }
        this.f86065j = m3.n.a(bArr);
        this.f86063h = (int) ((((long) m3.n.f(bArr)) * 1000000) / ((long) this.f86064i.f18984x));
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86066k = j10;
    }

    public k(String str) {
        this.f86057b = str;
    }

    public final boolean a(g5.t tVar, byte[] bArr, int i10) {
        int iMin = Math.min(tVar.a(), i10 - this.f86061f);
        tVar.h(bArr, this.f86061f, iMin);
        int i11 = this.f86061f + iMin;
        this.f86061f = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f86060e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(tVar.a(), this.f86065j - this.f86061f);
                        this.f86059d.c(tVar, iMin);
                        int i11 = this.f86061f + iMin;
                        this.f86061f = i11;
                        int i12 = this.f86065j;
                        if (i11 == i12) {
                            this.f86059d.d(this.f86066k, 1, i12, 0, null);
                            this.f86066k += this.f86063h;
                            this.f86060e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(tVar, this.f86056a.f53154a, 18)) {
                    d();
                    this.f86056a.L(0);
                    this.f86059d.c(this.f86056a, 18);
                    this.f86060e = 2;
                }
            } else if (e(tVar)) {
                this.f86060e = 1;
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86058c = dVar.b();
        this.f86059d = iVar.track(dVar.c(), 1);
    }

    public final boolean e(g5.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f86062g << 8;
            this.f86062g = i10;
            int iY = i10 | tVar.y();
            this.f86062g = iY;
            if (m3.n.d(iY)) {
                byte[] bArr = this.f86056a.f53154a;
                int i11 = this.f86062g;
                bArr[0] = (byte) ((i11 >> 24) & 255);
                bArr[1] = (byte) ((i11 >> 16) & 255);
                bArr[2] = (byte) ((i11 >> 8) & 255);
                bArr[3] = (byte) (i11 & 255);
                this.f86061f = 4;
                this.f86062g = 0;
                return true;
            }
        }
        return false;
    }
}
