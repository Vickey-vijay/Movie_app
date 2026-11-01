package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbea implements Runnable {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzbee zzb;

    public zzbea(zzbee zzbeeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbeeVar);
        this.zzb = zzbeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
