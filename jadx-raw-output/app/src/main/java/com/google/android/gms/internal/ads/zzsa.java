package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsa extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ zzsc zza;

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzrz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zzb();
            }
        });
        zzedVarZzs.zze();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzrx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zzc();
            }
        });
        zzedVarZzs.zze();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzry
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zzb();
            }
        });
        zzedVarZzs.zze();
    }

    public zzsa(zzsc zzscVar) {
        Objects.requireNonNull(zzscVar);
        this.zza = zzscVar;
    }
}
