package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class TsUtil {
    public static boolean isStartOfTsPacket(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static int findSyncBytePosition(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    private TsUtil() {
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i10, int i11) {
        boolean z10;
        parsableByteArray.setPosition(i10);
        if (parsableByteArray.bytesLeft() < 5) {
            return -9223372036854775807L;
        }
        int i12 = parsableByteArray.readInt();
        if ((8388608 & i12) != 0 || ((2096896 & i12) >> 8) != i11) {
            return -9223372036854775807L;
        }
        boolean z11 = true;
        if ((i12 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && parsableByteArray.readUnsignedByte() >= 7 && parsableByteArray.bytesLeft() >= 7) {
            if ((parsableByteArray.readUnsignedByte() & 16) != 16) {
                z11 = false;
            }
            if (z11) {
                byte[] bArr = new byte[6];
                parsableByteArray.readBytes(bArr, 0, 6);
                return readPcrValueFromPcrBytes(bArr);
            }
        }
        return -9223372036854775807L;
    }
}
