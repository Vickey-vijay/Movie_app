package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhik extends zzhij {
    private final long[] zzd;

    public zzhik() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhik(zzhin zzhinVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhim zzhimVar = zzhinVar.zza;
        zzhiv.zza(jArr2, zzhimVar.zzb, zzhimVar.zza);
        long[] jArr3 = this.zzb;
        zzhim zzhimVar2 = zzhinVar.zza;
        zzhiv.zzb(jArr3, zzhimVar2.zzb, zzhimVar2.zza);
        System.arraycopy(zzhinVar.zza.zzc, 0, jArr, 0, 10);
        zzhiv.zze(this.zzc, zzhinVar.zzb, zzhiq.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhij
    public final void zza(long[] jArr, long[] jArr2) {
        zzhiv.zze(jArr, jArr2, this.zzd);
    }
}
