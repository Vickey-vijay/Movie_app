package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zzafa {
    zzaeu[] zza();

    default zzaeu[] zzb(Uri uri, Map map) {
        return zza();
    }
}
