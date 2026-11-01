package yads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class rl0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f82295h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f82296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f82297c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f82298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f82299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLSurface f82300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f82301g;

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f82301g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f82296b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f82301g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f82297c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f82298d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f82298d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f82300f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f82298d, this.f82300f);
            }
            EGLContext eGLContext = this.f82299e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f82298d, eGLContext);
            }
            if (ib3.f78556a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f82298d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f82298d);
            }
            this.f82298d = null;
            this.f82299e = null;
            this.f82300f = null;
            this.f82301g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f82296b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f82301g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public rl0(Handler handler) {
        this.f82296b = handler;
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                this.f82298d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f82295h, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (zEglChooseConfig && iArr2[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f82298d, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f82299e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay = this.f82298d;
                        if (i10 == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new ql0("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f82300f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f82297c, 0);
                            sz0.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f82297c[0]);
                            this.f82301g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new ql0("eglMakeCurrent failed");
                    }
                    throw new ql0("eglCreateContext failed");
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
                int i11 = ib3.f78556a;
                throw new ql0(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
            }
            throw new ql0("eglInitialize failed");
        }
        throw new ql0("eglGetDisplay failed");
    }
}
