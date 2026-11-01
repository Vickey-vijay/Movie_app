package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzyx extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzzl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyx zzyxVar) {
        boolean z10 = this.zzf;
        zzgvz zzgvzVarZza = (z10 && this.zzi) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzi, zzyxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyxVar.zzk), zzgvz.zzb().zza()).zzb(this.zzj, zzyxVar.zzj).zzb(this.zzl, zzyxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyxVar.zzm), zzgvz.zzb().zza()).zzd(this.zzq, zzyxVar.zzq).zzd(this.zzn, zzyxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyxVar.zzo), zzgvz.zzb().zza()).zzb(this.zzp, zzyxVar.zzp).zzd(z10, zzyxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyxVar.zzu), zzgvz.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgts zzgtsVarZza2 = zzgtsVarZza.zzd(this.zzv, zzyxVar.zzv).zzd(this.zzw, zzyxVar.zzw).zzd(this.zzx, zzyxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyxVar.zzr), zzgvzVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyxVar.zzs), zzgvzVarZza);
        if (Objects.equals(this.zzg, zzyxVar.zzg)) {
            zzgtsVarZza2 = zzgtsVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyxVar.zzt), zzgvzVarZza);
        }
        return zzgtsVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        String str;
        int i10;
        zzyx zzyxVar = (zzyx) zzzsVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzG;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyxVar.zzd;
        return i11 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i10 = zzvVar.zzH) != -1 && i10 == zzvVar2.zzH && this.zzv == zzyxVar.zzv && this.zzw == zzyxVar.zzw;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    public zzyx(int i10, zzbg zzbgVar, int i11, zzzl zzzlVar, int i12, boolean z10, zzgrd zzgrdVar, int i13) {
        int i14;
        int i15;
        int iZzj;
        boolean z11;
        boolean z12;
        byte b10;
        boolean z13;
        boolean z14;
        int iZzj2;
        boolean z15;
        boolean z16;
        boolean z17;
        super(i10, zzbgVar, i11);
        this.zzh = zzzlVar;
        int i16 = 1;
        if (true != zzzlVar.zzT) {
            i14 = 16;
        } else {
            i14 = 24;
        }
        this.zzg = zzaaa.zzi(this.zzd.zzd);
        this.zzi = zzmn.zzaa(i12, false);
        int i17 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i17 < zzzlVar.zzq.size()) {
                iZzj = zzaaa.zzj(this.zzd, (String) zzzlVar.zzq.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzk = i17;
        this.zzj = iZzj;
        this.zzl = zzaaa.zzm(this.zzd.zzf, 0);
        this.zzm = zzaaa.zzn(this.zzd, zzzlVar.zzr);
        zzv zzvVar = this.zzd;
        int i18 = zzvVar.zzf;
        if (i18 != 0 && (i18 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.zzn = z11;
        if (1 != (zzvVar.zze & 1)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.zzq = z12;
        String str = zzvVar.zzo;
        if (str == null) {
            z13 = false;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 != 0 && b10 != 1 && b10 != 2) {
                z13 = false;
            } else {
                z13 = true;
            }
        }
        this.zzx = z13;
        int i19 = zzvVar.zzG;
        this.zzr = i19;
        this.zzs = zzvVar.zzH;
        int i20 = zzvVar.zzj;
        this.zzt = i20;
        if ((i20 != -1 && i20 > zzzlVar.zzu) || ((i19 != -1 && i19 > zzzlVar.zzt) || !zzgrdVar.zza(zzvVar))) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.zzf = z14;
        String str2 = zzfj.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = zzfj.zzh(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 < strArrSplit.length) {
                iZzj2 = zzaaa.zzj(this.zzd, strArrSplit[i22], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i22++;
                }
            } else {
                iZzj2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzo = i22;
        this.zzp = iZzj2;
        for (int i23 = 0; i23 < zzzlVar.zzv.size(); i23++) {
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzzlVar.zzv.get(i23))) {
                i15 = i23;
                break;
            }
        }
        this.zzu = i15;
        if ((i12 & 384) == 128) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.zzv = z15;
        if ((i12 & 64) == 64) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.zzw = z16;
        zzzl zzzlVar2 = this.zzh;
        if (!zzmn.zzaa(i12, zzzlVar2.zzV) || (!(z17 = this.zzf) && !zzzlVar2.zzO)) {
            i16 = 0;
        } else {
            int i24 = zzzlVar2.zzw.zzb;
            if (zzmn.zzaa(i12, false) && z17 && this.zzd.zzj != -1 && ((zzzlVar2.zzX || !z10) && (i14 & i12) != 0)) {
                i16 = 2;
            }
        }
        this.zze = i16;
    }
}
