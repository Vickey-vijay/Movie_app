package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class ir2 implements kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow f78778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f78779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78780d;

    @Override // yads.kz
    public final void e() {
        if (this.f78780d) {
            this.f78779c.e();
            return;
        }
        ((ei0) this.f78778b).a(this.f78777a);
    }

    public ir2(Context context, ei0 ei0Var, kz kzVar) {
        this.f78777a = context;
        this.f78778b = ei0Var;
        this.f78779c = kzVar;
    }
}
