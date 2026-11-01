package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4478qk implements Jc {
    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        Sm sm2 = (Sm) Qm.a(C4329km.class);
        ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.b(context));
        C4329km c4329km = (C4329km) protobufStateStorageA.read();
        C4303jm c4303jmA = c4329km.a(c4329km.f57143m);
        c4303jmA.f57044o = 0L;
        protobufStateStorageA.save(new C4329km(c4303jmA));
    }
}
