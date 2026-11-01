package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzijx extends AbstractList {
    private static final zzijy zzc = zzijy.zzb(zzijx.class);
    public final List zza;
    public final Iterator zzb;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzijw(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.zza;
        if (list.size() > i10) {
            return list.get(i10);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzijy zzijyVar = zzc;
        zzijyVar.zza("potentially expensive size() call");
        zzijyVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }

    public zzijx(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }
}
