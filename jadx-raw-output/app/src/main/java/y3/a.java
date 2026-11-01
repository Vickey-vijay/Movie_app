package y3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.io.IOException;
import q3.g;
import q3.h;
import q3.i;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: RawCcExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f75258a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f75260c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75265h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f75259b = new t(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75261d = 0;

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f75261d = 0;
    }

    @Override // q3.g
    public int a(h hVar, r rVar) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f75261d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    e(hVar);
                    this.f75261d = 1;
                    return 0;
                }
                if (!f(hVar)) {
                    this.f75261d = 0;
                    return -1;
                }
                this.f75261d = 2;
            } else {
                if (!d(hVar)) {
                    return -1;
                }
                this.f75261d = 1;
            }
        }
    }

    @Override // q3.g
    public boolean b(h hVar) throws InterruptedException, IOException {
        this.f75259b.G();
        hVar.peekFully(this.f75259b.f53154a, 0, 8);
        return this.f75259b.j() == 1380139777;
    }

    @Override // q3.g
    public void c(i iVar) {
        iVar.e(new s.b(-9223372036854775807L));
        this.f75260c = iVar.track(0, 3);
        iVar.endTracks();
        this.f75260c.a(this.f75258a);
    }

    public final boolean d(h hVar) throws InterruptedException, IOException {
        this.f75259b.G();
        if (!hVar.readFully(this.f75259b.f53154a, 0, 8, true)) {
            return false;
        }
        if (this.f75259b.j() != 1380139777) {
            throw new IOException("Input not RawCC");
        }
        this.f75262e = this.f75259b.y();
        return true;
    }

    public final void e(h hVar) throws InterruptedException, IOException {
        while (this.f75264g > 0) {
            this.f75259b.G();
            hVar.readFully(this.f75259b.f53154a, 0, 3);
            this.f75260c.c(this.f75259b, 3);
            this.f75265h += 3;
            this.f75264g--;
        }
        int i10 = this.f75265h;
        if (i10 > 0) {
            this.f75260c.d(this.f75263f, 1, i10, 0, null);
        }
    }

    public final boolean f(h hVar) throws InterruptedException, IOException {
        this.f75259b.G();
        int i10 = this.f75262e;
        if (i10 == 0) {
            if (!hVar.readFully(this.f75259b.f53154a, 0, 5, true)) {
                return false;
            }
            this.f75263f = (this.f75259b.A() * 1000) / 45;
        } else {
            if (i10 != 1) {
                throw new ParserException("Unsupported version number: " + this.f75262e);
            }
            if (!hVar.readFully(this.f75259b.f53154a, 0, 9, true)) {
                return false;
            }
            this.f75263f = this.f75259b.r();
        }
        this.f75264g = this.f75259b.y();
        this.f75265h = 0;
        return true;
    }

    public a(Format format) {
        this.f75258a = format;
    }
}
