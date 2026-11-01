package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3327y9 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SdkInitializationListener f25777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3327y9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10, rj.c cVar) {
        super(1, cVar);
        this.f25775b = context;
        this.f25776c = str;
        this.f25777d = sdkInitializationListener;
        this.f25778e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3327y9(this.f25775b, this.f25776c, this.f25777d, this.f25778e, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C3327y9) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25774a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                Yk.a(this.f25775b);
                Context context = Ji.f22951a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || !file.isDirectory()) {
                        ck.p.i("Ji", "TAG");
                    } else {
                        ck.p.i("Ji", "TAG");
                    }
                }
                nk.i.b(null, new Xk(null), 1, null);
                String str = this.f25776c;
                ck.p.j(str, "primaryAccountId");
                Context context2 = Ji.f22951a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                    Da.a(context2, "coppa_store").a("im_accid", str, false);
                }
                Context context3 = this.f25775b;
                this.f25774a = 1;
                if (nk.i.b(null, new Wk(context3, null), 1, null) == objF) {
                    return objF;
                }
            }
            Ji.f22959i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.f25777d, null);
            Og.f23290a.getClass();
            nk.j.d(A9.f22353e, null, null, new Kg(null), 3, null);
            Map mapAccess$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.f25778e);
            Wj wj2 = Wj.f23753a;
            Wj.b("SdkInitialized", mapAccess$prepareTelemetryPayload, EnumC2735ak.SDK);
            InMobiUnifiedIdService.push(C2722a7.f23965b);
        } catch (Exception e10) {
            ck.p.i(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e10.getMessage();
            Ji.f22953c = null;
            Ji.f22951a = null;
            Ji.f22959i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.f25777d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return mj.r.f64562a;
    }
}
