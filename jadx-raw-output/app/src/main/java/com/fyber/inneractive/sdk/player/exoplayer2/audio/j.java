package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f16314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f16315b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f16315b = rVar;
        this.f16314a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f16314a.flush();
            this.f16314a.release();
        } finally {
            this.f16315b.f16339e.open();
        }
    }
}
