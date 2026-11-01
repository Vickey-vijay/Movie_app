package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    public zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final q5.i zzh(zzgdu zzgduVar) {
        q5.i iVarZzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, iVarZzc);
        return iVarZzc;
    }

    private final q5.i zzi(byte[] bArr) {
        q5.i iVarZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, iVarZzc);
        return iVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzb() {
        q5.i iVarZzb = this.zza.zzb();
        this.zzd.zze(20302, iVarZzb);
        return iVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        q5.i iVarZzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, iVarZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(iVarZzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final q5.i zze() {
        q5.i iVarZzb = this.zzb.zzb();
        this.zzd.zze(20304, iVarZzb);
        return iVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    public final /* synthetic */ q5.i zzf(zzgdu zzgduVar, Void r10) {
        return zzh(zzgduVar);
    }

    public final /* synthetic */ q5.i zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
