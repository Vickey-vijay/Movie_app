package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbxi extends zzbmi {
    private final NativeAd.UnconfirmedClickListener zza;

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zze(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }

    public zzbxi(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }
}
