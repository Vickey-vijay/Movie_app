package te;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: compiled from: PreviewCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72372d = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f72373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f72374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72375c;

    public void a(Handler handler, int i10) {
        this.f72374b = handler;
        this.f72375c = i10;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointC = this.f72373a.c();
        Handler handler = this.f72374b;
        if (pointC == null || handler == null) {
            Log.d(f72372d, "Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.f72375c, pointC.x, pointC.y, bArr).sendToTarget();
            this.f72374b = null;
        }
    }

    public e(b bVar) {
        this.f72373a = bVar;
    }
}
