package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzasq implements zzast {
    public final /* synthetic */ File zza;

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        return this.zza;
    }

    public zzasq(zzasu zzasuVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzasuVar);
    }
}
