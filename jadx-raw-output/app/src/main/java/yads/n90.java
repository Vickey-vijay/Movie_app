package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class n90 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o90 f80606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(o90 o90Var) {
        super(0);
        this.f80606b = o90Var;
    }

    @Override // bk.a
    public final Object invoke() {
        synchronized (eu1.f77192a) {
            eu1.f77193b = true;
        }
        o90 o90Var = this.f80606b;
        Toast.makeText(o90Var.f80975a, o90Var.f80975a.getString(R$string.logging_is_enabled), 0).show();
        return mj.r.f64562a;
    }
}
