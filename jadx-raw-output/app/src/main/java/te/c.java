package te;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.yzq.zxinglibrary.R$dimen;
import com.yzq.zxinglibrary.android.CaptureActivityHandler;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import java.io.IOException;
import y5.g;

/* JADX INFO: compiled from: CameraManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f72357n = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f72359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ZxingConfig f72360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Camera f72361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f72362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f72363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f72364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f72365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f72366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72367j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f72368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f72369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f72370m;

    public synchronized void b() {
        Camera camera = this.f72361d;
        if (camera != null) {
            camera.release();
            this.f72361d = null;
            this.f72363f = null;
            this.f72364g = null;
        }
    }

    public synchronized Rect c() {
        if (this.f72363f == null) {
            if (this.f72361d == null) {
                return null;
            }
            Point pointE = this.f72359b.e();
            if (pointE == null) {
                return null;
            }
            int i10 = pointE.x;
            int i11 = (int) (((double) i10) * 0.6d);
            int i12 = (i10 - i11) / 2;
            int i13 = (pointE.y - i11) / 5;
            this.f72363f = new Rect(i12, i13, i12 + i11, i11 + i13);
            Log.d(f72357n, "Calculated framing rect: " + this.f72363f);
        }
        return this.f72363f;
    }

    public synchronized Rect d() {
        if (this.f72364g == null) {
            Rect rectC = c();
            if (rectC == null) {
                return null;
            }
            Rect rect = new Rect(rectC);
            Point pointC = this.f72359b.c();
            Point pointE = this.f72359b.e();
            if (pointC != null && pointE != null) {
                int i10 = rect.left;
                int i11 = pointC.y;
                int i12 = pointE.x;
                rect.left = (i10 * i11) / i12;
                rect.right = (rect.right * i11) / i12;
                int i13 = rect.top;
                int i14 = pointC.x;
                int i15 = pointE.y;
                rect.top = (i13 * i14) / i15;
                rect.bottom = (rect.bottom * i14) / i15;
                this.f72364g = rect;
            }
            return null;
        }
        return this.f72364g;
    }

    public synchronized boolean e() {
        return this.f72361d != null;
    }

    public synchronized void f(SurfaceHolder surfaceHolder) throws IOException {
        int i10;
        Camera cameraB = this.f72361d;
        if (cameraB == null) {
            int i11 = this.f72367j;
            cameraB = i11 >= 0 ? d.b(i11) : d.a();
            if (cameraB == null) {
                throw new IOException();
            }
            this.f72361d = cameraB;
        }
        cameraB.setPreviewDisplay(surfaceHolder);
        if (!this.f72365h) {
            this.f72365h = true;
            this.f72359b.f(cameraB);
            int i12 = this.f72368k;
            if (i12 > 0 && (i10 = this.f72369l) > 0) {
                h(i12, i10);
                this.f72368k = 0;
                this.f72369l = 0;
            }
        }
        Camera.Parameters parameters = cameraB.getParameters();
        String strFlatten = parameters == null ? null : parameters.flatten();
        try {
            this.f72359b.g(cameraB);
        } catch (RuntimeException unused) {
            String str = f72357n;
            Log.w(str, "Camera rejected parameters. Setting only minimal safe-mode parameters");
            Log.i(str, "Resetting to saved camera params: " + strFlatten);
            if (strFlatten != null) {
                Camera.Parameters parameters2 = cameraB.getParameters();
                parameters2.unflatten(strFlatten);
                try {
                    cameraB.setParameters(parameters2);
                    this.f72359b.g(cameraB);
                } catch (RuntimeException unused2) {
                    Log.w(f72357n, "Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
    }

    public synchronized void g(Handler handler, int i10) {
        Camera camera = this.f72361d;
        if (camera != null && this.f72366i) {
            this.f72370m.a(handler, i10);
            camera.setOneShotPreviewCallback(this.f72370m);
        }
    }

    public synchronized void h(int i10, int i11) {
        if (this.f72365h) {
            Point pointE = this.f72359b.e();
            int i12 = pointE.x;
            if (i10 > i12) {
                i10 = i12;
            }
            int i13 = pointE.y;
            if (i11 > i13) {
                i11 = i13;
            }
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 5;
            this.f72363f = new Rect(i14, i15, i10 + i14, i11 + i15);
            Log.d(f72357n, "Calculated manual framing rect: " + this.f72363f);
            this.f72364g = null;
        } else {
            this.f72368k = i10;
            this.f72369l = i11;
        }
    }

    public synchronized void i() {
        Camera camera = this.f72361d;
        if (camera != null && !this.f72366i) {
            camera.startPreview();
            this.f72366i = true;
            this.f72362e = new a(this.f72361d);
        }
    }

    public synchronized void j() {
        a aVar = this.f72362e;
        if (aVar != null) {
            aVar.d();
            this.f72362e = null;
        }
        Camera camera = this.f72361d;
        if (camera != null && this.f72366i) {
            camera.stopPreview();
            this.f72370m.a(null, 0);
            this.f72366i = false;
        }
    }

    public void k(CaptureActivityHandler captureActivityHandler) {
        Camera.Parameters parameters = this.f72361d.getParameters();
        Message message = new Message();
        if (parameters.getFlashMode().equals("torch")) {
            parameters.setFlashMode("off");
            message.what = 9;
        } else {
            parameters.setFlashMode("torch");
            message.what = 8;
        }
        this.f72361d.setParameters(parameters);
        captureActivityHandler.sendMessage(message);
    }

    public c(Context context, ZxingConfig zxingConfig) {
        this.f72358a = context;
        b bVar = new b(context);
        this.f72359b = bVar;
        this.f72370m = new e(bVar);
        this.f72360c = zxingConfig;
    }

    public g a(byte[] bArr, int i10, int i11) {
        Rect rectD = d();
        if (rectD == null) {
            return null;
        }
        if (this.f72360c == null) {
            this.f72360c = new ZxingConfig();
        }
        if (this.f72360c.isFullScreenScan()) {
            return new g(bArr, i10, i11, 0, 0, i10, i11, false);
        }
        return new g(bArr, i10, i11, rectD.left, rectD.top + this.f72358a.getResources().getDimensionPixelSize(R$dimen.toolBarHeight), rectD.width(), rectD.height(), false);
    }
}
