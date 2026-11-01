package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class Tf implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new ro(this, true, "");
        }
        return new ro(this, false, "Invalid quantity value " + num);
    }
}
