package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzclr extends Thread {
    public final /* synthetic */ Runnable zza;
    public final /* synthetic */ zzcls zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzclr(zzcls zzclsVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzclsVar);
        this.zzb = zzclsVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
