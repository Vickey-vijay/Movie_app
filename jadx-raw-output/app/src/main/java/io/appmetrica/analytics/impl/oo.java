package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: loaded from: classes8.dex */
public final class oo implements La {
    @Override // io.appmetrica.analytics.impl.La
    public final String a(Context context) {
        C4329km c4329km;
        try {
            Rm rmA = Qm.a(C4329km.class);
            if (rmA != null) {
                Sm sm2 = (Sm) rmA;
                ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                if (protobufStateStorageA != null && (c4329km = (C4329km) protobufStateStorageA.read()) != null) {
                    return c4329km.f57131a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
