package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes10.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f43331a = -1;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            x.f43331a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f43331a).apply();
            }
        }
    }

    public static int a() {
        int i10;
        int i11 = f43331a;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i10 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f43331a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i10 = f43331a;
        if (i10 != -1) {
            return i10;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f43331a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f43331a = -1;
            }
        } else {
            f43331a = -2;
        }
        return f43331a;
    }
}
