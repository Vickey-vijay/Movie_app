package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq0 f77482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka2 f77483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f77484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public eq0 f77485e;

    public fq0(Handler handler, gw1 gw1Var, cq0 cq0Var, ka2 ka2Var) {
        this.f77481a = gw1Var;
        this.f77482b = cq0Var;
        this.f77483c = ka2Var;
        this.f77484d = handler;
    }

    public /* synthetic */ fq0(gw1 gw1Var, cq0 cq0Var, ka2 ka2Var) {
        this(new Handler(Looper.getMainLooper()), gw1Var, cq0Var, ka2Var);
    }
}
