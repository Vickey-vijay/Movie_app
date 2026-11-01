package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetm implements zzfax {
    private final Set zza;

    public zzetm(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgzo.zza(new zzetl(arrayList, null));
    }
}
