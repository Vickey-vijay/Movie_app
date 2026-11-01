package yads;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class oc2 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f80995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc2(Set set) {
        super(1);
        this.f80995b = set;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f80995b.contains(((u5) obj).f83374a));
    }
}
