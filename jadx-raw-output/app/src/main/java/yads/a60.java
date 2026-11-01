package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class a60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f75410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f75411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(Context context, m70 m70Var) {
        super(0);
        this.f75410b = context;
        this.f75411c = m70Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new kg(this.f75410b, (jg0) this.f75411c.f80097c.getValue());
    }
}
