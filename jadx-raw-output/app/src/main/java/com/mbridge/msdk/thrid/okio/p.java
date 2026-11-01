package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SegmentPool.java */
/* JADX INFO: loaded from: classes11.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static o f38076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f38077b;

    public static o a() {
        synchronized (p.class) {
            o oVar = f38076a;
            if (oVar == null) {
                return new o();
            }
            f38076a = oVar.f38074f;
            oVar.f38074f = null;
            f38077b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return oVar;
        }
    }

    private p() {
    }

    public static void a(o oVar) {
        if (oVar.f38074f == null && oVar.f38075g == null) {
            if (oVar.f38072d) {
                return;
            }
            synchronized (p.class) {
                long j10 = f38077b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                if (j10 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    return;
                }
                f38077b = j10;
                oVar.f38074f = f38076a;
                oVar.f38071c = 0;
                oVar.f38070b = 0;
                f38076a = oVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
