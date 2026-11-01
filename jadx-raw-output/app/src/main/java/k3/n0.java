package k3;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes8.dex */
public interface n0 {

    /* JADX INFO: compiled from: Player.java */
    public interface c {
        void a(t4.j jVar);

        void c(t4.j jVar);
    }

    /* JADX INFO: compiled from: Player.java */
    public interface d {
        void b(h5.i iVar);

        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void clearVideoTextureView(@Nullable TextureView textureView);

        void e(h5.i iVar);

        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void d(b bVar);

    void f(b bVar);

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    long getCurrentPosition();

    v0 getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    c5.c getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getPreviousWindowIndex();

    int getRendererType(int i10);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    @Nullable
    c getTextComponent();

    long getTotalBufferedDuration();

    @Nullable
    d getVideoComponent();

    boolean isPlayingAd();

    void next();

    void previous();

    void seekTo(int i10, long j10);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void stop(boolean z10);

    /* JADX INFO: compiled from: Player.java */
    @Deprecated
    public static abstract class a implements b {
        @Deprecated
        public void h(v0 v0Var, @Nullable Object obj) {
        }

        @Override // k3.n0.b
        public void g(v0 v0Var, int i10) {
            Object obj;
            if (v0Var.p() == 1) {
                obj = v0Var.n(0, new v0.c()).f62335c;
            } else {
                obj = null;
            }
            t(v0Var, obj, i10);
        }

        @Override // k3.n0.b
        public void t(v0 v0Var, @Nullable Object obj, int i10) {
            h(v0Var, obj);
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public interface b {
        default void a(l0 l0Var) {
        }

        default void b(ExoPlaybackException exoPlaybackException) {
        }

        default void c(TrackGroupArray trackGroupArray, c5.c cVar) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        default void onLoadingChanged(boolean z10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onPositionDiscontinuity(int i10) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekProcessed() {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Deprecated
        default void t(v0 v0Var, @Nullable Object obj, int i10) {
        }

        default void g(v0 v0Var, int i10) {
            Object obj;
            if (v0Var.p() == 1) {
                obj = v0Var.n(0, new v0.c()).f62335c;
            } else {
                obj = null;
            }
            t(v0Var, obj, i10);
        }
    }
}
