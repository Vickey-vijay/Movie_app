package io.bidmachine.media3.common;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OnInputFrameProcessedListener {
    void onInputFrameProcessed(int i10, long j10) throws VideoFrameProcessingException;
}
