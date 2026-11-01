package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzenr {
    private final Clock zza;
    private final zzent zzb;
    private final zzfqk zzc;

    @GuardedBy("this")
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhL)).booleanValue();
    private final zzekl zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfir zzfirVar) {
        zzenq zzenqVar = (zzenq) this.zzd.get(zzfirVar);
        if (zzenqVar == null) {
            return false;
        }
        return zzenqVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfir zzfirVar = (zzfir) it.next();
            String str = zzfirVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfirVar, new zzenq(str, zzfirVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(@Nullable zzfir zzfirVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfirVar != null) {
            this.zzf.zzi(zzfirVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzf(zzfir zzfirVar) {
        zzenq zzenqVar = (zzenq) this.zzd.get(zzfirVar);
        if (zzenqVar == null || this.zzg) {
            return;
        }
        zzenqVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzenq zzenqVar = (zzenq) ((Map.Entry) it.next()).getValue();
            if (zzenqVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzenqVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    public final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    public final /* synthetic */ zzent zzk() {
        return this.zzb;
    }

    public final /* synthetic */ zzfqk zzl() {
        return this.zzc;
    }

    public final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    public final /* synthetic */ zzekl zzo() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzp() {
        return this.zzg;
    }

    public final synchronized q5.i zze(zzfjc zzfjcVar, zzfir zzfirVar, q5.i iVar, zzfqg zzfqgVar) {
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfirVar.zzw;
        if (str != null) {
            this.zzd.put(zzfirVar, new zzenq(str, zzfirVar.zzaf, 9, 0L, null));
            zzgzo.zzr(iVar, new zzenp(this, jElapsedRealtime, zzfiuVar, zzfirVar, str, zzfqgVar, zzfjcVar), zzcei.zzg);
        }
        return iVar;
    }

    public zzenr(Clock clock, zzent zzentVar, zzekl zzeklVar, zzfqk zzfqkVar) {
        this.zza = clock;
        this.zzb = zzentVar;
        this.zzf = zzeklVar;
        this.zzc = zzfqkVar;
    }
}
