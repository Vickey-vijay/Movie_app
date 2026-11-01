package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class uz1 implements um0, y51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wz1 f83701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f83702b;

    public /* synthetic */ uz1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var) {
        wz1 wz1Var = new wz1();
        this(wz1Var, new f1(context, d4Var, lu2Var, v9Var, wz1Var));
    }

    @Override // yads.um0
    public final void a() {
        this.f83701a.a();
    }

    @Override // yads.y51
    public final void a(j5 j5Var) {
        this.f83701a.a(j5Var);
    }

    public uz1(wz1 wz1Var, f1 f1Var) {
        this.f83701a = wz1Var;
        this.f83702b = f1Var;
    }
}
