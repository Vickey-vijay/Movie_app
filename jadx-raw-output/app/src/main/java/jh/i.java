package jh;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.extractor.VorbisUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    @Nullable
    private VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;

    @Nullable
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;

    @Nullable
    private a vorbisSetup;

    @VisibleForTesting
    public static int readBits(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {
        public final VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final VorbisUtil.VorbisIdHeader idHeader;
        public final VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public a(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i10) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i10;
        }
    }

    private static int decodeBlockSize(byte b10, a aVar) {
        return !aVar.modes[readBits(b10, aVar.iLogModes, 1)].blockFlag ? aVar.idHeader.blockSize0 : aVar.idHeader.blockSize1;
    }

    @Override // jh.h
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j10, h.b bVar) throws IOException {
        if (this.vorbisSetup != null) {
            Assertions.checkNotNull(bVar.format);
            return false;
        }
        a setupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = setupHeaders;
        if (setupHeaders == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = setupHeaders.idHeader;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(setupHeaders.setupHeaderData);
        bVar.format = new Format.Builder().setSampleMimeType("audio/vorbis").setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(VorbisUtil.parseVorbisComments(ImmutableList.copyOf(setupHeaders.commentHeader.comments))).build();
        return true;
    }

    @Nullable
    @VisibleForTesting
    public a readSetupHeaders(ParsableByteArray parsableByteArray) throws IOException {
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        VorbisUtil.Mode[] vorbisModes = VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels);
        return new a(vorbisIdHeader, commentHeader, bArr, vorbisModes, VorbisUtil.iLog(vorbisModes.length - 1));
    }

    @VisibleForTesting
    public static void appendNumberOfSamples(ParsableByteArray parsableByteArray, long j10) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j10 & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j10 >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j10 >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    @Override // jh.h
    public void onSeekEnd(long j10) {
        boolean z10;
        super.onSeekEnd(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.seenFirstAudioPacket = z10;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader != null) {
            i10 = vorbisIdHeader.blockSize0;
        }
        this.previousPacketBlockSize = i10;
    }

    @Override // jh.h
    public long preparePayload(ParsableByteArray parsableByteArray) {
        int i10 = 0;
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iDecodeBlockSize = decodeBlockSize(parsableByteArray.getData()[0], (a) Assertions.checkStateNotNull(this.vorbisSetup));
        if (this.seenFirstAudioPacket) {
            i10 = (this.previousPacketBlockSize + iDecodeBlockSize) / 4;
        }
        long j10 = i10;
        appendNumberOfSamples(parsableByteArray, j10);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = iDecodeBlockSize;
        return j10;
    }

    @Override // jh.h
    public void reset(boolean z10) {
        super.reset(z10);
        if (z10) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
