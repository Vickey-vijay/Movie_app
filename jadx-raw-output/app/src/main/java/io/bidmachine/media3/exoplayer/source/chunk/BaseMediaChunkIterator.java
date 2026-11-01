package io.bidmachine.media3.exoplayer.source.chunk;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ long getChunkEndTimeUs();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ long getChunkStartTimeUs();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public abstract /* synthetic */ DataSpec getDataSpec();

    public final void checkInBounds() {
        long j10 = this.currentIndex;
        if (j10 < this.fromIndex || j10 > this.toIndex) {
            throw new NoSuchElementException();
        }
    }

    public final long getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean isEnded() {
        return this.currentIndex > this.toIndex;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public boolean next() {
        this.currentIndex++;
        return !isEnded();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
    public void reset() {
        this.currentIndex = this.fromIndex - 1;
    }

    public BaseMediaChunkIterator(long j10, long j11) {
        this.fromIndex = j10;
        this.toIndex = j11;
        reset();
    }
}
