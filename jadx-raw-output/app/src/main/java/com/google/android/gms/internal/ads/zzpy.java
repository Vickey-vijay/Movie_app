package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzpy zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzpy zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }

    public final zzpz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
