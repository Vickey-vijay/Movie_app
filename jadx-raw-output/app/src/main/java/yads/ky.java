package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class ky implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ag0[] f79621a;

    @Override // yads.ag0
    public final boolean a(Context context) {
        for (ag0 ag0Var : this.f79621a) {
            if (!ag0Var.a(context)) {
                return false;
            }
        }
        return true;
    }

    public ky(ag0... ag0VarArr) {
        this.f79621a = ag0VarArr;
    }
}
