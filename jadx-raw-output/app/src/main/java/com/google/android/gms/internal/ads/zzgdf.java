package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgdf {
    private final zzika zza;
    private final zzika zzb;
    private final ExecutorService zzc;
    private final zzika zzd;
    private q5.i zze = null;

    public zzgdf(zzika zzikaVar, zzika zzikaVar2, ExecutorService executorService, zzika zzikaVar3) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = executorService;
        this.zzd = zzikaVar3;
    }

    public final synchronized q5.i zza() {
        q5.i iVar = this.zze;
        if (iVar != null) {
            return iVar;
        }
        Set set = (Set) this.zzb.zzb();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzgdd) it.next()).zza());
        }
        zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
        q5.i iVarZzk = zzgzo.zzk(zzgzo.zzm(arrayList), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgde
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        }, this.zzc);
        zzgoeVar.zze(2, iVarZzk);
        this.zze = iVarZzk;
        Iterator it2 = ((Set) this.zza.zzb()).iterator();
        while (it2.hasNext()) {
            ((zzgdd) it2.next()).zza();
        }
        q5.i iVar2 = this.zze;
        iVar2.getClass();
        return iVar2;
    }

    public final synchronized q5.i zzb() {
        q5.i iVar;
        iVar = this.zze;
        iVar.getClass();
        return iVar;
    }
}
