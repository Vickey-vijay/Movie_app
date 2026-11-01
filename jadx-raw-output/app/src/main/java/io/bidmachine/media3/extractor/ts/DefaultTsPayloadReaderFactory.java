package io.bidmachine.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    @Override // io.bidmachine.media3.extractor.ts.TsPayloadReader.Factory
    @Nullable
    public TsPayloadReader createPayloadReader(int i10, TsPayloadReader.EsInfo esInfo) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new PesReader(new MpegAudioReader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i10 == 21) {
                return new PesReader(new Id3Reader());
            }
            if (i10 == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
            }
            if (i10 == 36) {
                return new PesReader(new H265Reader(buildSeiReader(esInfo)));
            }
            if (i10 == 45) {
                return new PesReader(new MpeghReader());
            }
            if (i10 == 89) {
                return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
            }
            if (i10 == 172) {
                return new PesReader(new Ac4Reader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i10 == 257) {
                return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), 5408));
                }
                switch (i10) {
                    case 15:
                        if (isSet(2)) {
                            return null;
                        }
                        return new PesReader(new AdtsReader(false, esInfo.language, esInfo.getRoleFlags()));
                    case 16:
                        return new PesReader(new H263Reader(buildUserDataReader(esInfo)));
                    case 17:
                        if (isSet(2)) {
                            return null;
                        }
                        return new PesReader(new LatmReader(esInfo.language, esInfo.getRoleFlags()));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case 129:
                                return new PesReader(new Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                            case 130:
                                if (!isSet(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 134:
                                        if (isSet(16)) {
                                            return null;
                                        }
                                        return new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                                    case 135:
                                        return new PesReader(new Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new PesReader(new DtsReader(esInfo.language, esInfo.getRoleFlags(), 4096));
        }
        return new PesReader(new H262Reader(buildUserDataReader(esInfo)));
    }

    public DefaultTsPayloadReaderFactory(int i10) {
        this(i10, ImmutableList.of());
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo));
    }

    private a buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new a(getClosedCaptionFormats(esInfo));
    }

    private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i10;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList<>();
                int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < unsignedByte2; i11++) {
                    String string = parsableByteArray.readString(3);
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z10 = (unsignedByte3 & 128) != 0;
                    if (z10) {
                        i10 = unsignedByte3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte unsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    List<byte[]> listBuildCea708InitializationData = null;
                    if (z10) {
                        listBuildCea708InitializationData = CodecSpecificDataUtil.buildCea708InitializationData((unsignedByte4 & 64) != 0);
                    }
                    arrayList.add(new Format.Builder().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i10).setInitializationData(listBuildCea708InitializationData).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return arrayList;
    }

    private boolean isSet(int i10) {
        return (i10 & this.flags) != 0;
    }

    @Override // io.bidmachine.media3.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public DefaultTsPayloadReaderFactory(int i10, List<Format> list) {
        this.flags = i10;
        this.closedCaptionFormats = list;
    }
}
