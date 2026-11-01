package io.bidmachine.media3.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.NalUnitUtil;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;
import ph.d;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final a csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    @Nullable
    private final d userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final io.bidmachine.media3.extractor.ts.a userDataReader;

    public static final class a {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.isFilling) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i13 = this.length;
                if (length < i13 + i12) {
                    this.data = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.data, this.length, i12);
                this.length += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            if (this.isFilling) {
                int i12 = this.length - i11;
                this.length = i12;
                if (this.sequenceExtensionPosition != 0 || i10 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i12;
            } else if (i10 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public a(int i10) {
            this.data = new byte[i10];
        }
    }

    public H262Reader() {
        this(null);
    }

    public H262Reader(@Nullable io.bidmachine.media3.extractor.ts.a aVar) {
        this.userDataReader = aVar;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new a(128);
        if (aVar != null) {
            this.userData = new d(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    private static Pair<Format, Long> parseCsdBuffer(a aVar, String str) {
        float f10;
        int i10;
        float f11;
        long j10;
        int i11;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.data, aVar.length);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = bArrCopyOf[5] & 255;
        int i16 = (i14 << 4) | (i15 >> 4);
        int i17 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i16).setHeight(i17).setPixelWidthHeightRatio(f11).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                j10 = 0;
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b10 = bArrCopyOf[aVar.sequenceExtensionPosition + 9];
                        i12 = (b10 & 96) >> 5;
                        i13 = b10 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                }
                return Pair.create(formatBuild, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i16).setHeight(i17).setPixelWidthHeightRatio(f11).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        j10 = 0;
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b11 = bArrCopyOf[aVar.sequenceExtensionPosition + 9];
                i12 = (b11 & 96) >> 5;
                i13 = b11 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(formatBuild2, Long.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        boolean z10;
        int i10;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i11 = iFindNalUnit + 3;
            int i12 = parsableByteArray.getData()[i11] & 255;
            int i13 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i13 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            d dVar = this.userData;
            if (dVar != null) {
                if (i13 > 0) {
                    dVar.appendToNalUnit(data, position, iFindNalUnit);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.userData.endNalUnit(i10)) {
                    d dVar2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(dVar2.nalData, dVar2.nalLength));
                    ((io.bidmachine.media3.extractor.ts.a) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i12 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i12);
                }
            }
            if (i12 == 0 || i12 == START_SEQUENCE_HEADER) {
                int i14 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j10 = this.sampleTimeUs;
                    if (j10 != -9223372036854775807L) {
                        this.output.sampleMetadata(j10, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i14, i14, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i14);
                    long j11 = this.pesTimeUs;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.sampleTimeUs;
                        j11 = j12 != -9223372036854775807L ? j12 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j11;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = -9223372036854775807L;
                    z10 = true;
                    this.startedFirstSample = true;
                } else {
                    z10 = true;
                }
                this.sampleHasPicture = i12 == 0 ? z10 : false;
            } else if (i12 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i11;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        d dVar3 = this.userData;
        if (dVar3 != null) {
            dVar3.appendToNalUnit(data, position, iLimit);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z10) {
        Assertions.checkStateNotNull(this.output);
        if (z10) {
            boolean z11 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z11 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, int i10) {
        this.pesTimeUs = j10;
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        d dVar = this.userData;
        if (dVar != null) {
            dVar.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        io.bidmachine.media3.extractor.ts.a aVar = this.userDataReader;
        if (aVar != null) {
            aVar.createTracks(extractorOutput, trackIdGenerator);
        }
    }
}
