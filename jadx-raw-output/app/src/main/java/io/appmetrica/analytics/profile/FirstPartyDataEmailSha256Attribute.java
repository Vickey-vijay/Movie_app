package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4083b8;
import io.appmetrica.analytics.impl.C4387n4;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class FirstPartyDataEmailSha256Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58331a = new C4563u6("appmetrica_1pd_email_sha256", new C4083b8(), new Hb(new C4387n4(100)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zk f58332b;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withEmailValues(@NonNull String... strArr) {
        return withEmailValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withEmailValues(@NonNull Iterable<String> iterable) {
        String str = this.f58331a.f57757c;
        ArrayList arrayListA = this.f58332b.a(iterable);
        Ym ym2 = new Ym(200, "First party data emails attribute", PublicLogger.getAnonymousInstance());
        C4563u6 c4563u6 = this.f58331a;
        return new UserProfileUpdate<>(new Xm(str, arrayListA, 10, ym2, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    public FirstPartyDataEmailSha256Attribute(Zk zk2) {
        this.f58332b = zk2;
    }
}
