package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzatc implements zzast {
    public final /* synthetic */ Context zza;
    private File zzb = null;

    public zzatc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
