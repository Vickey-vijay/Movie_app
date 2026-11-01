package p4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Loader;
import g5.k0;
import g5.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k3.f0;
import k4.b0;
import k4.h0;
import k4.i0;
import k4.j0;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements Loader.b<m4.d>, Loader.f, j0, q3.i, h0.b {
    public static final Set<Integer> W = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 4)));
    public boolean A;
    public boolean B;
    public int C;
    public Format D;

    @Nullable
    public Format E;
    public boolean F;
    public TrackGroupArray G;
    public Set<TrackGroup> H;
    public int[] I;
    public int J;
    public boolean K;
    public boolean[] L;
    public boolean[] M;
    public long N;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public long T;

    @Nullable
    public DrmInitData U;
    public int V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f65966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f65967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e5.b f65968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Format f65969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f65970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e5.m f65971h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.a f65973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f65974k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<h> f65976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<h> f65977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f65978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f65979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f65980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<j> f65981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map<String, DrmInitData> f65982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c[] f65983t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Set<Integer> f65985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SparseIntArray f65986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u f65987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f65988y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f65989z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Loader f65972i = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d.b f65975l = new d.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f65984u = new int[0];

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public interface a extends j0.a<n> {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static class b implements u {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Format f65990g = Format.s(null, "application/id3", Long.MAX_VALUE);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Format f65991h = Format.s(null, "application/x-emsg", Long.MAX_VALUE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d4.a f65992a = new d4.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f65993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f65994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Format f65995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f65996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f65997f;

        @Override // q3.u
        public void a(Format format) {
            this.f65995d = format;
            this.f65993b.a(this.f65994c);
        }

        @Override // q3.u
        public int b(q3.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            f(this.f65997f + i10);
            int i11 = hVar.read(this.f65996e, this.f65997f, i10);
            if (i11 != -1) {
                this.f65997f += i11;
                return i11;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // q3.u
        public void c(t tVar, int i10) {
            f(this.f65997f + i10);
            tVar.h(this.f65996e, this.f65997f, i10);
            this.f65997f += i10;
        }

        @Override // q3.u
        public void d(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
            g5.a.e(this.f65995d);
            t tVarG = g(i11, i12);
            if (!k0.c(this.f65995d.f18970j, this.f65994c.f18970j)) {
                if (!"application/x-emsg".equals(this.f65995d.f18970j)) {
                    g5.m.h("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f65995d.f18970j);
                    return;
                }
                EventMessage eventMessageB = this.f65992a.b(tVarG);
                if (!e(eventMessageB)) {
                    g5.m.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f65994c.f18970j, eventMessageB.getWrappedMetadataFormat()));
                    return;
                }
                tVarG = new t((byte[]) g5.a.e(eventMessageB.getWrappedMetadataBytes()));
            }
            int iA = tVarG.a();
            this.f65993b.c(tVarG, iA);
            this.f65993b.d(j10, i10, iA, i12, aVar);
        }

        public final void f(int i10) {
            byte[] bArr = this.f65996e;
            if (bArr.length < i10) {
                this.f65996e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        public final t g(int i10, int i11) {
            int i12 = this.f65997f - i11;
            t tVar = new t(Arrays.copyOfRange(this.f65996e, i12 - i10, i12));
            byte[] bArr = this.f65996e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f65997f = i11;
            return tVar;
        }

        public b(u uVar, int i10) {
            this.f65993b = uVar;
            if (i10 != 1) {
                if (i10 == 3) {
                    this.f65994c = f65991h;
                } else {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
            } else {
                this.f65994c = f65990g;
            }
            this.f65996e = new byte[0];
            this.f65997f = 0;
        }

        public final boolean e(EventMessage eventMessage) {
            Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && k0.c(this.f65994c.f18970j, wrappedMetadataFormat.f18970j)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static final class c extends h0 {
        public final Map<String, DrmInitData> F;

        @Nullable
        public DrmInitData G;

        @Nullable
        public final Metadata Y(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iD = metadata.d();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iD) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entryC = metadata.c(i11);
                if ((entryC instanceof PrivFrame) && io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entryC).f19331c)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (iD == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iD - 1];
            while (i10 < iD) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.c(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        public void Z(@Nullable DrmInitData drmInitData) {
            this.G = drmInitData;
            C();
        }

        @Override // k4.h0
        public Format s(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.G;
            if (drmInitData2 == null) {
                drmInitData2 = format.f18973m;
            }
            if (drmInitData2 != null && (drmInitData = this.F.get(drmInitData2.f19170d)) != null) {
                drmInitData2 = drmInitData;
            }
            return super.s(format.a(drmInitData2, Y(format.f18968h)));
        }

        public c(e5.b bVar, Looper looper, com.google.android.exoplayer2.drm.a<?> aVar, Map<String, DrmInitData> map) {
            super(bVar, looper, aVar);
            this.F = map;
        }
    }

    public static int w(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void K() {
        this.A = true;
        C();
    }

    public final void T() {
        this.B = true;
    }

    @Override // q3.i
    public void e(s sVar) {
    }

    @Override // q3.i
    public void endTracks() {
        this.S = true;
        this.f65980q.post(this.f65979p);
    }

    public final TrackGroupArray q(TrackGroup[] trackGroupArr) {
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            TrackGroup trackGroup = trackGroupArr[i10];
            Format[] formatArr = new Format[trackGroup.f19431b];
            for (int i11 = 0; i11 < trackGroup.f19431b; i11++) {
                Format formatA = trackGroup.a(i11);
                DrmInitData drmInitData = formatA.f18973m;
                if (drmInitData != null) {
                    formatA = formatA.e(this.f65970g.c(drmInitData));
                }
                formatArr[i11] = formatA;
            }
            trackGroupArr[i10] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // k4.j0
    public void reevaluateBuffer(long j10) {
    }

    public static q3.f o(int i10, int i11) {
        g5.m.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new q3.f();
    }

    public static Format r(@Nullable Format format, Format format2, boolean z10) {
        if (format == null) {
            return format2;
        }
        int i10 = z10 ? format.f18966f : -1;
        int i11 = format.f18983w;
        if (i11 == -1) {
            i11 = format2.f18983w;
        }
        int i12 = i11;
        String strD = k0.D(format.f18967g, g5.p.h(format2.f18970j));
        String strE = g5.p.e(strD);
        if (strE == null) {
            strE = format2.f18970j;
        }
        return format2.c(format.f18962b, format.f18963c, strE, strD, format.f18968h, i10, format.f18975o, format.f18976p, i12, format.f18964d, format.B);
    }

    public static boolean t(Format format, Format format2) {
        String str = format.f18970j;
        String str2 = format2.f18970j;
        int iH = g5.p.h(str);
        if (iH != 3) {
            return iH == g5.p.h(str2);
        }
        if (k0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.C == format2.C;
        }
        return false;
    }

    public static boolean y(m4.d dVar) {
        return dVar instanceof h;
    }

    public final void B() {
        int i10 = this.G.f19435b;
        int[] iArr = new int[i10];
        this.I = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                c[] cVarArr = this.f65983t;
                if (i12 >= cVarArr.length) {
                    break;
                }
                if (t(cVarArr[i12].z(), this.G.a(i11).a(0))) {
                    this.I[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<j> it = this.f65981r.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void C() {
        if (!this.F && this.I == null && this.A) {
            for (c cVar : this.f65983t) {
                if (cVar.z() == null) {
                    return;
                }
            }
            if (this.G != null) {
                B();
                return;
            }
            m();
            T();
            this.f65966c.onPrepared();
        }
    }

    public void D() throws IOException {
        this.f65972i.maybeThrowError();
        this.f65967d.i();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void f(m4.d dVar, long j10, long j11, boolean z10) {
        this.f65973j.w(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f65965b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, dVar.a());
        if (z10) {
            return;
        }
        O();
        if (this.C > 0) {
            this.f65966c.e(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void h(m4.d dVar, long j10, long j11) {
        this.f65967d.j(dVar);
        this.f65973j.z(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f65965b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, dVar.a());
        if (this.B) {
            this.f65966c.e(this);
        } else {
            continueLoading(this.N);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Loader.c k(m4.d dVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        long jA = dVar.a();
        boolean zY = y(dVar);
        long jA2 = this.f65971h.a(dVar.f64042b, j11, iOException, i10);
        boolean zG = jA2 != -9223372036854775807L ? this.f65967d.g(dVar, jA2) : false;
        if (zG) {
            if (zY && jA == 0) {
                ArrayList<h> arrayList = this.f65976m;
                g5.a.f(arrayList.remove(arrayList.size() - 1) == dVar);
                if (this.f65976m.isEmpty()) {
                    this.O = this.N;
                }
            }
            cVarG = Loader.f20061f;
        } else {
            long jB = this.f65971h.b(dVar.f64042b, j11, iOException, i10);
            cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f20062g;
        }
        Loader.c cVar = cVarG;
        this.f65973j.C(dVar.f64041a, dVar.d(), dVar.c(), dVar.f64042b, this.f65965b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, j10, j11, jA, iOException, !cVar.c());
        if (zG) {
            if (this.B) {
                this.f65966c.e(this);
            } else {
                continueLoading(this.N);
            }
        }
        return cVar;
    }

    public void I() {
        this.f65985v.clear();
    }

    public boolean J(Uri uri, long j10) {
        return this.f65967d.k(uri, j10);
    }

    public void N() {
        if (this.B) {
            for (c cVar : this.f65983t) {
                cVar.J();
            }
        }
        this.f65972i.l(this);
        this.f65980q.removeCallbacksAndMessages(null);
        this.F = true;
        this.f65981r.clear();
    }

    public final void O() {
        for (c cVar : this.f65983t) {
            cVar.P(this.P);
        }
        this.P = false;
    }

    public final boolean P(long j10) {
        int length = this.f65983t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f65983t[i10].S(j10, false) && (this.M[i10] || !this.K)) {
                return false;
            }
        }
        return true;
    }

    public boolean Q(long j10, boolean z10) {
        this.N = j10;
        if (z()) {
            this.O = j10;
            return true;
        }
        if (this.A && !z10 && P(j10)) {
            return false;
        }
        this.O = j10;
        this.R = false;
        this.f65976m.clear();
        if (this.f65972i.i()) {
            this.f65972i.e();
        } else {
            this.f65972i.f();
            O();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    public boolean R(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        j();
        int i10 = this.C;
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            j jVar = (j) i0VarArr[i12];
            if (jVar != null && (cVarArr[i12] == null || !zArr[i12])) {
                this.C--;
                jVar.d();
                i0VarArr[i12] = null;
            }
        }
        boolean z13 = z10 || (!this.Q ? j10 == this.N : i10 != 0);
        com.google.android.exoplayer2.trackselection.c cVarF = this.f65967d.f();
        boolean z14 = z13;
        com.google.android.exoplayer2.trackselection.c cVar = cVarF;
        for (int i13 = 0; i13 < cVarArr.length; i13++) {
            com.google.android.exoplayer2.trackselection.c cVar2 = cVarArr[i13];
            if (cVar2 != null) {
                int iB = this.G.b(cVar2.getTrackGroup());
                if (iB == this.J) {
                    this.f65967d.o(cVar2);
                    cVar = cVar2;
                }
                if (i0VarArr[i13] == null) {
                    this.C++;
                    j jVar2 = new j(this, iB);
                    i0VarArr[i13] = jVar2;
                    zArr2[i13] = true;
                    if (this.I != null) {
                        jVar2.a();
                        if (!z14) {
                            c cVar3 = this.f65983t[this.I[iB]];
                            z14 = (cVar3.S(j10, true) || cVar3.x() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.C == 0) {
            this.f65967d.l();
            this.E = null;
            this.P = true;
            this.f65976m.clear();
            if (this.f65972i.i()) {
                if (this.A) {
                    c[] cVarArr2 = this.f65983t;
                    int length = cVarArr2.length;
                    while (i11 < length) {
                        cVarArr2[i11].n();
                        i11++;
                    }
                }
                this.f65972i.e();
            } else {
                O();
            }
        } else {
            if (this.f65976m.isEmpty() || k0.c(cVar, cVarF)) {
                z11 = z10;
            } else {
                if (this.Q) {
                    z12 = true;
                } else {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    h hVarU = u();
                    cVar.a(j10, j11, -9223372036854775807L, this.f65977n, this.f65967d.a(hVarU, j10));
                    if (cVar.getSelectedIndexInTrackGroup() != this.f65967d.e().b(hVarU.f64043c)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    this.P = true;
                    z11 = true;
                    z14 = true;
                } else {
                    z11 = z10;
                }
            }
            if (z14) {
                Q(j10, z11);
                while (i11 < i0VarArr.length) {
                    if (i0VarArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        Y(i0VarArr);
        this.Q = true;
        return z14;
    }

    public void S(@Nullable DrmInitData drmInitData) {
        if (k0.c(this.U, drmInitData)) {
            return;
        }
        this.U = drmInitData;
        int i10 = 0;
        while (true) {
            c[] cVarArr = this.f65983t;
            if (i10 >= cVarArr.length) {
                return;
            }
            if (this.M[i10]) {
                cVarArr[i10].Z(drmInitData);
            }
            i10++;
        }
    }

    public void U(boolean z10) {
        this.f65967d.n(z10);
    }

    public void V(long j10) {
        if (this.T != j10) {
            this.T = j10;
            for (c cVar : this.f65983t) {
                cVar.T(j10);
            }
        }
    }

    public final void Y(i0[] i0VarArr) {
        this.f65981r.clear();
        for (i0 i0Var : i0VarArr) {
            if (i0Var != null) {
                this.f65981r.add((j) i0Var);
            }
        }
    }

    @Override // k4.h0.b
    public void b(Format format) {
        this.f65980q.post(this.f65978o);
    }

    @Override // k4.j0
    public boolean continueLoading(long j10) {
        List<h> listEmptyList;
        long jMax;
        if (this.R || this.f65972i.i() || this.f65972i.h()) {
            return false;
        }
        if (z()) {
            listEmptyList = Collections.emptyList();
            jMax = this.O;
        } else {
            listEmptyList = this.f65977n;
            h hVarU = u();
            jMax = hVarU.f() ? hVarU.f64047g : Math.max(this.N, hVarU.f64046f);
        }
        List<h> list = listEmptyList;
        this.f65967d.d(j10, jMax, list, this.B || !list.isEmpty(), this.f65975l);
        d.b bVar = this.f65975l;
        boolean z10 = bVar.f65909b;
        m4.d dVar = bVar.f65908a;
        Uri uri = bVar.f65910c;
        bVar.a();
        if (z10) {
            this.O = -9223372036854775807L;
            this.R = true;
            return true;
        }
        if (dVar == null) {
            if (uri != null) {
                this.f65966c.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (y(dVar)) {
            this.O = -9223372036854775807L;
            h hVar = (h) dVar;
            hVar.k(this);
            this.f65976m.add(hVar);
            this.D = hVar.f64043c;
        }
        this.f65973j.F(dVar.f64041a, dVar.f64042b, this.f65965b, dVar.f64043c, dVar.f64044d, dVar.f64045e, dVar.f64046f, dVar.f64047g, this.f65972i.m(dVar, this, this.f65971h.getMinimumLoadableRetryCount(dVar.f64042b)));
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        if (!this.A || z()) {
            return;
        }
        int length = this.f65983t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f65983t[i10].m(j10, z10, this.L[i10]);
        }
    }

    @Override // k4.j0
    public long getBufferedPositionUs() {
        if (this.R) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.O;
        }
        long jMax = this.N;
        h hVarU = u();
        if (!hVarU.f()) {
            if (this.f65976m.size() > 1) {
                ArrayList<h> arrayList = this.f65976m;
                hVarU = arrayList.get(arrayList.size() - 2);
            } else {
                hVarU = null;
            }
        }
        if (hVarU != null) {
            jMax = Math.max(jMax, hVarU.f64047g);
        }
        if (this.A) {
            for (c cVar : this.f65983t) {
                jMax = Math.max(jMax, cVar.v());
            }
        }
        return jMax;
    }

    @Override // k4.j0
    public boolean isLoading() {
        return this.f65972i.i();
    }

    public final void j() {
        g5.a.f(this.B);
        g5.a.e(this.G);
        g5.a.e(this.H);
    }

    public final void m() {
        int length = this.f65983t.length;
        int i10 = 6;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = this.f65983t[i12].z().f18970j;
            if (!g5.p.n(str)) {
                i13 = g5.p.l(str) ? 1 : g5.p.m(str) ? 3 : 6;
            }
            if (w(i13) > w(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        TrackGroup trackGroupE = this.f65967d.e();
        int i14 = trackGroupE.f19431b;
        this.J = -1;
        this.I = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.I[i15] = i15;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i16 = 0; i16 < length; i16++) {
            Format formatZ = this.f65983t[i16].z();
            if (i16 == i11) {
                Format[] formatArr = new Format[i14];
                if (i14 == 1) {
                    formatArr[0] = formatZ.i(trackGroupE.a(0));
                } else {
                    for (int i17 = 0; i17 < i14; i17++) {
                        formatArr[i17] = r(trackGroupE.a(i17), formatZ, true);
                    }
                }
                trackGroupArr[i16] = new TrackGroup(formatArr);
                this.J = i16;
            } else {
                trackGroupArr[i16] = new TrackGroup(r((i10 == 2 && g5.p.l(formatZ.f18970j)) ? this.f65969f : null, formatZ, false));
            }
        }
        this.G = q(trackGroupArr);
        g5.a.f(this.H == null);
        this.H = Collections.emptySet();
    }

    public void n() {
        if (this.B) {
            return;
        }
        continueLoading(this.N);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        for (c cVar : this.f65983t) {
            cVar.M();
        }
    }

    public final h0 p(int i10, int i11) {
        int length = this.f65983t.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        c cVar = new c(this.f65968e, this.f65980q.getLooper(), this.f65970g, this.f65982s);
        if (z10) {
            cVar.Z(this.U);
        }
        cVar.T(this.T);
        cVar.W(this.V);
        cVar.V(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f65984u, i12);
        this.f65984u = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f65983t = (c[]) k0.o0(this.f65983t, cVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.M, i12);
        this.M = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.K |= z10;
        this.f65985v.add(Integer.valueOf(i11));
        this.f65986w.append(i11, length);
        if (w(i11) > w(this.f65988y)) {
            this.f65989z = length;
            this.f65988y = i11;
        }
        this.L = Arrays.copyOf(this.L, i12);
        return cVar;
    }

    public final boolean s(h hVar) {
        int i10 = hVar.f65920j;
        int length = this.f65983t.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.L[i11] && this.f65983t[i11].I() == i10) {
                return false;
            }
        }
        return true;
    }

    @Override // q3.i
    public u track(int i10, int i11) {
        u uVarP;
        if (!W.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                u[] uVarArr = this.f65983t;
                if (i12 >= uVarArr.length) {
                    uVarP = null;
                    break;
                }
                if (this.f65984u[i12] == i10) {
                    uVarP = uVarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            uVarP = v(i10, i11);
        }
        if (uVarP == null) {
            if (this.S) {
                return o(i10, i11);
            }
            uVarP = p(i10, i11);
        }
        if (i11 != 4) {
            return uVarP;
        }
        if (this.f65987x == null) {
            this.f65987x = new b(uVarP, this.f65974k);
        }
        return this.f65987x;
    }

    public final h u() {
        ArrayList<h> arrayList = this.f65976m;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public final u v(int i10, int i11) {
        g5.a.a(W.contains(Integer.valueOf(i11)));
        int i12 = this.f65986w.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f65985v.add(Integer.valueOf(i11))) {
            this.f65984u[i12] = i10;
        }
        return this.f65984u[i12] == i10 ? this.f65983t[i12] : o(i10, i11);
    }

    public void x(int i10, boolean z10) {
        this.V = i10;
        for (c cVar : this.f65983t) {
            cVar.W(i10);
        }
        if (z10) {
            for (c cVar2 : this.f65983t) {
                cVar2.X();
            }
        }
    }

    public final boolean z() {
        return this.O != -9223372036854775807L;
    }

    public n(int i10, a aVar, d dVar, Map<String, DrmInitData> map, e5.b bVar, long j10, @Nullable Format format, com.google.android.exoplayer2.drm.a<?> aVar2, e5.m mVar, b0.a aVar3, int i11) {
        this.f65965b = i10;
        this.f65966c = aVar;
        this.f65967d = dVar;
        this.f65982s = map;
        this.f65968e = bVar;
        this.f65969f = format;
        this.f65970g = aVar2;
        this.f65971h = mVar;
        this.f65973j = aVar3;
        this.f65974k = i11;
        Set<Integer> set = W;
        this.f65985v = new HashSet(set.size());
        this.f65986w = new SparseIntArray(set.size());
        this.f65983t = new c[0];
        this.M = new boolean[0];
        this.L = new boolean[0];
        ArrayList<h> arrayList = new ArrayList<>();
        this.f65976m = arrayList;
        this.f65977n = Collections.unmodifiableList(arrayList);
        this.f65981r = new ArrayList<>();
        this.f65978o = new Runnable() { // from class: p4.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f65962b.C();
            }
        };
        this.f65979p = new Runnable() { // from class: p4.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f65963b.K();
            }
        };
        this.f65980q = new Handler();
        this.N = j10;
        this.O = j10;
    }

    public boolean A(int i10) {
        if (!z() && this.f65983t[i10].E(this.R)) {
            return true;
        }
        return false;
    }

    public void E(int i10) throws IOException {
        D();
        this.f65983t[i10].G();
    }

    public void L(TrackGroup[] trackGroupArr, int i10, int... iArr) {
        this.G = q(trackGroupArr);
        this.H = new HashSet();
        for (int i11 : iArr) {
            this.H.add(this.G.a(i11));
        }
        this.J = i10;
        Handler handler = this.f65980q;
        final a aVar = this.f65966c;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: p4.m
            @Override // java.lang.Runnable
            public final void run() {
                aVar.onPrepared();
            }
        });
        T();
    }

    public int M(int i10, f0 f0Var, o3.e eVar, boolean z10) {
        Format format;
        if (z()) {
            return -3;
        }
        int i11 = 0;
        if (!this.f65976m.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f65976m.size() - 1 && s(this.f65976m.get(i12))) {
                i12++;
            }
            k0.w0(this.f65976m, 0, i12);
            h hVar = this.f65976m.get(0);
            Format format2 = hVar.f64043c;
            if (!format2.equals(this.E)) {
                this.f65973j.l(this.f65965b, format2, hVar.f64044d, hVar.f64045e, hVar.f64046f);
            }
            this.E = format2;
        }
        int iK = this.f65983t[i10].K(f0Var, eVar, z10, this.R, this.N);
        if (iK == -5) {
            Format formatI = (Format) g5.a.e(f0Var.f62129c);
            if (i10 == this.f65989z) {
                int I = this.f65983t[i10].I();
                while (i11 < this.f65976m.size() && this.f65976m.get(i11).f65920j != I) {
                    i11++;
                }
                if (i11 < this.f65976m.size()) {
                    format = this.f65976m.get(i11).f64043c;
                } else {
                    format = (Format) g5.a.e(this.D);
                }
                formatI = formatI.i(format);
            }
            f0Var.f62129c = formatI;
        }
        return iK;
    }

    public int W(int i10, long j10) {
        if (z()) {
            return 0;
        }
        c cVar = this.f65983t[i10];
        if (this.R && j10 > cVar.v()) {
            return cVar.f();
        }
        return cVar.e(j10);
    }

    public void X(int i10) {
        j();
        g5.a.e(this.I);
        int i11 = this.I[i10];
        g5.a.f(this.L[i11]);
        this.L[i11] = false;
    }

    @Override // k4.j0
    public long getNextLoadPositionUs() {
        if (z()) {
            return this.O;
        }
        if (this.R) {
            return Long.MIN_VALUE;
        }
        return u().f64047g;
    }

    public TrackGroupArray getTrackGroups() {
        j();
        return this.G;
    }

    public int l(int i10) {
        j();
        g5.a.e(this.I);
        int i11 = this.I[i10];
        if (i11 == -1) {
            if (!this.H.contains(this.G.a(i10))) {
                return -2;
            }
            return -3;
        }
        boolean[] zArr = this.L;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public void maybeThrowPrepareError() throws IOException {
        D();
        if (this.R && !this.B) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }
}
