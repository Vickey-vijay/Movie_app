package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzedl implements zzikg {
    private final zzikp zza;

    private zzedl(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzedl zza(zzikp zzikpVar) {
        return new zzedl(zzikpVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        zzfjk zzfjkVarZza = ((zzdaw) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzij)).booleanValue()) {
            String str = zzfjkVarZza.zzd.zzx;
            if (TextUtils.isEmpty(str)) {
                zzcVar = zzfjkVarZza.zzd.zzs;
                if (zzcVar != null) {
                    strValueOf = new JSONObject(zzcVar.zza).getString(CommonUrlParts.REQUEST_ID);
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                    }
                } else {
                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                try {
                    strValueOf = new JSONObject(str).getString(CommonUrlParts.REQUEST_ID);
                    if (TextUtils.isEmpty(strValueOf)) {
                        zzcVar = zzfjkVarZza.zzd.zzs;
                        if (zzcVar != null) {
                            try {
                                strValueOf = new JSONObject(zzcVar.zza).getString(CommonUrlParts.REQUEST_ID);
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
        }
        zziko.zzb(strValueOf);
        return strValueOf;
    }
}
