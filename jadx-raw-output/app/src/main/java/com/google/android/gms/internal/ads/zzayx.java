package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzayx implements zzfwx {
    public final /* synthetic */ zzfvc zza;

    public zzayx(zzayz zzayzVar, zzfvc zzfvcVar) {
        this.zza = zzfvcVar;
        Objects.requireNonNull(zzayzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
