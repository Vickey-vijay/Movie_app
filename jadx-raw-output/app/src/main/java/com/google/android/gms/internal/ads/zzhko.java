package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhko implements Iterable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ List zzb;

    public zzhko(zzhkr zzhkrVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhkrVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhkq(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
