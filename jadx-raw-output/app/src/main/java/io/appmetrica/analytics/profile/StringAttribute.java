package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.InterfaceC4309k2;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.to;

/* JADX INFO: loaded from: classes11.dex */
public class StringAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mn f58341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4563u6 f58342b;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValue(@NonNull String str) {
        C4563u6 c4563u6 = this.f58342b;
        return new UserProfileUpdate<>(new Zm(c4563u6.f57757c, str, this.f58341a, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueIfUndefined(@NonNull String str) {
        C4563u6 c4563u6 = this.f58342b;
        return new UserProfileUpdate<>(new Zm(c4563u6.f57757c, str, this.f58341a, c4563u6.f57755a, new Yk(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueReset() {
        C4563u6 c4563u6 = this.f58342b;
        return new UserProfileUpdate<>(new Ci(0, c4563u6.f57757c, c4563u6.f57755a, c4563u6.f57756b));
    }

    public StringAttribute(String str, Ym ym2, to toVar, InterfaceC4309k2 interfaceC4309k2) {
        this.f58342b = new C4563u6(str, toVar, interfaceC4309k2);
        this.f58341a = ym2;
    }
}
