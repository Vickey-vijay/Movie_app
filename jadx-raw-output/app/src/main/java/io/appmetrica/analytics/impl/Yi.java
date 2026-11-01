package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Yi extends Sg {
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q10) {
        Object objRemove;
        for (Map.Entry entry : q10.f55788p.entrySet()) {
            Kk kk2 = this.f55865a.f56219u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                kk2.getClass();
                if (bArr.length == 0) {
                    objRemove = kk2.f55482b.remove(str);
                } else {
                    objRemove = kk2.f55482b.put(str, bArr);
                }
            } else {
                objRemove = kk2.f55482b.remove(str);
            }
            Ok ok2 = kk2.f55481a;
            ok2.f55705d.insert(ok2.f55702a, ok2.f55704c.toByteArray(ok2.f55703b.fromModel(kk2.f55482b)));
        }
        return true;
    }

    public Yi(Y4 y10) {
        super(y10);
        y10.b().a();
    }
}
