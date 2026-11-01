package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrv implements Serializable, zzgru {
    public final zzgru zza;
    public volatile transient boolean zzb;
    public transient Object zzc;
    private final transient zzgsb zzd = new zzgsb();

    public final String toString() {
        Object string;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.zza;
        }
        String string2 = string.toString();
        StringBuilder sb3 = new StringBuilder(string2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object objZza = this.zza.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }

    public zzgrv(zzgru zzgruVar) {
        this.zza = zzgruVar;
    }
}
