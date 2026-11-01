package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcdl implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcen zzb;

    public zzcdl(zzcdm zzcdmVar, Context context, zzcen zzcenVar) {
        this.zza = context;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzcdmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e10);
        }
    }
}
