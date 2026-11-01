package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i10 = 0; i10 < zzgxxVar.zzc(); i10++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i10)));
        }
        String strZzx = zzfj.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(strZzx.length() + 37 + string.length() + 1);
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzx);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }

    public zzalg(int i10, @Nullable int[] iArr) {
        zzgxx zzgxxVarZza;
        this.zza = i10;
        if (iArr != null) {
            zzgxxVarZza = zzgxx.zzb(iArr);
        } else {
            zzgxxVarZza = zzgxx.zza();
        }
        this.zzb = zzgxxVarZza;
    }
}
