package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrw implements zzsj {
    public final /* synthetic */ zzsd zza;

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zzb(final long j10) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzrv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zza(j10);
            }
        };
        zzed zzedVarZzs = this.zza.zzs();
        zzedVarZzs.zzd(-1, zzdyVar);
        zzedVarZzs.zze();
    }

    public /* synthetic */ zzrw(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zza(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzee.zzc("AudioTrackAudioOutput", sb2.toString());
    }
}
