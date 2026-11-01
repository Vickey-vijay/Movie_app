package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: loaded from: classes6.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f43188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f43189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f43191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f43192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f43193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f43194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f43195h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f43189b) {
            return;
        }
        if (f43188a == null) {
            f43188a = new a();
        }
        if (f43195h == null) {
            f43195h = (DisplayManager) context.getSystemService("display");
        }
        if (f43195h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f43195h.registerDisplayListener(f43188a, handlerB);
            f43189b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    private static String a(int i10) {
        Display display = f43195h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f43190c)) {
                    return;
                }
                f43190c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f43192e)) {
                        return;
                    }
                    f43192e = strA;
                    return;
                }
                if (strA.equals(f43191d)) {
                    return;
                }
                f43191d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f43189b && (f43190c != null || f43191d != null || f43192e != null)) {
            return true;
        }
        if (f43189b && f43193f) {
            return f43194g;
        }
        if (context == null) {
            return false;
        }
        if (f43195h == null) {
            f43195h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f43195h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    f43194g = true;
                    break;
                }
            }
        }
        f43193f = true;
        return f43194g;
    }
}
