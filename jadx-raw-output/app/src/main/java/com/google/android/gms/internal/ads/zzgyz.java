package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    public zzgyz(zzgub zzgubVar, boolean z10) {
        super(zzgubVar, z10, true);
        List listEmptyList = zzgubVar.isEmpty() ? Collections.emptyList() : zzgvf.zzb(zzgubVar.size());
        for (int i10 = 0; i10 < zzgubVar.size(); i10++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgyy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }
}
