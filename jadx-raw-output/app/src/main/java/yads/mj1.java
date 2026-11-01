package yads;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes2.dex */
public final class mj1 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si3 f80194a;

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z10) {
        this.f80194a.getClass();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        ff2.f77379c.getClass();
        ff2 ff2Var = (ff2) ff2.f77380d.get(Integer.valueOf(i10));
        if (ff2Var != null) {
            this.f80194a.a(ff2Var);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        this.f80194a.a(playbackException);
    }
}
