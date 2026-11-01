package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public abstract class BaseAudioProcessor extends io.bidmachine.media3.common.audio.BaseAudioProcessor {
    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor, io.bidmachine.media3.common.audio.AudioProcessor
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    @Override // io.bidmachine.media3.common.audio.BaseAudioProcessor, io.bidmachine.media3.common.audio.AudioProcessor
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);
}
