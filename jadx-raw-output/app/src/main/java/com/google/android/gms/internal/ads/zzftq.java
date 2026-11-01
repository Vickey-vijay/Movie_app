package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzftq extends BroadcastReceiver {
    public final /* synthetic */ zzftr zza;

    public zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzftr zzftrVar = this.zza;
            zzftrVar.zzd(true, zzftrVar.zzf());
            zzftrVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzftr zzftrVar2 = this.zza;
            zzftrVar2.zzd(false, zzftrVar2.zzf());
            zzftrVar2.zze(false);
        }
    }
}
