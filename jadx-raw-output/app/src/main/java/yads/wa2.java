package yads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public final class wa2 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f84141a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f84142b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f84143c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f84144d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f84145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final va2[] f84146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84147g;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f84141a, sensorEvent.values);
        float[] fArr = this.f84141a;
        int rotation = this.f84145e.getRotation();
        if (rotation != 0) {
            int i10 = 130;
            int i11 = 129;
            if (rotation == 1) {
                i10 = 2;
            } else if (rotation == 2) {
                i11 = 130;
                i10 = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i11 = 1;
            }
            float[] fArr2 = this.f84142b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f84142b, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f84141a, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f84142b);
        SensorManager.getOrientation(this.f84142b, this.f84144d);
        float f10 = this.f84144d[2];
        Matrix.rotateM(this.f84141a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f84141a;
        if (!this.f84147g) {
            tx0.a(this.f84143c, fArr3);
            this.f84147g = true;
        }
        float[] fArr4 = this.f84142b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f84142b, 0, this.f84143c, 0);
        float[] fArr5 = this.f84141a;
        for (va2 va2Var : this.f84146f) {
            va2Var.a(fArr5, f10);
        }
    }

    public wa2(Display display, va2... va2VarArr) {
        this.f84145e = display;
        this.f84146f = va2VarArr;
    }
}
