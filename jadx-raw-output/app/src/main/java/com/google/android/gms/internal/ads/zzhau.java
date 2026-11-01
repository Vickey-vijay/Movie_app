package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhau {
    private final OutputStream zza;

    private zzhau(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhau zzb(OutputStream outputStream) {
        return new zzhau(outputStream);
    }

    public final void zza(zzhql zzhqlVar) throws IOException {
        try {
            zzhqlVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
