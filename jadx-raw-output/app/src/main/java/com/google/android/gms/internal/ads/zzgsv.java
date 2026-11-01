package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgsv extends zzgsy implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public Collection zza(Collection collection) {
        throw null;
    }

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public abstract Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public Set zzh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public Map zzl() {
        throw null;
    }

    public final /* synthetic */ Map zzo() {
        return this.zza;
    }

    final /* synthetic */ int zzp() {
        return this.zzb;
    }

    public final /* synthetic */ void zzq(int i10) {
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy, com.google.android.gms.internal.ads.zzgvn
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZzc = zzc();
        if (!collectionZzc.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, collectionZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final void zzf() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    public final List zzg(Object obj, List list, zzgss zzgssVar) {
        return list instanceof RandomAccess ? new zzgso(this, obj, list, zzgssVar) : new zzgsu(this, obj, list, zzgssVar);
    }

    public final Set zzi() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzgsn(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgsq(this, (SortedMap) map) : new zzgsl(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final Collection zzj() {
        return new zzgsx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final Iterator zzk() {
        return new zzgsf(this);
    }

    final Map zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzgsm(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgsp(this, (SortedMap) map) : new zzgsi(this, map);
    }

    public final /* synthetic */ void zzn(Object obj) {
        Object objRemove;
        try {
            objRemove = this.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    public zzgsv(Map map) {
        zzgrc.zza(map.isEmpty());
        this.zza = map;
    }
}
