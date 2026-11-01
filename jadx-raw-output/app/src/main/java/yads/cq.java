package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import yads.cq;

/* JADX INFO: loaded from: classes2.dex */
public final class cq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f76398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn2 f76399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f76400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq f76401e;

    public final void a(final Bitmap bitmap) {
        this.f76400d.post(new Runnable() { // from class: cp.r0
            @Override // java.lang.Runnable
            public final void run() {
                cq.a(this.f51547b, bitmap);
            }
        });
    }

    public static final void a(cq cqVar, Bitmap bitmap) {
        sn2 sn2Var = cqVar.f76399c;
        rn2 rn2Var = sn2Var.f82705a.f83118d;
        e72 e72Var = sn2Var.f82706b;
        un2 un2Var = sn2Var.f82707c;
        rn2Var.getClass();
        rn2.a(e72Var, un2Var, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq kqVar = this.f76401e;
        Bitmap bitmapA = this.f76398b;
        kqVar.getClass();
        try {
            bitmapA = kq.a(bitmapA, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmapA);
    }

    public cq(Bitmap bitmap, sn2 sn2Var, Handler handler, kq kqVar) {
        this.f76398b = bitmap;
        this.f76399c = sn2Var;
        this.f76400d = handler;
        this.f76401e = kqVar;
    }
}
