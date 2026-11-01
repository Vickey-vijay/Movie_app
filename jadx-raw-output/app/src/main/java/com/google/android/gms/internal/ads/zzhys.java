package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhys {
    public abstract void zza(zzhzs zzhzsVar, Object obj) throws IOException;

    public final zzhys zzc() {
        return !(this instanceof zzhyr) ? new zzhyr(this, null) : this;
    }
}
