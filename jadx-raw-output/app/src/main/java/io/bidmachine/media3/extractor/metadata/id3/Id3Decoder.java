package io.bidmachine.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.metadata.MetadataInputBuffer;
import io.bidmachine.media3.extractor.metadata.SimpleMetadataDecoder;
import io.bidmachine.media3.extractor.metadata.id3.Id3Decoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import m5.c;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: eh.a
        @Override // io.bidmachine.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return Id3Decoder.lambda$static$0(i10, i11, i12, i13, i14);
        }
    };
    private static final String TAG = "Id3Decoder";

    @Nullable
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class a {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public a(int i10, boolean z10, int i11) {
            this.majorVersion = i10;
            this.isUnsynchronized = z10;
            this.framesSize = i11;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, @Nullable FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, c.f64118b);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i13 = parsableByteArray.readInt();
        int i14 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j10 = unsignedInt == 4294967295L ? -1L : unsignedInt;
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j11 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i15 = position + i10;
        while (parsableByteArray.getPosition() < i15) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i13, i14, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i10) {
        if (i10 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        parsableByteArray.readBytes(bArr2, 0, i11);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        int iIndexOfTerminator = indexOfTerminator(bArr, i11, i10);
        while (i11 < iIndexOfTerminator) {
            aVarBuilder.a(new String(bArr, i11, iIndexOfTerminator - i11, getCharset(i10)));
            i11 = delimiterLength(i10) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i11, i10);
        }
        ImmutableList<String> immutableListM = aVarBuilder.m();
        return immutableListM.isEmpty() ? ImmutableList.of("") : immutableListM;
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i10) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i10) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), c.f64118b));
    }

    private static int delimiterLength(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i10) {
        if (i10 == 1) {
            return c.f64122f;
        }
        if (i10 != 2) {
            return i10 != 3 ? c.f64118b : c.f64119c;
        }
        return c.f64120d;
    }

    private static String getFrameId(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int indexOfZeroByte(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // io.bidmachine.media3.extractor.metadata.SimpleMetadataDecoder
    @Nullable
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i10, String str) {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10, int i12, @Nullable FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, c.f64118b);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z11 = (unsignedByte & 2) != 0;
        boolean z12 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i13 = 0; i13 < unsignedByte2; i13++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i13] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, c.f64118b);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (parsableByteArray.getPosition() < i14) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i11, parsableByteArray, z10, i12, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f0 A[Catch: all -> 0x012e, Exception -> 0x0131, OutOfMemoryError -> 0x0134, TRY_LEAVE, TryCatch #2 {Exception -> 0x0131, OutOfMemoryError -> 0x0134, all -> 0x012e, blocks: (B:91:0x011c, B:93:0x0124, B:106:0x0143, B:108:0x014b, B:116:0x0165, B:125:0x017d, B:136:0x0198, B:143:0x01aa, B:149:0x01b9, B:154:0x01d1, B:160:0x01eb, B:161:0x01f0), top: B:171:0x0112 }] */
    @Nullable
    private static Id3Frame decodeFrame(int i10, ParsableByteArray parsableByteArray, boolean z10, int i11, @Nullable FramePredicate framePredicate) {
        int unsignedIntToInt;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Id3Frame id3FrameDecodeBinaryFrame;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        int unsignedByte4 = i10 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i10 == 4) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (!z10) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i10 == 3 ? parsableByteArray.readUnsignedIntToInt() : parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i10 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        Id3Frame id3Frame = null;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            i12 = position;
            if (!framePredicate.evaluate(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4)) {
                parsableByteArray.setPosition(i12);
                return null;
            }
        } else {
            i12 = position;
        }
        if (i10 == 3) {
            int i13 = unsignedShort;
            z12 = (i13 & 128) != 0;
            z13 = (i13 & 64) != 0;
            z11 = (i13 & 32) != 0;
            z15 = z12;
            z14 = false;
        } else {
            int i14 = unsignedShort;
            if (i10 == 4) {
                boolean z16 = (i14 & 64) != 0;
                boolean z17 = (i14 & 8) != 0;
                boolean z18 = (i14 & 4) != 0;
                z14 = (i14 & 2) != 0;
                boolean z19 = (i14 & 1) != 0;
                z11 = z16;
                z12 = z19;
                z15 = z17;
                z13 = z18;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
        }
        if (z15 || z13) {
            Log.w(r4, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(i12);
            return null;
        }
        if (z11) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z12) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z14) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            if (unsignedByte == 84 && unsignedByte2 == 88 && unsignedByte3 == 88 && (i10 == 2 || unsignedByte4 == 88)) {
                id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 84) {
                id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 87 && unsignedByte2 == 88 && unsignedByte3 == 88 && (i10 == 2 || unsignedByte4 == 88)) {
                id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 87) {
                id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 80 && unsignedByte2 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 71 && unsignedByte2 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i10 == 2)) {
                id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (i10 == 2) {
                if (unsignedByte == 80 && unsignedByte2 == 73 && unsignedByte3 == 67) {
                    id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i10);
                } else if (unsignedByte != 67 && unsignedByte2 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i10 == 2)) {
                    id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                } else if (unsignedByte != 67 && unsignedByte2 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                    id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray, iRemoveUnsynchronization, i10, z10, i11, framePredicate);
                } else if (unsignedByte != 67 && unsignedByte2 == 84 && unsignedByte3 == 79 && unsignedByte4 == 67) {
                    id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray, iRemoveUnsynchronization, i10, z10, i11, framePredicate);
                } else if (unsignedByte != 77 && unsignedByte2 == 76 && unsignedByte3 == 76 && unsignedByte4 == 84) {
                    id3FrameDecodeBinaryFrame = decodeMlltFrame(parsableByteArray, iRemoveUnsynchronization);
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte == 65 && unsignedByte2 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i10);
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 67) {
                        if (unsignedByte != 77) {
                            id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        } else {
                            id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        }
                    } else if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 77) {
                id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else {
                id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            }
            parsableByteArray.setPosition(i12);
            id3Frame = id3FrameDecodeBinaryFrame;
            e = null;
        } catch (Exception e10) {
            e = e10;
        } catch (OutOfMemoryError e11) {
            e = e11;
        } finally {
            parsableByteArray.setPosition(i12);
        }
        if (id3Frame == null) {
            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i10, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
        }
        return id3Frame;
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i10) {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, c.f64118b), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i10));
    }

    private static String decodeStringIfValid(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i10, String str) {
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), c.f64118b));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i10, int i11, boolean z10) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i12;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z11 = true;
                if (parsableByteArray.bytesLeft() < i11) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i10 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (unsignedInt25 < i12) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (Throwable th2) {
                parsableByteArray.setPosition(position);
                throw th2;
            }
        }
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i10);
        a aVarDecodeHeader = decodeHeader(parsableByteArray);
        if (aVarDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i11 = aVarDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = aVarDecodeHeader.framesSize;
        if (aVarDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, aVarDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z10 = false;
        if (!validateFrames(parsableByteArray, aVarDecodeHeader.majorVersion, i11, false)) {
            if (aVarDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i11, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + aVarDecodeHeader.majorVersion);
                return null;
            }
            z10 = true;
        }
        while (parsableByteArray.bytesLeft() >= i11) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(aVarDecodeHeader.majorVersion, parsableByteArray, z10, i11, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i10, int i11) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + m5.a.e(new String(bArr, 0, 3, c.f64118b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String strE = m5.a.e(new String(bArr, 0, iIndexOfZeroByte, c.f64118b));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iIndexOfZeroByte + 1] & 255;
        int i14 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i14, unsignedByte);
        return new ApicFrame(str, new String(bArr, i14, iIndexOfTerminator - i14, charset), i13, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i12));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i10) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, c.f64118b));
        int i12 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i12, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i12, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i11));
    }

    @Nullable
    private static a decodeHeader(ParsableByteArray parsableByteArray) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        boolean z14 = false;
        if (unsignedInt24 != 4801587) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i10 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i10);
                synchSafeInt -= i10 + 4;
            }
        } else if (unsignedByte == 4) {
            if ((unsignedByte2 & 64) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                synchSafeInt -= 10;
            }
        } else {
            Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
            return null;
        }
        if (unsignedByte < 4 && (unsignedByte2 & 128) != 0) {
            z14 = true;
        }
        return new a(unsignedByte, z14, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i10) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i11 = ((i10 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i12] = bits;
            iArr2[i12] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static int indexOfTerminator(byte[] bArr, int i10, int i11) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (iIndexOfZeroByte < bArr.length - 1) {
                if ((iIndexOfZeroByte - i10) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                    return iIndexOfZeroByte;
                }
                iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return iIndexOfZeroByte;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i10) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i11 = position;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < position + i10) {
                if ((data[i11] & 255) == 255 && data[i12] == 0) {
                    System.arraycopy(data, i11 + 2, data, i12, (i10 - (i11 - position)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }
}
