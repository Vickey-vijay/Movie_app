package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhyy extends zzhza {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhyy(zzhyz zzhyzVar) {
        super(zzhyzVar.zza);
        Objects.requireNonNull(zzhyzVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
