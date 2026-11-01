package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class tn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f83115a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn2 f83117c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq f83116b = new dq();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn2 f83118d = new rn2();

    public final void a() {
        e72 e72Var = (e72) this.f83115a.b();
        if (e72Var != null) {
            un2 un2Var = e72Var.f76956c.f80563a;
            vn2 vn2Var = this.f83117c;
            vn2Var.getClass();
            un2Var.setVisibility(4);
            un2Var.f83548a.setOnClickListener(vn2Var.f83960a);
            Bitmap bitmap = e72Var.f76955b.getBitmap();
            if (bitmap != null) {
                this.f83116b.f76775a.execute(new cq(bitmap, new sn2(this, e72Var, un2Var), new Handler(Looper.getMainLooper()), new kq()));
            }
        }
    }

    public tn2(dk3 dk3Var, r62 r62Var) {
        this.f83115a = dk3Var;
        this.f83117c = new vn2(dk3Var, r62Var);
    }
}
