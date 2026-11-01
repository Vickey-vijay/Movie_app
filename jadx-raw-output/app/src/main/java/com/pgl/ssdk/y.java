package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f43332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f43333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f43334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f43335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f43336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f43337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f43338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f43339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f43340i;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f43341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f43342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f43343c;

        public a(String str, Context context, int i10) {
            this.f43341a = str;
            this.f43342b = context;
            this.f43343c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.f43338g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f43341a);
            }
            InputManager inputManagerB = y.b(this.f43342b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f43343c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i10 = f43334c;
        f43334c = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = f43337f;
        f43337f = i10 + 1;
        return i10;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.hashCode();
        switch (str) {
            case "eic":
                return f43333b;
            case "nic":
                return f43334c;
            case "vic":
                return f43332a;
            case "eihc":
                return f43336e;
            case "nihc":
                return f43337f;
            case "vihc":
                return f43335d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ int d() {
        int i10 = f43332a;
        f43332a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f43335d;
        f43335d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f43333b;
        f43333b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g() {
        int i10 = f43336e;
        f43336e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f43339h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f43337f = sharedPreferencesA.getInt("nihc", 0);
                f43336e = sharedPreferencesA.getInt("eihc", 0);
                f43335d = sharedPreferencesA.getInt("vihc", 0);
                f43339h = true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        String str = null;
        if (f43338g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    String string = Arrays.toString(new Exception().getStackTrace());
                    if (!string.contains("android.view.InputEventReceiver") && !string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") && !string.contains("android.view.ViewRootImpl$InputStage")) {
                        str = string;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        ar.b(new a(str, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f43340i == null) {
            f43340i = (InputManager) context.getSystemService("input");
        }
        return f43340i;
    }
}
