package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsz implements zzrg {
    public final /* synthetic */ zzta zza;

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }

    public /* synthetic */ zzsz(zzta zztaVar, byte[] bArr) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }
}
