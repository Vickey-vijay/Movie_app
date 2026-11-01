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

/* JADX INFO: loaded from: classes11.dex */
public class FirstPartyDataPhoneSha256Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58333a = new C4563u6("appmetrica_1pd_phone_sha256", new C4083b8(), new Hb(new C4387n4(100)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zk f58334b;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withPhoneValues(@NonNull String... strArr) {
        return withPhoneValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withPhoneValues(@NonNull Iterable<String> iterable) {
        String str = this.f58333a.f57757c;
        ArrayList arrayListA = this.f58334b.a(iterable);
        Ym ym2 = new Ym(200, "First party data phones attribute", PublicLogger.getAnonymousInstance());
        C4563u6 c4563u6 = this.f58333a;
        return new UserProfileUpdate<>(new Xm(str, arrayListA, 10, ym2, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    public FirstPartyDataPhoneSha256Attribute(Zk zk2) {
        this.f58334b = zk2;
    }
}
