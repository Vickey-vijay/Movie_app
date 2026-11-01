package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeShakeManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManager f36942a;

    /* JADX INFO: compiled from: NativeShakeManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f36943a = new a();
    }

    public static a a() {
        return b.f36943a;
    }

    private a() {
    }

    public void a(SensorEventListener sensorEventListener) {
        a(sensorEventListener, null, 2);
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f36942a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(SensorEventListener sensorEventListener, Sensor sensor, int i10) {
        Context contextD = c.n().d();
        if (contextD != null) {
            try {
                if (this.f36942a == null) {
                    this.f36942a = (SensorManager) contextD.getSystemService("sensor");
                }
                if (sensor == null) {
                    sensor = this.f36942a.getDefaultSensor(1);
                }
                this.f36942a.registerListener(sensorEventListener, sensor, i10);
            } catch (Exception e10) {
                e10.printStackTrace();
                a(contextD, e10.getMessage());
            }
        }
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3426d4.i.W, "2000106");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f34897g)) {
                    jSONObject.put("c", com.mbridge.msdk.foundation.same.a.f34897g);
                }
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("NativeShakeManager", th2.getMessage());
            }
        }
    }
}
