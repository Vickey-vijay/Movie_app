package io.bidmachine.media3.exoplayer.source.chunk;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface MediaChunkIterator {
    public static final MediaChunkIterator EMPTY = new a();

    public class a implements MediaChunkIterator {
        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean isEnded() {
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public void reset() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            throw new NoSuchElementException();
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    DataSpec getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
