package yads;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class g23 implements GLSurfaceView.Renderer, b73, va2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps2 f77603a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f77606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f77607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f77608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f77609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f77610h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i23 f77613k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f77604b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f77605c = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f77611i = new float[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f77612j = new float[16];

    @Override // yads.va2
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f77606d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f77610h = f11;
        Matrix.setRotateM(this.f77607e, 0, -this.f77609g, (float) Math.cos(f11), (float) Math.sin(this.f77610h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f77612j, 0, this.f77606d, 0, this.f77608f, 0);
            Matrix.multiplyMM(this.f77611i, 0, this.f77607e, 0, this.f77612j, 0);
        }
        Matrix.multiplyMM(this.f77605c, 0, this.f77604b, 0, this.f77611i, 0);
        this.f77603a.a(this.f77605c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        Matrix.perspectiveM(this.f77604b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f77613k.b(this.f77603a.a());
    }

    public g23(i23 i23Var, ps2 ps2Var) {
        this.f77613k = i23Var;
        float[] fArr = new float[16];
        this.f77606d = fArr;
        float[] fArr2 = new float[16];
        this.f77607e = fArr2;
        float[] fArr3 = new float[16];
        this.f77608f = fArr3;
        this.f77603a = ps2Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f77610h = 3.1415927f;
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.f77613k.performClick();
    }
}
