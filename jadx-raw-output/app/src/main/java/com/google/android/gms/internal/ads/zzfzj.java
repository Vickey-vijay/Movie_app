package com.google.android.gms.internal.ads;

import ck.p;
import java.util.concurrent.ExecutorService;
import nk.l0;
import nk.l1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfzj {
    public static final zzfzh zza(final ExecutorService executorService) {
        p.j(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final /* synthetic */ l0 zza() {
                return kotlinx.coroutines.d.a(l1.c(executorService));
            }
        };
    }
}
