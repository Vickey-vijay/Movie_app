package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Xi extends SuspendLambda implements bk.l {
    public Xi(rj.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Xi(cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Xi((rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        ck.p.i(Yi.f23857b, "access$getTAG$p(...)");
        C3030mb c3030mb = C3030mb.f24820a;
        if (C3030mb.d()) {
            LocationManager locationManager = C3030mb.f24821b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3030mb);
            }
            GoogleApiClient googleApiClient = C3030mb.f24823d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3030mb.f24823d = null;
        return mj.r.f64562a;
    }
}
