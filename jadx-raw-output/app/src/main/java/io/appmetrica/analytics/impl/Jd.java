package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.InterfaceC4096bl;
import io.appmetrica.analytics.impl.Jd;

/* JADX INFO: loaded from: classes6.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l f55426a;

    public final Kd a(Context context, Tg tg2) {
        return new Kd(context, tg2, this.f55426a, new Sd() { // from class: af.f
            @Override // io.appmetrica.analytics.impl.Sd
            public final InterfaceC4096bl a(G0 g10) {
                return Jd.a(g10);
            }
        }, EnumC4112cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Kd b(Context context, Tg tg2) {
        return new Kd(context, tg2, this.f55426a, new Sd() { // from class: af.e
            @Override // io.appmetrica.analytics.impl.Sd
            public final InterfaceC4096bl a(G0 g10) {
                return Jd.b(g10);
            }
        }, EnumC4112cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public Jd(Od od2) {
        this.f55426a = od2;
    }

    public static final InterfaceC4096bl a(G0 g10) {
        return new Hd(g10.f55255f.f55287d);
    }

    public static final InterfaceC4096bl b(G0 g10) {
        return new X();
    }
}
