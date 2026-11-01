package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqg zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqg zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqg zzd(int i10) {
        this.zzd = i10;
        return this;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
