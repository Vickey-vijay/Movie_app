package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes6.dex */
public final class Lm extends Sm {
    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper a(Context context) {
        return C4418oa.I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper iBinaryDataHelperA;
        C4702zk c4702zkB = C4418oa.I.B();
        synchronized (c4702zkB) {
            iBinaryDataHelperA = c4702zkB.a(context);
        }
        return iBinaryDataHelperA;
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        Z1 z10 = new Z1();
        try {
            bArrA = AbstractC4249hj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC4249hj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Nf("app_permissions_state", iBinaryDataHelper, new B8(z10, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new V1(new C4609w2()));
    }
}
