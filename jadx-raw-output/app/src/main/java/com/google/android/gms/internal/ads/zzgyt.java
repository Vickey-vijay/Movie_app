package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    public /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            if (zzgyuVar.seenExceptionsField == null) {
                zzgyuVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final int zzb(zzgyu zzgyuVar) {
        int i10;
        synchronized (zzgyuVar) {
            i10 = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i10;
        }
        return i10;
    }
}
