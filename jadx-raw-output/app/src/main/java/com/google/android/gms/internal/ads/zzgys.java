package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgys extends zzgyr {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgyu.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgyu.class, "remainingField");

    private zzgys() {
        throw null;
    }

    public /* synthetic */ zzgys(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        androidx.concurrent.futures.a.a(zza, zzgyuVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final int zzb(zzgyu zzgyuVar) {
        return zzb.decrementAndGet(zzgyuVar);
    }
}
