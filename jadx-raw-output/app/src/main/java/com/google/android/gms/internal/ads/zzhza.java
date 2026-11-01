package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhza implements Iterator {
    public zzhzb zza;
    public zzhzb zzb;
    public int zzc;
    public final /* synthetic */ zzhzc zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzhzb zzhzbVar = this.zzb;
        if (zzhzbVar == null) {
            throw new IllegalStateException();
        }
        zzhzc zzhzcVar = this.zzd;
        zzhzcVar.zzd(zzhzbVar, true);
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }

    public final zzhzb zza() {
        zzhzc zzhzcVar = this.zzd;
        zzhzb zzhzbVar = this.zza;
        if (zzhzbVar == zzhzcVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzhzcVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzhzbVar.zzd;
        this.zzb = zzhzbVar;
        return zzhzbVar;
    }

    public zzhza(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zzd = zzhzcVar;
        this.zza = zzhzcVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }
}
