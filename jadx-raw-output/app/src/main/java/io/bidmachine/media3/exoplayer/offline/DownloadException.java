package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class DownloadException extends IOException {
    public DownloadException(String str) {
        super(str);
    }

    public DownloadException(Throwable th2) {
        super(th2);
    }
}
