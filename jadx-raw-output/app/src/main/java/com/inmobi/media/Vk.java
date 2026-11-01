package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class Vk extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vk(Context context, rj.c cVar) {
        super(1, cVar);
        this.f23712b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Vk(this.f23712b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new Vk(this.f23712b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        ?? K;
        Object objF = sj.a.f();
        int i10 = this.f23711a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            mj.g gVar = AbstractC2904h9.f24488a;
            Context context = Ji.f22951a;
            if (context != null) {
                String[] strArrDatabaseList = context.databaseList();
                if (strArrDatabaseList != null) {
                    K = new ArrayList();
                    for (String str : strArrDatabaseList) {
                        ck.p.g(str);
                        if (new Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !ck.p.e(str, "com.im_11.1.0.db")) {
                            K.add(str);
                        }
                    }
                } else {
                    K = nj.s.k();
                }
                for (String str2 : K) {
                    File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            K4 k10 = K4.f22996a;
            ck.p.i("K4", "TAG");
            nk.i.b(null, new F4(null), 1, null);
            if (E0.f22557b == null) {
                E0.f22557b = new A0();
            }
            C2924i4 c2924i4 = Y3.f23815a;
            Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, E0.f22559d);
            A0 a10 = E0.f22557b;
            if (a10 == null) {
                ck.p.B("executor");
                a10 = null;
            }
            if (!a10.f22329a.get()) {
                A0 a11 = E0.f22557b;
                if (a11 == null) {
                    ck.p.B("executor");
                    a11 = null;
                }
                if (!a11.f22329a.get()) {
                    ck.p.j(AdConfig.class, "clazz");
                    if (((AdConfig) Y3.f23815a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                        a11.a();
                    }
                }
            }
            F9.b();
            F9.a();
            L5 l10 = J5.f22893a;
            ck.p.j(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f23815a.a(AdConfig.class);
            N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean zA = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            J5.f22897e = zA;
            if (!zA && J5.f22895c == null) {
                Context context2 = Ji.f22951a;
                if (context2 == null) {
                    string = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                    Ea eaA = Da.a(context2, "display_info_store");
                    ck.p.j("gesture_margin", C3426d4.i.W);
                    string = eaA.f22577a.getString("gesture_margin", null);
                }
                J5.f22895c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                J5.j();
                J5.i();
            }
            Vg.b();
            Yk yk2 = Yk.f23865a;
            this.f23711a = 1;
            if (yk2.b(this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        Context context3 = this.f23712b;
        ck.p.j(context3, GAMConfig.KEY_CONTEXT);
        try {
            ck.s.b(ActivityFilter.class).i();
            ck.s.b(ActivityRule.class).i();
            ck.s.b(RuleController.class).i();
            RuleController.Companion.getInstance(context3).addRule(new ActivityRule.Builder(nj.p0.d(new ActivityFilter(new ComponentName(context3, (Class<?>) InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused) {
        }
        Context context4 = this.f23712b;
        ck.p.j(context4, GAMConfig.KEY_CONTEXT);
        ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
        Da.a(context4, "sdk_version_store").a("sdk_version", "11.1.0", false);
        Yk.f23866b = true;
        return mj.r.f64562a;
    }
}
