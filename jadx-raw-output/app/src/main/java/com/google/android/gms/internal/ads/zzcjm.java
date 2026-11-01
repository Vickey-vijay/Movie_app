package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcjm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzcce zza;
    public final /* synthetic */ zzcjw zzb;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public zzcjm(zzcjw zzcjwVar, zzcce zzcceVar) {
        this.zza = zzcceVar;
        Objects.requireNonNull(zzcjwVar);
        this.zzb = zzcjwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }
}
