package g8;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o8.p;

/* JADX INFO: compiled from: PictureLanguageUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static void a(@NonNull Context context, @NonNull Locale locale) {
        b(context, locale, false);
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static void b(@NonNull Context context, @NonNull Locale locale, boolean z10) {
        if (z10) {
            p.d(context, "KEY_LOCALE", "VALUE_FOLLOW_SYSTEM");
        } else {
            p.d(context, "KEY_LOCALE", locale.getLanguage() + "$" + locale.getCountry());
        }
        f(context, locale);
    }

    public static void d(Context context, int i10, int i11) {
        WeakReference weakReference = new WeakReference(context);
        if (i10 >= 0) {
            a((Context) weakReference.get(), a.a(i10));
        } else if (i11 >= 0) {
            a((Context) weakReference.get(), a.a(i11));
        } else {
            e((Context) weakReference.get());
        }
    }

    public static void e(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(Locale.getDefault());
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public static void f(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (c(locale2.getLanguage(), locale.getLanguage()) && c(locale2.getCountry(), locale.getCountry())) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
