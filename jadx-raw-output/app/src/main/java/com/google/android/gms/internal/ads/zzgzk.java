package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzgzk extends zzgzi implements q5.i {
    @Override // com.google.android.gms.internal.ads.zzgzi
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract q5.i zzc();

    @Override // q5.i
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }
}
