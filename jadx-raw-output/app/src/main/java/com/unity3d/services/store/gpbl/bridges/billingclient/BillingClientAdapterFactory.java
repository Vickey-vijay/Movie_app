package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import ck.p;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: BillingClientAdapterFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i10) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            BillingClientBuilderBridge billingClientBuilderBridgeNewBuilder = BillingClientBridge.newBuilder(context);
            p.i(billingClientBuilderBridgeNewBuilder, "builder");
            objM3458constructorimpl = Result.m3458constructorimpl(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(billingClientBuilderBridgeNewBuilder, i10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (BillingClientAdapter) objM3458constructorimpl;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i10);
    }

    /* JADX INFO: renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m3195createV8AdapterIoAF18A(Context context) {
        try {
            Result.a aVar = Result.Companion;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return Result.m3458constructorimpl(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(c.a(th2));
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Object objM3195createV8AdapterIoAF18A = m3195createV8AdapterIoAF18A(context);
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3195createV8AdapterIoAF18A);
        if (thM3461exceptionOrNullimpl != null) {
            objM3195createV8AdapterIoAF18A = thM3461exceptionOrNullimpl instanceof FallbackException ? createV6Adapter(context, ((FallbackException) thM3461exceptionOrNullimpl).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) objM3195createV8AdapterIoAF18A;
    }
}
