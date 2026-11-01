package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.impl.C4552tk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4552tk implements Jc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Z6 z10;
        C4527sk c4527sk = new C4527sk();
        C4502rk c4502rk = new C4502rk();
        C4304jn c4304jn = new C4304jn(c4502rk, c4502rk, new C4468qa(false), new InterfaceC4330kn() { // from class: af.o0
            @Override // io.appmetrica.analytics.impl.InterfaceC4330kn
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return C4552tk.a(sQLiteDatabase);
            }
        });
        C4702zk c4702zkB = C4418oa.I.B();
        synchronized (c4702zkB) {
            C4082b7 c4082b7 = c4702zkB.f58057a;
            z10 = new Z6(context, new C4056a7(c4082b7.f56415a, c4082b7.f56416b, false).a(context, c4527sk), c4304jn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new T2(new C4503rl(z10), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C4418oa.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        Sm sm2 = (Sm) Qm.a(C4329km.class);
        ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.b(context));
        C4329km c4329km = (C4329km) protobufStateStorageA.read();
        C4303jm c4303jmA = c4329km.a(c4329km.f57143m);
        c4303jmA.f57044o = 0L;
        protobufStateStorageA.save(new C4329km(c4303jmA));
        b(context);
    }
}
