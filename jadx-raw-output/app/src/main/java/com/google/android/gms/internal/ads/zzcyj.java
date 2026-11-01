package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcyj {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final void zza(String str) {
        synchronized (this.zza) {
            ConcurrentHashMap concurrentHashMap = this.zzb;
            Integer num = (Integer) concurrentHashMap.get(str);
            concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int zzb(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzc(String str) {
        Long l10 = (Long) this.zzd.get(str);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public final void zze(String str, String str2, long j10) {
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, Long.valueOf(j10 - l10.longValue()));
    }

    @VisibleForTesting
    public zzcyj() {
    }

    public final void zzd(String str, long j10) {
        this.zzc.put(str, Long.valueOf(j10));
    }
}
