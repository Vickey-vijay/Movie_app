package yads;

import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class vg3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.l f83911a;

    public vg3(kotlinx.coroutines.c cVar) {
        this.f83911a = cVar;
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (this.f83911a.isActive()) {
            nk.l lVar = this.f83911a;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(new tg3(list)));
        }
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        be3Var.a();
        boolean z10 = ad1.f75480a;
        if (this.f83911a.isActive()) {
            nk.l lVar = this.f83911a;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(new sg3(be3Var)));
        }
    }
}
