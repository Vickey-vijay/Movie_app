package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f69751a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f69752b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f69753c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f69754d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f69755e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f69756f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (q.a((CharSequence) str)) {
                return;
            }
            byte b10 = 0;
            sg.bigo.ads.common.t.a.a(0, 3, "GdprManager", "Listener SharedPreferenceChanged, key: ".concat(String.valueOf(str)));
            str.hashCode();
            switch (str.hashCode()) {
                case -2004976699:
                    if (!str.equals("IABTCF_PurposeConsents")) {
                        b10 = -1;
                    }
                    break;
                case -464306296:
                    b10 = !str.equals("IABTCF_PurposeLegitimateInterests") ? (byte) -1 : (byte) 1;
                    break;
                case 83641339:
                    b10 = !str.equals("IABTCF_gdprApplies") ? (byte) -1 : (byte) 2;
                    break;
                case 1218895378:
                    b10 = !str.equals("IABTCF_TCString") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    b.a(sharedPreferences);
                    break;
                case 1:
                    b.c(sharedPreferences);
                    break;
                case 2:
                    b.b(sharedPreferences);
                    break;
                case 3:
                    b.d(sharedPreferences);
                    b.h();
                    return;
                default:
                    return;
            }
            b.h();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f69757g;

    public static void a(@NonNull Context context) {
        f69757g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f69756f);
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f69751a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            f69751a = "";
        }
    }

    public static boolean a() {
        return f69757g != null;
    }

    public static String b() {
        if (q.a((CharSequence) f69751a) && a()) {
            f69751a = sg.bigo.ads.common.x.a.e(f69757g.getPackageName());
        }
        return f69751a;
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f69751a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            f69752b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                f69752b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                f69752b = 0;
            }
        }
    }

    public static int c() {
        if (f69757g == null || !sg.bigo.ads.common.x.b.a()) {
            return f69752b;
        }
        f69752b = e(f69757g) ? sg.bigo.ads.common.x.a.g(f69757g.getPackageName()) : -1;
        return f69752b;
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f69752b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f69753c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            f69753c = "";
        }
    }

    public static String d() {
        if (q.a((CharSequence) f69753c) && a()) {
            f69753c = sg.bigo.ads.common.x.a.h(f69757g.getPackageName());
        }
        return f69753c;
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f69753c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f69754d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            f69754d = "";
        }
    }

    public static String e() {
        if (q.a((CharSequence) f69754d) && a()) {
            f69754d = sg.bigo.ads.common.x.a.f(f69757g.getPackageName());
        }
        return f69754d;
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", "IABTCF_gdprApplies");
    }

    public static boolean f() {
        return f69755e;
    }

    public static void g() {
        f69755e = false;
    }

    public static /* synthetic */ boolean h() {
        f69755e = true;
        return true;
    }
}
