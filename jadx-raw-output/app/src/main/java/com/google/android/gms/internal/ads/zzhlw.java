package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhlw extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhlv zzc;

    public /* synthetic */ zzhlw(int i10, int i11, zzhlv zzhlvVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhlvVar;
    }

    public static zzhlu zzb() {
        return new zzhlu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhlv.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhlv zzf() {
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlw)) {
            return false;
        }
        zzhlw zzhlwVar = (zzhlw) obj;
        return zzhlwVar.zza == this.zza && zzhlwVar.zze() == zze() && zzhlwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhlw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    public final int zze() {
        zzhlv zzhlvVar = this.zzc;
        if (zzhlvVar == zzhlv.zzd) {
            return this.zzb;
        }
        if (zzhlvVar == zzhlv.zza || zzhlvVar == zzhlv.zzb || zzhlvVar == zzhlv.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }
}
