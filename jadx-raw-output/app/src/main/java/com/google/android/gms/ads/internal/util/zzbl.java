package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcen;
import java.util.Map;
import q5.i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbl {
    private static zzasb zza;
    private static final Object zzb = new Object();

    public final i zza(String str) {
        zzcen zzcenVar = new zzcen();
        zza.zzb(new zzbk(str, null, zzcenVar));
        return zzcenVar;
    }

    public final i zzb(int i10, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i10, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzarg e10) {
                String message = e10.getMessage();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    public zzbl(Context context) {
        zzasb zzasbVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbhe.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfp)).booleanValue()) {
                        zzasbVarZza = zzay.zzb(context);
                    } else {
                        zzasbVarZza = zzatd.zza(context, null);
                    }
                } else {
                    zzasbVarZza = zzatd.zza(context, null);
                }
                zza = zzasbVarZza;
            }
        }
    }
}
