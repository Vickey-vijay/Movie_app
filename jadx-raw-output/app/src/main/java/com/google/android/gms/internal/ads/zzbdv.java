package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbdv {

    @VisibleForTesting
    public int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbduVar);
        }
    }

    public final boolean zzb(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbdu zzbduVar2 = (zzbdu) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbduVar.equals(zzbduVar2) && zzbduVar2.zzc().equals(zzbduVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbduVar.equals(zzbduVar2) && zzbduVar2.zzb().equals(zzbduVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzbdu zzbduVar) {
        synchronized (this.zzb) {
            List list = this.zzc;
            if (list.size() >= 10) {
                int size = list.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                sb2.append("Queue is full, current size = ");
                sb2.append(size);
                String string = sb2.toString();
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                list.remove(0);
            }
            int i11 = this.zza;
            this.zza = i11 + 1;
            zzbduVar.zzk(i11);
            zzbduVar.zzh();
            list.add(zzbduVar);
        }
    }
}
