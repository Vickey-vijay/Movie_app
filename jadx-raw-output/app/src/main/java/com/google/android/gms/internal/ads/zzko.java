package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzko implements zzlr {
    private final Object zza;
    private zzbf zzb;

    public zzko(Object obj, zzwf zzwfVar) {
        this.zza = obj;
        this.zzb = zzwfVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
