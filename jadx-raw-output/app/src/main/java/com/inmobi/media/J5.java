package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.inmobi.media.J5;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class J5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f22895c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f22898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f22899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f22900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f22901i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L5 f22893a = new L5(0, 0, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I5 f22894b = new I5(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f22896d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f22897e = true;

    public static String a() {
        Display displayA;
        Context context = Ji.f22951a;
        if (context == null || (displayA = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + VastAttributes.HORIZONTAL_POSITION + displayMetrics.heightPixels;
    }

    public static float b() {
        Display displayA;
        if (f22896d == -1.0f) {
            Context context = Ji.f22951a;
            if (context == null || (displayA = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f22896d = f10;
        }
        return f22896d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            map.put("d-device-screen-size", e());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f22900h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
            return map;
        } catch (Exception e10) {
            ck.p.i("J5", "TAG");
            e10.getMessage();
            return map;
        }
    }

    static {
        C3298x5.f25687a.getClass();
        f22901i = C3298x5.u();
    }

    public static L5 d() {
        Context context = Ji.f22951a;
        if (context == null) {
            return f22893a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f22893a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static Integer f() {
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        int rotation;
        Context context = Ji.f22951a;
        if (context == null || (displayA = a(context)) == null || (rotation = displayA.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        ck.p.i("J5", "TAG");
        return (byte) 1;
    }

    public static L5 h() {
        Context context = Ji.f22951a;
        if (context == null) {
            return f22893a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f22893a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static void i() {
        if (f22901i) {
            if (f() != null) {
                ck.p.i("J5", "TAG");
                return;
            }
            Context context = Ji.f22951a;
            if (context == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Ea eaA = Da.a(context, "display_info_store");
            ck.p.j("nav_bar_type", C3426d4.i.W);
            int i10 = eaA.f22577a.getInt("nav_bar_type", -1);
            Integer numValueOf = Integer.valueOf(i10);
            f22899g = numValueOf;
            if (i10 == -1) {
                numValueOf = null;
            }
            f22899g = numValueOf;
            ck.p.i("J5", "TAG");
        }
    }

    public static void j() {
        Context context;
        if (f22901i && (context = Ji.f22951a) != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            Ea eaA = Da.a(context, "display_info_store");
            ck.p.j("safe_area", C3426d4.i.W);
            JSONObject jSONObject = null;
            String string = eaA.f22577a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    ck.p.i("J5", "TAG");
                }
            }
            f22898f = jSONObject;
            ck.p.i("J5", "TAG");
            Objects.toString(f22898f);
        }
    }

    public static String e() {
        L5 l5D = d();
        return l5D.f23059a + "X" + l5D.f23060b;
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String string = windowInsets.getSystemGestureInsets().toString();
            ck.p.i(string, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").split(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(StringUtils.COMMA).split(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new Regex("=").split(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        stringBuffer.append(F3.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
            }
            if (stringBuffer.length() > 0) {
                f22895c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                ck.p.g(context);
                Da.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
            ck.p.i("J5", "TAG");
        }
    }

    public static void a(final Integer num) {
        final Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: b7.w1
            @Override // java.lang.Runnable
            public final void run() {
                J5.a(num, context);
            }
        };
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f22897e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(final LinkedHashMap linkedHashMap) {
        ck.p.j(linkedHashMap, "value");
        final Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: b7.y1
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                J5.a(linkedHashMap, context);
            }
        };
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static void a(final WindowInsets windowInsets, final Context context) {
        ck.p.j(windowInsets, "insets");
        if (f22897e) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: b7.x1
            @Override // java.lang.Runnable
            public final void run() {
                J5.b(windowInsets, context);
            }
        };
        Context context2 = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static Display a(Context context) {
        C3298x5.f25687a.getClass();
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    public static int a(WindowInsets windowInsets) {
        ck.p.j(windowInsets, "insets");
        C3298x5.f25687a.getClass();
        int i10 = 1;
        if (C3298x5.r()) {
            Df dfA = Ef.a(g());
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
            ck.p.i(insets, "getInsets(...)");
            int iOrdinal = dfA.ordinal();
            if (iOrdinal == 0) {
                if (insets.left == 0 && insets.right == 0) {
                    i10 = 0;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (insets.right == 0 && insets.bottom == 0) {
                            i10 = 0;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (insets.left == 0) {
                    i10 = 0;
                }
            } else if (insets.left == 0 && insets.bottom == 0) {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        ck.p.i("J5", "TAG");
        return i10;
    }

    public static final void a(Map map, Context context) throws JSONException {
        ck.p.i("J5", "TAG");
        Objects.toString(map);
        if (f22898f == null) {
            f22898f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f22898f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), map.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "display_info_store");
        JSONObject jSONObject2 = f22898f;
        eaA.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static I5 b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Display displayA = a(context);
        if (displayA == null) {
            return f22894b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        return new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final void a(Integer num, Context context) {
        ck.p.i("J5", "TAG");
        f22899g = num;
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Da.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }
}
