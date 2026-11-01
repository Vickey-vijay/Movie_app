package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class r8 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8 f82141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(t8 t8Var) {
        super(0);
        this.f82141b = t8Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new b9(new p8(), new q8(), new z8()).a(this.f82141b.f82913b.getApplicationContext());
    }
}
