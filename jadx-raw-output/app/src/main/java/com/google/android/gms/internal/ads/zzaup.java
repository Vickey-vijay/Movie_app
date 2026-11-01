package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaup {
    public int zza;
    public zzauk zzb;
    public zzaty zzc;
    public zzaub zzd;

    public zzaup() {
        this(new zzaub(1));
    }

    public zzaup(zzaub zzaubVar) {
        this(zzauk.zzb, 0, new zzatz());
        this.zzd = zzaubVar;
    }

    private zzaup(zzauk zzaukVar, int i10, zzaty zzatyVar) {
        this.zzb = zzaukVar;
        this.zza = i10;
        this.zzc = zzatyVar;
    }

    public zzaup(zzauk zzaukVar, int i10, zzaty zzatyVar, zzaub zzaubVar) {
        this(zzaukVar, i10, zzatyVar);
        this.zzd = zzaubVar;
    }

    private final long zzg() throws zzaum, zzauo {
        int[] iArr = {1246322141, 272302173, 1841378864, 825937997, 658822930, -1784934195, 38700438, 1600766768, 649830540};
        int i10 = 0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = i17 + ((((i12 & (~i11)) | i13) + ((i11 & i14) | i15)) - i16);
        int i20 = i18 % 649830540;
        iArr[0] = 680326130;
        iArr[1] = 1378702392;
        iArr[2] = 3315809;
        iArr[3] = 1913472410;
        iArr[4] = 739293607;
        iArr[5] = -1193353858;
        iArr[6] = 1053514403;
        iArr[7] = 1743768897;
        iArr[8] = 152059765;
        int i21 = 1053514403 + ((((1378702392 & (~680326130)) | 3315809) + ((680326130 & 1913472410) | 739293607)) - (-1193353858));
        int i22 = 1743768897 % 152059765;
        iArr[0] = 973294814;
        iArr[1] = 1252035530;
        iArr[2] = 51191353;
        iArr[3] = 1755616710;
        iArr[4] = 889459732;
        iArr[5] = 1628051670;
        iArr[6] = 133875502;
        iArr[7] = 1861701682;
        iArr[8] = 1196748250;
        int i23 = 133875502 + ((((1252035530 & (~973294814)) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1628051670);
        int i24 = 1861701682 % 1196748250;
        iArr[0] = 29116548;
        iArr[1] = 174422021;
        iArr[2] = 84710160;
        iArr[3] = -1973327347;
        iArr[4] = -1266641286;
        iArr[5] = -1298677495;
        iArr[6] = 593052434;
        iArr[7] = 2091729405;
        iArr[8] = 1207774949;
        int i25 = 593052434 + ((((174422021 & (~29116548)) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1298677495));
        int i26 = 2091729405 % 1207774949;
        iArr[0] = 80201211;
        iArr[1] = 1629524354;
        iArr[2] = 38778411;
        iArr[3] = 1977746312;
        iArr[4] = 382371455;
        iArr[5] = -934978761;
        iArr[6] = 1438507752;
        iArr[7] = 1050760512;
        iArr[8] = 184320788;
        int i27 = 1438507752 + (((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - (-934978761));
        int i28 = 1050760512 % 184320788;
        long j10 = 0;
        while (i10 < (i19 ^ i20)) {
            try {
                zzaty zzatyVar = this.zzc;
                zzauk zzaukVar = this.zzb;
                int i29 = this.zza;
                this.zza = i29 + 1;
                byte bZza = zzatyVar.zza(zzaukVar, i29);
                int i30 = i23 ^ i24;
                j10 |= ((long) ((i21 ^ i22) & bZza)) << i10;
                if (i10 == i30) {
                    if (bZza > 1) {
                        throw new zzaum();
                    }
                    i10 = i30;
                }
                if ((bZza & (i25 ^ i26)) == 0) {
                    return (j10 >>> 1) ^ (-(j10 & 1));
                }
                i10 += i27 ^ i28;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzauo(e10);
            }
        }
        throw new zzaum();
    }

    private static final void zzh(long j10) throws zzaun {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % ((jArr[6] + ((((j12 & (~j11)) | j13) + ((j11 & j14) | j15)) - j16)) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzaun();
        }
    }

    public final void zza(long j10) throws zzaun, zzauo {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        zzh(j10);
        long j19 = j10 / ((j17 + (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16)) ^ (j18 % 899334107));
        if (j19 >= 0 && j19 <= this.zzb.zza.length) {
            this.zza = (int) j19;
            return;
        }
        throw new zzauo();
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        return ((long) this.zza) * ((jArr[6] + ((((j11 & (~j10)) | j12) + ((j10 & j13) | j14)) - j15)) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzauo {
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzatyVar.zza(zzaukVar, i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzauo(e10);
        }
    }

    public final int zzd() throws zzauo {
        int[] iArr = {413360099, 1621678468, 84323740, 1621644360, 385888249, 1519637107, 6072641, 1609416931, 1031126087};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 1031126087;
        iArr[0] = 978587665;
        iArr[1] = 1228171537;
        iArr[2] = 1025392332;
        iArr[3] = 1075859857;
        iArr[4] = 983056096;
        iArr[5] = -1399000561;
        iArr[6] = 190113083;
        iArr[7] = 1723578341;
        iArr[8] = 672563970;
        int i20 = 190113083 + ((((1228171537 & (~978587665)) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1399000561));
        int i21 = 1723578341 % 672563970;
        iArr[0] = 1163384280;
        iArr[1] = 546336857;
        iArr[2] = 505597090;
        iArr[3] = 546323033;
        iArr[4] = 358992768;
        iArr[5] = 1545617422;
        iArr[6] = 198628789;
        iArr[7] = 1124734562;
        iArr[8] = 530406424;
        int i22 = 198628789 + ((((546336857 & (~1163384280)) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1545617422);
        int i23 = 1124734562 % 530406424;
        iArr[0] = 217161528;
        iArr[1] = 116398273;
        iArr[2] = 202500381;
        iArr[3] = 316821712;
        iArr[4] = 269928733;
        iArr[5] = 415634774;
        iArr[6] = 5622716;
        iArr[7] = 529302443;
        iArr[8] = 418646579;
        int i24 = 5622716 + (((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 415634774);
        int i25 = 529302443 % 418646579;
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            int i26 = this.zza;
            this.zza = i26 + 1;
            byte bZza = zzatyVar.zza(zzaukVar, i26);
            int i27 = i18 ^ i19;
            zzaty zzatyVar2 = this.zzc;
            zzauk zzaukVar2 = this.zzb;
            int i28 = this.zza;
            this.zza = i28 + 1;
            int iZza = (bZza & i27) | ((zzatyVar2.zza(zzaukVar2, i28) & i27) << (i20 ^ i21));
            zzaty zzatyVar3 = this.zzc;
            zzauk zzaukVar3 = this.zzb;
            int i29 = this.zza;
            this.zza = i29 + 1;
            int iZza2 = iZza | ((i27 & zzatyVar3.zza(zzaukVar3, i29)) << (i22 ^ i23));
            zzaty zzatyVar4 = this.zzc;
            zzauk zzaukVar4 = this.zzb;
            int i30 = this.zza;
            this.zza = i30 + 1;
            return iZza2 | (zzatyVar4.zza(zzaukVar4, i30) << (i24 ^ i25));
        } catch (IndexOutOfBoundsException e10) {
            throw new zzauo(e10);
        }
    }

    public final long zze() throws zzaum, zzauo {
        return zzg();
    }

    public final zzauk zzf(long j10) throws zzaun, zzauo {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzh(zzb() + j10);
        int i19 = this.zza;
        long j11 = i19;
        zzauk zzaukVar = this.zzb;
        long j12 = (j10 >> ((i17 % 774318984) ^ i18)) + j11;
        if (j12 > zzaukVar.zza.length || j12 < j11) {
            throw new zzauo();
        }
        try {
            int i20 = (int) j12;
            zzauk zzaukVarZzb = this.zzc.zzb(zzaukVar, i19, i20);
            this.zza = i20;
            return zzaukVarZzb;
        } catch (IndexOutOfBoundsException e10) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
