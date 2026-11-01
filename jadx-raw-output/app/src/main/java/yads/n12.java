package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n12 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f80510b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n12 f80511c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f80512a;

    public final void a(View view, p32 p32Var) {
        synchronized (f80510b) {
            this.f80512a.put(view, p32Var);
            mj.r rVar = mj.r.f64562a;
        }
    }

    public n12(Map map) {
        this.f80512a = map;
    }
}
