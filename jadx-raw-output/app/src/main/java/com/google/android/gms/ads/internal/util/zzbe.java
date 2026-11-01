package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d10, double d11) {
        List list;
        int i10 = 0;
        while (true) {
            list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.zzc.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        list.add(i10, str);
        this.zzc.add(i10, Double.valueOf(d10));
        this.zzb.add(i10, Double.valueOf(d11));
        return this;
    }

    public final /* synthetic */ List zzc() {
        return this.zza;
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }

    public final /* synthetic */ List zze() {
        return this.zzc;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
