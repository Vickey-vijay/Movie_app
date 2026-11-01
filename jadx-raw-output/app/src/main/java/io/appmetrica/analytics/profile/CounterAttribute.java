package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4493rb;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.R5;

/* JADX INFO: loaded from: classes11.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58330a;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withDelta(double d10) {
        return new UserProfileUpdate<>(new R5(this.f58330a.f57757c, d10));
    }

    public CounterAttribute(String str, C4493rb c4493rb, Hb hb2) {
        this.f58330a = new C4563u6(str, c4493rb, hb2);
    }
}
