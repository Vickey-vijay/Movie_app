package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface zzabl extends Executor {
    static zzabl zzb(Executor executor, zzdr zzdrVar) {
        return new zzabk(executor, zzdrVar);
    }

    void zza();
}
