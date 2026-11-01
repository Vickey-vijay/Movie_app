package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwa extends zzguf {
    public static final zzguf zza = new zzgwa(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgrc.zzm(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, com.google.android.gms.internal.ads.zzgub
    public final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    public zzgwa(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }
}
