package x3;

import g5.t;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f74295a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f74296b = new t(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74297c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74299e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f74298d = 0;
        do {
            int i13 = this.f74298d;
            int i14 = i10 + i13;
            f fVar = this.f74295a;
            if (i14 >= fVar.f74306g) {
                break;
            }
            int[] iArr = fVar.f74309j;
            this.f74298d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean d(q3.h hVar) throws InterruptedException, IOException {
        int i10;
        g5.a.f(hVar != null);
        if (this.f74299e) {
            this.f74299e = false;
            this.f74296b.G();
        }
        while (!this.f74299e) {
            if (this.f74297c < 0) {
                if (!this.f74295a.a(hVar, true)) {
                    return false;
                }
                f fVar = this.f74295a;
                int iA = fVar.f74307h;
                if ((fVar.f74301b & 1) == 1 && this.f74296b.d() == 0) {
                    iA += a(0);
                    i10 = this.f74298d + 0;
                } else {
                    i10 = 0;
                }
                hVar.skipFully(iA);
                this.f74297c = i10;
            }
            int iA2 = a(this.f74297c);
            int i11 = this.f74297c + this.f74298d;
            if (iA2 > 0) {
                if (this.f74296b.b() < this.f74296b.d() + iA2) {
                    t tVar = this.f74296b;
                    tVar.f53154a = Arrays.copyOf(tVar.f53154a, tVar.d() + iA2);
                }
                t tVar2 = this.f74296b;
                hVar.readFully(tVar2.f53154a, tVar2.d(), iA2);
                t tVar3 = this.f74296b;
                tVar3.K(tVar3.d() + iA2);
                this.f74299e = this.f74295a.f74309j[i11 + (-1)] != 255;
            }
            if (i11 == this.f74295a.f74306g) {
                i11 = -1;
            }
            this.f74297c = i11;
        }
        return true;
    }

    public f b() {
        return this.f74295a;
    }

    public t c() {
        return this.f74296b;
    }

    public void e() {
        this.f74295a.b();
        this.f74296b.G();
        this.f74297c = -1;
        this.f74299e = false;
    }

    public void f() {
        t tVar = this.f74296b;
        byte[] bArr = tVar.f53154a;
        if (bArr.length == 65025) {
            return;
        }
        tVar.f53154a = Arrays.copyOf(bArr, Math.max(65025, tVar.d()));
    }
}
