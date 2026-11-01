package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e70 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f76952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f76953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(Context context, m70 m70Var) {
        super(0);
        this.f76952b = context;
        this.f76953c = m70Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new cn2(this.f76952b, (yo2) this.f76953c.f80115u.getValue(), (da0) this.f76953c.f80116v.getValue(), new d71());
    }
}
