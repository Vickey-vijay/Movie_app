package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class po extends po2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f81478v = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f81479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oo f81480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final uo2 f81481u;

    public po(Context context, int i10, String str, oo ooVar, uo2 uo2Var) {
        super(i10, no.a(str), ooVar);
        this.f81479s = context;
        this.f81480t = ooVar;
        this.f81481u = uo2Var;
        k();
        a(new qe0(1.0f, f81478v, 0));
    }

    @Override // yads.po2
    public im3 a(im3 im3Var) {
        return im3Var;
    }

    @Override // yads.po2
    public final void a(Object obj) {
        this.f81480t.a(obj);
    }

    public /* synthetic */ po(Context context, String str, oo ooVar) {
        this(context, 0, str, ooVar, null);
    }
}
