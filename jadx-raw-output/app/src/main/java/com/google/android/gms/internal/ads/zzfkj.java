package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public final synchronized void zza(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    @Nullable
    public final synchronized q5.i zzb() {
        zza(1);
        return (q5.i) this.zza.poll();
    }

    public final synchronized void zzc(q5.i iVar) {
        this.zza.addFirst(iVar);
    }

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }
}
