package k3;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes2.dex */
public interface g0 {
    void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, c5.c cVar);

    e5.b getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j10, float f10);

    boolean shouldStartPlayback(long j10, float f10, boolean z10);
}
