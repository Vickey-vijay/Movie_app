package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f43208a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f43209b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f43210c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f43216i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f43211d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f43212e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f43213f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f43214g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f43215h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f43217j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f43218k = 999999;

    public static ak a(Context context) {
        if (f43210c == null) {
            synchronized (ak.class) {
                if (f43210c == null) {
                    f43210c = new ak(context);
                }
            }
        }
        if (f43209b) {
            f43210c.c();
        }
        return f43210c;
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f43217j.get();
        if (!f43209b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f43211d == null || aVar.f43220b != null) && ((this.f43212e == null || aVar.f43221c != null) && (this.f43213f == null || aVar.f43222d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f43214g = false;
        a(objArr, aVar);
        this.f43217j.set(null);
        return objArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f43220b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f43221c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f43222d = null;

        public a(long j10) {
            this.f43219a = j10;
        }
    }

    private void c() {
        if (this.f43215h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f43216i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f43211d = sensorManager.getDefaultSensor(1);
                this.f43212e = sensorManager.getDefaultSensor(2);
                this.f43213f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f43215h = true;
    }

    private void e() {
        this.f43218k = -1L;
        this.f43214g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f43216i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public boolean d() {
        if (this.f43211d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f43216i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f43211d, 2);
                    Sensor sensor = this.f43212e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f43213f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f43218k = jCurrentTimeMillis;
                        this.f43217j.set(new a(jCurrentTimeMillis));
                        this.f43214g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f43214g;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f43217j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f43220b == null) {
                aVar.f43220b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f43221c == null) {
                aVar.f43221c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f43222d == null) {
            aVar.f43222d = sensorEvent.values;
        }
    }

    private ak(Context context) {
        this.f43216i = context;
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f43208a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        float[] fArr = aVar.f43220b;
        if (fArr != null) {
            float[] fArr2 = aVar.f43221c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f43220b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f43208a;
        }
        objArr[3] = Long.valueOf(aVar.f43219a);
        float[] fArr3 = aVar.f43222d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f43208a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f43209b || this.f43214g) {
            return;
        }
        d();
    }
}
