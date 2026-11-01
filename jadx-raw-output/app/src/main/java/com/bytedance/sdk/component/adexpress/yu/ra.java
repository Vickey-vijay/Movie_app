package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.vpp;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ra {
    public static float ouw(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt();
        }
        return (f10 * vt(context)) + 0.5f;
    }

    public static int ouw(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static int vt(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt();
        }
        float fVt = vt(context);
        if (fVt <= 0.0f) {
            fVt = 1.0f;
        }
        return (int) ((f10 / fVt) + 0.5f);
    }

    public static float lh(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt();
        }
        return f10 * vt(context);
    }

    public static String ouw(@NonNull Context context) {
        String language;
        try {
            Locale locale = vpp.vt(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        language.hashCode();
        switch (language) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return language;
        }
    }

    private static float vt(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
