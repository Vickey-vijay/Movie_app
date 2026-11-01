package yads;

import android.widget.ImageView;
import java.util.List;
import yads.z70;

/* JADX INFO: loaded from: classes2.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f85233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85234b;

    public final et a(String str, ImageView imageView) {
        final i41 i41VarA = this.f85233a.a(str, new y70(imageView), 0, 0);
        et etVar = new et() { // from class: cp.vc
            @Override // yads.et
            public final void cancel() {
                z70.a(i41VarA);
            }
        };
        this.f85234b.add(etVar);
        return etVar;
    }

    public z70(d03 d03Var, List list) {
        this.f85233a = d03Var;
        this.f85234b = list;
    }

    public static final void a(i41 i41Var) {
        i41Var.a();
    }
}
