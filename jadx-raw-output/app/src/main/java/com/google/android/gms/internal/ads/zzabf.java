package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabf {
    public static final zzaaz zza = new zzaaz(2, -9223372036854775807L, null);
    public static final zzaaz zzb = new zzaaz(3, -9223372036854775807L, null);
    private final zzabl zzc = zzabl.zzb(zzfj.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), new zzdr() { // from class: com.google.android.gms.internal.ads.zzaay
        @Override // com.google.android.gms.internal.ads.zzdr
        public final /* synthetic */ void zza(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    });

    @Nullable
    private zzaba zzd;

    @Nullable
    private IOException zze;

    public static zzaaz zza(boolean z10, long j10) {
        return new zzaaz(z10 ? 1 : 0, j10, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final /* synthetic */ zzabl zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzaba zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzaba zzabaVar) {
        this.zzd = zzabaVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }

    public zzabf(String str) {
    }

    public final void zzf() {
        zzaba zzabaVar = this.zzd;
        zzabaVar.getClass();
        zzabaVar.zzc(false);
    }

    public final void zzg(@Nullable zzabc zzabcVar) {
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zzc(true);
        }
        zzabl zzablVar = this.zzc;
        zzablVar.execute(new zzabd(zzabcVar));
        zzablVar.zza();
    }

    public final void zzh(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zza(i10);
        }
    }

    public final long zzd(zzabb zzabbVar, zzaax zzaaxVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaba(this, looperMyLooper, zzabbVar, zzaaxVar, i10, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }
}
