package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbxh extends zzbmf {
    private final NativeAd.OnNativeAdLoadedListener zza;

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zze(zzbmm zzbmmVar) {
        this.zza.onNativeAdLoaded(new zzbxc(zzbmmVar));
    }

    public zzbxh(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }
}
