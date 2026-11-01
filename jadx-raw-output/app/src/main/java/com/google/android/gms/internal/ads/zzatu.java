package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzatu {
    public static byte[] zza() {
        int[] iArr = {1529195746, 118097808, 3345166, 656934035, 821390159, 1125361885, 184839124, 1037127828, 1034949299};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 1070575321;
        iArr[1] = 53864535;
        iArr[2] = 741512112;
        iArr[3] = 1665624655;
        iArr[4] = 1758594712;
        iArr[5] = 1453217468;
        iArr[6] = 94560416;
        iArr[7] = 1555319301;
        iArr[8] = 382697713;
        int[] iArr2 = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i18 = (94560416 + (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1453217468)) ^ (1555319301 % 382697713);
        int i19 = (i16 + (((((~i10) & i11) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 1034949299);
        int i20 = iArr2[0];
        int i21 = iArr2[1];
        int i22 = iArr2[2];
        int i23 = iArr2[3];
        int i24 = iArr2[4];
        int i25 = iArr2[5];
        int i26 = iArr2[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr2[7] % 1275373743) ^ (i26 + ((((i21 & (~i20)) | i22) + ((i20 & i23) | i24)) - i25)));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i19);
        byteBufferAllocate.putInt(i18);
        return byteBufferAllocate.array();
    }
}
