package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzzz extends zzzs {
    private final boolean zze;
    private final zzzl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zzs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgvz zzgvzVarZza = (zzzzVar.zze && zzzzVar.zzh) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZzg = zzgts.zzg();
        boolean z10 = zzzzVar.zzf.zzF;
        return zzgtsVarZzg.zza(Integer.valueOf(zzzzVar.zzk), Integer.valueOf(zzzzVar2.zzk), zzgvzVarZza).zza(Integer.valueOf(zzzzVar.zzj), Integer.valueOf(zzzzVar2.zzj), zzgvzVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        zzzz zzzzVar = (zzzz) zzzsVar;
        if (!Objects.equals(this.zzd.zzo, zzzzVar.zzd.zzo)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzzzVar.zzt && this.zzu == zzzzVar.zzu;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0064  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    public zzzz(int i10, zzbg zzbgVar, int i11, zzzl zzzlVar, int i12, @Nullable String str, int i13, boolean z10) {
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        int iZzj;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        byte b10;
        boolean z18;
        zzv zzvVar;
        int i16;
        int i17;
        int i18;
        zzv zzvVar2;
        int i19;
        int i20;
        int i21;
        super(i10, zzbgVar, i11);
        this.zzf = zzzlVar;
        int i22 = 1;
        if (true != zzzlVar.zzM) {
            i14 = 16;
        } else {
            i14 = 24;
        }
        if (z10 && (((i19 = (zzvVar2 = this.zzd).zzv) == -1 || i19 <= zzzlVar.zza) && ((i20 = zzvVar2.zzw) == -1 || i20 <= zzzlVar.zzb))) {
            float f10 = zzvVar2.zzz;
            if ((f10 == -1.0f || f10 <= zzzlVar.zzc) && ((i21 = zzvVar2.zzj) == -1 || i21 <= zzzlVar.zzd)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.zze = z11;
        if (z10 && (((i16 = (zzvVar = this.zzd).zzv) == -1 || i16 >= 0) && ((i17 = zzvVar.zzw) == -1 || i17 >= 0))) {
            float f11 = zzvVar.zzz;
            if ((f11 == -1.0f || f11 >= 0.0f) && ((i18 = zzvVar.zzj) == -1 || i18 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        this.zzg = z12;
        this.zzh = zzmn.zzaa(i12, false);
        zzv zzvVar3 = this.zzd;
        float f12 = zzvVar3.zzz;
        if (f12 != -1.0f && f12 >= 10.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.zzi = z13;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i23 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i23 < zzzlVar.zzo.size()) {
                iZzj = zzaaa.zzj(this.zzd, (String) zzzlVar.zzo.get(i23), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i23++;
                }
            } else {
                iZzj = 0;
                i23 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzm = i23;
        this.zzn = iZzj;
        this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
        int i24 = this.zzd.zzf;
        if (i24 != 0 && (i24 & 1) == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.zzq = z14;
        if (zzaaa.zzi(str) == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.zzr = zzaaa.zzj(this.zzd, str, z15);
        for (int i25 = 0; i25 < zzzlVar.zzm.size(); i25++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzzlVar.zzm.get(i25))) {
                i15 = i25;
                break;
            }
        }
        this.zzl = i15;
        this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
        if ((i12 & 384) == 128) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.zzt = z16;
        if ((i12 & 64) == 64) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.zzu = z17;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzo;
        int i26 = 4;
        if (str3 == null) {
            i26 = 0;
        } else {
            switch (str3) {
                case "video/dolby-vision":
                    b10 = 0;
                    break;
                case "video/av01":
                    b10 = 1;
                    break;
                case "video/hevc":
                    b10 = 2;
                    break;
                case "video/avc":
                    b10 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 != 4) {
                                i26 = 0;
                            } else {
                                i26 = 1;
                            }
                        } else {
                            i26 = 2;
                        }
                    } else {
                        i26 = 3;
                    }
                }
            } else {
                i26 = 5;
            }
        }
        this.zzv = i26;
        if ((zzvVar4.zzf & 16384) != 0) {
            i22 = 0;
        } else {
            zzzl zzzlVar2 = this.zzf;
            if (!zzmn.zzaa(i12, zzzlVar2.zzV) || (!(z18 = this.zze) && !zzzlVar2.zzK)) {
                i22 = 0;
            } else if (zzmn.zzaa(i12, false) && this.zzg && z18 && zzvVar4.zzj != -1 && (i14 & i12) != 0) {
                i22 = 2;
            }
        }
        this.zzs = i22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgts zzgtsVarZza = zzgts.zzg().zzd(zzzzVar.zzh, zzzzVar2.zzh).zza(Integer.valueOf(zzzzVar.zzm), Integer.valueOf(zzzzVar2.zzm), zzgvz.zzb().zza()).zzb(zzzzVar.zzn, zzzzVar2.zzn).zzb(zzzzVar.zzo, zzzzVar2.zzo).zza(Integer.valueOf(zzzzVar.zzp), Integer.valueOf(zzzzVar2.zzp), zzgvz.zzb().zza()).zzd(zzzzVar.zzq, zzzzVar2.zzq).zzb(zzzzVar.zzr, zzzzVar2.zzr).zzd(zzzzVar.zzi, zzzzVar2.zzi).zzd(zzzzVar.zze, zzzzVar2.zze).zzd(zzzzVar.zzg, zzzzVar2.zzg).zza(Integer.valueOf(zzzzVar.zzl), Integer.valueOf(zzzzVar2.zzl), zzgvz.zzb().zza());
        boolean z10 = zzzzVar.zzt;
        zzgts zzgtsVarZzd = zzgtsVarZza.zzd(z10, zzzzVar2.zzt);
        boolean z11 = zzzzVar.zzu;
        zzgts zzgtsVarZzd2 = zzgtsVarZzd.zzd(z11, zzzzVar2.zzu);
        if (z10 && z11) {
            zzgtsVarZzd2 = zzgtsVarZzd2.zzb(zzzzVar.zzv, zzzzVar2.zzv);
        }
        return zzgtsVarZzd2.zze();
    }
}
