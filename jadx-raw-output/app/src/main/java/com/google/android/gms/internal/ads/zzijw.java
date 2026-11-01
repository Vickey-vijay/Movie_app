package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzijw implements Iterator {
    public int zza = 0;
    public final /* synthetic */ zzijx zzb;

    public zzijw(zzijx zzijxVar) {
        this.zzb = zzijxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zzijx zzijxVar = this.zzb;
        return i10 < zzijxVar.zza.size() || zzijxVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zzijx zzijxVar = this.zzb;
        List list = zzijxVar.zza;
        if (i10 >= list.size()) {
            list.add(zzijxVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
