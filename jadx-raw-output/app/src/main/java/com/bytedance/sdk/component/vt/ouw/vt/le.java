package com.bytedance.sdk.component.vt.ouw.vt;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
final class le {
    public static fkw ouw;
    public static long vt;

    public static fkw ouw() {
        synchronized (le.class) {
            fkw fkwVar = ouw;
            if (fkwVar == null) {
                return new fkw();
            }
            ouw = fkwVar.f11963le;
            fkwVar.f11963le = null;
            vt -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return fkwVar;
        }
    }

    private le() {
    }

    public static void ouw(fkw fkwVar) {
        if (fkwVar.f11963le == null && fkwVar.f11965ra == null) {
            if (fkwVar.yu) {
                return;
            }
            synchronized (le.class) {
                long j10 = vt;
                if (j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    return;
                }
                vt = j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                fkwVar.f11963le = ouw;
                fkwVar.f11964lh = 0;
                fkwVar.vt = 0;
                ouw = fkwVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
