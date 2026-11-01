package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwq extends zzgup {
    public final transient Object zza;

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgux(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    /* JADX INFO: renamed from: zza */
    public final zzgwt iterator() {
        return new zzgux(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append(C3426d4.j.f28586d);
        sb2.append(string);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    public final zzguf zze() {
        return zzguf.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzg(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    public zzgwq(Object obj) {
        obj.getClass();
        this.zza = obj;
    }
}
