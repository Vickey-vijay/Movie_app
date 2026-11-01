package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class jy implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0[] f79237a;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        for (zf0 zf0Var : this.f79237a) {
            zf0Var.a(viewGroup);
        }
    }

    @Override // yads.zf0
    public final void c() {
        for (zf0 zf0Var : this.f79237a) {
            zf0Var.c();
        }
    }

    public jy(zf0... zf0VarArr) {
        this.f79237a = zf0VarArr;
    }
}
