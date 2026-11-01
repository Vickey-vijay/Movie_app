package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
final class zzru {
    private final AudioTrack zza;
    private final Handler zzb;

    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc;
    private final zzsh zzd;

    public final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        zzsi zzsiVar = this.zzd.zza;
        if (zzsiVar.zzi() != null) {
            zzsiVar.zzi().zzc(audioDeviceInfo);
        }
    }

    public final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }

    public /* synthetic */ zzru(AudioTrack audioTrack, zzsh zzshVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zzshVar;
        Handler handlerZzc = zzfj.zzc(null);
        this.zzb = handlerZzc;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrt
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzc = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerZzc);
    }

    public final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }
}
