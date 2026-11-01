package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzdhd {
    public final Map zza = new HashMap();

    public final synchronized void zzp(zzdje zzdjeVar) {
        zzq(zzdjeVar.zza, zzdjeVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzdje) it.next());
        }
    }

    public final synchronized void zzs(final zzdhc zzdhcVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        zzdhcVar.zza(key);
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th2);
                    }
                }
            });
        }
    }

    public zzdhd(Set set) {
        zzr(set);
    }
}
