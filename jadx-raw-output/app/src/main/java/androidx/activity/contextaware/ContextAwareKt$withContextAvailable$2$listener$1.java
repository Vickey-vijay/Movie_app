package androidx.activity.contextaware;

import android.content.Context;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import nk.l;
import rj.c;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    public final /* synthetic */ l<R> $co;
    public final /* synthetic */ bk.l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(l<R> lVar, bk.l<Context, R> lVar2) {
        this.$co = lVar;
        this.$onContextAvailable = lVar2;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM3458constructorimpl;
        p.j(context, GAMConfig.KEY_CONTEXT);
        c cVar = this.$co;
        bk.l<Context, R> lVar = this.$onContextAvailable;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(lVar.invoke(context));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        cVar.resumeWith(objM3458constructorimpl);
    }
}
