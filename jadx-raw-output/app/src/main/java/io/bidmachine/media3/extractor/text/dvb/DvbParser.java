package io.bidmachine.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Consumer;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class DvbParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final a defaultClutDefinition;
    private final b defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final h subtitleService;

    public static final class f {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f59902id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<g> regionObjects;
        public final int width;

        public void mergeFrom(f fVar) {
            SparseArray<g> sparseArray = fVar.regionObjects;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.regionObjects.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f59902id = i10;
            this.fillFlag = z10;
            this.width = i11;
            this.height = i12;
            this.levelOfCompatibility = i13;
            this.depth = i14;
            this.clutId = i15;
            this.pixelCode8Bit = i16;
            this.pixelCode4Bit = i17;
            this.pixelCode2Bit = i18;
            this.regionObjects = sparseArray;
        }
    }

    public static final class h {
        public final int ancillaryPageId;

        @Nullable
        public b displayDefinition;

        @Nullable
        public d pageComposition;
        public final int subtitlePageId;
        public final SparseArray<f> regions = new SparseArray<>();
        public final SparseArray<a> cluts = new SparseArray<>();
        public final SparseArray<c> objects = new SparseArray<>();
        public final SparseArray<a> ancillaryCluts = new SparseArray<>();
        public final SparseArray<c> ancillaryObjects = new SparseArray<>();

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }

        public h(int i10, int i11) {
            this.subtitlePageId = i10;
            this.ancillaryPageId = i11;
        }
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int getColor(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        int i12;
        int bits;
        int bits2;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        i12 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z10 = true;
                        } else if (bits4 == 1) {
                            i12 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z10 = z10;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i12 = 0;
                    }
                    bits3 = 0;
                }
                z10 = z10;
                i12 = bits;
                bits3 = bits2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        int i12;
        int bits;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(4);
            int i14 = 2;
            if (bits2 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int bits3 = parsableBitArray.readBits(2);
                    if (bits3 != 0) {
                        if (bits3 != 1) {
                            if (bits3 == 2) {
                                bits = parsableBitArray.readBits(4) + 9;
                                bits2 = parsableBitArray.readBits(4);
                            } else if (bits3 != 3) {
                                z10 = z10;
                                bits2 = 0;
                                i12 = 0;
                            } else {
                                bits = parsableBitArray.readBits(8) + 25;
                                bits2 = parsableBitArray.readBits(4);
                            }
                        }
                        i12 = i14;
                    } else {
                        i12 = 1;
                    }
                    bits2 = 0;
                } else {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                }
                z10 = z10;
                i12 = bits;
            } else {
                int bits4 = parsableBitArray.readBits(3);
                if (bits4 != 0) {
                    i14 = bits4 + 2;
                    i12 = i14;
                    bits2 = 0;
                } else {
                    z10 = true;
                    bits2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int bits;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z10 = z11;
                bits = 1;
            } else if (parsableBitArray.readBit()) {
                z10 = z11;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            } else {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z10 = z11;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z10 = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i12, i11, i12 + bits, i11 + 1, paint);
            }
            i12 += bits;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void paintPixelDataSubBlocks(c cVar, a aVar, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.clutEntries8Bit;
        } else {
            iArr = i10 == 2 ? aVar.clutEntries4Bit : aVar.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(cVar.topFieldData, iArr2, i10, i11, i12, paint, canvas);
        paintPixelDataSubBlock(cVar.bottomFieldData, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static b parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i10;
        int i11;
        int i12;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i12 = bits5;
            i11 = bits6;
            i10 = bits4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = bits2;
            bits = bits3;
        }
        return new b(bits2, bits3, i10, i12, i11, bits);
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i10, int i11, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i11 + i10);
        parsableBitArray.setPosition(i10);
        consumer.accept(parse(parsableBitArray));
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        super.parse(bArr, outputOptions, consumer);
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public /* bridge */ /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    public static final class a {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f59900id;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f59900id = i10;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    public static final class b {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.width = i10;
            this.height = i11;
            this.horizontalPositionMinimum = i12;
            this.horizontalPositionMaximum = i13;
            this.verticalPositionMinimum = i14;
            this.verticalPositionMaximum = i15;
        }
    }

    public static final class c {
        public final byte[] bottomFieldData;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f59901id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f59901id = i10;
            this.nonModifyingColorFlag = z10;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    public static final class d {
        public final SparseArray<e> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.timeOutSecs = i10;
            this.version = i11;
            this.state = i12;
            this.regions = sparseArray;
        }
    }

    public static final class e {
        public final int horizontalAddress;
        public final int verticalAddress;

        public e(int i10, int i11) {
            this.horizontalAddress = i10;
            this.verticalAddress = i11;
        }
    }

    public static final class g {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.type = i10;
            this.provider = i11;
            this.horizontalPosition = i12;
            this.verticalPosition = i13;
            this.foregroundPixelCode = i14;
            this.backgroundPixelCode = i15;
        }
    }

    private static byte[] buildClutMapTable(int i10, int i11, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) parsableBitArray.readBits(i11);
        }
        return bArr;
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = getColor(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = getColor(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = getColor(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = getColor(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = getColor(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = getColor(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = getColor(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int iPaint2BitPixelCodeString = i11;
        int i13 = i12;
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        byte[] bArrBuildClutMapTable3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrBuildClutMapTable3 == null ? defaultMap2To4 : bArrBuildClutMapTable3;
                            } else {
                                bArr2 = null;
                            }
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, iPaint2BitPixelCodeString, i13, paint, canvas);
                            parsableBitArray.byteAlign();
                        } else {
                            bArr3 = bArrBuildClutMapTable == null ? defaultMap2To8 : bArrBuildClutMapTable;
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, iPaint2BitPixelCodeString, i13, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(parsableBitArray, iArr, i10 == 3 ? bArrBuildClutMapTable2 == null ? defaultMap4To8 : bArrBuildClutMapTable2 : null, iPaint2BitPixelCodeString, i13, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(parsableBitArray, iArr, null, iPaint2BitPixelCodeString, i13, paint, canvas);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrBuildClutMapTable = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrBuildClutMapTable2 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                        break;
                }
            } else {
                i13 += 2;
                iPaint2BitPixelCodeString = i11;
            }
        }
    }

    private static a parseClutDefinition(ParsableBitArray parsableBitArray, int i10) {
        int[] iArr;
        int bits;
        int i11;
        int bits2;
        int bits3;
        int bits4;
        int i12 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i14 > 0) {
            int bits6 = parsableBitArray.readBits(i12);
            int bits7 = parsableBitArray.readBits(i12);
            int i15 = i14 - 2;
            if ((bits7 & 128) != 0) {
                iArr = iArrGenerateDefault2BitClutEntries;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            }
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i12);
                bits4 = parsableBitArray.readBits(i12);
                bits = parsableBitArray.readBits(i12);
                bits2 = parsableBitArray.readBits(i12);
                i11 = i15 - 4;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i13;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i11 = i15 - 2;
                bits2 = parsableBitArray.readBits(i13) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d10 = bits3;
            double d11 = bits4 - 128;
            double d12 = bits - 128;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), Util.constrainValue((int) (d10 + (1.402d * d11)), 0, 255), Util.constrainValue((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), Util.constrainValue((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            bits5 = bits5;
            i12 = 8;
            i13 = 2;
        }
        return new a(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static c parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new c(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new c(bits, bit, bArr2, bArr);
    }

    private static d parsePageComposition(ParsableBitArray parsableBitArray, int i10) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i11 -= 6;
            sparseArray.put(bits4, new e(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new d(bits, bits2, bits3, sparseArray);
    }

    private static f parseRegionComposition(ParsableBitArray parsableBitArray, int i10) {
        int bits;
        int bits2;
        int bits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i11 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i12 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int bits12 = parsableBitArray.readBits(i11);
            int bits13 = parsableBitArray.readBits(i12);
            int bits14 = parsableBitArray.readBits(i12);
            int bits15 = parsableBitArray.readBits(12);
            int i14 = bits11;
            parsableBitArray.skipBits(4);
            int bits16 = parsableBitArray.readBits(12);
            i13 -= 6;
            if (bits13 == 1 || bits13 == 2) {
                i13 -= 2;
                bits = parsableBitArray.readBits(8);
                bits2 = parsableBitArray.readBits(8);
            } else {
                bits = 0;
                bits2 = 0;
            }
            sparseArray.put(bits12, new g(bits13, bits14, bits15, bits16, bits, bits2));
            bits11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, h hVar) {
        f fVar;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == hVar.subtitlePageId) {
                    d dVar = hVar.pageComposition;
                    d pageComposition = parsePageComposition(parsableBitArray, bits3);
                    if (pageComposition.state != 0) {
                        hVar.pageComposition = pageComposition;
                        hVar.regions.clear();
                        hVar.cluts.clear();
                        hVar.objects.clear();
                    } else if (dVar != null && dVar.version != pageComposition.version) {
                        hVar.pageComposition = pageComposition;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.pageComposition;
                if (bits2 == hVar.subtitlePageId && dVar2 != null) {
                    f regionComposition = parseRegionComposition(parsableBitArray, bits3);
                    if (dVar2.state == 0 && (fVar = hVar.regions.get(regionComposition.f59902id)) != null) {
                        regionComposition.mergeFrom(fVar);
                    }
                    hVar.regions.put(regionComposition.f59902id, regionComposition);
                }
                break;
            case 18:
                if (bits2 == hVar.subtitlePageId) {
                    a clutDefinition = parseClutDefinition(parsableBitArray, bits3);
                    hVar.cluts.put(clutDefinition.f59900id, clutDefinition);
                } else if (bits2 == hVar.ancillaryPageId) {
                    a clutDefinition2 = parseClutDefinition(parsableBitArray, bits3);
                    hVar.ancillaryCluts.put(clutDefinition2.f59900id, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == hVar.subtitlePageId) {
                    c objectData = parseObjectData(parsableBitArray);
                    hVar.objects.put(objectData.f59901id, objectData);
                } else if (bits2 == hVar.ancillaryPageId) {
                    c objectData2 = parseObjectData(parsableBitArray);
                    hVar.ancillaryObjects.put(objectData2.f59901id, objectData2);
                }
                break;
            case 20:
                if (bits2 == hVar.subtitlePageId) {
                    hVar.displayDefinition = parseDisplayDefinition(parsableBitArray);
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public void reset() {
        this.subtitleService.reset();
    }

    public DvbParser(List<byte[]> list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new b(719, 575, 0, 719, 0, 575);
        this.defaultClutDefinition = new a(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new h(unsignedShort, unsignedShort2);
    }

    private CuesWithTiming parse(ParsableBitArray parsableBitArray) {
        int i10;
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        h hVar = this.subtitleService;
        d dVar = hVar.pageComposition;
        if (dVar == null) {
            return new CuesWithTiming(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.displayDefinition;
        if (bVar == null) {
            bVar = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bVar.width + 1 != bitmap.getWidth() || bVar.height + 1 != this.bitmap.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.width + 1, bVar.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.regions;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.canvas.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.subtitleService.regions.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.horizontalAddress + bVar.horizontalPositionMinimum;
            int i13 = eVarValueAt.verticalAddress + bVar.verticalPositionMinimum;
            this.canvas.clipRect(i12, i13, Math.min(fVar.width + i12, bVar.horizontalPositionMaximum), Math.min(fVar.height + i13, bVar.verticalPositionMaximum));
            a aVar = this.subtitleService.cluts.get(fVar.clutId);
            if (aVar == null && (aVar = this.subtitleService.ancillaryCluts.get(fVar.clutId)) == null) {
                aVar = this.defaultClutDefinition;
            }
            int i14 = 0;
            for (SparseArray<g> sparseArray2 = fVar.regionObjects; i14 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.subtitleService.objects.get(iKeyAt);
                c cVar2 = cVar == null ? this.subtitleService.ancillaryObjects.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    paintPixelDataSubBlocks(cVar2, aVar, fVar.depth, gVarValueAt.horizontalPosition + i12, i13 + gVarValueAt.verticalPosition, cVar2.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                }
                i14++;
            }
            if (fVar.fillFlag) {
                int i15 = fVar.depth;
                if (i15 == 3) {
                    i10 = aVar.clutEntries8Bit[fVar.pixelCode8Bit];
                } else if (i15 == 2) {
                    i10 = aVar.clutEntries4Bit[fVar.pixelCode4Bit];
                } else {
                    i10 = aVar.clutEntries2Bit[fVar.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i10);
                this.canvas.drawRect(i12, i13, fVar.width + i12, fVar.height + i13, this.fillRegionPaint);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.bitmap, i12, i13, fVar.width, fVar.height)).setPosition(i12 / bVar.width).setPositionAnchor(0).setLine(i13 / bVar.height, 0).setLineAnchor(0).setSize(fVar.width / bVar.width).setBitmapHeight(fVar.height / bVar.height).build());
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.canvas.restore();
        }
        return new CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L);
    }
}
