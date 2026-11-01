package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrx implements zzgru {
    private static final zzgru zzb = new zzgru() { // from class: com.google.android.gms.internal.ads.zzgrw
        @Override // com.google.android.gms.internal.ads.zzgru
        public final /* synthetic */ Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzgsb zza = new zzgsb();
    private volatile zzgru zzc;
    private Object zzd;

    public final String toString() {
        Object string = this.zzc;
        if (string == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        zzgru zzgruVar = this.zzc;
        zzgru zzgruVar2 = zzb;
        if (zzgruVar != zzgruVar2) {
            synchronized (this.zza) {
                if (this.zzc != zzgruVar2) {
                    Object objZza = this.zzc.zza();
                    this.zzd = objZza;
                    this.zzc = zzgruVar2;
                    return objZza;
                }
            }
        }
        return this.zzd;
    }

    public zzgrx(zzgru zzgruVar) {
        this.zzc = zzgruVar;
    }
}
