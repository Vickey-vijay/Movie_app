package z3;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.t f86197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.q f86198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f86200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q3.u f86201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f86206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f86207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f86208l;

    public s() {
        this(null);
    }

    @Override // z3.m
    public void packetFinished() {
    }

    @Override // z3.m
    public void seek() {
        this.f86202f = 0;
        this.f86203g = 0;
        this.f86205i = false;
    }

    public s(String str) {
        this.f86202f = 0;
        g5.t tVar = new g5.t(4);
        this.f86197a = tVar;
        tVar.f53154a[0] = -1;
        this.f86198b = new q3.q();
        this.f86199c = str;
    }

    public final void a(g5.t tVar) {
        byte[] bArr = tVar.f53154a;
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD; iC++) {
            byte b10 = bArr[iC];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f86205i && (b10 & 224) == 224;
            this.f86205i = z10;
            if (z11) {
                tVar.L(iC + 1);
                this.f86205i = false;
                this.f86197a.f53154a[1] = bArr[iC];
                this.f86203g = 2;
                this.f86202f = 1;
                return;
            }
        }
        tVar.L(iD);
    }

    public final void e(g5.t tVar) {
        int iMin = Math.min(tVar.a(), 4 - this.f86203g);
        tVar.h(this.f86197a.f53154a, this.f86203g, iMin);
        int i10 = this.f86203g + iMin;
        this.f86203g = i10;
        if (i10 < 4) {
            return;
        }
        this.f86197a.L(0);
        if (!q3.q.e(this.f86197a.j(), this.f86198b)) {
            this.f86203g = 0;
            this.f86202f = 1;
            return;
        }
        q3.q qVar = this.f86198b;
        this.f86207k = qVar.f66472c;
        if (!this.f86204h) {
            long j10 = ((long) qVar.f66476g) * 1000000;
            int i11 = qVar.f66473d;
            this.f86206j = j10 / ((long) i11);
            this.f86201e.a(Format.p(this.f86200d, qVar.f66471b, null, -1, 4096, qVar.f66474e, i11, null, null, 0, this.f86199c));
            this.f86204h = true;
        }
        this.f86197a.L(0);
        this.f86201e.c(this.f86197a, 4);
        this.f86202f = 2;
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86208l = j10;
    }

    @Override // z3.m
    public void b(g5.t tVar) {
        while (tVar.a() > 0) {
            int i10 = this.f86202f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        d(tVar);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e(tVar);
                }
            } else {
                a(tVar);
            }
        }
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86200d = dVar.b();
        this.f86201e = iVar.track(dVar.c(), 1);
    }

    public final void d(g5.t tVar) {
        int iMin = Math.min(tVar.a(), this.f86207k - this.f86203g);
        this.f86201e.c(tVar, iMin);
        int i10 = this.f86203g + iMin;
        this.f86203g = i10;
        int i11 = this.f86207k;
        if (i10 < i11) {
            return;
        }
        this.f86201e.d(this.f86208l, 1, i11, 0, null);
        this.f86208l += this.f86206j;
        this.f86203g = 0;
        this.f86202f = 0;
    }
}
