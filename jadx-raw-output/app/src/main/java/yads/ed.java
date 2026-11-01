package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ed extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gd f77030l;

    public ed(Context context) {
        this(context, new ji1());
    }

    @Override // yads.hb2
    public final void e() {
    }

    public /* synthetic */ ed(Context context, ji1 ji1Var) {
        this(context, ji1Var, new gd(new pa2(context)));
    }

    @Override // yads.hb2, yads.m11
    public final void a(Context context, String str) {
        this.f77030l.a(str);
    }

    public final void setAdtuneWebViewListener(hd hdVar) {
        this.f77030l.f77740c = hdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ed(Context context, ji1 ji1Var, gd gdVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f77030l = gdVar;
        if (ji1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(gdVar);
    }
}
