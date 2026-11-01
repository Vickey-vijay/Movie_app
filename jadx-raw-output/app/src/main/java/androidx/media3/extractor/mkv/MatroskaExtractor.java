package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @Nullable
    private LongArray cueClusterPositions;

    @Nullable
    private LongArray cueTimesUs;
    private long cuesContentPosition;

    @Nullable
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.lambda$static$1();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i10, int i11, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i10, i11, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i10) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i10);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i10, double d10) throws ParserException {
            MatroskaExtractor.this.floatElement(i10, d10);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i10) {
            return MatroskaExtractor.this.getElementType(i10);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i10, long j10) throws ParserException {
            MatroskaExtractor.this.integerElement(i10, j10);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i10) {
            return MatroskaExtractor.this.isLevel1Element(i10);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i10, j10, j11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i10, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i10, str);
        }
    }

    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:152:0x02a0 A[PHI: r1
  0x02a0: PHI (r1v111 int) = (r1v77 int), (r1v107 int), (r1v108 int), (r1v109 int), (r1v115 int) binds: [B:195:0x03dd, B:161:0x02ba, B:159:0x02b5, B:157:0x02b0, B:150:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:206:0x0429  */
        /* JADX WARN: Code duplicated, block: B:211:0x0445  */
        /* JADX WARN: Code duplicated, block: B:212:0x0447  */
        /* JADX WARN: Code duplicated, block: B:215:0x0454  */
        /* JADX WARN: Code duplicated, block: B:216:0x0466  */
        /* JADX WARN: Code duplicated, block: B:218:0x046c  */
        /* JADX WARN: Code duplicated, block: B:220:0x0470  */
        /* JADX WARN: Code duplicated, block: B:222:0x0475  */
        /* JADX WARN: Code duplicated, block: B:225:0x047d  */
        /* JADX WARN: Code duplicated, block: B:227:0x0482  */
        /* JADX WARN: Code duplicated, block: B:230:0x0489  */
        /* JADX WARN: Code duplicated, block: B:235:0x049a  */
        /* JADX WARN: Code duplicated, block: B:238:0x04cd  */
        /* JADX WARN: Code duplicated, block: B:243:0x04ed  */
        /* JADX WARN: Code duplicated, block: B:262:0x0539  */
        /* JADX WARN: Code duplicated, block: B:264:0x055f  */
        /* JADX WARN: Code duplicated, block: B:266:0x0565  */
        /* JADX WARN: Code duplicated, block: B:282:0x0592  */
        /* JADX WARN: Code duplicated, block: B:4:0x0017  */
        public void initializeOutput(ExtractorOutput extractorOutput, int i10) throws ParserException {
            byte b10;
            List<byte[]> listSingletonList;
            int pcmEncoding;
            String str;
            List<byte[]> list;
            String str2;
            int i11;
            int i12;
            String str3;
            int i13;
            int i14;
            Format.Builder builder;
            int i15;
            int iIntValue;
            float f10;
            int i16;
            int i17;
            int i18;
            int i19;
            DolbyVisionConfig dolbyVisionConfig;
            String str4 = this.codecId;
            str4.hashCode();
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = 18;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b10 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = 24;
                    break;
                case "S_TEXT/ASS":
                    b10 = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = 26;
                    break;
                case "S_TEXT/WEBVTT":
                    b10 = 27;
                    break;
                case "S_TEXT/UTF8":
                    b10 = 28;
                    break;
                case "V_MPEG2":
                    b10 = 29;
                    break;
                case "A_EAC3":
                    b10 = 30;
                    break;
                case "A_FLAC":
                    b10 = 31;
                    break;
                case "A_OPUS":
                    b10 = 32;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            int i20 = 4096;
            String str5 = "audio/raw";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.codecPrivate;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i22 = i21 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            i18 = this.displayWidth;
                            iIntValue = -1;
                            if (i18 == -1) {
                                i18 = this.width;
                            }
                            this.displayWidth = i18;
                            i19 = this.displayHeight;
                            if (i19 == -1) {
                                i19 = this.height;
                            }
                            this.displayHeight = i19;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i16 = this.displayWidth;
                        if (i16 != iIntValue && (i17 = this.displayHeight) != iIntValue) {
                            f10 = (this.height * i16) / (this.width * i17);
                        }
                        ColorInfo colorInfoBuild = this.hasColorInfo ? new ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 || Float.compare(this.projectionPoseYaw, 0.0f) != 0 || Float.compare(this.projectionPosePitch, 0.0f) != 0) {
                            i13 = iIntValue;
                        } else if (Float.compare(this.projectionPoseRoll, 0.0f) != 0) {
                            if (Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                i13 = 90;
                            } else if (Float.compare(this.projectionPoseRoll, -180.0f) == 0 || Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                                i13 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else if (Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                                i13 = 270;
                            } else {
                                i13 = iIntValue;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                        i15 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i15 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i22).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding == 0) {
                            Log.w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i11 = pcmEncoding;
                            listSingletonList = null;
                            str = null;
                        }
                        i12 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                            str = dolbyVisionConfig.codecs;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        i13 = 0;
                        int i23 = (this.flagDefault ? 1 : 0) | 0;
                        if (this.flagForced) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i24 = i23 | i14;
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                            if (MimeTypes.isVideo(str3)) {
                                if (this.displayUnit == 0) {
                                    i18 = this.displayWidth;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.width;
                                    }
                                    this.displayWidth = i18;
                                    i19 = this.displayHeight;
                                    if (i19 == -1) {
                                        i19 = this.height;
                                    }
                                    this.displayHeight = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                f10 = -1.0f;
                                i16 = this.displayWidth;
                                if (i16 != iIntValue) {
                                    f10 = (this.height * i16) / (this.width * i17);
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name != null) {
                                    iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                }
                                if (this.projectionType == 0) {
                                    i13 = iIntValue;
                                } else {
                                    i13 = iIntValue;
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                            i15 = 1;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild2 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i24).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i15);
                        this.output = trackOutputTrack2;
                        trackOutputTrack2.format(formatBuild2);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i25 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i26 = i25 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild3 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i26).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i27 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i28 = i27 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild4 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i28).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case 4:
                    i20 = 8192;
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = "audio/vorbis";
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i29 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i210 = i29 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild5 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i210).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i212 = i211 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild6 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i212).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i213 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i214 = i213 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild7 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i214).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) fourCcPrivate.first;
                    listSingletonList = (List) fourCcPrivate.second;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i215 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i216 = i215 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild8 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i216).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.of(bArr2);
                    str5 = "application/dvbsubs";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i217 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i218 = i217 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild9 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i218).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = "video/avc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i219 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2110 = i219 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild10 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case 11:
                    listSingletonList = ImmutableList.of(getCodecPrivate(this.codecId));
                    str = null;
                    str5 = "application/vobsub";
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2112 = i2111 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild11 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2113 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2114 = i2113 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild12 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = "audio/mp4a-latm";
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2115 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2116 = i2115 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild13 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2117 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2118 = i2117 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild14 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2119 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21110 = i2119 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild15 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21111 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21112 = i21111 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild16 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21113 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21114 = i21113 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild17 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21115 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21116 = i21115 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild18 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case 19:
                    str5 = "application/pgs";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21117 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21118 = i21117 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild19 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21119 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211110 = i21119 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild110 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i211110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case 22:
                    if (this.audioBitDepth == 32) {
                        listSingletonList = null;
                        str = null;
                        i11 = 4;
                    } else {
                        Log.w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i11 = -1;
                    }
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211111 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211112 = i211111 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild111 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i211112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack111;
                    trackOutputTrack111.format(formatBuild111);
                    return;
                case 23:
                    int i30 = this.audioBitDepth;
                    if (i30 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i30 == 16) {
                            pcmEncoding = 268435456;
                        } else if (i30 == 24) {
                            pcmEncoding = 1342177280;
                        } else if (i30 == 32) {
                            pcmEncoding = 1610612736;
                        } else {
                            Log.w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i11 = -1;
                        }
                        i11 = pcmEncoding;
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211113 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211114 = i211113 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild112 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i211114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack112;
                    trackOutputTrack112.format(formatBuild112);
                    return;
                case 24:
                    pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding == 0) {
                        Log.w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i11 = -1;
                    } else {
                        i11 = pcmEncoding;
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211115 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211116 = i211115 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild113 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i211116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack113;
                    trackOutputTrack113.format(formatBuild113);
                    return;
                case 25:
                    listSingletonList = ImmutableList.of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = "text/x-ssa";
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211117 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211118 = i211117 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild114 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i211118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack114;
                    trackOutputTrack114.format(formatBuild114);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = "video/hevc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i211119 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111110 = i211119 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild115 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2111110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack115;
                    trackOutputTrack115.format(formatBuild115);
                    return;
                case 27:
                    listSingletonList = null;
                    str = null;
                    str5 = "text/vtt";
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111111 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111112 = i2111111 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild116 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2111112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case 28:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111113 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111114 = i2111113 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild117 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2111114).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case 29:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111115 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111116 = i2111115 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild118 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2111116).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111117 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111118 = i2111117 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild119 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i2111118).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack119 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = "audio/flac";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i2111119 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111110 = i2111119 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1110 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21111110).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1110 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                case 32:
                    i20 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = "audio/opus";
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    i13 = 0;
                    int i21111111 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111112 = i21111111 | i14;
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i18 = this.displayWidth;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.width;
                                }
                                this.displayWidth = i18;
                                i19 = this.displayHeight;
                                if (i19 == -1) {
                                    i19 = this.height;
                                }
                                this.displayHeight = i19;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i16 = this.displayWidth;
                            if (i16 != iIntValue) {
                                f10 = (this.height * i16) / (this.width * i17);
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f10).setRotationDegrees(i13).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i11);
                        i15 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1111 = builder.setId(i10).setSampleMimeType(str3).setMaxInputSize(i12).setLanguage(this.language).setSelectionFlags(i21111112).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1111 = extractorOutput.track(this.number, i15);
                    this.output = trackOutputTrack1111;
                    trackOutputTrack1111.format(formatBuild1111);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z10) {
            if (MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId)) {
                return z10;
            }
            return this.maxBlockAdditionId > 0;
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i10);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    @CallSuper
    public int getElementType(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case ID_BLOCK_DURATION /* 155 */:
            case ID_CHANNELS /* 159 */:
            case ID_PIXEL_WIDTH /* 176 */:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case 215:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case ID_DOC_TYPE /* 17026 */:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case ID_BLOCK_GROUP /* 160 */:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case 225:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAdditionalData(Track track, int i10, ExtractorInput extractorInput, int i11) throws IOException {
        if (i10 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i11);
        } else {
            this.supplementalData.reset(i11);
            extractorInput.readFully(this.supplementalData.getData(), 0, i11);
        }
    }

    @CallSuper
    public boolean isLevel1Element(int i10) {
        return i10 == 357149030 || i10 == ID_CLUSTER || i10 == ID_CUES || i10 == ID_TRACKS;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z10 = true;
        while (z10 && !this.haveOutputSample) {
            z10 = this.reader.read(extractorInput);
            if (z10 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.tracks.size(); i10++) {
            Track trackValueAt = this.tracks.valueAt(i10);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(BaseTransientBottomBar.ANIMATION_FADE_DURATION));
        map.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public MatroskaExtractor(int i10) {
        this(new DefaultEbmlReader(), i10 | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    private void assertInCues(int i10) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void assertInTrackEntry(int i10) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i10;
        if (this.segmentContentPosition == -1 || this.durationUs == -9223372036854775807L || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            jArrCopyOf3[i12] = longArray.get(i12);
            jArrCopyOf[i12] = this.segmentContentPosition + longArray2.get(i12);
        }
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i10]);
        long j10 = this.durationUs - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            Log.w(TAG, "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void commitSampleToOutput(Track track, long j10, int i10, int i11, int i12) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j10, i10, i11, i12, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.blockDurationUs;
                    if (j11 == -9223372036854775807L) {
                        Log.w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j11, this.subtitleSample.getData());
                        for (int position = this.subtitleSample.getPosition(); position < this.subtitleSample.limit(); position++) {
                            if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            }
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i11 += this.subtitleSample.limit();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int iLimit = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, iLimit, 2);
                    i11 += iLimit;
                }
            }
            track.output.sampleMetadata(j10, i10, i11, i12, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(@Nullable int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int finishWriteSampleData() {
        int i10 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i10;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j10) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j10;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j11 = this.seekPositionAfterBuildingCues;
            if (j11 != -1) {
                positionHolder.position = j11;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.b
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.lambda$newFactory$0(factory);
            }
        };
    }

    private void readScratch(ExtractorInput extractorInput, int i10) throws IOException {
        if (this.scratch.limit() >= i10) {
            return;
        }
        if (this.scratch.capacity() < i10) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i10));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i10 - this.scratch.limit());
        this.scratch.setLimit(i10);
    }

    private long scaleTimecodeToUs(long j10) throws ParserException {
        long j11 = this.timecodeScale;
        if (j11 != -9223372036854775807L) {
            return Util.scaleLargeTimestamp(j10, j11, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i10, boolean z10) throws IOException {
        int i11;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i10);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i10);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i10);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b10 = this.sampleSignalByte;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z11) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i12 = this.samplePartitionCount * 4;
                        this.scratch.reset(i12);
                        extractorInput.readFully(this.scratch.getData(), 0, i12);
                        this.sampleBytesRead += i12;
                        short s10 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i13);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.samplePartitionCount;
                            if (i14 >= i11) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i14 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i15));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i15);
                            }
                            i14++;
                            i15 = unsignedIntToInt;
                        }
                        int i16 = (i10 - this.sampleBytesRead) - i15;
                        if (i11 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i16);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i16);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i13);
                        trackOutput.sampleData(this.encryptionSubsampleData, i13, 1);
                        this.sampleBytesWritten += i13;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z10)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i10) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i10 + this.sampleStrippedBytes.limit();
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i17 = this.sampleBytesRead;
                if (i17 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit2 - i17);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i18 = track.nalUnitLengthFieldLength;
            int i19 = 4 - i18;
            while (this.sampleBytesRead < iLimit2) {
                int i20 = this.sampleCurrentNalBytesRemaining;
                if (i20 == 0) {
                    writeToTarget(extractorInput, data, i19, i18);
                    this.sampleBytesRead += i18;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i20);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i10) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i10, false);
        }
        int iMin = Math.min(i10, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i10, iMin);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x028e  */
    @CallSuper
    public void binaryElement(int i10, int i11, ExtractorInput extractorInput) throws IOException {
        Track track;
        int i12;
        Track track2;
        long j10;
        long j11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        int i18 = 1;
        if (i10 != ID_BLOCK && i10 != ID_SIMPLE_BLOCK) {
            if (i10 == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i11);
                return;
            }
            if (i10 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i10), extractorInput, i11);
                return;
            }
            if (i10 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i10);
                byte[] bArr = new byte[i11];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i11];
                extractorInput.readFully(bArr2, 0, i11);
                getCurrentTrack(i10).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i10 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i11, i11);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i10 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i10);
                byte[] bArr3 = new byte[i11];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != ID_PROJECTION_PRIVATE) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i10, null);
            }
            assertInTrackEntry(i10);
            byte[] bArr4 = new byte[i11];
            this.currentTrack.projectionData = bArr4;
            extractorInput.readFully(bArr4, 0, i11);
            return;
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = -9223372036854775807L;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track3 = this.tracks.get(this.blockTrackNumber);
        if (track3 == null) {
            extractorInput.skipFully(i11 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track3.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i19 = (this.scratch.getData()[2] & 6) >> 1;
            byte b10 = 255;
            if (i19 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i11 - this.blockTrackNumberLength) - 3;
            } else {
                int i20 = 4;
                readScratch(extractorInput, 4);
                int i21 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i21;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i21);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i19 == 2) {
                    int i22 = (i11 - this.blockTrackNumberLength) - 4;
                    int i23 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i23, i22 / i23);
                } else {
                    if (i19 == 1) {
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i13 = this.blockSampleCount;
                            if (i24 >= i13 - 1) {
                                break;
                            }
                            this.blockSampleSizes[i24] = 0;
                            do {
                                i20++;
                                readScratch(extractorInput, i20);
                                i14 = this.scratch.getData()[i20 - 1] & 255;
                                int[] iArr = this.blockSampleSizes;
                                i15 = iArr[i24] + i14;
                                iArr[i24] = i15;
                            } while (i14 == 255);
                            i25 += i15;
                            i24++;
                        }
                        this.blockSampleSizes[i13 - 1] = ((i11 - this.blockTrackNumberLength) - i20) - i25;
                    } else {
                        if (i19 != 3) {
                            throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i19, null);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        while (true) {
                            int i28 = this.blockSampleCount;
                            if (i26 >= i28 - 1) {
                                track2 = track3;
                                this.blockSampleSizes[i28 - 1] = ((i11 - this.blockTrackNumberLength) - i20) - i27;
                                break;
                            }
                            this.blockSampleSizes[i26] = i17;
                            i20++;
                            readScratch(extractorInput, i20);
                            int i29 = i20 - 1;
                            if (this.scratch.getData()[i29] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i30 = i17;
                            while (true) {
                                if (i30 >= 8) {
                                    j10 = 0;
                                    break;
                                }
                                int i31 = i18 << (7 - i30);
                                if ((this.scratch.getData()[i29] & i31) != 0) {
                                    int i32 = i20 + i30;
                                    readScratch(extractorInput, i32);
                                    long j12 = (~i31) & this.scratch.getData()[i29] & b10;
                                    int i33 = i29 + 1;
                                    while (true) {
                                        j11 = j12;
                                        if (i33 >= i32) {
                                            break;
                                        }
                                        j12 = (j11 << 8) | ((long) (this.scratch.getData()[i33] & b10));
                                        i33++;
                                        i32 = i32;
                                        b10 = 255;
                                    }
                                    int i34 = i32;
                                    if (i26 > 0) {
                                        j11 -= (1 << ((i30 * 7) + 6)) - 1;
                                    }
                                    j10 = j11;
                                    i20 = i34;
                                    break;
                                }
                                i30++;
                                i18 = 1;
                                b10 = 255;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                            }
                            int i35 = (int) j10;
                            int[] iArr2 = this.blockSampleSizes;
                            if (i26 != 0) {
                                i35 += iArr2[i26 - 1];
                            }
                            iArr2[i26] = i35;
                            i27 += i35;
                            i26++;
                            track3 = track3;
                            i17 = 0;
                            i18 = 1;
                            b10 = 255;
                        }
                    }
                    this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
                    track = track2;
                    if (track.type != 2 || (i10 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & 128) == 128)) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.blockFlags = i16;
                    this.blockState = 2;
                    this.blockSampleIndex = 0;
                    i12 = ID_SIMPLE_BLOCK;
                }
            }
            track2 = track3;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            track = track2;
            if (track.type != 2) {
                i16 = 1;
            } else {
                i16 = 1;
            }
            this.blockFlags = i16;
            this.blockState = 2;
            this.blockSampleIndex = 0;
            i12 = ID_SIMPLE_BLOCK;
        } else {
            track = track3;
            i12 = ID_SIMPLE_BLOCK;
        }
        if (i10 == i12) {
            while (true) {
                int i36 = this.blockSampleIndex;
                if (i36 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                commitSampleToOutput(track, ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i36], false), 0);
                this.blockSampleIndex++;
            }
        } else {
            while (true) {
                int i37 = this.blockSampleIndex;
                if (i37 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i37] = writeSampleData(extractorInput, track, iArr3[i37], true);
                this.blockSampleIndex++;
            }
        }
    }

    @CallSuper
    public void floatElement(int i10, double d10) throws ParserException {
        if (i10 == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i10).sampleRate = (int) d10;
        }
        if (i10 == ID_DURATION) {
            this.durationTimecode = (long) d10;
            return;
        }
        switch (i10) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i10).primaryRChromaticityX = (float) d10;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i10).primaryRChromaticityY = (float) d10;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i10).primaryGChromaticityX = (float) d10;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i10).primaryGChromaticityY = (float) d10;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i10).primaryBChromaticityX = (float) d10;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i10).primaryBChromaticityY = (float) d10;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i10).whitePointChromaticityX = (float) d10;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i10).whitePointChromaticityY = (float) d10;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i10).maxMasteringLuminance = (float) d10;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i10).minMasteringLuminance = (float) d10;
                break;
            default:
                switch (i10) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i10).projectionPoseYaw = (float) d10;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i10).projectionPosePitch = (float) d10;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i10).projectionPoseRoll = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    public void integerElement(int i10, long j10) throws ParserException {
        if (i10 == ID_CONTENT_ENCODING_ORDER) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == ID_CONTENT_ENCODING_SCOPE) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                getCurrentTrack(i10).type = (int) j10;
                return;
            case 136:
                getCurrentTrack(i10).flagDefault = j10 == 1;
                return;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j10);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i10).channelCount = (int) j10;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                getCurrentTrack(i10).width = (int) j10;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i10);
                this.cueTimesUs.add(scaleTimecodeToUs(j10));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i10).height = (int) j10;
                return;
            case 215:
                getCurrentTrack(i10).number = (int) j10;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j10);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j10;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i10);
                this.cueClusterPositions.add(j10);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i10).blockAddIdType = (int) j10;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j10 + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j10 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j10 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j10 + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j10 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i11 = (int) j10;
                assertInTrackEntry(i10);
                if (i11 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i11 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i11 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i10).displayWidth = (int) j10;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i10).displayUnit = (int) j10;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i10).displayHeight = (int) j10;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i10).flagForced = j10 == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i10);
                Track track = this.currentTrack;
                track.hasColorInfo = true;
                track.bitsPerChannel = (int) j10;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i10).maxBlockAdditionId = (int) j10;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i10).codecDelayNs = j10;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i10).seekPreRollNs = j10;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i10).audioBitDepth = (int) j10;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j10;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i12 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i12 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i10).defaultSampleDurationNs = (int) j10;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j10;
                return;
            default:
                switch (i10) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i10);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j10);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i10);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j10);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i10).maxContentLuminance = (int) j10;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i10).maxFrameAverageLuminance = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @CallSuper
    public void stringElement(int i10, String str) throws ParserException {
        if (i10 == 134) {
            getCurrentTrack(i10).codecId = str;
            return;
        }
        if (i10 != ID_DOC_TYPE) {
            if (i10 == ID_NAME) {
                getCurrentTrack(i10).name = str;
                return;
            } else {
                if (i10 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i10).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    private static boolean isCodecSupported(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private static void setSubtitleEndTime(String str, long j10, byte[] bArr) {
        byte[] subtitleTimecode;
        int i10;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j10, SSA_TIMECODE_FORMAT, 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j10, VTT_TIMECODE_FORMAT, 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j10, SUBRIP_TIMECODE_FORMAT, 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i10, subtitleTimecode.length);
    }

    @CallSuper
    public void endMasterElement(int i10) throws ParserException {
        assertInitialized();
        if (i10 != ID_BLOCK_GROUP) {
            if (i10 != ID_TRACK_ENTRY) {
                if (i10 != ID_SEEK) {
                    if (i10 != ID_CONTENT_ENCODING) {
                        if (i10 != ID_CONTENT_ENCODINGS) {
                            if (i10 != 357149030) {
                                if (i10 != ID_TRACKS) {
                                    if (i10 == ID_CUES) {
                                        if (!this.sentSeekMap) {
                                            this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                                            this.sentSeekMap = true;
                                        }
                                        this.cueTimesUs = null;
                                        this.cueClusterPositions = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.tracks.size() != 0) {
                                    this.extractorOutput.endTracks();
                                    return;
                                }
                                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
                            }
                            if (this.timecodeScale == -9223372036854775807L) {
                                this.timecodeScale = 1000000L;
                            }
                            long j10 = this.durationTimecode;
                            if (j10 != -9223372036854775807L) {
                                this.durationUs = scaleTimecodeToUs(j10);
                                return;
                            }
                            return;
                        }
                        assertInTrackEntry(i10);
                        Track track = this.currentTrack;
                        if (track.hasContentEncryption && track.sampleStrippedBytes != null) {
                            throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    assertInTrackEntry(i10);
                    Track track2 = this.currentTrack;
                    if (track2.hasContentEncryption) {
                        if (track2.cryptoData != null) {
                            track2.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                            return;
                        }
                        throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i11 = this.seekEntryId;
                if (i11 != -1) {
                    long j11 = this.seekEntryPosition;
                    if (j11 != -1) {
                        if (i11 == ID_CUES) {
                            this.cuesContentPosition = j11;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
            }
            Track track3 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track3.codecId;
            if (str != null) {
                if (isCodecSupported(str)) {
                    track3.initializeOutput(this.extractorOutput, track3.number);
                    this.tracks.put(track3.number, track3);
                }
                this.currentTrack = null;
                return;
            }
            throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
        }
        if (this.blockState != 2) {
            return;
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        track4.assertOutputInitialized();
        if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track4.codecId)) {
            this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.blockSampleCount; i13++) {
            i12 += this.blockSampleSizes[i13];
        }
        int i14 = 0;
        while (i14 < this.blockSampleCount) {
            long j12 = this.blockTimeUs + ((long) ((track4.defaultSampleDurationNs * i14) / 1000));
            int i15 = this.blockFlags;
            if (i14 == 0 && !this.blockHasReferenceBlock) {
                i15 |= 1;
            }
            int i16 = this.blockSampleSizes[i14];
            int i17 = i12 - i16;
            commitSampleToOutput(track4, j12, i15, i16, i17);
            i14++;
            i12 = i17;
        }
        this.blockState = 0;
    }

    public Track getCurrentTrack(int i10) throws ParserException {
        assertInTrackEntry(i10);
        return this.currentTrack;
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i10) throws IOException {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i10);
    }

    @CallSuper
    public void startMasterElement(int i10, long j10, long j11) throws ParserException {
        assertInitialized();
        if (i10 != ID_BLOCK_GROUP) {
            if (i10 != ID_TRACK_ENTRY) {
                if (i10 != ID_CUE_POINT) {
                    if (i10 != ID_SEEK) {
                        if (i10 != ID_CONTENT_ENCRYPTION) {
                            if (i10 != ID_MASTERING_METADATA) {
                                if (i10 != ID_SEGMENT) {
                                    if (i10 != ID_CUES) {
                                        if (i10 == ID_CLUSTER && !this.sentSeekMap) {
                                            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                                                this.seekForCues = true;
                                                return;
                                            } else {
                                                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                                                this.sentSeekMap = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.cueTimesUs = new LongArray();
                                    this.cueClusterPositions = new LongArray();
                                    return;
                                }
                                long j12 = this.segmentContentPosition;
                                if (j12 != -1 && j12 != j10) {
                                    throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
                                }
                                this.segmentContentPosition = j10;
                                this.segmentContentSize = j11;
                                return;
                            }
                            getCurrentTrack(i10).hasColorInfo = true;
                            return;
                        }
                        getCurrentTrack(i10).hasContentEncryption = true;
                        return;
                    }
                    this.seekEntryId = -1;
                    this.seekEntryPosition = -1L;
                    return;
                }
                this.seenClusterPositionForCurrentCuePoint = false;
                return;
            }
            this.currentTrack = new Track();
            return;
        }
        this.blockHasReferenceBlock = false;
        this.blockGroupDiscardPaddingNs = 0L;
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i10) {
        this(new DefaultEbmlReader(), i10, factory);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i10, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i10 & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i10 & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    private static byte[] formatSubtitleTimecode(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    @Override // androidx.media3.extractor.Extractor
    @CallSuper
    public void seek(long j10, long j11) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i10 = 0; i10 < this.tracks.size(); i10++) {
            this.tracks.valueAt(i10).reset();
        }
    }
}
