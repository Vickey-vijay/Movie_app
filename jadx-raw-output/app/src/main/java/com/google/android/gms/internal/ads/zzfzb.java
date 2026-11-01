package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import ck.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mj.r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfzb implements Serializer {
    public static final zzfzb zza = new zzfzb();
    private static final zzfyy zzb;

    private zzfzb() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    static {
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        p.i(zzfyyVarZzd, "getDefaultInstance(...)");
        zzb = zzfyyVarZzd;
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, rj.c cVar) throws IOException {
        ((zzfyy) obj).zzaO(outputStream);
        return r.f64562a;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, rj.c cVar) {
        try {
            zzfyy zzfyyVarZzc = zzfyy.zzc(inputStream);
            p.g(zzfyyVarZzc);
            return zzfyyVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }
}
