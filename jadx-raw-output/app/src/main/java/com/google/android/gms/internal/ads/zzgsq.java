package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgsq extends zzgsl implements SortedSet {
    public final /* synthetic */ zzgsv zzc;

    public SortedSet headSet(Object obj) {
        return new zzgsq(this.zzc, zza().headMap(obj));
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgsq(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgsq(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsq(zzgsv zzgsvVar, SortedMap sortedMap) {
        super(zzgsvVar, sortedMap);
        Objects.requireNonNull(zzgsvVar);
        this.zzc = zzgsvVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }
}
