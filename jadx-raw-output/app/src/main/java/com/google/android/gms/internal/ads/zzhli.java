package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhli {
    private final Class zza;
    private final zzhye zzb;

    public /* synthetic */ zzhli(Class cls, zzhye zzhyeVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhyeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhli)) {
            return false;
        }
        zzhli zzhliVar = (zzhli) obj;
        return zzhliVar.zza.equals(this.zza) && zzhliVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhye zzhyeVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzhyeVar);
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb2.append(simpleName);
        sb2.append(", object identifier: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
