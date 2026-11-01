package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public interface zzgzy extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    q5.i submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    q5.i submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    q5.i submit(Callable callable);
}
