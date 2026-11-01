package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4057a8;
import io.appmetrica.analytics.impl.C4083b8;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.C4703zl;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Zm;

/* JADX INFO: loaded from: classes.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58337a = new C4563u6("appmetrica_gender", new C4083b8(), new C4703zl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58339a;

        public String getStringValue() {
            return this.f58339a;
        }

        Gender(String str) {
            this.f58339a = str;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValue(@NonNull Gender gender) {
        String str = this.f58337a.f57757c;
        String stringValue = gender.getStringValue();
        C4057a8 c4057a8 = new C4057a8();
        C4563u6 c4563u6 = this.f58337a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c4057a8, c4563u6.f57755a, new C4536t4(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f58337a.f57757c;
        String stringValue = gender.getStringValue();
        C4057a8 c4057a8 = new C4057a8();
        C4563u6 c4563u6 = this.f58337a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c4057a8, c4563u6.f57755a, new Yk(c4563u6.f57756b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4202fo> withValueReset() {
        C4563u6 c4563u6 = this.f58337a;
        return new UserProfileUpdate<>(new Ci(0, c4563u6.f57757c, c4563u6.f57755a, c4563u6.f57756b));
    }
}
