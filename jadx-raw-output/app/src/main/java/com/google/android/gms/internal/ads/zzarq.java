package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzarq {
    private final String zza;
    private final String zzb;

    public zzarq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarq.class == obj.getClass()) {
            zzarq zzarqVar = (zzarq) obj;
            if (TextUtils.equals(this.zza, zzarqVar.zza) && TextUtils.equals(this.zzb, zzarqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb2.append("Header[name=");
        sb2.append(str);
        sb2.append(",value=");
        sb2.append(str2);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }
}
