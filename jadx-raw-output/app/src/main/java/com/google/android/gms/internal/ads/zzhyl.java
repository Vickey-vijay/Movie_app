package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzhyl {
    @Deprecated
    public zzhyl() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzhzs zzhzsVar = new zzhzs(zzhzg.zza(sb2));
            zzhzsVar.zza(zzhyq.LENIENT);
            zzhzo.zza.zza(zzhzsVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final zzhyn zze() {
        if (this instanceof zzhyn) {
            return (zzhyn) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzhyk zzf() {
        if (this instanceof zzhyk) {
            return (zzhyk) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzhyp zzg() {
        if (this instanceof zzhyp) {
            return (zzhyp) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
