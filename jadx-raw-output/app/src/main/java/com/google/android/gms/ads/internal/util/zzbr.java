package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbr {
    public final Map zza = new ConcurrentHashMap();

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zza.get(num);
    }

    public zzbr() {
        new AtomicInteger(0);
    }
}
