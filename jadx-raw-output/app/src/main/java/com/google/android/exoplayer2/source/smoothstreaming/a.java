package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import e5.h;
import e5.n;
import e5.q;
import g5.k0;
import java.io.IOException;
import java.util.List;
import k3.t0;
import m4.d;
import m4.e;
import m4.i;
import w3.f;
import w3.l;
import w3.m;

/* JADX INFO: compiled from: DefaultSsChunkSource.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e[] f19722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f19723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.c f19724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a f19725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IOException f19727h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class C0184a implements com.google.android.exoplayer2.source.smoothstreaming.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19728a;

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(n nVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer2.trackselection.c cVar, @Nullable q qVar) {
            com.google.android.exoplayer2.upstream.a aVarCreateDataSource = this.f19728a.createDataSource();
            if (qVar != null) {
                aVarCreateDataSource.b(qVar);
            }
            return new a(nVar, aVar, i10, cVar, aVarCreateDataSource);
        }

        public C0184a(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this.f19728a = interfaceC0188a;
        }
    }

    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class b extends m4.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b f19729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19730f;

        public b(com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar, int i10, int i11) {
            super(i11, bVar.f19798k - 1);
            this.f19729e = bVar;
            this.f19730f = i10;
        }
    }

    @Override // m4.h
    public void g(d dVar) {
    }

    public a(n nVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer2.trackselection.c cVar, com.google.android.exoplayer2.upstream.a aVar2) {
        this.f19720a = nVar;
        this.f19725f = aVar;
        this.f19721b = i10;
        this.f19724e = cVar;
        this.f19723d = aVar2;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f19782f[i10];
        this.f19722c = new e[cVar.length()];
        int i11 = 0;
        while (i11 < this.f19722c.length) {
            int indexInTrackGroup = cVar.getIndexInTrackGroup(i11);
            Format format = bVar.f19797j[indexInTrackGroup];
            m[] mVarArr = format.f18973m != null ? aVar.f19781e.f19787c : null;
            int i12 = bVar.f19788a;
            int i13 = i11;
            this.f19722c[i13] = new e(new f(3, null, new l(indexInTrackGroup, i12, bVar.f19790c, -9223372036854775807L, aVar.f19783g, format, 0, mVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f19788a, format);
            i11 = i13 + 1;
        }
    }

    public static m4.l h(Format format, com.google.android.exoplayer2.upstream.a aVar, Uri uri, String str, int i10, long j10, long j11, long j12, int i11, Object obj, e eVar) {
        return new i(aVar, new h(uri, 0L, -1L, str), format, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, eVar);
    }

    @Override // m4.h
    public long a(long j10, t0 t0Var) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = this.f19725f.f19782f[this.f19721b];
        int iD = bVar.d(j10);
        long jE = bVar.e(iD);
        return k0.x0(j10, t0Var, jE, (jE >= j10 || iD >= bVar.f19798k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(com.google.android.exoplayer2.trackselection.c cVar) {
        this.f19724e = cVar;
    }

    @Override // m4.h
    public boolean c(d dVar, boolean z10, Exception exc, long j10) {
        if (z10 && j10 != -9223372036854775807L) {
            com.google.android.exoplayer2.trackselection.c cVar = this.f19724e;
            if (cVar.blacklist(cVar.b(dVar.f64043c), j10)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void d(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = this.f19725f.f19782f;
        int i10 = this.f19721b;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
        int i11 = bVar.f19798k;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar2 = aVar.f19782f[i10];
        if (i11 == 0 || bVar2.f19798k == 0) {
            this.f19726g += i11;
        } else {
            int i12 = i11 - 1;
            long jE = bVar.e(i12) + bVar.c(i12);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f19726g += i11;
            } else {
                this.f19726g += bVar.d(jE2);
            }
        }
        this.f19725f = aVar;
    }

    @Override // m4.h
    public final void f(long j10, long j11, List<? extends m4.l> list, m4.f fVar) {
        int iE;
        long j12 = j11;
        if (this.f19727h != null) {
            return;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f19725f;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f19782f[this.f19721b];
        if (bVar.f19798k == 0) {
            fVar.f64066b = !aVar.f19780d;
            return;
        }
        if (list.isEmpty()) {
            iE = bVar.d(j12);
        } else {
            iE = (int) (list.get(list.size() - 1).e() - ((long) this.f19726g));
            if (iE < 0) {
                this.f19727h = new BehindLiveWindowException();
                return;
            }
        }
        if (iE >= bVar.f19798k) {
            fVar.f64066b = !this.f19725f.f19780d;
            return;
        }
        long j13 = j12 - j10;
        long jI = i(j10);
        int length = this.f19724e.length();
        m4.m[] mVarArr = new m4.m[length];
        for (int i10 = 0; i10 < length; i10++) {
            mVarArr[i10] = new b(bVar, this.f19724e.getIndexInTrackGroup(i10), iE);
        }
        this.f19724e.a(j10, j13, jI, list, mVarArr);
        long jE = bVar.e(iE);
        long jC = jE + bVar.c(iE);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = iE + this.f19726g;
        int selectedIndex = this.f19724e.getSelectedIndex();
        fVar.f64065a = h(this.f19724e.getSelectedFormat(), this.f19723d, bVar.a(this.f19724e.getIndexInTrackGroup(selectedIndex), iE), null, i11, jE, jC, j14, this.f19724e.getSelectionReason(), this.f19724e.getSelectionData(), this.f19722c[selectedIndex]);
    }

    @Override // m4.h
    public int getPreferredQueueSize(long j10, List<? extends m4.l> list) {
        return (this.f19727h != null || this.f19724e.length() < 2) ? list.size() : this.f19724e.evaluateQueueSize(j10, list);
    }

    public final long i(long j10) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f19725f;
        if (!aVar.f19780d) {
            return -9223372036854775807L;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f19782f[this.f19721b];
        int i10 = bVar.f19798k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // m4.h
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f19727h;
        if (iOException != null) {
            throw iOException;
        }
        this.f19720a.maybeThrowError();
    }
}
