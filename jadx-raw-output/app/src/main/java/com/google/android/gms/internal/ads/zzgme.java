package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    public zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzb() {
        q5.i iVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, iVarZzd);
        return iVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzc(final zzgdu zzgduVar, final byte[] bArr, final byte[] bArr2) {
        q5.i iVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzgduVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, iVarZzd);
        return iVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final q5.i zzd(final zzgdu zzgduVar, final byte[] bArr) {
        q5.i iVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzgduVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, iVarZzd);
        return iVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final q5.i zze() {
        q5.i iVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, iVarZzd);
        return iVarZzd;
    }

    public final /* synthetic */ zzgdu zzf() {
        zzgdu zzgduVarZzc = this.zza.zzc(1);
        return zzgduVarZzc == null ? zzgdu.zzg() : zzgduVarZzc;
    }

    public final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
