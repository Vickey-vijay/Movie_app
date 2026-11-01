package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class jg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f79040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg1 f79041b;

    public /* synthetic */ jg0() {
        this(new lg0(), new yg1());
    }

    public final String a(Context context) {
        String lowerCase = this.f79040a.a(context).name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public jg0(lg0 lg0Var, yg1 yg1Var) {
        this.f79040a = lg0Var;
        this.f79041b = yg1Var;
    }
}
