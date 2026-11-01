package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class V4 extends U4 {
    @Override // io.appmetrica.analytics.impl.U4
    public final boolean b(int i10) {
        return i10 < 113;
    }

    @Override // io.appmetrica.analytics.impl.U4
    public final void c() {
        Xe xe2 = this.f55962a.f56201c;
        try {
            Vk vk2 = new Vk(xe2, A2.f54950g);
            Long lA = vk2.f56043c.a(Vk.f56035d);
            if (lA != null) {
                vk2.a(Vk.f56035d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = vk2.f56043c.a(Vk.f56036e);
            if (lA2 != null) {
                vk2.a(Vk.f56036e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Vk vk3 = new Vk(xe2, "foreground");
            Long lA3 = vk3.f56043c.a(Vk.f56035d);
            if (lA3 != null) {
                vk3.a(Vk.f56035d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = vk3.f56043c.a(Vk.f56036e);
            if (lA4 != null) {
                vk3.a(Vk.f56036e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }

    public V4(Y4 y10) {
        super(y10);
    }
}
