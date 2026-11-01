package gh;

import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.mkv.EbmlProcessor;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements gh.b {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private EbmlProcessor processor;
    private final byte[] scratch = new byte[8];
    private final ArrayDeque<b> masterElementsStack = new ArrayDeque<>();
    private final f varintReader = new f();

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {
        private final long elementEndPosition;
        private final int elementId;

        private b(int i10, long j10) {
            this.elementId = i10;
            this.elementEndPosition = j10;
        }
    }

    @Override // gh.b
    public void reset() {
        this.elementState = 0;
        this.masterElementsStack.clear();
        this.varintReader.reset();
    }

    private long readInteger(ExtractorInput extractorInput, int i10) throws IOException {
        extractorInput.readFully(this.scratch, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.scratch[i11] & 255));
        }
        return j10;
    }

    private static String readString(ExtractorInput extractorInput, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        extractorInput.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // gh.b
    public void init(EbmlProcessor ebmlProcessor) {
        this.processor = ebmlProcessor;
    }

    @Override // gh.b
    public boolean read(ExtractorInput extractorInput) throws IOException {
        Assertions.checkStateNotNull(this.processor);
        while (true) {
            b bVarPeek = this.masterElementsStack.peek();
            if (bVarPeek != null && extractorInput.getPosition() >= bVarPeek.elementEndPosition) {
                this.processor.endMasterElement(this.masterElementsStack.pop().elementId);
                return true;
            }
            if (this.elementState == 0) {
                long unsignedVarint = this.varintReader.readUnsignedVarint(extractorInput, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = maybeResyncToNextLevel1Element(extractorInput);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.elementId = (int) unsignedVarint;
                this.elementState = 1;
            }
            if (this.elementState == 1) {
                this.elementContentSize = this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
                this.elementState = 2;
            }
            int elementType = this.processor.getElementType(this.elementId);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = extractorInput.getPosition();
                    this.masterElementsStack.push(new b(this.elementId, this.elementContentSize + position));
                    this.processor.startMasterElement(this.elementId, position, this.elementContentSize);
                    this.elementState = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.elementContentSize;
                    if (j10 <= 8) {
                        this.processor.integerElement(this.elementId, readInteger(extractorInput, (int) j10));
                        this.elementState = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.elementContentSize, null);
                }
                if (elementType == 3) {
                    long j11 = this.elementContentSize;
                    if (j11 <= 2147483647L) {
                        this.processor.stringElement(this.elementId, readString(extractorInput, (int) j11));
                        this.elementState = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.elementContentSize, null);
                }
                if (elementType == 4) {
                    this.processor.binaryElement(this.elementId, (int) this.elementContentSize, extractorInput);
                    this.elementState = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j12 = this.elementContentSize;
                if (j12 == 4 || j12 == 8) {
                    this.processor.floatElement(this.elementId, readFloat(extractorInput, (int) j12));
                    this.elementState = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.elementContentSize, null);
            }
            extractorInput.skipFully((int) this.elementContentSize);
            this.elementState = 0;
        }
    }

    private long maybeResyncToNextLevel1Element(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.scratch, 0, 4);
            int unsignedVarintLength = f.parseUnsignedVarintLength(this.scratch[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) f.assembleVarint(this.scratch, unsignedVarintLength, false);
                if (this.processor.isLevel1Element(iAssembleVarint)) {
                    extractorInput.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double readFloat(ExtractorInput extractorInput, int i10) throws IOException {
        long integer = readInteger(extractorInput, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) integer);
        }
        return Double.longBitsToDouble(integer);
    }
}
