package p4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import g5.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k3.t0;
import k4.b0;
import k4.i0;
import k4.j0;
import k4.q;

/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements q, n.a, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f65937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HlsPlaylistTracker f65938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f65939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final e5.q f65940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f65941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e5.m f65942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0.a f65943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e5.b f65944i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k4.g f65947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f65948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f65949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f65950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public q.a f65951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f65952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TrackGroupArray f65953r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j0 f65957v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f65958w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentityHashMap<i0, Integer> f65945j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f65946k = new o();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n[] f65954s = new n[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n[] f65955t = new n[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[][] f65956u = new int[0][];

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        return j10;
    }

    public static Format k(Format format, @Nullable Format format2, boolean z10) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        int i12;
        Metadata metadata;
        if (format2 != null) {
            String str4 = format2.f18967g;
            Metadata metadata2 = format2.f18968h;
            int i13 = format2.f18983w;
            int i14 = format2.f18964d;
            int i15 = format2.f18965e;
            String str5 = format2.B;
            str2 = format2.f18963c;
            str = str4;
            metadata = metadata2;
            i12 = i13;
            i10 = i14;
            i11 = i15;
            str3 = str5;
        } else {
            String strD = k0.D(format.f18967g, 1);
            Metadata metadata3 = format.f18968h;
            if (z10) {
                int i16 = format.f18983w;
                str = strD;
                i12 = i16;
                i10 = format.f18964d;
                metadata = metadata3;
                i11 = format.f18965e;
                str3 = format.B;
                str2 = format.f18963c;
            } else {
                str = strD;
                str2 = null;
                str3 = null;
                i10 = 0;
                i11 = 0;
                i12 = -1;
                metadata = metadata3;
            }
        }
        return Format.m(format.f18962b, str2, format.f18969i, g5.p.e(str), str, metadata, z10 ? format.f18966f : -1, i12, -1, null, i10, i11, str3);
    }

    public static Map<String, DrmInitData> l(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataF = list.get(i10);
            String str = drmInitDataF.f19170d;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.f19170d, str)) {
                    drmInitDataF = drmInitDataF.f(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataF);
        }
        return map;
    }

    public static Format m(Format format) {
        String strD = k0.D(format.f18967g, 2);
        return Format.A(format.f18962b, format.f18963c, format.f18969i, g5.p.e(strD), strD, format.f18968h, format.f18966f, format.f18975o, format.f18976p, format.f18977q, null, format.f18964d, format.f18965e);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean b(Uri uri, long j10) {
        boolean zJ = true;
        for (n nVar : this.f65954s) {
            zJ &= nVar.J(uri, j10);
        }
        this.f65951p.e(this);
        return zJ;
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f65951p = aVar;
        this.f65938c.c(this);
        i(j10);
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        if (this.f65953r != null) {
            return this.f65957v.continueLoading(j10);
        }
        for (n nVar : this.f65954s) {
            nVar.n();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        i0[] i0VarArr2 = i0VarArr;
        int[] iArr = new int[cVarArr.length];
        int[] iArr2 = new int[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            i0 i0Var = i0VarArr2[i10];
            iArr[i10] = i0Var == null ? -1 : this.f65945j.get(i0Var).intValue();
            iArr2[i10] = -1;
            com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i10];
            if (cVar != null) {
                TrackGroup trackGroup = cVar.getTrackGroup();
                int i11 = 0;
                while (true) {
                    n[] nVarArr = this.f65954s;
                    if (i11 >= nVarArr.length) {
                        break;
                    }
                    if (nVarArr[i11].getTrackGroups().b(trackGroup) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f65945j.clear();
        int length = cVarArr.length;
        i0[] i0VarArr3 = new i0[length];
        i0[] i0VarArr4 = new i0[cVarArr.length];
        com.google.android.exoplayer2.trackselection.c[] cVarArr2 = new com.google.android.exoplayer2.trackselection.c[cVarArr.length];
        n[] nVarArr2 = new n[this.f65954s.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f65954s.length) {
            for (int i14 = 0; i14 < cVarArr.length; i14++) {
                com.google.android.exoplayer2.trackselection.c cVar2 = null;
                i0VarArr4[i14] = iArr[i14] == i13 ? i0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    cVar2 = cVarArr[i14];
                }
                cVarArr2[i14] = cVar2;
            }
            n nVar = this.f65954s[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            com.google.android.exoplayer2.trackselection.c[] cVarArr3 = cVarArr2;
            n[] nVarArr3 = nVarArr2;
            boolean zR = nVar.R(cVarArr2, zArr, i0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= cVarArr.length) {
                    break;
                }
                i0 i0Var2 = i0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    g5.a.e(i0Var2);
                    i0VarArr3[i18] = i0Var2;
                    this.f65945j.put(i0Var2, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    g5.a.f(i0Var2 == null);
                }
                i18++;
            }
            if (z11) {
                nVarArr3[i15] = nVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    nVar.U(true);
                    if (zR) {
                        this.f65946k.b();
                        z10 = true;
                    } else {
                        n[] nVarArr4 = this.f65955t;
                        if (nVarArr4.length != 0) {
                            if (nVar != nVarArr4[0]) {
                            }
                        }
                        this.f65946k.b();
                        z10 = true;
                    }
                } else {
                    nVar.U(false);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            i0VarArr2 = i0VarArr;
            nVarArr2 = nVarArr3;
            length = i16;
            cVarArr2 = cVarArr3;
        }
        System.arraycopy(i0VarArr3, 0, i0VarArr2, 0, length);
        n[] nVarArr5 = (n[]) k0.q0(nVarArr2, i12);
        this.f65955t = nVarArr5;
        this.f65957v = this.f65947l.a(nVarArr5);
        return j10;
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        for (n nVar : this.f65955t) {
            nVar.discardBuffer(j10, z10);
        }
    }

    public final void g(long j10, List<com.google.android.exoplayer2.source.hls.playlist.b.a> list, List<n> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f19630d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (k0.c(str, list.get(i11).f19630d)) {
                        com.google.android.exoplayer2.source.hls.playlist.b.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f19627a);
                        arrayList2.add(aVar.f19628b);
                        z10 &= aVar.f19628b.f18967g != null;
                    }
                }
                n nVarJ = j(1, (Uri[]) arrayList.toArray((Uri[]) k0.j(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j10);
                list3.add(k0.I0(arrayList3));
                list2.add(nVarJ);
                if (this.f65948m && z10) {
                    nVarJ.L(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        return this.f65957v.getBufferedPositionUs();
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        return this.f65957v.getNextLoadPositionUs();
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) g5.a.e(this.f65953r);
    }

    public final void h(com.google.android.exoplayer2.source.hls.playlist.b bVar, long j10, List<n> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        int size = bVar.f19618e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < bVar.f19618e.size(); i12++) {
            Format format = bVar.f19618e.get(i12).f19632b;
            if (format.f18976p > 0 || k0.D(format.f18967g, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (k0.D(format.f18967g, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < bVar.f19618e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                com.google.android.exoplayer2.source.hls.playlist.b.C0183b c0183b = bVar.f19618e.get(i14);
                uriArr[i13] = c0183b.f19631a;
                formatArr[i13] = c0183b.f19632b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = formatArr[0].f18967g;
        n nVarJ = j(0, uriArr, formatArr, bVar.f19623j, bVar.f19624k, map, j10);
        list.add(nVarJ);
        list2.add(iArr2);
        if (!this.f65948m || str == null) {
            return;
        }
        boolean z12 = k0.D(str, 2) != null;
        boolean z13 = k0.D(str, 1) != null;
        ArrayList arrayList = new ArrayList();
        if (z12) {
            Format[] formatArr2 = new Format[size];
            for (int i15 = 0; i15 < size; i15++) {
                formatArr2[i15] = m(formatArr[i15]);
            }
            arrayList.add(new TrackGroup(formatArr2));
            if (z13 && (bVar.f19623j != null || bVar.f19620g.isEmpty())) {
                arrayList.add(new TrackGroup(k(formatArr[0], bVar.f19623j, false)));
            }
            List<Format> list3 = bVar.f19624k;
            if (list3 != null) {
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    arrayList.add(new TrackGroup(list3.get(i16)));
                }
            }
        } else {
            if (!z13) {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            Format[] formatArr3 = new Format[size];
            for (int i17 = 0; i17 < size; i17++) {
                formatArr3[i17] = k(formatArr[i17], bVar.f19623j, true);
            }
            arrayList.add(new TrackGroup(formatArr3));
        }
        TrackGroup trackGroup = new TrackGroup(Format.t("ID3", "application/id3", null, -1, null));
        arrayList.add(trackGroup);
        nVarJ.L((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
    }

    public final void i(long j10) {
        com.google.android.exoplayer2.source.hls.playlist.b bVar = (com.google.android.exoplayer2.source.hls.playlist.b) g5.a.e(this.f65938c.b());
        Map<String, DrmInitData> mapL = this.f65950o ? l(bVar.f19626m) : Collections.emptyMap();
        boolean z10 = !bVar.f19618e.isEmpty();
        List<com.google.android.exoplayer2.source.hls.playlist.b.a> list = bVar.f19620g;
        List<com.google.android.exoplayer2.source.hls.playlist.b.a> list2 = bVar.f19621h;
        this.f65952q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            h(bVar, j10, arrayList, arrayList2, mapL);
        }
        g(j10, list, arrayList, arrayList2, mapL);
        int i10 = 0;
        while (i10 < list2.size()) {
            com.google.android.exoplayer2.source.hls.playlist.b.a aVar = list2.get(i10);
            int i11 = i10;
            n nVarJ = j(3, new Uri[]{aVar.f19627a}, new Format[]{aVar.f19628b}, null, Collections.emptyList(), mapL, j10);
            arrayList2.add(new int[]{i11});
            arrayList.add(nVarJ);
            nVarJ.L(new TrackGroup[]{new TrackGroup(aVar.f19628b)}, 0, new int[0]);
            i10 = i11 + 1;
        }
        this.f65954s = (n[]) arrayList.toArray(new n[0]);
        this.f65956u = (int[][]) arrayList2.toArray(new int[0][]);
        n[] nVarArr = this.f65954s;
        this.f65952q = nVarArr.length;
        nVarArr[0].U(true);
        for (n nVar : this.f65954s) {
            nVar.n();
        }
        this.f65955t = this.f65954s;
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        return this.f65957v.isLoading();
    }

    public final n j(int i10, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new n(i10, this, new d(this.f65937b, this.f65938c, uriArr, formatArr, this.f65939d, this.f65940e, this.f65946k, list), map, this.f65944i, j10, format, this.f65941f, this.f65942g, this.f65943h, this.f65949n);
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        for (n nVar : this.f65954s) {
            nVar.maybeThrowPrepareError();
        }
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(n nVar) {
        this.f65951p.e(this);
    }

    public void o() {
        this.f65938c.a(this);
        for (n nVar : this.f65954s) {
            nVar.N();
        }
        this.f65951p = null;
        this.f65943h.J();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void onPlaylistChanged() {
        this.f65951p.e(this);
    }

    @Override // p4.n.a
    public void onPlaylistRefreshRequired(Uri uri) {
        this.f65938c.refreshPlaylist(uri);
    }

    @Override // p4.n.a
    public void onPrepared() {
        int i10 = this.f65952q - 1;
        this.f65952q = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (n nVar : this.f65954s) {
            i11 += nVar.getTrackGroups().f19435b;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        for (n nVar2 : this.f65954s) {
            int i13 = nVar2.getTrackGroups().f19435b;
            int i14 = 0;
            while (i14 < i13) {
                trackGroupArr[i12] = nVar2.getTrackGroups().a(i14);
                i14++;
                i12++;
            }
        }
        this.f65953r = new TrackGroupArray(trackGroupArr);
        this.f65951p.f(this);
    }

    @Override // k4.q
    public long readDiscontinuity() {
        if (this.f65958w) {
            return -9223372036854775807L;
        }
        this.f65943h.L();
        this.f65958w = true;
        return -9223372036854775807L;
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
        this.f65957v.reevaluateBuffer(j10);
    }

    @Override // k4.q
    public long seekToUs(long j10) {
        n[] nVarArr = this.f65955t;
        if (nVarArr.length > 0) {
            boolean zQ = nVarArr[0].Q(j10, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.f65955t;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].Q(j10, zQ);
                i10++;
            }
            if (zQ) {
                this.f65946k.b();
            }
        }
        return j10;
    }

    public i(f fVar, HlsPlaylistTracker hlsPlaylistTracker, e eVar, @Nullable e5.q qVar, com.google.android.exoplayer2.drm.a<?> aVar, e5.m mVar, b0.a aVar2, e5.b bVar, k4.g gVar, boolean z10, int i10, boolean z11) {
        this.f65937b = fVar;
        this.f65938c = hlsPlaylistTracker;
        this.f65939d = eVar;
        this.f65940e = qVar;
        this.f65941f = aVar;
        this.f65942g = mVar;
        this.f65943h = aVar2;
        this.f65944i = bVar;
        this.f65947l = gVar;
        this.f65948m = z10;
        this.f65949n = i10;
        this.f65950o = z11;
        this.f65957v = gVar.a(new j0[0]);
        aVar2.I();
    }
}
