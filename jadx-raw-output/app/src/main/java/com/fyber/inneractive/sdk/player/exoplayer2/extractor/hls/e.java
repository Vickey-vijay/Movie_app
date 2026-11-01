package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16531g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.f16531g;
    }

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.f17625b[0];
        while (i10 < this.f17637b) {
            if (this.f17639d[i10] != oVar) {
                i10++;
            } else {
                this.f16531g = i10;
            }
        }
        i10 = -1;
        this.f16531g = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f17640e[this.f16531g] > jElapsedRealtime) {
            for (int i10 = this.f17637b - 1; i10 >= 0; i10--) {
                if (this.f17640e[i10] <= jElapsedRealtime) {
                    this.f16531g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
