package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f75904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f75905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f75906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final an f75907e;

    public /* synthetic */ bn(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, new we1(list), new ue1(), new an(onPreDrawListener));
    }

    public bn(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, an anVar) {
        this.f75903a = context;
        this.f75904b = viewGroup;
        this.f75905c = we1Var;
        this.f75906d = ue1Var;
        this.f75907e = anVar;
    }
}
