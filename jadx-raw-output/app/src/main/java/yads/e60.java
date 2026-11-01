package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f76934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f76935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(Context context, m70 m70Var) {
        super(0);
        this.f76934b = context;
        this.f76935c = m70Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new x70(this.f76934b, (eq1) this.f76935c.f80099e.getValue(), new fr1(this.f76934b));
    }
}
