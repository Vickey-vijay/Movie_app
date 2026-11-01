package z3;

import androidx.core.view.InputDeviceCompat;
import g5.k0;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f85924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.t f85925b = new g5.t(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85929f;

    @Override // z3.h0
    public void b(g5.t tVar, int i10) {
        int iC;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iC = tVar.c() + tVar.y();
        } else {
            iC = -1;
        }
        if (this.f85929f) {
            if (!z10) {
                return;
            }
            this.f85929f = false;
            tVar.L(iC);
            this.f85927d = 0;
        }
        while (tVar.a() > 0) {
            int i11 = this.f85927d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iY = tVar.y();
                    tVar.L(tVar.c() - 1);
                    if (iY == 255) {
                        this.f85929f = true;
                        return;
                    }
                }
                int iMin = Math.min(tVar.a(), 3 - this.f85927d);
                tVar.h(this.f85925b.f53154a, this.f85927d, iMin);
                int i12 = this.f85927d + iMin;
                this.f85927d = i12;
                if (i12 == 3) {
                    this.f85925b.H(3);
                    this.f85925b.M(1);
                    int iY2 = this.f85925b.y();
                    int iY3 = this.f85925b.y();
                    this.f85928e = (iY2 & 128) != 0;
                    this.f85926c = (((iY2 & 15) << 8) | iY3) + 3;
                    int iB = this.f85925b.b();
                    int i13 = this.f85926c;
                    if (iB < i13) {
                        g5.t tVar2 = this.f85925b;
                        byte[] bArr = tVar2.f53154a;
                        tVar2.H(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f85925b.f53154a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(tVar.a(), this.f85926c - this.f85927d);
                tVar.h(this.f85925b.f53154a, this.f85927d, iMin2);
                int i14 = this.f85927d + iMin2;
                this.f85927d = i14;
                int i15 = this.f85926c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f85928e) {
                        this.f85925b.H(i15);
                    } else {
                        if (k0.t(this.f85925b.f53154a, 0, i15, -1) != 0) {
                            this.f85929f = true;
                            return;
                        }
                        this.f85925b.H(this.f85926c - 4);
                    }
                    this.f85924a.b(this.f85925b);
                    this.f85927d = 0;
                }
            }
        }
    }

    @Override // z3.h0
    public void seek() {
        this.f85929f = true;
    }

    @Override // z3.h0
    public void a(g5.g0 g0Var, q3.i iVar, h0.d dVar) {
        this.f85924a.a(g0Var, iVar, dVar);
        this.f85929f = true;
    }

    public a0(z zVar) {
        this.f85924a = zVar;
    }
}
