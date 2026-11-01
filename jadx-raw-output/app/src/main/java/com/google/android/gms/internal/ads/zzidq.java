package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidq extends zziag {
    public final zzids zza;
    public zziai zzb;
    public final /* synthetic */ zzidt zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    private final zziai zzb() {
        zzids zzidsVar = this.zza;
        if (zzidsVar.hasNext()) {
            return zzidsVar.next().iterator();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        zziai zziaiVar = this.zzb;
        if (zziaiVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zziaiVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }

    public zzidq(zzidt zzidtVar) {
        Objects.requireNonNull(zzidtVar);
        this.zzc = zzidtVar;
        this.zza = new zzids(zzidtVar, null);
        this.zzb = zzb();
    }
}
