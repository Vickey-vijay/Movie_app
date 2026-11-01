package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f77476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rc3 f77477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg3 f77478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f77479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77480f;

    public final void a(Context context, List list, to2 to2Var, Object obj) {
        int i10 = this.f77480f + 1;
        this.f77480f = i10;
        if (i10 > 5) {
            to2Var.a(new be3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new hp3(new cp3(this.f77479e, this.f77475a, this.f77476b, this.f77477c, this.f77478d)).a(context, list, to2Var, obj);
    }

    public fp3(Context context, d4 d4Var, lu2 lu2Var, rc3 rc3Var, fg3 fg3Var) {
        this.f77475a = d4Var;
        this.f77476b = lu2Var;
        this.f77477c = rc3Var;
        this.f77478d = fg3Var;
        this.f77479e = context.getApplicationContext();
    }
}
