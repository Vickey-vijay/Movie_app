package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzd implements View.OnClickListener {
    public final /* synthetic */ zzm zza;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }

    public zzd(zzm zzmVar) {
        Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }
}
