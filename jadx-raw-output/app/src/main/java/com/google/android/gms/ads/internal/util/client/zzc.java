package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzc extends Thread {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public zzc(zzf zzfVar, Context context, String str) {
        this.zza = context;
        this.zzb = str;
        Objects.requireNonNull(zzfVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.zza, null).zzc(this.zzb, null);
    }
}
