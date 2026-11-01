package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3426d4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f17354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f17355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f17357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f17358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f17359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f17360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f17366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f17367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f17368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f17369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f17370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17372s;

    public final void a(boolean z10) {
        if (this.f17362i != z10) {
            this.f17362i = z10;
            this.f17357d.f17407f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f17358e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.f17363j, z10);
            }
        }
    }

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Looper mainLooper;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.f17877e + C3426d4.j.f28588e);
        if (aVarArr.length > 0) {
            this.f17354a = dVar;
            this.f17362i = false;
            this.f17363j = 1;
            this.f17358e = new CopyOnWriteArraySet();
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
            this.f17355b = hVar;
            this.f17366m = x.f17962a;
            this.f17359f = new w();
            this.f17360g = new v();
            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f17627d;
            this.f17368o = hVar;
            this.f17369p = s.f17526d;
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            f fVar = new f(this, mainLooper);
            this.f17356c = fVar;
            i iVar = new i(0, 0L);
            this.f17370q = iVar;
            this.f17357d = new l(aVarArr, dVar, cVar, this.f17362i, fVar, iVar, this);
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(int i10, long j10) {
        if (i10 >= 0 && (this.f17366m.c() || i10 < this.f17366m.b())) {
            this.f17364k++;
            this.f17371r = i10;
            if (!this.f17366m.c()) {
                this.f17366m.a(i10, this.f17359f, 0L);
                long j11 = j10 == -9223372036854775807L ? this.f17359f.f17959e : j10;
                w wVar = this.f17359f;
                int i11 = wVar.f17957c;
                long j12 = wVar.f17961g;
                int i12 = b.f16414a;
                long j13 = (j11 == -9223372036854775807L ? -9223372036854775807L : j11 * 1000) + j12;
                long j14 = this.f17366m.a(i11, this.f17360g, false).f17884d;
                while (j14 != -9223372036854775807L && j13 >= j14 && i11 < this.f17359f.f17958d) {
                    j13 -= j14;
                    i11++;
                    j14 = this.f17366m.a(i11, this.f17360g, false).f17884d;
                }
            }
            if (j10 == -9223372036854775807L) {
                this.f17372s = 0L;
                this.f17357d.f17407f.obtainMessage(3, new j(this.f17366m, i10, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.f17372s = j10;
            l lVar = this.f17357d;
            x xVar = this.f17366m;
            int i13 = b.f16414a;
            lVar.f17407f.obtainMessage(3, new j(xVar, i10, j10 != -9223372036854775807L ? j10 * 1000 : -9223372036854775807L)).sendToTarget();
            Iterator it = this.f17358e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
            return;
        }
        throw new q();
    }

    public final void a(e... eVarArr) {
        l lVar = this.f17357d;
        if (lVar.f17418q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f17407f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.f17366m.c() && this.f17364k <= 0) {
            return this.f17366m.a(this.f17370q.f17392a, this.f17360g, false).f17883c;
        }
        return this.f17371r;
    }
}
