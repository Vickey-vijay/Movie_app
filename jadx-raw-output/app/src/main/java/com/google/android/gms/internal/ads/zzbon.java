package com.google.android.gms.internal.ads;

import android.content.Context;
import com.ironsource.C3426d4;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbon implements zzboh {
    private final Context zza;
    private final Map zzb;

    public zzbon(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        byte b10;
        zzccq zzccqVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (!zzccqVarZzD.zza(context)) {
            return;
        }
        String str = (String) map.get(C3426d4.i.f28547j0);
        String str2 = (String) map.get("eventId");
        int iHashCode = str.hashCode();
        if (iHashCode != 94399) {
            if (iHashCode != 94401) {
                if (iHashCode == 94407 && str.equals("_ai")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("_ac")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("_aa")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
    }
}
