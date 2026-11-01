package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f8568a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8569b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f8570c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f8571d = new HashMap(2);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8575d;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int a() {
            return this.f8575d;
        }

        public int b() {
            return this.f8572a;
        }

        public int c() {
            return this.f8574c;
        }

        public int d() {
            return this.f8573b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f8572a));
            map.put("top", Integer.valueOf(this.f8573b));
            map.put("right", Integer.valueOf(this.f8574c));
            map.put("bottom", Integer.valueOf(this.f8575d));
            return map;
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public a(int i10, int i11, int i12, int i13) {
            this.f8572a = i10;
            this.f8573b = i11;
            this.f8574c = i12;
            this.f8575d = i13;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8579d;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f8580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f8581b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f8582c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f8583d;

            public a a(int i10) {
                this.f8582c = i10;
                return this;
            }

            public b a() {
                return new b(this.f8580a, this.f8581b, this.f8582c, this.f8583d);
            }

            public a b(int i10) {
                this.f8583d = i10;
                return this;
            }

            public a c(int i10) {
                this.f8580a = i10;
                return this;
            }

            public a d(int i10) {
                this.f8581b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f8580a + ", topRight=" + this.f8581b + ", bottomLeft=" + this.f8582c + ", bottomRight=" + this.f8583d + ")";
            }
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int a() {
            return this.f8578c;
        }

        public int b() {
            return this.f8579d;
        }

        public int c() {
            return this.f8576a;
        }

        public int d() {
            return this.f8577b;
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public b(int i10, int i11, int i12, int i13) {
            this.f8576a = i10;
            this.f8577b = i11;
            this.f8578c = i12;
            this.f8579d = i13;
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        boolean z10 = kVar == null || ((Boolean) kVar.a(x4.E6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f8571d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerF = n7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f8571d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = n7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f8569b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8569b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f8568a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8568a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager windowManagerF;
        if (!((Boolean) kVar.a(x4.Y3)).booleanValue() || !k() || (windowManagerF = n7.f(context)) == null) {
            return null;
        }
        try {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f8570c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8570c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
