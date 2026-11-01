package io.bidmachine.media3.extractor.text;

import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Consumer;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.IndexSeekMap;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public class SubtitleExtractor implements Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    private int bytesRead;
    private final Format format;
    private final SubtitleParser subtitleParser;
    private TrackOutput trackOutput;
    private final CueEncoder cueEncoder = new CueEncoder();
    private byte[] subtitleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray scratchSampleArray = new ParsableByteArray();
    private final List<b> samples = new ArrayList();
    private int state = 0;
    private long[] timestamps = Util.EMPTY_LONG_ARRAY;
    private long seekTimeUs = -9223372036854775807L;

    public static class b implements Comparable<b> {
        private final byte[] data;
        private final long timeUs;

        private b(long j10, byte[] bArr) {
            this.timeUs = j10;
            this.data = bArr;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return Long.compare(this.timeUs, bVar.timeUs);
        }
    }

    private void writeToOutput() {
        long j10 = this.seekTimeUs;
        for (int iBinarySearchFloor = j10 == -9223372036854775807L ? 0 : Util.binarySearchFloor(this.timestamps, j10, true, true); iBinarySearchFloor < this.samples.size(); iBinarySearchFloor++) {
            writeToOutput(this.samples.get(iBinarySearchFloor));
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$parseAndWriteToOutput$0(CuesWithTiming cuesWithTiming) {
        b bVar = new b(cuesWithTiming.startTimeUs, this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs));
        this.samples.add(bVar);
        long j10 = this.seekTimeUs;
        if (j10 == -9223372036854775807L || cuesWithTiming.startTimeUs >= j10) {
            writeToOutput(bVar);
        }
    }

    private void parseAndWriteToOutput() throws IOException {
        try {
            long j10 = this.seekTimeUs;
            this.subtitleParser.parse(this.subtitleData, 0, this.bytesRead, j10 != -9223372036854775807L ? SubtitleParser.OutputOptions.cuesAfterThenRemainingCuesBefore(j10) : SubtitleParser.OutputOptions.allCues(), new Consumer() { // from class: kh.c
                @Override // io.bidmachine.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f62811a.lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
                }
            });
            Collections.sort(this.samples);
            this.timestamps = new long[this.samples.size()];
            for (int i10 = 0; i10 < this.samples.size(); i10++) {
                this.timestamps[i10] = this.samples.get(i10).timeUs;
            }
            this.subtitleData = Util.EMPTY_BYTE_ARRAY;
        } catch (RuntimeException e10) {
            throw ParserException.createForMalformedContainer("SubtitleParser failed.", e10);
        }
    }

    private boolean readFromInput(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = this.subtitleData;
        if (bArr.length == this.bytesRead) {
            this.subtitleData = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.subtitleData;
        int i10 = this.bytesRead;
        int i11 = extractorInput.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.bytesRead += i11;
        }
        long length = extractorInput.getLength();
        return (length != -1 && ((long) this.bytesRead) == length) || i11 == -1;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        Assertions.checkState(this.state == 0);
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.format);
        extractorOutput.endTracks();
        extractorOutput.seekMap(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.state = 1;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i10 = this.state;
        Assertions.checkState((i10 == 0 || i10 == 5) ? false : true);
        if (this.state == 1) {
            int iD = extractorInput.getLength() != -1 ? Ints.d(extractorInput.getLength()) : 1024;
            if (iD > this.subtitleData.length) {
                this.subtitleData = new byte[iD];
            }
            this.bytesRead = 0;
            this.state = 2;
        }
        if (this.state == 2 && readFromInput(extractorInput)) {
            parseAndWriteToOutput();
            this.state = 4;
        }
        if (this.state == 3 && skipInput(extractorInput)) {
            writeToOutput();
            this.state = 4;
        }
        return this.state == 4 ? -1 : 0;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
        if (this.state == 5) {
            return;
        }
        this.subtitleParser.reset();
        this.state = 5;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        int i10 = this.state;
        Assertions.checkState((i10 == 0 || i10 == 5) ? false : true);
        this.seekTimeUs = j11;
        if (this.state == 2) {
            this.state = 1;
        }
        if (this.state == 4) {
            this.state = 3;
        }
    }

    public SubtitleExtractor(SubtitleParser subtitleParser, Format format) {
        this.subtitleParser = subtitleParser;
        this.format = format.buildUpon().setSampleMimeType("application/x-media3-cues").setCodecs(format.sampleMimeType).setCueReplacementBehavior(subtitleParser.getCueReplacementBehavior()).build();
    }

    private boolean skipInput(ExtractorInput extractorInput) throws IOException {
        int iD;
        if (extractorInput.getLength() != -1) {
            iD = Ints.d(extractorInput.getLength());
        } else {
            iD = 1024;
        }
        if (extractorInput.skip(iD) == -1) {
            return true;
        }
        return false;
    }

    private void writeToOutput(b bVar) {
        Assertions.checkStateNotNull(this.trackOutput);
        int length = bVar.data.length;
        this.scratchSampleArray.reset(bVar.data);
        this.trackOutput.sampleData(this.scratchSampleArray, length);
        this.trackOutput.sampleMetadata(bVar.timeUs, 1, length, 0, null);
    }
}
