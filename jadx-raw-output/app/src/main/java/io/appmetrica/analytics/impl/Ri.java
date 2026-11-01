package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Ri implements InterfaceC4566u9 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4566u9
    @Nullable
    public final Integer a(@NonNull O8 o10) {
        EnumC4112cb enumC4112cb = o10.f55680h;
        if (enumC4112cb != null) {
            return (Integer) Qf.f55800c.get(enumC4112cb);
        }
        Map map = Qf.f55798a;
        return null;
    }
}
