package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class fkw {
    public static int bly = 4;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public static int f13600cf = 16;
    public static long fkw = 15360;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public static int f13601le = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f13602lh = 1;
    public static String ouw = "images";
    public static int pno = 2;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static int f13603ra = 1;
    public static int ryl = 32;
    public static int tlj = 8;
    public static String vt = null;
    public static int yu = 30;

    public static Bitmap ouw(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean ouw() {
        return false;
    }

    public static float vt(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static boolean ouw(Context context, int i10) {
        if (f13601le == 0) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f13601le |= bly;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f13601le |= tlj;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f13601le |= f13600cf;
            }
        }
        return (f13601le & i10) != 0;
    }

    public static boolean ouw(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }

    public static boolean ouw(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }
}
