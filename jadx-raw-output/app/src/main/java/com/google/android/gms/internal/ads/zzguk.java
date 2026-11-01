package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzguk extends zzgwt {
    public final Iterator zza;
    public Iterator zzb;
    public final /* synthetic */ zzgun zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgub) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }

    public zzguk(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzc = zzgunVar;
        this.zza = ((zzguf) zzgunVar.map.values()).listIterator(0);
        this.zzb = zzguv.zza;
    }
}
