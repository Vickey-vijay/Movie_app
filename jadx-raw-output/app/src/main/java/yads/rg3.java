package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp3 f82265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pg3 f82266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f82267d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rg3(Context context, d4 d4Var, lu2 lu2Var, fg3 fg3Var, rc3 rc3Var) {
        Context applicationContext = context.getApplicationContext();
        this(applicationContext, new fp3(applicationContext, d4Var, lu2Var, rc3Var, fg3Var), new pg3());
    }

    public rg3(Context context, fp3 fp3Var, pg3 pg3Var) {
        this.f82264a = context;
        this.f82265b = fp3Var;
        this.f82266c = pg3Var;
        this.f82267d = new ArrayList();
    }
}
