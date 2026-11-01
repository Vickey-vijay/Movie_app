package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f79297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h41 f79298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f79299c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f79300d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f79301e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f41 f79302f;

    public final i41 a(String str, j41 j41Var, int i10, int i11) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((d03) this).f76501g.getClass();
        String strA = k31.a(str, scaleType);
        Bitmap bitmapA = ((t82) this.f79298b).a(strA);
        if (bitmapA != null) {
            i41 i41Var = new i41(this, bitmapA, null, null);
            j41Var.a(i41Var, true);
            return i41Var;
        }
        i41 i41Var2 = new i41(this, null, strA, j41Var);
        j41Var.a(i41Var2, true);
        g41 g41Var = (g41) this.f79299c.get(strA);
        if (g41Var == null) {
            g41Var = (g41) this.f79300d.get(strA);
        }
        if (g41Var != null) {
            g41Var.f77627d.add(i41Var2);
        } else {
            o41 o41Var = new o41(str, new d41(this, strA), i10, i11, scaleType, Bitmap.Config.RGB_565, new e41(this, strA));
            this.f79297a.a(o41Var);
            this.f79299c.put(strA, new g41(o41Var, i41Var2));
        }
        return i41Var2;
    }

    public k41(cp2 cp2Var, t82 t82Var) {
        this.f79297a = cp2Var;
        this.f79298b = t82Var;
    }
}
