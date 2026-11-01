package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgsr implements Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzgss zzc;

    public zzgsr(zzgss zzgssVar) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        Collection collection = zzgssVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgss zzgssVar = this.zzc;
        zzgsv zzgsvVar = zzgssVar.zze;
        zzgsvVar.zzq(zzgsvVar.zzp() - 1);
        zzgssVar.zzb();
    }

    final void zza() {
        zzgss zzgssVar = this.zzc;
        zzgssVar.zza();
        if (zzgssVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    public zzgsr(zzgss zzgssVar, Iterator it) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        this.zzb = zzgssVar.zzb;
        this.zza = it;
    }
}
