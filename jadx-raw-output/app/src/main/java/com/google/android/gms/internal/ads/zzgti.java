package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
abstract class zzgti implements Iterator {
    public int zzb;
    public int zzc;
    public int zzd;
    public final /* synthetic */ zzgtm zze;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public abstract Object zza(int i10);

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public /* synthetic */ zzgti(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zze = zzgtmVar;
        this.zzb = zzgtmVar.zzs();
        this.zzc = zzgtmVar.zzf();
        this.zzd = -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object objZza = zza(i10);
            this.zzc = this.zze.zzg(this.zzc);
            return objZza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        zzb();
        if (this.zzd >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zzj(z10, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzgtm zzgtmVar = this.zze;
        zzgtmVar.remove(zzgtmVar.zzo(i10));
        this.zzc--;
        this.zzd = -1;
    }
}
