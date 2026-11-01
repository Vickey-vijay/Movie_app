package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f16565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16566b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f16568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f16569e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f16574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f16577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n[] f16578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n[] f16579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f16580p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16567c = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentityHashMap f16570f = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f16571g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f16572h = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.f16565a.f16696g.add(this);
        this.f16574j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.f16565a.f16699j;
        ArrayList arrayList = new ArrayList(bVar.f16625b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        char c10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f16624b;
            if (oVar.f17509k <= 0) {
                String str = oVar.f17501c;
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
                    int length = strArrSplit.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (strArrSplit[i11].startsWith("avc")) {
                                arrayList2.add(aVar);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                String str2 = aVar.f16624b.f17501c;
                if (!TextUtils.isEmpty(str2)) {
                    for (String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
                        if (str3.startsWith("mp4a")) {
                            arrayList3.add(aVar);
                            break;
                        }
                    }
                }
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.f16626c;
        List list2 = bVar.f16627d;
        int size = list2.size() + list.size() + 1;
        this.f16578n = new n[size];
        this.f16575k = size;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalArgumentException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.f16628e;
        f fVar = new f(this.f16565a, aVarArr, this.f16566b, this.f16571g, bVar.f16629f);
        n nVar = new n(0, this, fVar, this.f16569e, this.f16573i, oVar2, this.f16567c, this.f16568d);
        this.f16578n[0] = nVar;
        fVar.f16539h = true;
        if (!nVar.f16603o) {
            nVar.b(nVar.f16611w);
        }
        int i12 = 0;
        int i13 = 1;
        while (i12 < list.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[1];
            aVarArr2[c10] = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i12);
            n nVar2 = new n(1, this, new f(this.f16565a, aVarArr2, this.f16566b, this.f16571g, Collections.emptyList()), this.f16569e, this.f16573i, null, this.f16567c, this.f16568d);
            int i14 = i13 + 1;
            this.f16578n[i13] = nVar2;
            if (!nVar2.f16603o) {
                nVar2.b(nVar2.f16611w);
            }
            i12++;
            i13 = i14;
            c10 = 0;
        }
        int i15 = 0;
        while (i15 < list2.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i15);
            f fVar2 = new f(this.f16565a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.f16566b, this.f16571g, Collections.emptyList());
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.f16569e;
            n nVar3 = new n(3, this, fVar2, bVar2, this.f16573i, null, this.f16567c, this.f16568d);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.f16624b;
            if (nVar3.f16598j.indexOfKey(0) >= 0) {
                gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.f16598j.get(0);
            } else {
                gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                gVar.f16517n = nVar3;
                gVar.f16506c.f16478r = nVar3.f16606r;
                nVar3.f16598j.put(0, gVar);
            }
            gVar.a(oVar3);
            nVar3.f16602n = true;
            nVar3.h();
            this.f16578n[i13] = nVar3;
            i15++;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        return this.f16580p.b(j10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        long jMin = Long.MAX_VALUE;
        for (n nVar : this.f16579o) {
            if (nVar.f16613y) {
                jMax = Long.MIN_VALUE;
            } else {
                jMax = nVar.f16612x;
                if (jMax == -9223372036854775807L) {
                    jMax = nVar.f16611w;
                    h hVar = (h) nVar.f16599k.getLast();
                    if (!hVar.F) {
                        if (nVar.f16599k.size() > 1) {
                            LinkedList linkedList = nVar.f16599k;
                            hVar = (h) linkedList.get(linkedList.size() - 2);
                        } else {
                            hVar = null;
                        }
                    }
                    if (hVar != null) {
                        jMax = Math.max(jMax, hVar.f17548g);
                    }
                    int size = nVar.f16598j.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i10)).d());
                    }
                }
            }
            if (jMax != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMax);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        n[] nVarArr = this.f16578n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.f16595g.b();
                f fVar = nVar.f16591c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f16541j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f16542k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f16536e.f16693d.get(aVar);
                    hVar.f16680b.b();
                    IOException iOException = hVar.f16688j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.f16580p.f();
    }

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j10) {
        this.f16565a = kVar;
        this.f16566b = bVar;
        this.f16568d = fVar;
        this.f16569e = bVar2;
        this.f16573i = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f16577m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        long j11;
        ArrayList arrayList;
        int i10;
        v[] vVarArr2 = vVarArr;
        int[] iArr = new int[bVarArr.length];
        int[] iArr2 = new int[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            v vVar = vVarArr2[i11];
            iArr[i11] = vVar == null ? -1 : ((Integer) this.f16570f.get(vVar)).intValue();
            iArr2[i11] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i11];
            if (bVar != null) {
                y yVar = bVar.f17636a;
                int i12 = 0;
                while (true) {
                    n[] nVarArr = this.f16578n;
                    if (i12 >= nVarArr.length) {
                        break;
                    }
                    z zVar = nVarArr[i12].f16608t;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= zVar.f17628a) {
                            i13 = -1;
                            break;
                        }
                        if (zVar.f17629b[i13] == yVar) {
                            break;
                        }
                        i13++;
                    }
                    if (i13 != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        this.f16570f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList2 = new ArrayList(this.f16578n.length);
        int i14 = 0;
        boolean z10 = false;
        while (i14 < this.f16578n.length) {
            for (int i15 = 0; i15 < bVarArr.length; i15++) {
                vVarArr4[i15] = iArr[i15] == i14 ? vVarArr2[i15] : null;
                bVarArr2[i15] = iArr2[i15] == i14 ? bVarArr[i15] : null;
            }
            n nVar = this.f16578n[i14];
            boolean z11 = !this.f16576l;
            if (nVar.f16603o) {
                for (int i16 = 0; i16 < length2; i16++) {
                    v vVar2 = vVarArr4[i16];
                    if (vVar2 != null && (bVarArr2[i16] == null || !zArr[i16])) {
                        int i17 = ((k) vVar2).f16586a;
                        boolean[] zArr3 = nVar.f16610v;
                        if (zArr3[i17]) {
                            zArr3[i17] = false;
                            nVar.f16604p--;
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i17)).b();
                            vVarArr4[i16] = null;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
                int i18 = 0;
                boolean z12 = false;
                while (i18 < length2) {
                    if (vVarArr4[i18] == null) {
                        i10 = length2;
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr2[i18];
                        if (bVar3 != null) {
                            z zVar2 = nVar.f16608t;
                            y yVar2 = bVar3.f17636a;
                            length = length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= zVar2.f17628a) {
                                    i19 = -1;
                                    break;
                                }
                                if (zVar2.f17629b[i19] == yVar2) {
                                    break;
                                }
                                i19++;
                            }
                            boolean[] zArr4 = nVar.f16610v;
                            if (!zArr4[i19]) {
                                zArr4[i19] = true;
                                nVar.f16604p++;
                                if (i19 == nVar.f16609u) {
                                    nVar.f16591c.f16547p = bVar3;
                                    bVar2 = bVar3;
                                }
                                vVarArr4[i18] = new k(nVar, i19);
                                zArr2[i18] = true;
                                z12 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i18++;
                        length2 = i10;
                        bVarArr2 = bVarArr2;
                        length = length;
                        arrayList2 = arrayList2;
                    } else {
                        i10 = length2;
                    }
                    i18++;
                    length2 = i10;
                    bVarArr2 = bVarArr2;
                    length = length;
                    arrayList2 = arrayList2;
                }
                int i20 = length;
                int i21 = length2;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = bVarArr2;
                ArrayList arrayList3 = arrayList2;
                if (z11) {
                    int size = nVar.f16598j.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        if (!nVar.f16610v[i22]) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f16598j.valueAt(i22)).b();
                        }
                    }
                    if (bVar2 != null && !nVar.f16599k.isEmpty()) {
                        bVar2.d();
                        if (bVar2.f17638c[bVar2.a()] != nVar.f16591c.f16537f.a(((h) nVar.f16599k.getLast()).f17544c)) {
                            nVar.c(nVar.f16611w);
                        }
                    }
                }
                if (nVar.f16604p == 0) {
                    nVar.f16591c.f16541j = null;
                    nVar.f16605q = null;
                    nVar.f16599k.clear();
                    if (nVar.f16595g.a()) {
                        nVar.f16595g.f17655b.a(false);
                    }
                }
                z10 |= z12;
                boolean z13 = false;
                for (int i23 = 0; i23 < bVarArr.length; i23++) {
                    if (iArr2[i23] == i14) {
                        v vVar3 = vVarArr4[i23];
                        if (vVar3 != null) {
                            vVarArr3[i23] = vVar3;
                            this.f16570f.put(vVarArr4[i23], Integer.valueOf(i14));
                            z13 = true;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (iArr[i23] == i14 && vVarArr4[i23] != null) {
                        throw new IllegalStateException();
                    }
                }
                if (z13) {
                    arrayList = arrayList3;
                    arrayList.add(this.f16578n[i14]);
                } else {
                    arrayList = arrayList3;
                }
                i14++;
                vVarArr2 = vVarArr;
                arrayList2 = arrayList;
                length2 = i21;
                bVarArr2 = bVarArr3;
                length = i20;
            } else {
                throw new IllegalStateException();
            }
        }
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(vVarArr3, 0, vVarArr2, 0, length);
        n[] nVarArr2 = new n[arrayList4.size()];
        this.f16579o = nVarArr2;
        arrayList4.toArray(nVarArr2);
        n[] nVarArr3 = this.f16579o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].f16591c.f16539h = true;
            int i24 = 1;
            while (true) {
                n[] nVarArr4 = this.f16579o;
                if (i24 >= nVarArr4.length) {
                    break;
                }
                nVarArr4[i24].f16591c.f16539h = false;
                i24++;
            }
        }
        this.f16580p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f16579o);
        if (this.f16576l && z10) {
            j11 = j10;
            a(j11);
            for (int i25 = 0; i25 < bVarArr.length; i25++) {
                if (vVarArr2[i25] != null) {
                    zArr2[i25] = true;
                }
            }
        } else {
            j11 = j10;
        }
        this.f16576l = true;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        this.f16571g.f16614a.clear();
        for (n nVar : this.f16579o) {
            nVar.c(j10);
        }
        return j10;
    }
}
