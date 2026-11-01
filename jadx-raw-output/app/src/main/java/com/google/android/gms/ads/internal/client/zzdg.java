package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdg extends zzde {
    private final MuteThisAdListener zza;

    @Override // com.google.android.gms.ads.internal.client.zzdf
    public final void zze() {
        this.zza.onAdMuted();
    }

    public zzdg(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }
}
