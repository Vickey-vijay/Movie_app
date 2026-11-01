package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f17636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f17638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f17639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f17640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17641f;

    public abstract int a();

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17636a == bVar.f17636a && Arrays.equals(this.f17638c, bVar.f17638c);
    }

    public final int hashCode() {
        if (this.f17641f == 0) {
            this.f17641f = Arrays.hashCode(this.f17638c) + (System.identityHashCode(this.f17636a) * 31);
        }
        return this.f17641f;
    }

    public b(y yVar, int... iArr) {
        if (iArr.length > 0) {
            yVar.getClass();
            this.f17636a = yVar;
            int length = iArr.length;
            this.f17637b = length;
            this.f17639d = new o[length];
            int i10 = 0;
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f17639d[i11] = yVar.f17625b[iArr[i11]];
            }
            Arrays.sort(this.f17639d, new a());
            this.f17638c = new int[this.f17637b];
            while (true) {
                int i12 = this.f17637b;
                if (i10 < i12) {
                    this.f17638c[i10] = yVar.a(this.f17639d[i10]);
                    i10++;
                } else {
                    this.f17640e = new long[i12];
                    return;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final boolean a(int i10) {
        boolean z10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f17640e[i10] > jElapsedRealtime) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < this.f17637b && !z10; i11++) {
            if (i11 != i10 && this.f17640e[i11] <= jElapsedRealtime) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            return false;
        }
        long[] jArr = this.f17640e;
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + 60000);
        return true;
    }
}
