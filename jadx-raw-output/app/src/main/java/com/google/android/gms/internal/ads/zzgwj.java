package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwj extends zzgsd {
    public final Iterator zza;
    public final /* synthetic */ Set zzb;
    public final /* synthetic */ Set zzc;

    public zzgwj(zzgwk zzgwkVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgwkVar);
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgsd
    public final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            set = this.zzc;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
