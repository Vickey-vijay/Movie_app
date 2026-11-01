package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalv extends zzalt {

    @Nullable
    private zzalu zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzagm zzd;

    @Nullable
    private zzagk zze;

    /* JADX WARN: Code duplicated, block: B:167:0x03ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03f1  */
    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i10;
        int iZzb;
        int i11;
        int i12;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar = this.zzd;
        int i13 = 4;
        if (zzagmVar != null) {
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i14 = zzagmVar.zza;
                int i15 = 5;
                zzagn.zzd(5, zzerVar, false);
                int iZzs = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= iZzs) {
                        zzagm zzagmVar2 = zzagmVar;
                        int i19 = 6;
                        int iZzb2 = zzagjVar.zzb(6) + 1;
                        for (int i20 = 0; i20 < iZzb2; i20++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int iZzb3 = zzagjVar.zzb(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 >= iZzb3) {
                                int i24 = 1;
                                int iZzb4 = zzagjVar.zzb(i19) + 1;
                                int i25 = 0;
                                while (i25 < iZzb4) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int iZzb5 = zzagjVar.zzb(i19) + i24;
                                    int i26 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i27 = 0; i27 < iZzb5; i27++) {
                                        iArr[i27] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr[i28] & (1 << i29)) != 0) {
                                                zzagjVar.zzc(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i25++;
                                    i19 = 6;
                                    i24 = 1;
                                }
                                int iZzb6 = zzagjVar.zzb(i19) + 1;
                                for (int i30 = 0; i30 < iZzb6; i30++) {
                                    int iZzb7 = zzagjVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb7);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int iZzb8 = zzagjVar.zzb(8) + i10;
                                            for (int i31 = 0; i31 < iZzb8; i31++) {
                                                int i32 = i14 - 1;
                                                zzagjVar.zzc(zzagn.zza(i32));
                                                zzagjVar.zzc(zzagn.zza(i32));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i33 = 0; i33 < i14; i33++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i34 = 0; i34 < iZzb; i34++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzagjVar.zzb(6) + 1;
                                zzagl[] zzaglVarArr = new zzagl[iZzb9];
                                for (int i35 = 0; i35 < iZzb9; i35++) {
                                    zzaglVarArr[i35] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar2, zzagkVar, bArr, zzaglVarArr, zzagn.zza(iZzb9 - 1));
                                break;
                            }
                            int iZzb10 = zzagjVar.zzb(i18);
                            if (iZzb10 == 0) {
                                i11 = iZzb3;
                                int i36 = 8;
                                zzagjVar.zzc(8);
                                zzagjVar.zzc(16);
                                zzagjVar.zzc(16);
                                zzagjVar.zzc(6);
                                zzagjVar.zzc(8);
                                int iZzb11 = zzagjVar.zzb(4) + 1;
                                int i37 = 0;
                                while (i37 < iZzb11) {
                                    zzagjVar.zzc(i36);
                                    i37++;
                                    i36 = 8;
                                }
                            } else {
                                if (iZzb10 != i21) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb3.append("floor type greater than 1 not decodable: ");
                                    sb3.append(iZzb10);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                int iZzb12 = zzagjVar.zzb(i15);
                                int[] iArr2 = new int[iZzb12];
                                int i38 = -1;
                                for (int i39 = 0; i39 < iZzb12; i39++) {
                                    int iZzb13 = zzagjVar.zzb(4);
                                    iArr2[i39] = iZzb13;
                                    if (iZzb13 > i38) {
                                        i38 = iZzb13;
                                    }
                                }
                                int i40 = i38 + 1;
                                int[] iArr3 = new int[i40];
                                int i41 = 0;
                                while (i41 < i40) {
                                    iArr3[i41] = zzagjVar.zzb(i23) + 1;
                                    int iZzb14 = zzagjVar.zzb(i17);
                                    if (iZzb14 > 0) {
                                        i12 = 8;
                                        zzagjVar.zzc(8);
                                    } else {
                                        i12 = 8;
                                    }
                                    int i42 = iZzb3;
                                    int i43 = 0;
                                    for (int i44 = 1; i43 < (i44 << iZzb14); i44 = 1) {
                                        zzagjVar.zzc(i12);
                                        i43++;
                                        i12 = 8;
                                    }
                                    i41++;
                                    iZzb3 = i42;
                                    i17 = 2;
                                    i23 = 3;
                                }
                                i11 = iZzb3;
                                zzagjVar.zzc(i17);
                                int iZzb15 = zzagjVar.zzb(4);
                                int i45 = 0;
                                int i46 = 0;
                                for (int i47 = 0; i47 < iZzb12; i47++) {
                                    i45 += iArr3[iArr2[i47]];
                                    while (i46 < i45) {
                                        zzagjVar.zzc(iZzb15);
                                        i46++;
                                    }
                                }
                            }
                            i22++;
                            iZzb3 = i11;
                            i19 = 6;
                            i18 = 16;
                            i17 = 2;
                            i21 = 1;
                            i15 = 5;
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int iZzd = zzagjVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzagjVar.zzb(16);
                        int iZzb17 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagjVar.zzb(zzagn.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagjVar.zza();
                            for (int i48 = 0; i48 < iZzb17; i48++) {
                                if (!zZza) {
                                    zzagjVar.zzc(5);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzagjVar.zzb(i13);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzagmVar = zzagmVar;
                            }
                            i16++;
                            zzagmVar = zzagmVar;
                            i13 = 4;
                        } else {
                            i17 = iZzb19;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int iZzb20 = zzagjVar.zzb(i13) + 1;
                        zzagjVar.zzc(1);
                        zzagjVar.zzc((int) ((i17 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i16++;
                        zzagmVar = zzagmVar;
                        i13 = 4;
                    }
                }
            }
            this.zza = zzaluVar;
            if (zzaluVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzagm zzagmVar3 = zzaluVar.zza;
            arrayList.add(zzagmVar3.zzg);
            arrayList.add(zzaluVar.zzc);
            zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/vorbis");
            zztVar.zzh(zzagmVar3.zzd);
            zztVar.zzi(zzagmVar3.zzc);
            zztVar.zzE(zzagmVar3.zza);
            zztVar.zzF(zzagmVar3.zzb);
            zztVar.zzp(arrayList);
            zztVar.zzk(zzapVarZzc);
            zzalrVar.zza = zztVar.zzM();
            return true;
        }
        zzagn.zzd(1, zzerVar, false);
        int iZzI = zzerVar.zzI();
        int iZzs2 = zzerVar.zzs();
        int iZzI2 = zzerVar.zzI();
        int iZzC = zzerVar.zzC();
        int i49 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzerVar.zzC();
        int i50 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzerVar.zzC();
        int i51 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzerVar.zzs();
        this.zzd = new zzagm(iZzI, iZzs2, iZzI2, i49, i50, i51, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzagm zzagmVar4 = zzaluVar.zza;
        arrayList2.add(zzagmVar4.zzg);
        arrayList2.add(zzaluVar.zzc);
        zzap zzapVarZzc2 = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzl("audio/ogg");
        zztVar2.zzm("audio/vorbis");
        zztVar2.zzh(zzagmVar4.zzd);
        zztVar2.zzi(zzagmVar4.zzc);
        zztVar2.zzE(zzagmVar4.zza);
        zztVar2.zzF(zzagmVar4.zzb);
        zztVar2.zzp(arrayList2);
        zztVar2.zzk(zzapVarZzc2);
        zzalrVar.zza = zztVar2.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        int i10;
        int i11 = 0;
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        if (!zzaluVar.zzd[(b10 >> 1) & (255 >>> (8 - zzaluVar.zze))].zza) {
            i10 = zzaluVar.zza.zze;
        } else {
            i10 = zzaluVar.zza.zzf;
        }
        if (this.zzc) {
            i11 = (this.zzb + i10) / 4;
        }
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zzj(long j10) {
        boolean z10;
        super.zzj(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        zzagm zzagmVar = this.zzd;
        if (zzagmVar != null) {
            i10 = zzagmVar.zze;
        }
        this.zzb = i10;
    }
}
