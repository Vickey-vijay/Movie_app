package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwd extends zzgup {
    private final transient zzgui zza;
    private final transient zzguf zzb;

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    public final zzguf zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    /* JADX INFO: renamed from: zza */
    public final zzgwt iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzg(Object[] objArr, int i10) {
        return this.zzb.zzg(objArr, i10);
    }

    public zzgwd(zzgui zzguiVar, zzguf zzgufVar) {
        this.zza = zzguiVar;
        this.zzb = zzgufVar;
    }
}
