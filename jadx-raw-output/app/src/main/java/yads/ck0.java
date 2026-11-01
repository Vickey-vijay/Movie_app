package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class ck0 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk0 f76301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f76302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(dk0 dk0Var, String str) {
        super(1);
        this.f76301b = dk0Var;
        this.f76302c = str;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        gk0 gk0Var = (gk0) obj;
        dk0 dk0Var = this.f76301b;
        String str = this.f76302c;
        ak0 ak0Var = (ak0) dk0Var.f76704d.remove(str);
        if (ak0Var != null) {
            dk0Var.f76703c.a(str, gk0Var.f77835a, gk0Var.f77836b);
            dk0Var.a(str, ak0Var, gk0Var.f77835a, null);
        }
        return mj.r.f64562a;
    }
}
