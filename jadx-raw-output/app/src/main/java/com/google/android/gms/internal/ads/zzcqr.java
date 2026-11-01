package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcqr implements zzcql {
    private final zzebf zza;

    public zzcqr(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        byte b10;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("flick")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            this.zza.zze(zzebb.SHAKE);
        } else if (b10 != 1) {
            this.zza.zze(zzebb.NONE);
        } else {
            this.zza.zze(zzebb.FLICK);
        }
    }
}
