package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class i41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f78482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j41 f78483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41 f78485d;

    public i41(k41 k41Var, Bitmap bitmap, String str, j41 j41Var) {
        this.f78485d = k41Var;
        this.f78482a = bitmap;
        this.f78484c = str;
        this.f78483b = j41Var;
    }

    public final void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f78483b == null) {
                return;
            }
            g41 g41Var = (g41) this.f78485d.f79299c.get(this.f78484c);
            if (g41Var != null) {
                g41Var.f77627d.remove(this);
                if (g41Var.f77627d.size() == 0) {
                    g41Var.f77624a.a();
                    this.f78485d.f79299c.remove(this.f78484c);
                    return;
                }
                return;
            }
            g41 g41Var2 = (g41) this.f78485d.f79300d.get(this.f78484c);
            if (g41Var2 != null) {
                g41Var2.f77627d.remove(this);
                if (g41Var2.f77627d.size() == 0) {
                    g41Var2.f77624a.a();
                }
                if (g41Var2.f77627d.size() == 0) {
                    this.f78485d.f79300d.remove(this.f78484c);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
