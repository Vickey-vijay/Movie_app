package mg;

import io.bidmachine.media3.exoplayer.offline.Download;
import io.bidmachine.media3.exoplayer.offline.DownloadManager;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.c.compareStartTimes((Download) obj, (Download) obj2);
    }
}
