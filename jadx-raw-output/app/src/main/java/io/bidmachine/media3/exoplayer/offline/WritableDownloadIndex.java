package io.bidmachine.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
@WorkerThread
@UnstableApi
public interface WritableDownloadIndex extends DownloadIndex {
    @Override // io.bidmachine.media3.exoplayer.offline.DownloadIndex
    @Nullable
    /* synthetic */ Download getDownload(String str) throws IOException;

    @Override // io.bidmachine.media3.exoplayer.offline.DownloadIndex
    /* synthetic */ DownloadCursor getDownloads(int... iArr) throws IOException;

    void putDownload(Download download) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i10) throws IOException;

    void setStopReason(String str, int i10) throws IOException;
}
