package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zztu implements zzui {
    private final zzgru zza;
    private final zzgru zzb;

    public zztu(final int i10) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i10, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final /* bridge */ /* synthetic */ zzuk zzb(zzuh zzuhVar) throws IOException {
        throw null;
    }

    public final zztv zza(zzuh zzuhVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zzun zzunVar = zzuhVar.zza;
        String str = zzunVar.zza;
        zztv zztvVar = null;
        try {
            StringBuilder sb2 = new StringBuilder(str.length() + 12);
            sb2.append("createCodec:");
            sb2.append(str);
            Trace.beginSection(sb2.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zztv zztvVar2 = new zztv(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzty(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzuhVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzuhVar.zzd;
                    int i10 = 0;
                    if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    }
                    zztvVar2.zzt(zzuhVar.zzb, surface, null, i10);
                    return zztvVar2;
                } catch (Exception e10) {
                    e = e10;
                    zztvVar = zztvVar2;
                    if (zztvVar != null) {
                        zztvVar.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }
}
