package k4;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.t0;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements q, q3.i, Loader.b<a>, Loader.f, h0.b {
    public static final Map<String, String> N = v();
    public static final Format O = Format.s("icy", "application/x-icy", Long.MAX_VALUE);
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f62411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f62412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f62413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e5.m f62414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.a f62415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f62416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e5.b f62417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f62418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f62419j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f62421l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public q.a f62426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public q3.s f62427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public IcyHeaders f62428s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public d f62433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62434y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Loader f62420k = new Loader("Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g5.f f62422m = new g5.f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f62423n = new Runnable() { // from class: k4.c0
        @Override // java.lang.Runnable
        public final void run() {
            this.f62398b.D();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f62424o = new Runnable() { // from class: k4.d0
        @Override // java.lang.Runnable
        public final void run() {
            this.f62401b.C();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f62425p = new Handler();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f[] f62430u = new f[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0[] f62429t = new h0[0];
    public long I = -9223372036854775807L;
    public long F = -1;
    public long E = -9223372036854775807L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f62435z = 1;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f62436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e5.o f62437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f62438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q3.i f62439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g5.f f62440e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f62442g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f62444i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public q3.u f62447l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f62448m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q3.r f62441f = new q3.r();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f62443h = true;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f62446k = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e5.h f62445j = g(0);

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
            this.f62442g = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws Throwable {
            int iA = 0;
            while (iA == 0 && !this.f62442g) {
                q3.d dVar = null;
                try {
                    long position = this.f62441f.f66477a;
                    e5.h hVarG = g(position);
                    this.f62445j = hVarG;
                    long jA = this.f62437b.a(hVarG);
                    this.f62446k = jA;
                    if (jA != -1) {
                        this.f62446k = jA + position;
                    }
                    Uri uri = (Uri) g5.a.e(this.f62437b.getUri());
                    e0.this.f62428s = IcyHeaders.a(this.f62437b.getResponseHeaders());
                    com.google.android.exoplayer2.upstream.a nVar = this.f62437b;
                    if (e0.this.f62428s != null && e0.this.f62428s.f19295g != -1) {
                        nVar = new n(this.f62437b, e0.this.f62428s.f19295g, this);
                        q3.u uVarZ = e0.this.z();
                        this.f62447l = uVarZ;
                        uVarZ.a(e0.O);
                    }
                    q3.d dVar2 = new q3.d(nVar, position, this.f62446k);
                    try {
                        q3.g gVarB = this.f62438c.b(dVar2, this.f62439d, uri);
                        if (e0.this.f62428s != null && (gVarB instanceof v3.e)) {
                            ((v3.e) gVarB).f();
                        }
                        if (this.f62443h) {
                            gVarB.seek(position, this.f62444i);
                            this.f62443h = false;
                        }
                        while (iA == 0 && !this.f62442g) {
                            this.f62440e.a();
                            iA = gVarB.a(dVar2, this.f62441f);
                            if (dVar2.getPosition() > e0.this.f62419j + position) {
                                position = dVar2.getPosition();
                                this.f62440e.b();
                                e0.this.f62425p.post(e0.this.f62424o);
                            }
                        }
                        if (iA == 1) {
                            iA = 0;
                        } else {
                            this.f62441f.f66477a = dVar2.getPosition();
                        }
                        g5.k0.m(this.f62437b);
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = dVar2;
                        if (iA != 1 && dVar != null) {
                            this.f62441f.f66477a = dVar.getPosition();
                        }
                        g5.k0.m(this.f62437b);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        public a(Uri uri, com.google.android.exoplayer2.upstream.a aVar, b bVar, q3.i iVar, g5.f fVar) {
            this.f62436a = uri;
            this.f62437b = new e5.o(aVar);
            this.f62438c = bVar;
            this.f62439d = iVar;
            this.f62440e = fVar;
        }

        @Override // k4.n.a
        public void a(g5.t tVar) {
            long jMax = !this.f62448m ? this.f62444i : Math.max(e0.this.x(), this.f62444i);
            int iA = tVar.a();
            q3.u uVar = (q3.u) g5.a.e(this.f62447l);
            uVar.c(tVar, iA);
            uVar.d(jMax, 1, iA, 0, null);
            this.f62448m = true;
        }

        public final e5.h g(long j10) {
            return new e5.h(this.f62436a, j10, -1L, e0.this.f62418i, 6, (Map<String, String>) e0.N);
        }

        public final void h(long j10, long j11) {
            this.f62441f.f66477a = j10;
            this.f62444i = j11;
            this.f62443h = true;
            this.f62448m = false;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.g[] f62450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public q3.g f62451b;

        public void a() {
            q3.g gVar = this.f62451b;
            if (gVar != null) {
                gVar.release();
                this.f62451b = null;
            }
        }

        public q3.g b(q3.h hVar, q3.i iVar, Uri uri) throws InterruptedException, IOException {
            q3.g gVar = this.f62451b;
            if (gVar != null) {
                return gVar;
            }
            q3.g[] gVarArr = this.f62450a;
            if (gVarArr.length == 1) {
                this.f62451b = gVarArr[0];
            } else {
                for (q3.g gVar2 : gVarArr) {
                    try {
                        if (gVar2.b(hVar)) {
                            this.f62451b = gVar2;
                            hVar.resetPeekPosition();
                            break;
                        }
                        continue;
                    } catch (EOFException unused) {
                    } catch (Throwable th2) {
                        hVar.resetPeekPosition();
                        throw th2;
                    }
                    hVar.resetPeekPosition();
                }
                if (this.f62451b == null) {
                    throw new UnrecognizedInputFormatException("None of the available extractors (" + g5.k0.E(this.f62450a) + ") could read the stream.", uri);
                }
            }
            this.f62451b.c(iVar);
            return this.f62451b;
        }

        public b(q3.g[] gVarArr) {
            this.f62450a = gVarArr;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface c {
        void onSourceInfoRefreshed(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class e implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62457b;

        public e(int i10) {
            this.f62457b = i10;
        }

        @Override // k4.i0
        public int b(k3.f0 f0Var, o3.e eVar, boolean z10) {
            return e0.this.M(this.f62457b, f0Var, eVar, z10);
        }

        @Override // k4.i0
        public boolean isReady() {
            return e0.this.B(this.f62457b);
        }

        @Override // k4.i0
        public void maybeThrowError() throws IOException {
            e0.this.H(this.f62457b);
        }

        @Override // k4.i0
        public int skipData(long j10) {
            return e0.this.P(this.f62457b, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62460b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f62459a == fVar.f62459a && this.f62460b == fVar.f62460b;
        }

        public int hashCode() {
            return (this.f62459a * 31) + (this.f62460b ? 1 : 0);
        }

        public f(int i10, boolean z10) {
            this.f62459a = i10;
            this.f62460b = z10;
        }
    }

    @Override // q3.i
    public void endTracks() {
        this.f62431v = true;
        this.f62425p.post(this.f62423n);
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.s f62452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroupArray f62453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f62454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f62455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f62456e;

        public d(q3.s sVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f62452a = sVar;
            this.f62453b = trackGroupArray;
            this.f62454c = zArr;
            int i10 = trackGroupArray.f19435b;
            this.f62455d = new boolean[i10];
            this.f62456e = new boolean[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (this.M) {
            return;
        }
        ((q.a) g5.a.e(this.f62426q)).e(this);
    }

    public static Map<String, String> v() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    public final boolean A() {
        return this.I != -9223372036854775807L;
    }

    public final void D() {
        int i10;
        q3.s sVar = this.f62427r;
        if (this.M || this.f62432w || !this.f62431v || sVar == null) {
            return;
        }
        boolean z10 = false;
        for (h0 h0Var : this.f62429t) {
            if (h0Var.z() == null) {
                return;
            }
        }
        this.f62422m.b();
        int length = this.f62429t.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        this.E = sVar.getDurationUs();
        for (int i11 = 0; i11 < length; i11++) {
            Format formatZ = this.f62429t[i11].z();
            String str = formatZ.f18970j;
            boolean zL = g5.p.l(str);
            boolean z11 = zL || g5.p.n(str);
            zArr[i11] = z11;
            this.f62434y = z11 | this.f62434y;
            IcyHeaders icyHeaders = this.f62428s;
            if (icyHeaders != null) {
                if (zL || this.f62430u[i11].f62460b) {
                    Metadata metadata = formatZ.f18968h;
                    formatZ = formatZ.k(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders));
                }
                if (zL && formatZ.f18966f == -1 && (i10 = icyHeaders.f19290b) != -1) {
                    formatZ = formatZ.b(i10);
                }
            }
            DrmInitData drmInitData = formatZ.f18973m;
            if (drmInitData != null) {
                formatZ = formatZ.e(this.f62413d.c(drmInitData));
            }
            trackGroupArr[i11] = new TrackGroup(formatZ);
        }
        if (this.F == -1 && sVar.getDurationUs() == -9223372036854775807L) {
            z10 = true;
        }
        this.G = z10;
        this.f62435z = z10 ? 7 : 1;
        this.f62433x = new d(sVar, new TrackGroupArray(trackGroupArr), zArr);
        this.f62432w = true;
        this.f62416g.onSourceInfoRefreshed(this.E, sVar.isSeekable(), this.G);
        ((q.a) g5.a.e(this.f62426q)).f(this);
    }

    public void G() throws IOException {
        this.f62420k.j(this.f62414e.getMinimumLoadableRetryCount(this.f62435z));
    }

    public void H(int i10) throws IOException {
        this.f62429t[i10].G();
        G();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void f(a aVar, long j10, long j11, boolean z10) {
        this.f62415f.w(aVar.f62445j, aVar.f62437b.d(), aVar.f62437b.e(), 1, -1, null, 0, null, aVar.f62444i, this.E, j10, j11, aVar.f62437b.c());
        if (z10) {
            return;
        }
        u(aVar);
        for (h0 h0Var : this.f62429t) {
            h0Var.O();
        }
        if (this.D > 0) {
            ((q.a) g5.a.e(this.f62426q)).e(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void h(a aVar, long j10, long j11) {
        q3.s sVar;
        if (this.E == -9223372036854775807L && (sVar = this.f62427r) != null) {
            boolean zIsSeekable = sVar.isSeekable();
            long jX = x();
            long j12 = jX == Long.MIN_VALUE ? 0L : jX + 10000;
            this.E = j12;
            this.f62416g.onSourceInfoRefreshed(j12, zIsSeekable, this.G);
        }
        this.f62415f.z(aVar.f62445j, aVar.f62437b.d(), aVar.f62437b.e(), 1, -1, null, 0, null, aVar.f62444i, this.E, j10, j11, aVar.f62437b.c());
        u(aVar);
        this.L = true;
        ((q.a) g5.a.e(this.f62426q)).e(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Loader.c k(a aVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        u(aVar);
        long jB = this.f62414e.b(this.f62435z, j11, iOException, i10);
        if (jB == -9223372036854775807L) {
            cVarG = Loader.f20062g;
        } else {
            int iW = w();
            cVarG = t(aVar, iW) ? Loader.g(iW > this.K, jB) : Loader.f20061f;
        }
        this.f62415f.C(aVar.f62445j, aVar.f62437b.d(), aVar.f62437b.e(), 1, -1, null, 0, null, aVar.f62444i, this.E, j10, j11, aVar.f62437b.c(), iOException, !cVarG.c());
        return cVarG;
    }

    public final q3.u L(f fVar) {
        int length = this.f62429t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (fVar.equals(this.f62430u[i10])) {
                return this.f62429t[i10];
            }
        }
        h0 h0Var = new h0(this.f62417h, this.f62425p.getLooper(), this.f62413d);
        h0Var.V(this);
        int i11 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.f62430u, i11);
        fVarArr[length] = fVar;
        this.f62430u = (f[]) g5.k0.j(fVarArr);
        h0[] h0VarArr = (h0[]) Arrays.copyOf(this.f62429t, i11);
        h0VarArr[length] = h0Var;
        this.f62429t = (h0[]) g5.k0.j(h0VarArr);
        return h0Var;
    }

    public void N() {
        if (this.f62432w) {
            for (h0 h0Var : this.f62429t) {
                h0Var.J();
            }
        }
        this.f62420k.l(this);
        this.f62425p.removeCallbacksAndMessages(null);
        this.f62426q = null;
        this.M = true;
        this.f62415f.J();
    }

    public final boolean O(boolean[] zArr, long j10) {
        int length = this.f62429t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f62429t[i10].S(j10, false) && (zArr[i10] || !this.f62434y)) {
                return false;
            }
        }
        return true;
    }

    public final void Q() {
        a aVar = new a(this.f62411b, this.f62412c, this.f62421l, this, this.f62422m);
        if (this.f62432w) {
            q3.s sVar = y().f62452a;
            g5.a.f(A());
            long j10 = this.E;
            if (j10 != -9223372036854775807L && this.I > j10) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            } else {
                aVar.h(sVar.getSeekPoints(this.I).f66478a.f66484b, this.I);
                this.I = -9223372036854775807L;
            }
        }
        this.K = w();
        this.f62415f.F(aVar.f62445j, 1, -1, null, 0, null, aVar.f62444i, this.E, this.f62420k.m(aVar, this, this.f62414e.getMinimumLoadableRetryCount(this.f62435z)));
    }

    public final boolean R() {
        return this.B || A();
    }

    @Override // k4.h0.b
    public void b(Format format) {
        this.f62425p.post(this.f62423n);
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f62426q = aVar;
        this.f62422m.d();
        Q();
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        if (this.L || this.f62420k.h() || this.J) {
            return false;
        }
        if (this.f62432w && this.D == 0) {
            return false;
        }
        boolean zD = this.f62422m.d();
        if (this.f62420k.i()) {
            return zD;
        }
        Q();
        return true;
    }

    @Override // q3.i
    public void e(q3.s sVar) {
        if (this.f62428s != null) {
            sVar = new q3.s.b(-9223372036854775807L);
        }
        this.f62427r = sVar;
        this.f62425p.post(this.f62423n);
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        return this.f62420k.i() && this.f62422m.c();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        for (h0 h0Var : this.f62429t) {
            h0Var.M();
        }
        this.f62421l.a();
    }

    @Override // k4.q
    public long readDiscontinuity() {
        if (!this.C) {
            this.f62415f.L();
            this.C = true;
        }
        if (!this.B) {
            return -9223372036854775807L;
        }
        if (!this.L && w() <= this.K) {
            return -9223372036854775807L;
        }
        this.B = false;
        return this.H;
    }

    public final boolean t(a aVar, int i10) {
        q3.s sVar;
        if (this.F != -1 || ((sVar = this.f62427r) != null && sVar.getDurationUs() != -9223372036854775807L)) {
            this.K = i10;
            return true;
        }
        if (this.f62432w && !R()) {
            this.J = true;
            return false;
        }
        this.B = this.f62432w;
        this.H = 0L;
        this.K = 0;
        for (h0 h0Var : this.f62429t) {
            h0Var.O();
        }
        aVar.h(0L, 0L);
        return true;
    }

    @Override // q3.i
    public q3.u track(int i10, int i11) {
        return L(new f(i10, false));
    }

    public final void u(a aVar) {
        if (this.F == -1) {
            this.F = aVar.f62446k;
        }
    }

    public final int w() {
        int iA = 0;
        for (h0 h0Var : this.f62429t) {
            iA += h0Var.A();
        }
        return iA;
    }

    public final long x() {
        long jMax = Long.MIN_VALUE;
        for (h0 h0Var : this.f62429t) {
            jMax = Math.max(jMax, h0Var.v());
        }
        return jMax;
    }

    public final d y() {
        return (d) g5.a.e(this.f62433x);
    }

    public q3.u z() {
        return L(new f(0, true));
    }

    public e0(Uri uri, com.google.android.exoplayer2.upstream.a aVar, q3.g[] gVarArr, com.google.android.exoplayer2.drm.a<?> aVar2, e5.m mVar, b0.a aVar3, c cVar, e5.b bVar, @Nullable String str, int i10) {
        this.f62411b = uri;
        this.f62412c = aVar;
        this.f62413d = aVar2;
        this.f62414e = mVar;
        this.f62415f = aVar3;
        this.f62416g = cVar;
        this.f62417h = bVar;
        this.f62418i = str;
        this.f62419j = i10;
        this.f62421l = new b(gVarArr);
        aVar3.I();
    }

    public boolean B(int i10) {
        if (!R() && this.f62429t[i10].E(this.L)) {
            return true;
        }
        return false;
    }

    public final void E(int i10) {
        d dVarY = y();
        boolean[] zArr = dVarY.f62456e;
        if (!zArr[i10]) {
            Format formatA = dVarY.f62453b.a(i10).a(0);
            this.f62415f.l(g5.p.h(formatA.f18970j), formatA, 0, null, this.H);
            zArr[i10] = true;
        }
    }

    public final void F(int i10) {
        boolean[] zArr = y().f62454c;
        if (this.J && zArr[i10]) {
            if (!this.f62429t[i10].E(false)) {
                this.I = 0L;
                this.J = false;
                this.B = true;
                this.H = 0L;
                this.K = 0;
                for (h0 h0Var : this.f62429t) {
                    h0Var.O();
                }
                ((q.a) g5.a.e(this.f62426q)).e(this);
            }
        }
    }

    public int M(int i10, k3.f0 f0Var, o3.e eVar, boolean z10) {
        if (R()) {
            return -3;
        }
        E(i10);
        int iK = this.f62429t[i10].K(f0Var, eVar, z10, this.L, this.H);
        if (iK == -3) {
            F(i10);
        }
        return iK;
    }

    public int P(int i10, long j10) {
        int iE;
        if (R()) {
            return 0;
        }
        E(i10);
        h0 h0Var = this.f62429t[i10];
        if (this.L && j10 > h0Var.v()) {
            iE = h0Var.f();
        } else {
            iE = h0Var.e(j10);
        }
        if (iE == 0) {
            F(i10);
        }
        return iE;
    }

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        q3.s sVar = y().f62452a;
        if (!sVar.isSeekable()) {
            return 0L;
        }
        q3.s.a seekPoints = sVar.getSeekPoints(j10);
        return g5.k0.x0(j10, t0Var, seekPoints.f66478a.f66483a, seekPoints.f66479b.f66483a);
    }

    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        com.google.android.exoplayer2.trackselection.c cVar;
        boolean z11;
        boolean z12;
        d dVarY = y();
        TrackGroupArray trackGroupArray = dVarY.f62453b;
        boolean[] zArr3 = dVarY.f62455d;
        int i10 = this.D;
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            i0 i0Var = i0VarArr[i12];
            if (i0Var != null && (cVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((e) i0Var).f62457b;
                g5.a.f(zArr3[i13]);
                this.D--;
                zArr3[i13] = false;
                i0VarArr[i12] = null;
            }
        }
        if (!this.A ? j10 != 0 : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (i0VarArr[i14] == null && (cVar = cVarArr[i14]) != null) {
                if (cVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g5.a.f(z11);
                if (cVar.getIndexInTrackGroup(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g5.a.f(z12);
                int iB = trackGroupArray.b(cVar.getTrackGroup());
                g5.a.f(!zArr3[iB]);
                this.D++;
                zArr3[iB] = true;
                i0VarArr[i14] = new e(iB);
                zArr2[i14] = true;
                if (!z10) {
                    h0 h0Var = this.f62429t[iB];
                    if (!h0Var.S(j10, true) && h0Var.x() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.D == 0) {
            this.J = false;
            this.B = false;
            if (this.f62420k.i()) {
                h0[] h0VarArr = this.f62429t;
                int length = h0VarArr.length;
                while (i11 < length) {
                    h0VarArr[i11].n();
                    i11++;
                }
                this.f62420k.e();
            } else {
                h0[] h0VarArr2 = this.f62429t;
                int length2 = h0VarArr2.length;
                while (i11 < length2) {
                    h0VarArr2[i11].O();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < i0VarArr.length) {
                if (i0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.A = true;
        return j10;
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        if (A()) {
            return;
        }
        boolean[] zArr = y().f62455d;
        int length = this.f62429t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f62429t[i10].m(j10, z10, zArr[i10]);
        }
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        long jX;
        boolean[] zArr = y().f62454c;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.I;
        }
        if (this.f62434y) {
            int length = this.f62429t.length;
            jX = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f62429t[i10].D()) {
                    jX = Math.min(jX, this.f62429t[i10].v());
                }
            }
        } else {
            jX = Long.MAX_VALUE;
        }
        if (jX == Long.MAX_VALUE) {
            jX = x();
        }
        if (jX == Long.MIN_VALUE) {
            return this.H;
        }
        return jX;
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return y().f62453b;
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        G();
        if (this.L && !this.f62432w) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // k4.q
    public long seekToUs(long j10) {
        d dVarY = y();
        q3.s sVar = dVarY.f62452a;
        boolean[] zArr = dVarY.f62454c;
        if (!sVar.isSeekable()) {
            j10 = 0;
        }
        this.B = false;
        this.H = j10;
        if (A()) {
            this.I = j10;
            return j10;
        }
        if (this.f62435z != 7 && O(zArr, j10)) {
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f62420k.i()) {
            this.f62420k.e();
        } else {
            this.f62420k.f();
            for (h0 h0Var : this.f62429t) {
                h0Var.O();
            }
        }
        return j10;
    }
}
