package x3;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.io.IOException;
import java.util.ArrayList;
import q3.w;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f74328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f74329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f74330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w.d f74331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w.b f74332r;

    @VisibleForTesting
    public static int n(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean p(t tVar) {
        try {
            return w.l(1, tVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w.d f74333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w.b f74334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f74335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w.c[] f74336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f74337e;

        public a(w.d dVar, w.b bVar, byte[] bArr, w.c[] cVarArr, int i10) {
            this.f74333a = dVar;
            this.f74334b = bVar;
            this.f74335c = bArr;
            this.f74336d = cVarArr;
            this.f74337e = i10;
        }
    }

    public static int m(byte b10, a aVar) {
        return !aVar.f74336d[n(b10, aVar.f74337e, 1)].f66501a ? aVar.f74333a.f66511g : aVar.f74333a.f66512h;
    }

    @Override // x3.i
    public long e(t tVar) {
        byte b10 = tVar.f53154a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        int iM = m(b10, this.f74328n);
        long j10 = this.f74330p ? (this.f74329o + iM) / 4 : 0;
        l(tVar, j10);
        this.f74330p = true;
        this.f74329o = iM;
        return j10;
    }

    @Override // x3.i
    public boolean h(t tVar, long j10, i.b bVar) throws InterruptedException, IOException {
        if (this.f74328n != null) {
            return false;
        }
        a aVarO = o(tVar);
        this.f74328n = aVarO;
        if (aVarO == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f74328n.f74333a.f66514j);
        arrayList.add(this.f74328n.f74335c);
        w.d dVar = this.f74328n.f74333a;
        bVar.f74326a = Format.p(null, "audio/vorbis", null, dVar.f66509e, -1, dVar.f66506b, (int) dVar.f66507c, arrayList, null, 0, null);
        return true;
    }

    @VisibleForTesting
    public a o(t tVar) throws IOException {
        if (this.f74331q == null) {
            this.f74331q = w.j(tVar);
            return null;
        }
        if (this.f74332r == null) {
            this.f74332r = w.h(tVar);
            return null;
        }
        byte[] bArr = new byte[tVar.d()];
        System.arraycopy(tVar.f53154a, 0, bArr, 0, tVar.d());
        w.c[] cVarArrK = w.k(tVar, this.f74331q.f66506b);
        return new a(this.f74331q, this.f74332r, bArr, cVarArrK, w.a(cVarArrK.length - 1));
    }

    @VisibleForTesting
    public static void l(t tVar, long j10) {
        tVar.K(tVar.d() + 4);
        tVar.f53154a[tVar.d() - 4] = (byte) (j10 & 255);
        tVar.f53154a[tVar.d() - 3] = (byte) ((j10 >>> 8) & 255);
        tVar.f53154a[tVar.d() - 2] = (byte) ((j10 >>> 16) & 255);
        tVar.f53154a[tVar.d() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    @Override // x3.i
    public void d(long j10) {
        boolean z10;
        super.d(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f74330p = z10;
        w.d dVar = this.f74331q;
        if (dVar != null) {
            i10 = dVar.f66511g;
        }
        this.f74329o = i10;
    }

    @Override // x3.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f74328n = null;
            this.f74331q = null;
            this.f74332r = null;
        }
        this.f74329o = 0;
        this.f74330p = false;
    }
}
