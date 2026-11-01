package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgqy {
    private final String zza;
    private final zzgqx zzb;
    private zzgqx zzc;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzgqx zzgqxVar = this.zzb.zzb;
        String str = "";
        while (zzgqxVar != null) {
            Object obj = zzgqxVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgqxVar = zzgqxVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzgqy zza(Object obj) {
        zzgqx zzgqxVar = new zzgqx();
        this.zzc.zzb = zzgqxVar;
        this.zzc = zzgqxVar;
        zzgqxVar.zza = obj;
        return this;
    }

    public /* synthetic */ zzgqy(String str, byte[] bArr) {
        zzgqx zzgqxVar = new zzgqx();
        this.zzb = zzgqxVar;
        this.zzc = zzgqxVar;
        str.getClass();
        this.zza = str;
    }
}
