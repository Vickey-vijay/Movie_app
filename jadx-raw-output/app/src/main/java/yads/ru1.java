package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ru1 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f82433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f82434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00 f82435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(Context context, lu2 lu2Var, l00 l00Var) {
        super(0);
        this.f82433b = context;
        this.f82434c = lu2Var;
        this.f82435d = l00Var;
    }

    @Override // bk.a
    public final Object invoke() {
        Context context = this.f82433b;
        lu2 lu2Var = this.f82434c;
        l00 l00Var = this.f82435d;
        iu3 iu3Var = (iu3) lu2Var;
        nk.j.d(kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new y10(iu3Var.a()))), null, null, new su1(context, iu3Var, null), 3, null);
        l00Var.onInitializationCompleted();
        return mj.r.f64562a;
    }
}
