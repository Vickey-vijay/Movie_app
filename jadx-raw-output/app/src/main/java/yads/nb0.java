package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes5.dex */
public final class nb0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f80617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f80618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(zb0 zb0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f80618c = zb0Var;
        this.f80617b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f80617b.flush();
            this.f80617b.release();
        } finally {
            this.f80618c.f85280h.d();
        }
    }
}
