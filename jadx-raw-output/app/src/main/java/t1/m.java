package t1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewIndexingTrigger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\u000eB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lt1/m;", "Landroid/hardware/SensorEventListener;", "Lt1/m$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmj/r;", "a", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "b", "Lt1/m$b;", "onShakeListener", "<init>", "()V", "c", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class m implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public b onShakeListener;

    /* JADX INFO: compiled from: ViewIndexingTrigger.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lt1/m$b;", "", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            this.onShakeListener = bVar;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(sensor, "sensor");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            p.j(sensorEvent, "event");
            b bVar = this.onShakeListener;
            if (bVar != null) {
                float[] fArr = sensorEvent.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                    bVar.a();
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
