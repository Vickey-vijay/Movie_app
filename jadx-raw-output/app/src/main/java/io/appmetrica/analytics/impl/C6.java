package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class C6 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6 f55081a;

    public static void a(ResultReceiver resultReceiver, T3 t10) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            t10.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f55081a.a(i10, bundle);
    }

    public C6(Handler handler, B6 b10) {
        super(handler);
        this.f55081a = b10;
    }

    public static void a(ResultReceiver resultReceiver, Kl kl2, T3 t10) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", kl2.f55487a);
            t10.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
