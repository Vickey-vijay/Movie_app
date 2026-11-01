package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private long bytesRead;

    @GuardedBy("lock")
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;

    @GuardedBy("lock")
    private LongArray inputSegmentStartTimesUs;

    @GuardedBy("lock")
    private long lastProcessedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedOutputTimeUs;
    private final Object lock;

    @GuardedBy("lock")
    private LongArray outputSegmentStartTimesUs;

    @GuardedBy("lock")
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy("lock")
    private final Queue<TimestampConsumer> pendingCallbacks;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;

    @GuardedBy("lock")
    private long speedAdjustedTimeAsyncInputTimeUs;
    private final SpeedProvider speedProvider;

    private static double divide(long j10, long j11) {
        return j10 / j11;
    }

    private long calculateSpeedAdjustedTime(long j10) {
        long jRound;
        int size = this.inputSegmentStartTimesUs.size() - 1;
        while (size > 0 && this.inputSegmentStartTimesUs.get(size) > j10) {
            size--;
        }
        if (size == this.inputSegmentStartTimesUs.size() - 1) {
            if (this.lastSpeedAdjustedInputTimeUs < this.inputSegmentStartTimesUs.get(size)) {
                this.lastSpeedAdjustedInputTimeUs = this.inputSegmentStartTimesUs.get(size);
                this.lastSpeedAdjustedOutputTimeUs = this.outputSegmentStartTimesUs.get(size);
            }
            jRound = getPlayoutDurationUsAtCurrentSpeed(j10 - this.lastSpeedAdjustedInputTimeUs);
        } else {
            int i10 = size + 1;
            jRound = Math.round((j10 - this.lastSpeedAdjustedInputTimeUs) * divide(this.outputSegmentStartTimesUs.get(i10) - this.outputSegmentStartTimesUs.get(size), this.inputSegmentStartTimesUs.get(i10) - this.inputSegmentStartTimesUs.get(size)));
        }
        this.lastSpeedAdjustedInputTimeUs = j10;
        long j11 = this.lastSpeedAdjustedOutputTimeUs + jRound;
        this.lastSpeedAdjustedOutputTimeUs = j11;
        return j11;
    }

    private boolean isUsingSonic() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.currentSpeed != 1.0f;
        }
        return z10;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            while (!this.pendingCallbacks.isEmpty() && (this.pendingCallbackInputTimesUs.element() <= this.lastProcessedInputTimeUs || isEnded())) {
                this.pendingCallbacks.remove().onTimestamp(calculateSpeedAdjustedTime(this.pendingCallbackInputTimesUs.remove()));
            }
        }
    }

    private void resetState() {
        synchronized (this.lock) {
            this.inputSegmentStartTimesUs = new LongArray();
            this.outputSegmentStartTimesUs = new LongArray();
            this.inputSegmentStartTimesUs.add(0L);
            this.outputSegmentStartTimesUs.add(0L);
            this.lastProcessedInputTimeUs = 0L;
            this.lastSpeedAdjustedInputTimeUs = 0L;
            this.lastSpeedAdjustedOutputTimeUs = 0L;
            this.currentSpeed = 1.0f;
        }
        this.bytesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateLastProcessedInputTime() {
        synchronized (this.lock) {
            if (isUsingSonic()) {
                long processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
                AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                long jScaleLargeTimestamp = Util.scaleLargeTimestamp(processedInputBytes, 1000000L, ((long) audioFormat.sampleRate) * ((long) audioFormat.bytesPerFrame));
                LongArray longArray = this.inputSegmentStartTimesUs;
                this.lastProcessedInputTimeUs = longArray.get(longArray.size() - 1) + jScaleLargeTimestamp;
            } else {
                long j10 = this.bytesRead;
                AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
                this.lastProcessedInputTimeUs = Util.scaleLargeTimestamp(j10, 1000000L, ((long) audioFormat2.sampleRate) * ((long) audioFormat2.bytesPerFrame));
            }
        }
    }

    private void updateSpeed(float f10, long j10) {
        synchronized (this.lock) {
            if (f10 != this.currentSpeed) {
                updateSpeedChangeArrays(j10);
                this.currentSpeed = f10;
                if (isUsingSonic()) {
                    this.sonicAudioProcessor.setSpeed(f10);
                    this.sonicAudioProcessor.setPitch(f10);
                }
                this.sonicAudioProcessor.flush();
                this.endOfStreamQueuedToSonic = false;
                super.getOutput();
            }
        }
    }

    private void updateSpeedChangeArrays(long j10) {
        LongArray longArray = this.outputSegmentStartTimesUs;
        long j11 = longArray.get(longArray.size() - 1);
        LongArray longArray2 = this.inputSegmentStartTimesUs;
        long j12 = j10 - longArray2.get(longArray2.size() - 1);
        this.inputSegmentStartTimesUs.add(j10);
        this.outputSegmentStartTimesUs.add(j11 + getPlayoutDurationUsAtCurrentSpeed(j12));
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j10) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j10);
    }

    public long getMediaDurationUs(long j10) {
        long jRound;
        long j11;
        synchronized (this.lock) {
            int size = this.outputSegmentStartTimesUs.size() - 1;
            while (size > 0 && this.outputSegmentStartTimesUs.get(size) > j10) {
                size--;
            }
            long j12 = j10 - this.outputSegmentStartTimesUs.get(size);
            if (size == this.outputSegmentStartTimesUs.size() - 1) {
                jRound = getMediaDurationUsAtCurrentSpeed(j12);
            } else {
                int i10 = size + 1;
                jRound = Math.round(j12 * divide(this.inputSegmentStartTimesUs.get(i10) - this.inputSegmentStartTimesUs.get(size), this.outputSegmentStartTimesUs.get(i10) - this.outputSegmentStartTimesUs.get(size)));
            }
            j11 = this.inputSegmentStartTimesUs.get(size) + jRound;
        }
        return j11;
    }

    public void getSpeedAdjustedTimeAsync(long j10, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            Assertions.checkArgument(this.speedAdjustedTimeAsyncInputTimeUs < j10);
            this.speedAdjustedTimeAsyncInputTimeUs = j10;
            if ((j10 <= this.lastProcessedInputTimeUs && this.pendingCallbackInputTimesUs.isEmpty()) || isEnded()) {
                timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j10));
            } else {
                this.pendingCallbackInputTimesUs.add(j10);
                this.pendingCallbacks.add(timestampConsumer);
            }
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iScaleLargeValue;
        long j10 = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, ((long) audioFormat.sampleRate) * ((long) audioFormat.bytesPerFrame));
        updateSpeed(this.speedProvider.getSpeed(jScaleLargeTimestamp), jScaleLargeTimestamp);
        int iLimit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(jScaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != -9223372036854775807L) {
            long j11 = nextSpeedChangeTimeUs - jScaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            iScaleLargeValue = (int) Util.scaleLargeValue(j11, ((long) audioFormat2.sampleRate) * ((long) audioFormat2.bytesPerFrame), 1000000L, RoundingMode.CEILING);
            int i10 = this.inputAudioFormat.bytesPerFrame;
            int i11 = i10 - (iScaleLargeValue % i10);
            if (i11 != i10) {
                iScaleLargeValue += i11;
            }
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + iScaleLargeValue));
        } else {
            iScaleLargeValue = -1;
        }
        long jPosition = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (iScaleLargeValue != -1 && ((long) byteBuffer.position()) - jPosition == iScaleLargeValue) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                byteBufferReplaceOutputBuffer.put(byteBuffer);
            }
            byteBufferReplaceOutputBuffer.flip();
        }
        this.bytesRead += ((long) byteBuffer.position()) - jPosition;
        updateLastProcessedInputTime();
        byteBuffer.limit(iLimit);
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.speedAdjustedTimeAsyncInputTimeUs = -9223372036854775807L;
        resetState();
    }

    private long getMediaDurationUsAtCurrentSpeed(long j10) {
        if (isUsingSonic()) {
            return this.sonicAudioProcessor.getMediaDuration(j10);
        }
        return j10;
    }

    private long getPlayoutDurationUsAtCurrentSpeed(long j10) {
        if (isUsingSonic()) {
            return this.sonicAudioProcessor.getPlayoutDuration(j10);
        }
        return j10;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer output;
        if (isUsingSonic()) {
            output = this.sonicAudioProcessor.getOutput();
        } else {
            output = super.getOutput();
        }
        processPendingCallbacks();
        return output;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.sonicAudioProcessor.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        resetState();
        this.sonicAudioProcessor.flush();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        resetState();
        this.sonicAudioProcessor.reset();
    }
}
