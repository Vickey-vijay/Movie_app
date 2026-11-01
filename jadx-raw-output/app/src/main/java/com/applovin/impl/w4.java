package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f9817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f9818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f9819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f9821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f9822h;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public float a() {
        float[] fArr = this.f9821g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    public float b() {
        return this.f9822h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f9820f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f9817c.b(this);
        if (((Boolean) this.f9820f.o0().a(x4.f9914e4)).booleanValue()) {
            this.f9817c.b(this, this.f9818d, (int) TimeUnit.MILLISECONDS.toMicros(this.f9815a), this.f9820f.O());
        }
        if (((Boolean) this.f9820f.o0().a(x4.f9923f4)).booleanValue()) {
            this.f9817c.b(this, this.f9819e, (int) TimeUnit.MILLISECONDS.toMicros(this.f9815a), this.f9820f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f9821g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f9822h * this.f9816b;
            this.f9822h = f10;
            this.f9822h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f9820f = kVar;
        f0 f0Var = new f0();
        this.f9817c = f0Var;
        this.f9818d = f0Var.a(9);
        this.f9819e = f0Var.a(4);
        this.f9815a = ((Integer) kVar.a(x4.f9941h4)).intValue();
        this.f9816b = ((Float) kVar.a(x4.f9932g4)).floatValue();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f9817c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }
}
