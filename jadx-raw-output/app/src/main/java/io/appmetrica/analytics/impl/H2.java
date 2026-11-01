package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class H2 implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        C4228go[] c4228goArr = ((C4305jo) obj).f57061a;
        return (c4228goArr == null || c4228goArr.length == 0) ? new ro(this, false, "attributes list is empty") : new ro(this, true, "");
    }
}
