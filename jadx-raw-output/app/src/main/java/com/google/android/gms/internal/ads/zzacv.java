package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import androidx.annotation.CallSuper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
abstract class zzacv implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    public final Choreographer zza;
    public final DisplayManager zzb;
    public volatile long zzc = -9223372036854775807L;
    public volatile long zzd = -9223372036854775807L;

    public /* synthetic */ zzacv(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @CallSuper
    void zzb() {
        throw null;
    }

    @CallSuper
    void zza() {
        this.zzb.registerDisplayListener(this, zzfj.zzc(null));
    }
}
