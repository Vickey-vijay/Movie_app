package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    public final synchronized void zza(long j10, int i10, long j11) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            if (i10 == 2) {
                zzdza zzdzaVar = new zzdza();
                zzdzaVar.zza(j10);
                zzdzaVar.zzb(1);
                zzdzf zzdzfVarZzc = zzdzaVar.zzc();
                Map map = this.zza;
                ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzdzfVarZzc);
                if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst();
                    if (arrayDeque2.isEmpty()) {
                        map.remove(zzdzfVarZzc);
                    }
                }
                i10 = 2;
            }
            zzdza zzdzaVar2 = new zzdza();
            zzdzaVar2.zza(j10);
            zzdzaVar2.zzb(i10);
            zzdzf zzdzfVarZzc2 = zzdzaVar2.zzc();
            int iZzb = zzdzfVarZzc2.zzb();
            if (iZzb != 0) {
                if (iZzb == 1) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziV)).intValue();
                } else if (iZzb != 2) {
                    iIntValue = iZzb != 3 ? 0 : ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziX)).intValue();
                } else {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziW)).intValue();
                }
            }
            if (iIntValue > 0) {
                Map map2 = this.zza;
                ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzdzfVarZzc2);
                if (arrayDeque3 == null) {
                    arrayDeque3 = new ArrayDeque();
                    map2.put(zzdzfVarZzc2, arrayDeque3);
                }
                arrayDeque3.addLast(Long.valueOf(j11));
                while (arrayDeque3.size() > iIntValue) {
                    arrayDeque3.removeFirst();
                }
                zzc();
                int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziY)).intValue();
                if (iIntValue2 <= 0) {
                    map2.clear();
                    return;
                }
                while (true) {
                    Iterator it = map2.values().iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((ArrayDeque) it.next()).size();
                    }
                    if (size <= iIntValue2) {
                        break;
                    }
                    if (!map2.isEmpty()) {
                        Long l11 = Long.MAX_VALUE;
                        Map.Entry entry = null;
                        for (Map.Entry entry2 : map2.entrySet()) {
                            ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque4.isEmpty() && (l10 = (Long) arrayDeque4.peekFirst()) != null && l10.longValue() < l11.longValue()) {
                                entry = entry2;
                                l11 = l10;
                            }
                        }
                        if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                            arrayDeque.removeFirst();
                            if (arrayDeque.isEmpty()) {
                                map2.remove(entry.getKey());
                            }
                        }
                    }
                }
            }
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    public final void zzc() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdzf zzdzfVar = (zzdzf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzdzfVar.zzb();
            if (iZzb != 0) {
                if (iZzb != 1) {
                    if (iZzb != 2) {
                        if (iZzb == 3) {
                            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziU)).longValue();
                        } else {
                            jLongValue = 0;
                        }
                    } else {
                        jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziT)).longValue();
                    }
                } else {
                    jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziS)).longValue();
                }
            } else {
                jLongValue = 0;
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
