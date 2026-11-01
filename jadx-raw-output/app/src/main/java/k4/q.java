package k4;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import k3.t0;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public interface q extends j0 {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends j0.a<q> {
        void f(q qVar);
    }

    long a(long j10, t0 t0Var);

    void c(a aVar, long j10);

    @Override // k4.j0
    boolean continueLoading(long j10);

    long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10);

    void discardBuffer(long j10, boolean z10);

    @Override // k4.j0
    long getBufferedPositionUs();

    @Override // k4.j0
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    @Override // k4.j0
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // k4.j0
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
