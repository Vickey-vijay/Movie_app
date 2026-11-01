package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private CeaUtil() {
    }

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i10 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i10 += unsignedByte;
            if (unsignedByte != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void consumeCcData(long j10, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i10 = (unsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i10);
                Assertions.checkState(j10 != -9223372036854775807L);
                trackOutput.sampleMetadata(j10, 1, i10, 0, null);
            }
        }
    }

    public static void consume(long j10, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (parsableByteArray.bytesLeft() > 1) {
                int non255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
                int non255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
                int position = parsableByteArray.getPosition() + non255TerminatedValue2;
                if (non255TerminatedValue2 != -1 && non255TerminatedValue2 <= parsableByteArray.bytesLeft()) {
                    if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int unsignedShort = parsableByteArray.readUnsignedShort();
                        if (unsignedShort == 49) {
                            i10 = parsableByteArray.readInt();
                        } else {
                            i10 = 0;
                        }
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedShort == 47) {
                            parsableByteArray.skipBytes(1);
                        }
                        if (unsignedByte == COUNTRY_CODE && ((unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (unsignedShort == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            consumeCcData(j10, parsableByteArray, trackOutputArr);
                        }
                    }
                } else {
                    Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                    position = parsableByteArray.limit();
                }
                parsableByteArray.setPosition(position);
            } else {
                return;
            }
        }
    }
}
