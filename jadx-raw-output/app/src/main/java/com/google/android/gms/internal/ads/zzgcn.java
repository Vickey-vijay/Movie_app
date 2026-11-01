package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgcn implements zzgcl {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgcp zzgcpVar = new zzgcp(runnable, System.currentTimeMillis() + j10);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgcpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            if (queue.isEmpty()) {
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (zzgcp zzgcpVar = (zzgcp) queue.peek(); zzgcpVar != null && zzgcpVar.zzb <= jCurrentTimeMillis; zzgcpVar = (zzgcp) queue.peek()) {
                priorityQueue.add(zzgcpVar);
            }
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    this.zza.execute(((zzgcp) it.next()).zza);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public zzgcn(Executor executor, zzgao zzgaoVar) {
        this.zza = executor;
    }
}
