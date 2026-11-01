package k4;

/* JADX INFO: compiled from: SequenceableLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public interface j0 {

    /* JADX INFO: compiled from: SequenceableLoader.java */
    public interface a<T extends j0> {
        void e(T t10);
    }

    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}
