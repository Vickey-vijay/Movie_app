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

/* JADX INFO: loaded from: classes9.dex */
public class FirstPartyDataTelegramLoginSha256Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58335a = new C4563u6("appmetrica_1pd_telegram_sha256", new C4083b8(), new Hb(new C4387n4(100)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zk f58336b;

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withTelegramLoginValues(@NonNull String... strArr) {
        return withTelegramLoginValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withTelegramLoginValues(@NonNull Iterable<String> iterable) {
        String str = this.f58335a.f57757c;
        ArrayList arrayListA = this.f58336b.a(iterable);
        Ym ym2 = new Ym(200, "First party data telegram logins attribute", PublicLogger.getAnonymousInstance());
        C4563u6 c4563u6 = this.f58335a;
        return new UserProfileUpdate<>(new Xm(str, arrayListA, 10, ym2, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    public FirstPartyDataTelegramLoginSha256Attribute(Zk zk2) {
        this.f58336b = zk2;
    }
}
