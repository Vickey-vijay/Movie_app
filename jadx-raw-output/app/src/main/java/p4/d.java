package p4;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import e5.q;
import g5.i0;
import g5.k0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: HlsChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f65889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f65890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f65891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f65892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f65893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format[] f65894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HlsPlaylistTracker f65895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroup f65896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<Format> f65897i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f65899k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public IOException f65901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Uri f65902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f65903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.c f65904p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f65906r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FullSegmentEncryptionKeyCache f65898j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f65900l = k0.f53113f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f65905q = -9223372036854775807L;

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class a extends m4.j {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f65907k;

        public a(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, @Nullable Object obj, byte[] bArr) {
            super(aVar, hVar, 3, format, i10, obj, bArr);
        }

        @Nullable
        public byte[] h() {
            return this.f65907k;
        }

        @Override // m4.j
        public void e(byte[] bArr, int i10) {
            this.f65907k = Arrays.copyOf(bArr, i10);
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class c extends m4.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.hls.playlist.c f65911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f65912f;

        public c(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, int i10) {
            super(i10, cVar.f19648o.size() - 1);
            this.f65911e = cVar;
            this.f65912f = j10;
        }
    }

    /* JADX INFO: renamed from: p4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class C0612d extends c5.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f65913g;

        @Override // com.google.android.exoplayer2.trackselection.c
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int getSelectedIndex() {
            return this.f65913g;
        }

        public C0612d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f65913g = b(trackGroup.a(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public void a(long j10, long j11, long j12, List<? extends m4.l> list, m4.m[] mVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!c(this.f65913g, jElapsedRealtime)) {
                return;
            }
            for (int i10 = this.f5638b - 1; i10 >= 0; i10--) {
                if (!c(i10, jElapsedRealtime)) {
                    this.f65913g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Nullable
    public final m4.d h(@Nullable Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f65898j.c(uri);
        if (bArrC != null) {
            this.f65898j.b(uri, bArrC);
            return null;
        }
        return new a(this.f65891c, new e5.h(uri, 0L, -1L, null, 1), this.f65894f[i10], this.f65904p.getSelectionReason(), this.f65904p.getSelectionData(), this.f65900l);
    }

    public boolean k(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f65893e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.f65904p.indexOf(i10)) == -1) {
            return true;
        }
        this.f65906r = uri.equals(this.f65902n) | this.f65906r;
        return j10 == -9223372036854775807L || this.f65904p.blacklist(iIndexOf, j10);
    }

    public void l() {
        this.f65901m = null;
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public m4.d f65908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f65909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Uri f65910c;

        public void a() {
            this.f65908a = null;
            this.f65909b = false;
            this.f65910c = null;
        }

        public b() {
            a();
        }
    }

    @Nullable
    public static Uri c(com.google.android.exoplayer2.source.hls.playlist.c cVar, @Nullable com.google.android.exoplayer2.source.hls.playlist.c.a aVar) {
        String str;
        if (aVar == null || (str = aVar.f19657i) == null) {
            return null;
        }
        return i0.d(cVar.f66517a, str);
    }

    public m4.m[] a(@Nullable h hVar, long j10) {
        int iB = hVar == null ? -1 : this.f65896h.b(hVar.f64043c);
        int length = this.f65904p.length();
        m4.m[] mVarArr = new m4.m[length];
        for (int i10 = 0; i10 < length; i10++) {
            int indexInTrackGroup = this.f65904p.getIndexInTrackGroup(i10);
            Uri uri = this.f65893e[indexInTrackGroup];
            if (this.f65895g.isSnapshotValid(uri)) {
                com.google.android.exoplayer2.source.hls.playlist.c playlistSnapshot = this.f65895g.getPlaylistSnapshot(uri, false);
                g5.a.e(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.f19639f - this.f65895g.getInitialStartTimeUs();
                long jB = b(hVar, indexInTrackGroup != iB, playlistSnapshot, initialStartTimeUs, j10);
                long j11 = playlistSnapshot.f19642i;
                if (jB < j11) {
                    mVarArr[i10] = m4.m.f64109a;
                } else {
                    mVarArr[i10] = new c(playlistSnapshot, initialStartTimeUs, (int) (jB - j11));
                }
            } else {
                mVarArr[i10] = m4.m.f64109a;
            }
        }
        return mVarArr;
    }

    public final long b(@Nullable h hVar, boolean z10, com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, long j11) {
        long jF;
        long size;
        if (hVar != null && !z10) {
            return hVar.e();
        }
        long j12 = cVar.f19649p + j10;
        if (hVar != null && !this.f65903o) {
            j11 = hVar.f64046f;
        }
        if (cVar.f19645l || j11 < j12) {
            jF = k0.f(cVar.f19648o, Long.valueOf(j11 - j10), true, !this.f65895g.isLive() || hVar == null);
            size = cVar.f19642i;
        } else {
            jF = cVar.f19642i;
            size = cVar.f19648o.size();
        }
        return jF + size;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[PHI: r2
  0x0055: PHI (r2v2 long) = (r2v1 long), (r2v1 long), (r2v15 long) binds: [B:10:0x0032, B:12:0x0036, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(long j10, long j11, List<h> list, boolean z10, b bVar) {
        long j12;
        long jMax;
        int i10;
        Uri uri;
        com.google.android.exoplayer2.source.hls.playlist.c cVar;
        h hVar = list.isEmpty() ? null : list.get(list.size() - 1);
        int iB = hVar == null ? -1 : this.f65896h.b(hVar.f64043c);
        long jMax2 = j11 - j10;
        long jM = m(j10);
        if (hVar == null || this.f65903o) {
            j12 = jMax2;
            jMax = jM;
        } else {
            long jB = hVar.b();
            jMax2 = Math.max(0L, jMax2 - jB);
            if (jM != -9223372036854775807L) {
                j12 = jMax2;
                jMax = Math.max(0L, jM - jB);
            } else {
                j12 = jMax2;
                jMax = jM;
            }
        }
        this.f65904p.a(j10, j12, jMax, list, a(hVar, j11));
        int selectedIndexInTrackGroup = this.f65904p.getSelectedIndexInTrackGroup();
        boolean z11 = iB != selectedIndexInTrackGroup;
        Uri uri2 = this.f65893e[selectedIndexInTrackGroup];
        if (!this.f65895g.isSnapshotValid(uri2)) {
            bVar.f65910c = uri2;
            this.f65906r &= uri2.equals(this.f65902n);
            this.f65902n = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c playlistSnapshot = this.f65895g.getPlaylistSnapshot(uri2, true);
        g5.a.e(playlistSnapshot);
        this.f65903o = playlistSnapshot.f66519c;
        p(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.f19639f - this.f65895g.getInitialStartTimeUs();
        h hVar2 = hVar;
        long jB2 = b(hVar, z11, playlistSnapshot, initialStartTimeUs, j11);
        if (jB2 >= playlistSnapshot.f19642i || hVar2 == null || !z11) {
            i10 = selectedIndexInTrackGroup;
            uri = uri2;
            cVar = playlistSnapshot;
        } else {
            Uri uri3 = this.f65893e[iB];
            com.google.android.exoplayer2.source.hls.playlist.c playlistSnapshot2 = this.f65895g.getPlaylistSnapshot(uri3, true);
            g5.a.e(playlistSnapshot2);
            initialStartTimeUs = playlistSnapshot2.f19639f - this.f65895g.getInitialStartTimeUs();
            uri = uri3;
            cVar = playlistSnapshot2;
            jB2 = hVar2.e();
            i10 = iB;
        }
        long j13 = cVar.f19642i;
        if (jB2 < j13) {
            this.f65901m = new BehindLiveWindowException();
            return;
        }
        int i11 = (int) (jB2 - j13);
        int size = cVar.f19648o.size();
        if (i11 >= size) {
            if (!cVar.f19645l) {
                bVar.f65910c = uri;
                this.f65906r &= uri.equals(this.f65902n);
                this.f65902n = uri;
                return;
            } else {
                if (z10 || size == 0) {
                    bVar.f65909b = true;
                    return;
                }
                i11 = size - 1;
            }
        }
        this.f65906r = false;
        this.f65902n = null;
        com.google.android.exoplayer2.source.hls.playlist.c.a aVar = cVar.f19648o.get(i11);
        Uri uriC = c(cVar, aVar.f19651c);
        m4.d dVarH = h(uriC, i10);
        bVar.f65908a = dVarH;
        if (dVarH != null) {
            return;
        }
        Uri uriC2 = c(cVar, aVar);
        m4.d dVarH2 = h(uriC2, i10);
        bVar.f65908a = dVarH2;
        if (dVarH2 != null) {
            return;
        }
        bVar.f65908a = h.h(this.f65889a, this.f65890b, this.f65894f[i10], initialStartTimeUs, cVar, i11, uri, this.f65897i, this.f65904p.getSelectionReason(), this.f65904p.getSelectionData(), this.f65899k, this.f65892d, hVar2, this.f65898j.a(uriC2), this.f65898j.a(uriC));
    }

    public TrackGroup e() {
        return this.f65896h;
    }

    public com.google.android.exoplayer2.trackselection.c f() {
        return this.f65904p;
    }

    public boolean g(m4.d dVar, long j10) {
        com.google.android.exoplayer2.trackselection.c cVar = this.f65904p;
        return cVar.blacklist(cVar.indexOf(this.f65896h.b(dVar.f64043c)), j10);
    }

    public void i() throws IOException {
        IOException iOException = this.f65901m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f65902n;
        if (uri == null || !this.f65906r) {
            return;
        }
        this.f65895g.maybeThrowPlaylistRefreshError(uri);
    }

    public void j(m4.d dVar) {
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            this.f65900l = aVar.f();
            this.f65898j.b(aVar.f64041a.f52374a, (byte[]) g5.a.e(aVar.h()));
        }
    }

    public final long m(long j10) {
        long j11 = this.f65905q;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    public void n(boolean z10) {
        this.f65899k = z10;
    }

    public void o(com.google.android.exoplayer2.trackselection.c cVar) {
        this.f65904p = cVar;
    }

    public final void p(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        this.f65905q = cVar.f19645l ? -9223372036854775807L : cVar.d() - this.f65895g.getInitialStartTimeUs();
    }

    public d(f fVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, e eVar, @Nullable q qVar, o oVar, @Nullable List<Format> list) {
        this.f65889a = fVar;
        this.f65895g = hlsPlaylistTracker;
        this.f65893e = uriArr;
        this.f65894f = formatArr;
        this.f65892d = oVar;
        this.f65897i = list;
        com.google.android.exoplayer2.upstream.a aVarCreateDataSource = eVar.createDataSource(1);
        this.f65890b = aVarCreateDataSource;
        if (qVar != null) {
            aVarCreateDataSource.b(qVar);
        }
        this.f65891c = eVar.createDataSource(3);
        this.f65896h = new TrackGroup(formatArr);
        int[] iArr = new int[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            iArr[i10] = i10;
        }
        this.f65904p = new C0612d(this.f65896h, iArr);
    }
}
