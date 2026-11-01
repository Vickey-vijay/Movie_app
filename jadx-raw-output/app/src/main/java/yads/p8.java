package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class p8 {
    public static AdQualityVerifierAdapter a() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Object objA = om2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            objM3458constructorimpl = Result.m3458constructorimpl(objA instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) objA : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            thM3461exceptionOrNullimpl.getMessage();
            boolean z10 = ad1.f75480a;
        }
        return (AdQualityVerifierAdapter) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
