package lh;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderOutputBuffer;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.SubtitleDecoder;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import io.bidmachine.media3.extractor.text.SubtitleInputBuffer;
import io.bidmachine.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<b> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;

    @Nullable
    private b dequeuedInputBuffer;
    private long outputStartTimeUs;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<b> queuedInputBuffers;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends SubtitleInputBuffer implements Comparable<b> {
        private long queuedInputBufferCount;

        private b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.timeUs - bVar.timeUs;
            if (j10 == 0) {
                j10 = this.queuedInputBufferCount - bVar.queuedInputBufferCount;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: lh.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class C0574c extends SubtitleOutputBuffer {
        private DecoderOutputBuffer.Owner<C0574c> owner;

        @Override // io.bidmachine.media3.decoder.DecoderOutputBuffer
        public final void release() {
            this.owner.releaseOutputBuffer(this);
        }

        public C0574c(DecoderOutputBuffer.Owner<C0574c> owner) {
            this.owner = owner;
        }
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public abstract String getName();

    public abstract boolean isNewSubtitleDataAvailable();

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void release() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = bVarPollFirst;
        return bVarPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((b) Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            b bVar = (b) Util.castNonNull(this.queuedInputBuffers.poll());
            if (bVar.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                releaseInputBuffer(bVar);
                return subtitleOutputBuffer;
            }
            decode(bVar);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(bVar.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                releaseInputBuffer(bVar);
                return subtitleOutputBuffer2;
            }
            releaseInputBuffer(bVar);
        }
        return null;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer((b) Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        b bVar = this.dequeuedInputBuffer;
        if (bVar != null) {
            releaseInputBuffer(bVar);
            this.dequeuedInputBuffer = null;
        }
    }

    @Nullable
    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    public final long getPositionUs() {
        return this.playbackPositionUs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        b bVar = (b) subtitleInputBuffer;
        long j10 = this.outputStartTimeUs;
        if (j10 == -9223372036854775807L || bVar.timeUs >= j10) {
            long j11 = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j11;
            bVar.queuedInputBufferCount = j11;
            this.queuedInputBuffers.add(bVar);
        } else {
            releaseInputBuffer(bVar);
        }
        this.dequeuedInputBuffer = null;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j10) {
        this.outputStartTimeUs = j10;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j10) {
        this.playbackPositionUs = j10;
    }

    public c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.availableInputBuffers.add(new b());
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.availableOutputBuffers.add(new C0574c(new DecoderOutputBuffer.Owner() { // from class: lh.b
                @Override // io.bidmachine.media3.decoder.DecoderOutputBuffer.Owner
                public final void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer) {
                    this.f63571a.releaseOutputBuffer((c.C0574c) decoderOutputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new PriorityQueue<>();
        this.outputStartTimeUs = -9223372036854775807L;
    }

    private void releaseInputBuffer(b bVar) {
        bVar.clear();
        this.availableInputBuffers.add(bVar);
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }
}
