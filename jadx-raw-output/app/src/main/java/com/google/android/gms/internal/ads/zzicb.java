package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzf(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }
}
