package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.monetization.ads.mediation.base.a f77470a;

    public final MediatedAdapterInfo b() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(this.f77470a.getAdapterInfo());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            objM3458constructorimpl = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) objM3458constructorimpl;
    }

    public fo1(com.monetization.ads.mediation.base.a aVar) {
        this.f77470a = aVar;
    }
}
