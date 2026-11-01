package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaug {
    public static zzavg zza(final long j10) {
        return zzavg.zzf(new zzauy() { // from class: com.google.android.gms.internal.ads.zzauf
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzavb) obj).zzb.zzb(zzavg.zzb(j10));
                    return Optional.empty();
                } catch (zzauw unused) {
                    return Optional.of(zzatq.zza);
                }
            }
        });
    }

    public static int zzb(long j10, zzavf zzavfVar, boolean z10) throws IOException {
        long j11;
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        int[] iArr = {1725868784, 388366538, 739792167, 1395525853, 1087913783, 2097482120, 23637094, 1550046828, 184366026};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = j18 + ((((j13 & (~j12)) | j14) + ((j12 & j15) | j16)) - j17);
        long j21 = j19 % 1629190168;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 184366026;
        iArr[0] = 84870791;
        iArr[1] = 719462960;
        iArr[2] = 688752780;
        iArr[3] = 317383283;
        iArr[4] = 806209731;
        iArr[5] = 1640397215;
        iArr[6] = 202422448;
        iArr[7] = 2023762697;
        iArr[8] = 959200313;
        int i20 = 202422448 + (((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1640397215);
        int i21 = 2023762697 % 959200313;
        iArr[0] = 294151249;
        iArr[1] = 1465191424;
        iArr[2] = 201912514;
        iArr[3] = 1398095366;
        iArr[4] = 75641662;
        iArr[5] = 1691264753;
        iArr[6] = 361164745;
        iArr[7] = 1583887958;
        iArr[8] = 619175679;
        int i22 = 361164745 + (((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1691264753);
        int i23 = 1583887958 % 619175679;
        if (z10) {
            iArr[0] = 1375552878;
            iArr[1] = 930005102;
            iArr[2] = 1249030018;
            iArr[3] = 1024213116;
            iArr[4] = 136481682;
            iArr[5] = -1912210507;
            iArr[6] = 291789062;
            iArr[7] = 2014126950;
            iArr[8] = 228698447;
            j11 = (j10 + j10) ^ (j10 >> ((291789062 + (((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - (-1912210507))) ^ (2014126950 % 228698447)));
        } else {
            j11 = j10;
        }
        int i24 = 1;
        while (true) {
            long j22 = j20 ^ j21;
            long j23 = j11 >>> (i20 ^ i21);
            boolean z11 = j23 != 0 || i24 < 0;
            int i25 = (int) (j11 & j22);
            if (z11) {
                int i26 = i18 ^ i19;
                i25 = ((i25 | (i22 ^ i23)) << i26) >> i26;
            }
            zzavfVar.zza((byte) i25);
            if (!z11) {
                return i24;
            }
            i24++;
            j11 = j23;
        }
    }
}
