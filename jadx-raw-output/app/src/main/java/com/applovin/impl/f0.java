package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f7460a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f7461b;

    public Sensor a(int i10) {
        return this.f7460a.getDefaultSensor(i10);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i10, final com.applovin.impl.sdk.o oVar) {
        this.f7461b.post(new Runnable() { // from class: com.applovin.impl.ba
            @Override // java.lang.Runnable
            public final void run() {
                this.f7081b.a(sensorEventListener, sensor, i10, oVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.o oVar) {
        try {
            this.f7460a.registerListener(sensorEventListener, sensor, i10, this.f7461b);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th2);
            }
        }
    }

    public void b(final SensorEventListener sensorEventListener) {
        this.f7461b.post(new Runnable() { // from class: com.applovin.impl.ca
            @Override // java.lang.Runnable
            public final void run() {
                this.f7144b.a(sensorEventListener);
            }
        });
    }

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f7461b = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f7460a.unregisterListener(sensorEventListener);
    }
}
