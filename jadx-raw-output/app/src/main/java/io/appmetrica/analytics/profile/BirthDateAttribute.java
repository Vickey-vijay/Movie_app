package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4057a8;
import io.appmetrica.analytics.impl.C4083b8;
import io.appmetrica.analytics.impl.C4536t4;
import io.appmetrica.analytics.impl.C4563u6;
import io.appmetrica.analytics.impl.C4703zl;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import io.appmetrica.analytics.impl.K2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Zm;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4563u6 f58328a = new C4563u6("appmetrica_birth_date", new C4083b8(), new C4703zl());

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C4536t4(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Yk(this.f58328a.f57756b));
    }

    public final UserProfileUpdate a(Calendar calendar, String str, K2 k10) {
        return new UserProfileUpdate(new Zm(this.f58328a.f57757c, new SimpleDateFormat(str).format(calendar.getTime()), new C4057a8(), new C4083b8(), k10));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withAge(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new C4536t4(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withAgeIfUndefined(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new Yk(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withValueReset() {
        return new UserProfileUpdate<>(new Ci(0, this.f58328a.f57757c, new C4083b8(), new C4703zl()));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDate(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C4536t4(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDateIfUndefined(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new Yk(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDate(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C4536t4(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDateIfUndefined(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Yk(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDate(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new C4536t4(this.f58328a.f57756b));
    }

    public UserProfileUpdate<? extends InterfaceC4202fo> withBirthDateIfUndefined(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new Yk(this.f58328a.f57756b));
    }
}
