package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgsj implements Iterator {
    public final Iterator zza;
    public Collection zzb;
    public Iterator zzc;
    public final /* synthetic */ zzgsv zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzc.remove();
        Collection collection = this.zzb;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzgsv zzgsvVar = this.zzd;
        zzgsvVar.zzq(zzgsvVar.zzp() - 1);
    }

    public zzgsj(zzgsv zzgsvVar) {
        Objects.requireNonNull(zzgsvVar);
        this.zzd = zzgsvVar;
        this.zza = zzgsvVar.zzo().entrySet().iterator();
        this.zzb = null;
        this.zzc = zzguw.INSTANCE;
    }
}
