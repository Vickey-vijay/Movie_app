package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbdt extends com.google.android.gms.ads.internal.client.zzcn {
    private final AppEventListener zza;

    public final AppEventListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public zzbdt(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }
}
