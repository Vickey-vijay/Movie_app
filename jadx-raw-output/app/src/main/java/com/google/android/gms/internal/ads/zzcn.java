package com.google.android.gms.internal.ads;

import com.ironsource.Z7;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcn extends Exception {
    public zzcn(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb2.append(str);
        sb2.append(Z7.f27998r);
        sb2.append(strValueOf);
        super(sb2.toString());
    }
}
