package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafo {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final zzgj zzo;

    private zzafo(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, @Nullable String str, @Nullable zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = i19;
        this.zzj = i20;
        this.zzk = i21;
        this.zzl = f10;
        this.zzm = i22;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafo zza(zzer zzerVar) throws zzat {
        return zzc(zzerVar, false, null);
    }

    public static zzafo zzb(zzer zzerVar, zzgj zzgjVar) throws zzat {
        return zzc(zzerVar, true, zzgjVar);
    }

    private static zzafo zzc(zzer zzerVar, boolean z10, @Nullable zzgj zzgjVar) throws zzat {
        boolean z11;
        int i10;
        zzgf zzgfVar;
        int i11 = 4;
        boolean z12 = true;
        try {
            if (z10) {
                zzerVar.zzk(4);
            } else {
                zzerVar.zzk(21);
            }
            int iZzs = zzerVar.zzs() & 3;
            int iZzs2 = zzerVar.zzs();
            int iZzg = zzerVar.zzg();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < iZzs2; i14++) {
                zzerVar.zzk(1);
                int iZzt = zzerVar.zzt();
                for (int i15 = 0; i15 < iZzt; i15++) {
                    int iZzt2 = zzerVar.zzt();
                    i13 += iZzt2 + 4;
                    zzerVar.zzk(iZzt2);
                }
            }
            zzerVar.zzh(iZzg);
            byte[] bArr = new byte[i13];
            zzgj zzgjVar2 = zzgjVar;
            int i16 = 0;
            float f10 = 1.0f;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            String strZzb = null;
            int i29 = 0;
            while (i29 < iZzs2) {
                int iZzs3 = zzerVar.zzs() & 63;
                int iZzt3 = zzerVar.zzt();
                int i30 = i12;
                zzgj zzgjVarZzf = zzgjVar2;
                while (i30 < iZzt3) {
                    try {
                        int iZzt4 = zzerVar.zzt();
                        int i31 = iZzs2;
                        System.arraycopy(zzgm.zza, i12, bArr, i16, i11);
                        int i32 = i16 + 4;
                        System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i32, iZzt4);
                        int i33 = 32;
                        if (iZzs3 == 32) {
                            if (i30 == 0) {
                                zzgjVarZzf = zzgm.zzf(bArr, i32, i32 + iZzt4);
                                i30 = i12;
                                iZzt3 = iZzt3;
                                iZzs3 = iZzs3;
                            }
                            i16 = i32 + iZzt4;
                            zzerVar.zzk(iZzt4);
                            i30++;
                            iZzs2 = i31;
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            i11 = 4;
                        } else {
                            i33 = iZzs3;
                        }
                        if (i33 != 33) {
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            if (i33 == 39 && i30 == 0) {
                                int i34 = i32 + 2;
                                int i35 = (i32 + iZzt4) - 1;
                                while (true) {
                                    byte b10 = bArr[i35];
                                    if (b10 != 0) {
                                        if (b10 != 0 && i35 > i34) {
                                            zzgn zzgnVar = new zzgn(bArr, i34, i35 + 1);
                                            while (true) {
                                                if (zzgnVar.zzd(16)) {
                                                    int iZzf = zzgnVar.zzf(8);
                                                    int i36 = 0;
                                                    while (iZzf == 255) {
                                                        i36 += 255;
                                                        iZzf = zzgnVar.zzf(8);
                                                    }
                                                    int i37 = i36 + iZzf;
                                                    int iZzf2 = zzgnVar.zzf(8);
                                                    int i38 = 0;
                                                    while (iZzf2 == 255) {
                                                        i38 += 255;
                                                        iZzf2 = zzgnVar.zzf(8);
                                                    }
                                                    int i39 = i38 + iZzf2;
                                                    if (i39 != 0 && zzgnVar.zzd(i39)) {
                                                        if (i37 == 176) {
                                                            int iZzg2 = zzgnVar.zzg();
                                                            boolean zZze = zzgnVar.zze();
                                                            int iZzg3 = zZze ? zzgnVar.zzg() : 0;
                                                            int iZzg4 = zzgnVar.zzg();
                                                            int i40 = 0;
                                                            int iZzg5 = -1;
                                                            int iZzg6 = -1;
                                                            int i41 = -1;
                                                            int iZzf3 = -1;
                                                            int i42 = -1;
                                                            int iZzf4 = -1;
                                                            while (true) {
                                                                if (i40 <= iZzg4) {
                                                                    iZzg5 = zzgnVar.zzg();
                                                                    iZzg6 = zzgnVar.zzg();
                                                                    i10 = i30;
                                                                    int iZzf5 = zzgnVar.zzf(6);
                                                                    if (iZzf5 != 63) {
                                                                        iZzf3 = zzgnVar.zzf(iZzf5 == 0 ? Math.max(0, iZzg2 - 30) : Math.max(0, (iZzf5 + iZzg2) - 31));
                                                                        if (zZze) {
                                                                            int iZzf6 = zzgnVar.zzf(6);
                                                                            if (iZzf6 != 63) {
                                                                                iZzf4 = zzgnVar.zzf(iZzf6 == 0 ? Math.max(0, iZzg3 - 30) : Math.max(0, (iZzf6 + iZzg3) - 31));
                                                                                i42 = iZzf6;
                                                                            }
                                                                        } else {
                                                                            zZze = zZze;
                                                                        }
                                                                        if (zzgnVar.zze()) {
                                                                            zzgnVar.zzb(10);
                                                                        }
                                                                        i40++;
                                                                        i41 = iZzf5;
                                                                        i30 = i10;
                                                                        zZze = zZze;
                                                                        i17 = i17;
                                                                    }
                                                                    zzgfVar = null;
                                                                } else {
                                                                    i10 = i30;
                                                                    i17 = i17;
                                                                    zzgfVar = new zzgf(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i41, iZzf3, i42, iZzf4);
                                                                }
                                                            }
                                                        } else {
                                                            zzgnVar.zzb(i39 * 8);
                                                            i30 = i30;
                                                            i17 = i17;
                                                        }
                                                    }
                                                    i17 = i17;
                                                    zzgfVar = null;
                                                }
                                            }
                                        }
                                        if (zzgfVar == null && zzgjVarZzf != null) {
                                            i12 = 0;
                                            if (zzgfVar.zza == ((zzfz) zzgjVarZzf.zza.get(0)).zzb) {
                                                i30 = i10;
                                                i17 = i17;
                                                i27 = 4;
                                            } else {
                                                i27 = 5;
                                            }
                                        }
                                        i30 = i10;
                                        i17 = i17;
                                    } else if (i35 > i34) {
                                        i35--;
                                    }
                                    i10 = i30;
                                    i17 = i17;
                                    zzgfVar = null;
                                    if (zzgfVar == null) {
                                    }
                                }
                            } else {
                                i10 = i30;
                                i17 = i17;
                            }
                            i12 = 0;
                            i30 = i10;
                            i17 = i17;
                        } else if (i30 == 0) {
                            zzgg zzggVarZzg = zzgm.zzg(bArr, i32, i32 + iZzt4, zzgjVarZzf);
                            int i43 = zzggVarZzg.zza + 1;
                            int i44 = zzggVarZzg.zze;
                            int i45 = zzggVarZzg.zzf;
                            int i46 = zzggVarZzg.zzg;
                            int i47 = zzggVarZzg.zzh;
                            i22 = zzggVarZzg.zzc + 8;
                            int i48 = zzggVarZzg.zzd + 8;
                            int i49 = zzggVarZzg.zzk;
                            int i50 = zzggVarZzg.zzl;
                            int i51 = zzggVarZzg.zzm;
                            float f11 = zzggVarZzg.zzi;
                            int i52 = zzggVarZzg.zzj;
                            zzgb zzgbVar = zzggVarZzg.zzb;
                            if (zzgbVar != null) {
                                strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                            }
                            i17 = i43;
                            i18 = i44;
                            i12 = 0;
                            i20 = i46;
                            i19 = i45;
                            i28 = i52;
                            f10 = f11;
                            i26 = i51;
                            i25 = i50;
                            i24 = i49;
                            i23 = i48;
                            i21 = i47;
                        } else {
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            i10 = i30;
                            i17 = i17;
                            i12 = 0;
                            i30 = i10;
                            i17 = i17;
                        }
                        i16 = i32 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i30++;
                        iZzs2 = i31;
                        iZzt3 = iZzt3;
                        iZzs3 = iZzs3;
                        i11 = 4;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        e = e10;
                        z11 = true;
                        throw zzat.zzb("Error parsing".concat(z11 != z10 ? "HEVC config" : "L-HEVC config"), e);
                    }
                }
                i29++;
                zzgjVar2 = zzgjVarZzf;
                i11 = 4;
                z12 = true;
            }
            return new zzafo(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzs + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, f10, i28, strZzb, zzgjVar2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            z11 = z12;
        }
    }
}
