package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3768wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3698s9 f31535a = new C3698s9(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    public static final class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f31536b;

        public a(Runnable runnable) {
            this.f31536b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f31536b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wb$b */
    public static final class b extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bk.a<mj.r> f31537b;

        public b(bk.a<mj.r> aVar) {
            this.f31537b = aVar;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f31537b.invoke();
        }
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        a(this, abstractRunnableC3526ie, 0L, 2, (Object) null);
    }

    public final void b(final Runnable runnable) {
        ck.p.j(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.nm
            @Override // java.lang.Runnable
            public final void run() {
                C3768wb.a(this.f30325b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void c(final Runnable runnable) {
        ck.p.j(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.mm
            @Override // java.lang.Runnable
            public final void run() {
                C3768wb.b(this.f30198b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        this.f31535a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3768wb c3768wb, Runnable runnable) {
        ck.p.j(c3768wb, "this$0");
        ck.p.j(runnable, "$runnable");
        c3768wb.f31535a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C3768wb c3768wb, final Runnable runnable) {
        ck.p.j(c3768wb, "this$0");
        ck.p.j(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.lm
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                C3768wb.a(this.f29446b, runnable, j10);
            }
        });
    }

    public final void e(Runnable runnable) {
        ck.p.j(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3768wb c3768wb, Runnable runnable, long j10) {
        ck.p.j(c3768wb, "this$0");
        ck.p.j(runnable, "$runnable");
        c3768wb.b(runnable);
    }

    public final void b(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        this.f31535a.a(abstractRunnableC3526ie);
    }

    public static /* synthetic */ void a(C3768wb c3768wb, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3768wb.a(runnable, j10);
    }

    public final C3617ne b(C3617ne c3617ne) {
        ck.p.j(c3617ne, "error");
        return c3617ne.c() == 2080 ? new C3617ne(c3617ne.c(), "serverResponseIsNotValid") : c3617ne;
    }

    public final void a(Runnable runnable, long j10) {
        ck.p.j(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "callback");
        this.f31535a.a(runnable);
    }

    public final void b(String str, int i10, String str2) throws JSONException {
        ck.p.j(str, "adUnitId");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C3772wf.a(D5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie, long j10) {
        ck.p.j(abstractRunnableC3526ie, "safeRunnable");
        this.f31535a.a(abstractRunnableC3526ie, j10);
    }

    public static /* synthetic */ void a(C3768wb c3768wb, AbstractRunnableC3526ie abstractRunnableC3526ie, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3768wb.a(abstractRunnableC3526ie, j10);
    }

    public static /* synthetic */ void a(C3768wb c3768wb, bk.a aVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3768wb.a((bk.a<mj.r>) aVar, j10);
    }

    public final void a(bk.a<mj.r> aVar, long j10) {
        ck.p.j(aVar, "action");
        a((AbstractRunnableC3526ie) new b(aVar), j10);
    }

    public final Handler a() {
        return this.f31535a.a();
    }

    public final void a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        C3665q9.a aVar = C3665q9.f30550a;
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormatArr) {
        ck.p.j(adFormatArr, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormatArr) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        ck.p.j(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        ck.p.j(adapterBaseInterface, "networkAdapter");
        ck.p.j(aVar, "adFormat");
        ck.p.j(str, "providerName");
        return C3772wf.a(adapterBaseInterface, aVar, str);
    }

    public static /* synthetic */ void a(C3768wb c3768wb, long j10, Ne.a aVar, long j11, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i10 & 8) != 0) {
            jSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        c3768wb.a(j10, aVar, j11, jSONObject);
    }

    public final void a(long j10, Ne.a aVar, long j11, JSONObject jSONObject) {
        ck.p.j(aVar, "responseOrigin");
        ck.p.j(jSONObject, "data");
        try {
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j10);
            String strB = aVar.b();
            ck.p.i(strB, "responseOrigin.value");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(strB, j11));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C3772wf.a(D5.SDK_INIT_SUCCESS, jSONObject);
    }

    public final C3617ne a(C3617ne c3617ne) {
        C3617ne c3617ne2;
        ck.p.j(c3617ne, "error");
        int iC = c3617ne.c();
        if (iC == 2070) {
            c3617ne2 = new C3617ne(c3617ne.c(), "noServerResponse");
        } else {
            if (iC != 2110) {
                return c3617ne;
            }
            c3617ne2 = new C3617ne(c3617ne.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return c3617ne2;
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public static /* synthetic */ void a(C3768wb c3768wb, C3617ne c3617ne, long j10, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i10 & 4) != 0) {
            jSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        c3768wb.a(c3617ne, j10, jSONObject);
    }

    public final void a(C3617ne c3617ne, long j10, JSONObject jSONObject) {
        ck.p.j(c3617ne, "error");
        ck.p.j(jSONObject, "data");
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, c3617ne.c());
            jSONObject.put("reason", c3617ne.d());
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j10);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C3772wf.a(D5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(String str, LevelPlay.AdFormat adFormat, int i10, String str2) throws JSONException {
        ck.p.j(str, "placementName");
        ck.p.j(adFormat, "adFormat");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("placement", str);
        jSONObjectJsonObjectInit.put(C3397bb.f28234f, adFormat.getValue());
        jSONObjectJsonObjectInit.put("adf", C3772wf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C3772wf.a(D5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void a(String str, int i10, String str2) throws JSONException {
        ck.p.j(str, "adUnitId");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C3772wf.a(D5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }
}
