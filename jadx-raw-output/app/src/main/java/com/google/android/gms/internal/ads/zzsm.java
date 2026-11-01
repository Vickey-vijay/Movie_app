package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsm {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public zzsm(@Nullable Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i10;
        boolean zBooleanValue;
        boolean z10;
        zzvVar.getClass();
        zzdVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (i10 = zzvVar.zzH) != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            boolean z11 = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zzb = Boolean.valueOf(z10);
                } else {
                    this.zzb = Boolean.FALSE;
                }
                zBooleanValue = this.zzb.booleanValue();
            }
            String str = zzvVar.zzo;
            str.getClass();
            int iZzg = zzas.zzg(str, zzvVar.zzk);
            if (iZzg != 0 && i11 >= zzfj.zzC(iZzg)) {
                int iZzB = zzfj.zzB(zzvVar.zzG);
                if (iZzB != 0) {
                    try {
                        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(iZzB).setEncoding(iZzg).build();
                        if (i11 >= 31) {
                            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
                            if (playbackOffloadSupport == 0) {
                                return zzpz.zza;
                            }
                            zzpy zzpyVar = new zzpy();
                            if (i11 > 32 && playbackOffloadSupport == 2) {
                                z11 = true;
                            }
                            zzpyVar.zza(true);
                            zzpyVar.zzb(z11);
                            zzpyVar.zzc(zBooleanValue);
                            return zzpyVar.zzd();
                        }
                        if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                            return zzpz.zza;
                        }
                        zzpy zzpyVar2 = new zzpy();
                        zzpyVar2.zza(true);
                        zzpyVar2.zzc(zBooleanValue);
                        return zzpyVar2.zzd();
                    } catch (IllegalArgumentException unused) {
                        return zzpz.zza;
                    }
                }
                return zzpz.zza;
            }
            return zzpz.zza;
        }
        return zzpz.zza;
    }
}
