package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhia implements zzhic {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Override // com.google.android.gms.internal.ads.zzhic
    public final boolean zza() {
        return this.zza.get();
    }

    public zzhia(boolean z10) {
    }
}
