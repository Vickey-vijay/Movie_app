package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(24)
final class zzid {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public final /* synthetic */ void zza(int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i10, i11);
        this.zza.setPattern(pattern);
    }
}
