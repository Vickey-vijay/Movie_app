package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
