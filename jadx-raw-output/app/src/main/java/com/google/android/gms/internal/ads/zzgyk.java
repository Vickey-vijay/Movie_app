package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (q5.i) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (q5.i) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Callable callable) {
        return (q5.i) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zza */
    public final q5.i submit(Runnable runnable) {
        return (q5.i) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzb */
    public final q5.i submit(Runnable runnable, Object obj) {
        return (q5.i) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    /* JADX INFO: renamed from: zzc */
    public final q5.i submit(Callable callable) {
        return (q5.i) super.submit(callable);
    }
}
