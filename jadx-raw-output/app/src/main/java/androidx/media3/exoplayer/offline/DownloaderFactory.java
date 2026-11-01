package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
