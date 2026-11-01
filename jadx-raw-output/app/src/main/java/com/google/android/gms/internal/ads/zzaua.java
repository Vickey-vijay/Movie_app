package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaua implements zzaty {
    private int zza;
    private final byte[] zzb;
    private final zzauc zzc;

    public zzaua(zzauc zzaucVar) {
        int[] iArr = {1539942439, 2070175971, 1100945533, -1166483302, -2145608135, 164110942, 67728125, 1143565421, 981914693};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 991039875;
        iArr[1] = 475472926;
        iArr[2] = 1225689584;
        iArr[3] = 357672014;
        iArr[4] = 1805818736;
        iArr[5] = -1153961639;
        iArr[6] = 102782241;
        iArr[7] = 1671581032;
        iArr[8] = 1337434154;
        this.zza = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 981914693);
        this.zzb = new byte[(102782241 + (((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1153961639))) ^ (1671581032 % 1337434154)];
        this.zzc = zzaucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i10) {
        int[] iArr = {143154913, 992498304, 439467622, 1627930754, 1212551295, -122082883, 1967905751, 2033018190, 70061690};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        iArr[0] = 1264448664;
        iArr[1] = 231739608;
        iArr[2] = 1128901767;
        iArr[3] = 479203675;
        iArr[4] = 860794247;
        iArr[5] = 1929373616;
        iArr[6] = 106041240;
        iArr[7] = 1761855727;
        iArr[8] = 1384724137;
        int i19 = 106041240 + ((((231739608 & (~1264448664)) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1929373616);
        int i20 = 1761855727 % 1384724137;
        iArr[0] = 1661299468;
        iArr[1] = 613450408;
        iArr[2] = 2017391535;
        iArr[3] = 109051904;
        iArr[4] = 2071555381;
        iArr[5] = -395510193;
        iArr[6] = 45882350;
        iArr[7] = 1694830070;
        int i21 = (i17 + ((((i12 & (~i11)) | i13) + ((i11 & i14) | i15)) - i16)) ^ (i18 % 70061690);
        iArr[8] = 1383960411;
        int i22 = 45882350 + (((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-395510193));
        int i23 = 1694830070 % 1383960411;
        int i24 = i10 >>> i21;
        if (i24 != this.zza) {
            this.zzc.zza(i24, this.zzb);
            this.zza = i24;
        }
        int i25 = i22 ^ i23;
        return (byte) (((this.zzb[i10 % (i19 ^ i20)] ^ zzaukVar.zzb(i10)) << i25) >> i25);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > zzaukVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            bArr[i12] = zza(zzaukVar, i10);
            i10++;
            i12++;
        }
        return zzauk.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final /* bridge */ /* synthetic */ zzaty zzc() {
        return new zzaua(this.zzc);
    }
}
