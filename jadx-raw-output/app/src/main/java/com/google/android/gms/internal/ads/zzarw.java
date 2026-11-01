package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarw implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzary zzc;

    public zzarw(zzary zzaryVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzaryVar);
        this.zzc = zzaryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzary zzaryVar = this.zzc;
        zzaryVar.zzx().zza(this.zza, this.zzb);
        zzaryVar.zzx().zzb(zzaryVar.toString());
    }
}
