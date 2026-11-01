package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class gb0 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb0 f77720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var) {
        super(0);
        this.f77720b = hb0Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return Long.valueOf(this.f77720b.f78159a.toMillis(1L));
    }
}
