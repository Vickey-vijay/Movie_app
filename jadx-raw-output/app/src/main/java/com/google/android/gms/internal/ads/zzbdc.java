package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbdc extends BroadcastReceiver {
    public final /* synthetic */ zzbdg zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }

    public zzbdc(zzbdg zzbdgVar) {
        Objects.requireNonNull(zzbdgVar);
        this.zza = zzbdgVar;
    }
}
