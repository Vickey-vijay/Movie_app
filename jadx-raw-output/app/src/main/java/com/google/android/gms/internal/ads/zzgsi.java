package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgsi extends zzgvl {
    public final transient Map zza;
    public final /* synthetic */ zzgsv zzb;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzgsv zzgsvVar = this.zzb;
        if (this.zza == zzgsvVar.zzo()) {
            zzgsvVar.zzf();
        } else {
            zzguy.zzb(new zzgsh(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzgvm.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgvl, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgsv zzgsvVar = this.zzb;
        Collection collectionZzc = zzgsvVar.zzc();
        collectionZzc.addAll(collection);
        zzgsvVar.zzq(zzgsvVar.zzp() - collection.size());
        collection.clear();
        return collectionZzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgvl
    public final Set zza() {
        return new zzgsg(this);
    }

    public zzgsi(zzgsv zzgsvVar, Map map) {
        Objects.requireNonNull(zzgsvVar);
        this.zzb = zzgsvVar;
        this.zza = map;
    }

    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}
