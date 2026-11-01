package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: ShakeSensorEventListener.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36944a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f36945b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f36946c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36947d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36949f;

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f10 = -fArr[0];
        float f11 = -fArr[1];
        float f12 = -fArr[2];
        float f13 = this.f36945b;
        if (f13 == 0.0f || Math.abs(f10 - f13) <= this.f36948e) {
            float f14 = this.f36946c;
            if (f14 == 0.0f || Math.abs(f11 - f14) <= this.f36948e) {
                float f15 = this.f36947d;
                if (f15 != 0.0f && Math.abs(f12 - f15) > this.f36948e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f36944a > this.f36949f) {
                        this.f36944a = jCurrentTimeMillis;
                        a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f36944a > this.f36949f) {
                    this.f36944a = jCurrentTimeMillis;
                    a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f36944a > this.f36949f) {
                this.f36944a = jCurrentTimeMillis;
                a();
            }
        }
        this.f36945b = f10;
        this.f36946c = f11;
        this.f36947d = f12;
    }

    public b(int i10, int i11) {
        this.f36948e = i10;
        this.f36949f = i11;
    }
}
