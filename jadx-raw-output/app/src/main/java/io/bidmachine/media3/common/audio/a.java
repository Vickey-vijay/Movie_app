package io.bidmachine.media3.common.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SynchronizedSonicAudioProcessor.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements AudioProcessor {
    private final Object lock;
    private final SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        AudioProcessor.AudioFormat audioFormatConfigure;
        synchronized (this.lock) {
            audioFormatConfigure = this.sonicAudioProcessor.configure(audioFormat);
        }
        return audioFormatConfigure;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void flush() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.flush();
        }
    }

    public final long getMediaDuration(long j10) {
        long mediaDuration;
        synchronized (this.lock) {
            mediaDuration = this.sonicAudioProcessor.getMediaDuration(j10);
        }
        return mediaDuration;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.lock) {
            output = this.sonicAudioProcessor.getOutput();
        }
        return output;
    }

    public final long getPlayoutDuration(long j10) {
        long playoutDuration;
        synchronized (this.lock) {
            playoutDuration = this.sonicAudioProcessor.getPlayoutDuration(j10);
        }
        return playoutDuration;
    }

    public final long getProcessedInputBytes() {
        long processedInputBytes;
        synchronized (this.lock) {
            processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
        }
        return processedInputBytes;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.lock) {
            zIsActive = this.sonicAudioProcessor.isActive();
        }
        return zIsActive;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        boolean zIsEnded;
        synchronized (this.lock) {
            zIsEnded = this.sonicAudioProcessor.isEnded();
        }
        return zIsEnded;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueEndOfStream();
        }
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
        }
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void reset() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.reset();
        }
    }

    public final void setOutputSampleRateHz(int i10) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setOutputSampleRateHz(i10);
        }
    }

    public final void setPitch(float f10) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setPitch(f10);
        }
    }

    public final void setSpeed(float f10) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setSpeed(f10);
        }
    }

    public a(Object obj) {
        this.lock = obj;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j10) {
        return getPlayoutDuration(j10);
    }
}
