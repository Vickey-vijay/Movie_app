package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgse extends zzgsv implements zzgva {
    @Override // com.google.android.gms.internal.ads.zzgsv
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    public zzgse(Map map) {
        super(map);
    }
}
