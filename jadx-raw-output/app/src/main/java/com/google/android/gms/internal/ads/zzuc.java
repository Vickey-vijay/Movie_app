package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzuc implements zzui {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzuc() {
        this.zza = null;
    }

    public zzuc(Context context, @Nullable zzgru zzgruVar, @Nullable zzgru zzgruVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzuk zzb(zzuh zzuhVar) throws Throwable {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.zza) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzf = zzas.zzf(zzuhVar.zzc.zzo);
            zzee.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzP(iZzf)));
            return new zztu(iZzf).zza(zzuhVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzun zzunVar = zzuhVar.zza;
            String str = zzunVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzuhVar.zzd;
                int i11 = 0;
                if (surface == null && zzunVar.zzh && i10 >= 35) {
                    i11 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzuhVar.zzb, surface, (MediaCrypto) null, i11);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzvh(mediaCodecCreateByCodecName, zzuhVar.zzf, null);
            } catch (IOException | RuntimeException e10) {
                e = e10;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (RuntimeException e12) {
            e = e12;
        }
    }
}
