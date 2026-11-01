package lg;

import android.os.Bundle;
import io.bidmachine.media3.decoder.CryptoInfo;

/* JADX INFO: compiled from: MediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes11.dex */
public interface g {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws InterruptedException;
}
