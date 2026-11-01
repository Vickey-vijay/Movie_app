package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzguj extends zzgwt {
    public final Iterator zza;
    public Object zzb;
    public Iterator zzc;
    public final /* synthetic */ zzgun zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgub) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }

    public zzguj(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzd = zzgunVar;
        this.zza = zzgunVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzguv.zza;
    }
}
