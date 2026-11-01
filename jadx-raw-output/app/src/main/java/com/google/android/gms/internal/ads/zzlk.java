package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzlk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public /* synthetic */ zzlk(zzll zzllVar, byte[] bArr) {
        this.zza = zzllVar.zza;
        this.zzb = zzllVar.zzb;
        this.zzc = zzllVar.zzc;
    }

    public final zzlk zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzlk zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzgrc.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzll zzd() {
        return new zzll(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public final zzlk zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzgrc.zza(z10);
        this.zzc = j10;
        return this;
    }
}
