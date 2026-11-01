package io.bidmachine.media3.extractor.mp3;

import io.bidmachine.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes4.dex */
public interface Seeker extends SeekMap {
    int getAverageBitrate();

    long getDataEndPosition();

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ long getDurationUs();

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ SeekMap.SeekPoints getSeekPoints(long j10);

    long getTimeUs(long j10);

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ boolean isSeekable();

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // io.bidmachine.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return -2147483647;
        }

        @Override // io.bidmachine.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // io.bidmachine.media3.extractor.mp3.Seeker
        public long getTimeUs(long j10) {
            return 0L;
        }

        public UnseekableSeeker() {
            super(-9223372036854775807L);
        }
    }
}
