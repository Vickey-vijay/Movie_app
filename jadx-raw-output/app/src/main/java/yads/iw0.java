package yads;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class iw0 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mw0 f78841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f78842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(mw0 mw0Var, UUID uuid) {
        super(1);
        this.f78841b = mw0Var;
        this.f78842c = uuid;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        cp2 cp2Var = (cp2) this.f78841b.f80408b.getValue();
        UUID uuid = this.f78842c;
        cp2Var.getClass();
        if (uuid == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        cp2Var.a(new zo2(uuid));
        return mj.r.f64562a;
    }
}
