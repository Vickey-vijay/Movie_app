package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f17758a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17763f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i10;
        float f10;
        if (this.f17759b <= 0) {
            throw new IllegalStateException();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = (int) (jElapsedRealtime - this.f17760c);
        long j10 = i11;
        this.f17762e += j10;
        long j11 = this.f17763f;
        long j12 = this.f17761d;
        this.f17763f = j11 + j12;
        if (i11 > 0) {
            float f11 = (8000 * j12) / j10;
            com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f17758a;
            int iSqrt = (int) Math.sqrt(j12);
            if (tVar.f17861d != 1) {
                Collections.sort(tVar.f17859b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f17856h);
                tVar.f17861d = 1;
            }
            int i12 = tVar.f17864g;
            if (i12 > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f17860c;
                int i13 = i12 - 1;
                tVar.f17864g = i13;
                sVar = sVarArr[i13];
            } else {
                sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
            }
            int i14 = tVar.f17862e;
            tVar.f17862e = i14 + 1;
            sVar.f17853a = i14;
            sVar.f17854b = iSqrt;
            sVar.f17855c = f11;
            tVar.f17859b.add(sVar);
            tVar.f17863f += iSqrt;
            while (true) {
                int i15 = tVar.f17863f;
                int i16 = tVar.f17858a;
                i10 = 0;
                if (i15 <= i16) {
                    break;
                }
                int i17 = i15 - i16;
                com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f17859b.get(0);
                int i18 = sVar2.f17854b;
                if (i18 <= i17) {
                    tVar.f17863f -= i18;
                    tVar.f17859b.remove(0);
                    int i19 = tVar.f17864g;
                    if (i19 < 5) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f17860c;
                        tVar.f17864g = i19 + 1;
                        sVarArr2[i19] = sVar2;
                    }
                } else {
                    sVar2.f17854b = i18 - i17;
                    tVar.f17863f -= i17;
                }
            }
            if (this.f17762e >= 2000 || this.f17763f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f17758a;
                if (tVar2.f17861d != 0) {
                    Collections.sort(tVar2.f17859b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f17857i);
                    tVar2.f17861d = 0;
                }
                float f12 = 0.5f * tVar2.f17863f;
                int i20 = 0;
                while (true) {
                    if (i10 >= tVar2.f17859b.size()) {
                        if (!tVar2.f17859b.isEmpty()) {
                            ArrayList arrayList = tVar2.f17859b;
                            f10 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f17855c;
                            break;
                        } else {
                            f10 = Float.NaN;
                            break;
                        }
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f17859b.get(i10);
                    i20 += sVar3.f17854b;
                    if (i20 >= f12) {
                        f10 = sVar3.f17855c;
                        break;
                    }
                    i10++;
                }
                Float.isNaN(f10);
            }
        }
        int i21 = this.f17759b - 1;
        this.f17759b = i21;
        if (i21 > 0) {
            this.f17760c = jElapsedRealtime;
        }
        this.f17761d = 0L;
    }
}
