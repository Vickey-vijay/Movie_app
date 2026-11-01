package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzace extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacd zzd;
    private boolean zze;

    public static zzace zzb(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zza(context)) {
            z11 = false;
        }
        zzgrc.zzi(z11);
        return new zzacd().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zza(Context context) {
        int i10;
        if (!zzc) {
            try {
                if (zzdv.zza(context)) {
                    i10 = zzdv.zzb() ? 1 : 2;
                } else {
                    i10 = 0;
                }
            } catch (zzdu e10) {
                zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            zzb = i10;
            zzc = true;
        }
        return zzb != 0;
    }

    public /* synthetic */ zzace(zzacd zzacdVar, SurfaceTexture surfaceTexture, boolean z10, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacdVar;
        this.zza = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacd zzacdVar = this.zzd;
        synchronized (zzacdVar) {
            if (!this.zze) {
                zzacdVar.zzb();
                this.zze = true;
            }
        }
    }
}
