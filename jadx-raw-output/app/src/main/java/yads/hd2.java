package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class hd2 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f78180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f78181f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd2 f78183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78184d;

    public hd2(gd2 gd2Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f78183c = gd2Var;
        this.f78182b = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f78183c) {
            if (!this.f78184d) {
                gd2 gd2Var = this.f78183c;
                gd2Var.f77767c.getClass();
                gd2Var.f77767c.sendEmptyMessage(2);
                this.f78184d = true;
            }
        }
    }
}
