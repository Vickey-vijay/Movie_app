package r3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.k0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import q3.c;
import q3.g;
import q3.h;
import q3.i;
import q3.k;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f66685r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f66688u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f66689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f66692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f66696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f66698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f66699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f66700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f66701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public s f66702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f66683p = new k() { // from class: r3.a
        @Override // q3.k
        public final g[] createExtractors() {
            return b.k();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f66684q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f66686s = k0.c0("#!AMR\n");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f66687t = k0.c0("#!AMR-WB\n");

    public b() {
        this(0);
    }

    public static /* synthetic */ g[] k() {
        return new g[]{new b()};
    }

    @Override // q3.g
    public void release() {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f66685r = iArr;
        f66688u = iArr[8];
    }

    public b(int i10) {
        this.f66690b = i10;
        this.f66689a = new byte[1];
        this.f66697i = -1;
    }

    public static int e(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    @Override // q3.g
    public void c(i iVar) {
        this.f66700l = iVar;
        this.f66701m = iVar.track(0, 1);
        iVar.endTracks();
    }

    public final s f(long j10) {
        return new c(j10, this.f66696h, e(this.f66697i, 20000L), this.f66697i);
    }

    public final boolean h(int i10) {
        return !this.f66691c && (i10 < 12 || i10 > 14);
    }

    public final boolean i(int i10) {
        return i10 >= 0 && i10 <= 15 && (j(i10) || h(i10));
    }

    public final boolean j(int i10) {
        return this.f66691c && (i10 < 10 || i10 > 13);
    }

    public final void l() {
        if (this.f66703o) {
            return;
        }
        this.f66703o = true;
        boolean z10 = this.f66691c;
        this.f66701m.a(Format.o(null, z10 ? "audio/amr-wb" : "audio/3gpp", null, -1, f66688u, 1, z10 ? 16000 : 8000, -1, null, null, 0, null));
    }

    public final void m(long j10, int i10) {
        int i11;
        if (this.f66695g) {
            return;
        }
        if ((this.f66690b & 1) == 0 || j10 == -1 || !((i11 = this.f66697i) == -1 || i11 == this.f66693e)) {
            s.b bVar = new s.b(-9223372036854775807L);
            this.f66702n = bVar;
            this.f66700l.e(bVar);
            this.f66695g = true;
            return;
        }
        if (this.f66698j >= 20 || i10 == -1) {
            s sVarF = f(j10);
            this.f66702n = sVarF;
            this.f66700l.e(sVarF);
            this.f66695g = true;
        }
    }

    public final boolean p(h hVar) throws InterruptedException, IOException {
        byte[] bArr = f66686s;
        if (n(hVar, bArr)) {
            this.f66691c = false;
            hVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f66687t;
        if (!n(hVar, bArr2)) {
            return false;
        }
        this.f66691c = true;
        hVar.skipFully(bArr2.length);
        return true;
    }

    public final int q(h hVar) throws InterruptedException, IOException {
        if (this.f66694f == 0) {
            try {
                int iO = o(hVar);
                this.f66693e = iO;
                this.f66694f = iO;
                if (this.f66697i == -1) {
                    this.f66696h = hVar.getPosition();
                    this.f66697i = this.f66693e;
                }
                if (this.f66697i == this.f66693e) {
                    this.f66698j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.f66701m.b(hVar, this.f66694f, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f66694f - iB;
        this.f66694f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f66701m.d(this.f66699k + this.f66692d, 1, this.f66693e, 0, null);
        this.f66692d += 20000;
        return 0;
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f66692d = 0L;
        this.f66693e = 0;
        this.f66694f = 0;
        if (j10 != 0) {
            s sVar = this.f66702n;
            if (sVar instanceof c) {
                this.f66699k = ((c) sVar).b(j10);
                return;
            }
        }
        this.f66699k = 0L;
    }

    @Override // q3.g
    public int a(h hVar, r rVar) throws InterruptedException, IOException {
        if (hVar.getPosition() == 0 && !p(hVar)) {
            throw new ParserException("Could not find AMR header.");
        }
        l();
        int iQ = q(hVar);
        m(hVar.getLength(), iQ);
        return iQ;
    }

    @Override // q3.g
    public boolean b(h hVar) throws InterruptedException, IOException {
        return p(hVar);
    }

    public final int g(int i10) throws ParserException {
        String str;
        if (!i(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f66691c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw new ParserException(sb2.toString());
        }
        if (this.f66691c) {
            return f66685r[i10];
        }
        return f66684q[i10];
    }

    public final boolean n(h hVar, byte[] bArr) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        hVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final int o(h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        hVar.peekFully(this.f66689a, 0, 1);
        byte b10 = this.f66689a[0];
        if ((b10 & 131) <= 0) {
            return g((b10 >> 3) & 15);
        }
        throw new ParserException("Invalid padding bits for frame header " + ((int) b10));
    }
}
