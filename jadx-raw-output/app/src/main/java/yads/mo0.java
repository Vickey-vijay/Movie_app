package yads;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes7.dex */
public final class mo0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oo0 f80300a;

    public mo0(oo0 oo0Var) {
        this.f80300a = oo0Var;
    }

    @Override // yads.ac2
    public final void a() {
        this.f80300a.f81114a.onPlayerError(ExoPlaybackException.createForRemote("Video load error occurred"));
    }
}
