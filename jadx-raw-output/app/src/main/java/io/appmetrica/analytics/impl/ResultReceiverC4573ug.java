package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ResultReceiverC4573ug extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4220gg f57770a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            C4424og c4424og = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c4424og = new C4424og(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f57770a.a(c4424og);
        }
    }

    public static void a(ResultReceiver resultReceiver, C4424og c4424og) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c4424og == null ? null : c4424og.a());
            resultReceiver.send(1, bundle);
        }
    }

    public ResultReceiverC4573ug(Handler handler, InterfaceC4220gg interfaceC4220gg) {
        super(handler);
        this.f57770a = interfaceC4220gg;
    }
}
