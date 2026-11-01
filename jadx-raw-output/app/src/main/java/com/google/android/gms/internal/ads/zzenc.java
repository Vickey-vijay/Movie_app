package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzenc {

    @GuardedBy("this")
    private final zzhah zzc;

    @GuardedBy("this")
    private zzens zzf;
    private final String zzh;
    private final int zzi;
    private final zzenr zzj;
    private zzfir zzk;

    @GuardedBy("this")
    private final Map zza = new HashMap();

    @GuardedBy("this")
    private final List zzb = new ArrayList();

    @GuardedBy("this")
    private final List zzd = new ArrayList();

    @GuardedBy("this")
    private final Set zze = new HashSet();

    @GuardedBy("this")
    private int zzg = Integer.MAX_VALUE;

    @GuardedBy("this")
    private boolean zzl = false;

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfir) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z10) {
        for (zzfir zzfirVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfirVar);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z10 || !this.zze.contains(zzfirVar.zzat)) {
                if (numValueOf.intValue() < this.zzg) {
                    return true;
                }
                if (numValueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        boolean z10;
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfir) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzens zzensVar = this.zzf;
        if (zzensVar != null) {
            this.zzc.zza(zzensVar);
        } else {
            this.zzc.zzb(new zzenv(3, this.zzh));
        }
    }

    public final synchronized zzfir zza() {
        if (zze()) {
            int i10 = 0;
            while (true) {
                List list = this.zzb;
                if (i10 >= list.size()) {
                    break;
                }
                zzfir zzfirVar = (zzfir) list.get(i10);
                String str = zzfirVar.zzat;
                Set set = this.zze;
                if (!set.contains(str)) {
                    if (zzfirVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        set.add(str);
                    }
                    this.zzd.add(zzfirVar);
                    return (zzfir) list.remove(i10);
                }
                i10++;
            }
        }
        return null;
    }

    public final synchronized void zzb(zzens zzensVar, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        if (zzd()) {
            zzensVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfirVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.zzg) {
            this.zzj.zzf(zzfirVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = numValueOf.intValue();
        this.zzf = zzensVar;
        this.zzk = zzfirVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized void zzc(Throwable th2, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        this.zze.remove(zzfirVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    public zzenc(zzfjc zzfjcVar, zzenr zzenrVar, zzhah zzhahVar) {
        this.zzi = zzfjcVar.zzb.zzb.zzr;
        this.zzj = zzenrVar;
        this.zzc = zzhahVar;
        this.zzh = zzeny.zzb(zzfjcVar);
        List list = zzfjcVar.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzfir) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }
}
