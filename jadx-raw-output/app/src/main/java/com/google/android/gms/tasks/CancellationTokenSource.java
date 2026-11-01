package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenSource {
    private final zzb zza = new zzb();

    @NonNull
    public CancellationToken getToken() {
        return this.zza;
    }

    public void cancel() {
        this.zza.zza();
    }
}
