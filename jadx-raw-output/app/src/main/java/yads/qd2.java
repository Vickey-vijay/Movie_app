package yads;

import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class qd2 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.l f81834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd2(kotlinx.coroutines.c cVar) {
        super(1);
        this.f81834b = cVar;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f81834b.K((AppSetIdInfo) obj, null);
        return mj.r.f64562a;
    }
}
