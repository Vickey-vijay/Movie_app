package e5;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {
        void onBandwidthSample(int i10, long j10, long j11);
    }

    void b(a aVar);

    void e(Handler handler, a aVar);

    long getBitrateEstimate();

    @Nullable
    q getTransferListener();
}
