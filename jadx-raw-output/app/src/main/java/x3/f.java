package x3;

import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f74302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f74303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f74304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f74305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f74307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f74308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f74309j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f74310k = new t(255);

    public void b() {
        this.f74300a = 0;
        this.f74301b = 0;
        this.f74302c = 0L;
        this.f74303d = 0L;
        this.f74304e = 0L;
        this.f74305f = 0L;
        this.f74306g = 0;
        this.f74307h = 0;
        this.f74308i = 0;
    }

    public boolean a(q3.h hVar, boolean z10) throws InterruptedException, IOException {
        this.f74310k.G();
        b();
        if (!(hVar.getLength() == -1 || hVar.getLength() - hVar.getPeekPosition() >= 27) || !hVar.peekFully(this.f74310k.f53154a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f74310k.A() != 1332176723) {
            if (z10) {
                return false;
            }
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
        int iY = this.f74310k.y();
        this.f74300a = iY;
        if (iY != 0) {
            if (z10) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.f74301b = this.f74310k.y();
        this.f74302c = this.f74310k.n();
        this.f74303d = this.f74310k.o();
        this.f74304e = this.f74310k.o();
        this.f74305f = this.f74310k.o();
        int iY2 = this.f74310k.y();
        this.f74306g = iY2;
        this.f74307h = iY2 + 27;
        this.f74310k.G();
        hVar.peekFully(this.f74310k.f53154a, 0, this.f74306g);
        for (int i10 = 0; i10 < this.f74306g; i10++) {
            this.f74309j[i10] = this.f74310k.y();
            this.f74308i += this.f74309j[i10];
        }
        return true;
    }
}
