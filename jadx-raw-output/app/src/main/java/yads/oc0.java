package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class oc0 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f80992b;

    @Override // yads.o30
    public final p30 createDataSource() {
        return new pc0(this.f80991a, this.f80992b.createDataSource());
    }

    public oc0(Context context, o30 o30Var) {
        this.f80991a = context.getApplicationContext();
        this.f80992b = o30Var;
    }
}
