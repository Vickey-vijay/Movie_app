package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class bly {
    public static WeakReference<ouw> ouw;
    public static final float[] vt = new float[3];

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final float[] f13599lh = new float[3];
    public static final float[] yu = new float[9];
    public static final float[] fkw = new float[3];

    public static void ouw() {
    }

    public static void ouw(ouw ouwVar) {
        ouw = new WeakReference<>(ouwVar);
    }

    public static void lh(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void ouw(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void vt(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void yu(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void ouw(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
