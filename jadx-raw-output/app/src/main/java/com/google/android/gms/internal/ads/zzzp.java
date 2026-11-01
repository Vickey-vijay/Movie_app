package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(32)
final class zzzp {

    @Nullable
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private final Handler zzc;

    @Nullable
    private final Spatializer.OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        String str = zzvVar.zzo;
        int i10 = 24;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i10 = zzvVar.zzG;
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i10 = zzvVar.zzG;
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            int i11 = zzvVar.zzG;
            if (i11 != 18 && i11 != 21) {
                i10 = i11;
            }
        } else {
            i10 = zzvVar.zzG;
        }
        int iZzB = zzfj.zzB(i10);
        if (iZzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzB);
        int i12 = zzvVar.zzH;
        if (i12 != -1) {
            channelMask.setSampleRate(i12);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (onSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzzp(@Nullable Context context, zzaaa zzaaaVar, @Nullable Boolean bool) {
        AudioManager audioManagerZza;
        if (context == null) {
            audioManagerZza = null;
        } else {
            audioManagerZza = zzcj.zza(context);
        }
        if (audioManagerZza != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerZza.getSpatializer();
            this.zza = spatializer;
            this.zzb = spatializer.getImmersiveAudioLevel() != 0;
            zzzn zzznVar = new zzzn(this, zzaaaVar);
            this.zzd = zzznVar;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final Handler handler = new Handler(looperMyLooper);
            this.zzc = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.util.concurrent.Executor
                public final /* synthetic */ void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, zzznVar);
            return;
        }
        this.zza = null;
        this.zzb = false;
        this.zzc = null;
        this.zzd = null;
    }
}
