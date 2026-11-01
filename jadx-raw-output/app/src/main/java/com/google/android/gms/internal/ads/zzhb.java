package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzhb extends zzj {
    long zzb(zzhf zzhfVar) throws IOException;

    @Nullable
    Uri zzc();

    void zzd() throws IOException;

    void zze(zzhz zzhzVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}
