package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzeo extends BroadcastReceiver {
    public final /* synthetic */ zzep zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzd(context);
            }
        });
    }

    public /* synthetic */ zzeo(zzep zzepVar, byte[] bArr) {
        Objects.requireNonNull(zzepVar);
        this.zza = zzepVar;
    }
}
