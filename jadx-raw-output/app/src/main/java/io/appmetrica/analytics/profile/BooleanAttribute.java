package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.InterfaceC4309k2;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.to;

/* JADX INFO: loaded from: classes11.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58329a;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValue(boolean z10) {
        C4563u6 c4563u6 = this.f58329a;
        return new UserProfileUpdate<>(new Y2(c4563u6.f57757c, z10, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueIfUndefined(boolean z10) {
        C4563u6 c4563u6 = this.f58329a;
        return new UserProfileUpdate<>(new Y2(c4563u6.f57757c, z10, c4563u6.f57755a, new Yk(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueReset() {
        C4563u6 c4563u6 = this.f58329a;
        return new UserProfileUpdate<>(new Ci(3, c4563u6.f57757c, c4563u6.f57755a, c4563u6.f57756b));
    }

    public BooleanAttribute(String str, to toVar, InterfaceC4309k2 interfaceC4309k2) {
        this.f58329a = new C4563u6(str, toVar, interfaceC4309k2);
    }
}
