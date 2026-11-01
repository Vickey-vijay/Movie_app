package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4218ge;
import io.appmetrica.analytics.impl.C4387n4;
import io.appmetrica.analytics.impl.C4493rb;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.Yk;

/* JADX INFO: loaded from: classes6.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58340a;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValue(double d10) {
        return new UserProfileUpdate<>(new C4218ge(this.f58340a.f57757c, d10, new C4493rb(), new C4536t4(new Hb(new C4387n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C4218ge(this.f58340a.f57757c, d10, new C4493rb(), new Yk(new Hb(new C4387n4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueReset() {
        return new UserProfileUpdate<>(new Ci(1, this.f58340a.f57757c, new C4493rb(), new Hb(new C4387n4(100))));
    }

    public NumberAttribute(String str, C4493rb c4493rb, Hb hb2) {
        this.f58340a = new C4563u6(str, c4493rb, hb2);
    }
}
