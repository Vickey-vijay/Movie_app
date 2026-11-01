package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class kd extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final od f79389l;

    public kd(Context context) {
        this(context, new ji1());
    }

    @Override // yads.hb2
    public final void e() {
    }

    public /* synthetic */ kd(Context context, ji1 ji1Var) {
        this(context, ji1Var, new od(new dd(context)));
    }

    @Override // yads.hb2, yads.m11
    public final void a(Context context, String str) {
        this.f79389l.a(str);
    }

    public final void setAdtuneWebViewListener(pd pdVar) {
        this.f79389l.f80998c = pdVar;
    }

    public final void setOptOutUrl(String str) {
        this.f79389l.f80999d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kd(Context context, ji1 ji1Var, od odVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f79389l = odVar;
        if (ji1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(odVar);
    }
}
