package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zzaib implements zzao {
    public final String zza;
    public final String zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaib zzaibVar = (zzaib) obj;
            if (this.zza.equals(zzaibVar.zza) && this.zzb.equals(zzaibVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        switch (this.zza) {
            case "TITLE":
                zzamVar.zza(this.zzb);
                break;
            case "ARTIST":
                zzamVar.zzb(this.zzb);
                break;
            case "ALBUM":
                zzamVar.zzc(this.zzb);
                break;
            case "ALBUMARTIST":
                zzamVar.zzd(this.zzb);
                break;
            case "TRACKNUMBER":
                Integer numZzh = zzgxz.zzh(this.zzb, 10);
                if (numZzh != null) {
                    zzamVar.zzg(numZzh);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numZzh2 = zzgxz.zzh(this.zzb, 10);
                if (numZzh2 != null) {
                    zzamVar.zzh(numZzh2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numZzh3 = zzgxz.zzh(this.zzb, 10);
                if (numZzh3 != null) {
                    zzamVar.zzr(numZzh3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZzh4 = zzgxz.zzh(this.zzb, 10);
                if (numZzh4 != null) {
                    zzamVar.zzs(numZzh4);
                    break;
                }
                break;
            case "GENRE":
                zzamVar.zzt(this.zzb);
                break;
            case "DESCRIPTION":
                zzamVar.zze(this.zzb);
                break;
        }
    }

    public zzaib(String str, String str2) {
        this.zza = zzgql.zzb(str);
        this.zzb = str2;
    }
}
