package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C3426d4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17752f;

    public final String toString() {
        return "DataSpec[" + this.f17747a + ", " + Arrays.toString((byte[]) null) + ", " + this.f17748b + ", " + this.f17749c + ", " + this.f17750d + ", " + this.f17751e + ", " + this.f17752f + C3426d4.j.f28588e;
    }

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        if (j10 >= 0) {
            if (j11 >= 0) {
                if (j12 <= 0 && j12 != -1) {
                    throw new IllegalArgumentException();
                }
                this.f17747a = uri;
                this.f17748b = j10;
                this.f17749c = j11;
                this.f17750d = j12;
                this.f17751e = str;
                this.f17752f = i10;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
