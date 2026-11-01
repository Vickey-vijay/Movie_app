package k3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface p0 extends o0.b {
    default void c(float f10) throws ExoPlaybackException {
    }

    void d(r0 r0Var, Format[] formatArr, k4.i0 i0Var, long j10, boolean z10, long j11) throws ExoPlaybackException;

    void disable();

    void e(Format[] formatArr, k4.i0 i0Var, long j10) throws ExoPlaybackException;

    q0 getCapabilities();

    @Nullable
    g5.o getMediaClock();

    long getReadingPositionUs();

    int getState();

    @Nullable
    k4.i0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j10) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    void setIndex(int i10);

    void start() throws ExoPlaybackException;

    void stop() throws ExoPlaybackException;
}
