package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgtx extends zzgtu implements Queue {
    public abstract Queue zza();

    @Override // com.google.android.gms.internal.ads.zzgtu
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    @Override // java.util.Queue
    public final Object element() {
        return zza().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return zza().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zza().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zza().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zza().remove();
    }
}
