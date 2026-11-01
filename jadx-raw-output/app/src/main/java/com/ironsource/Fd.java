package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f26533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bk.a<Long> f26534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7 f26535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f26536d;

    public /* synthetic */ class a extends FunctionReferenceImpl implements bk.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26537a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            ck.p.j(exc, "error");
            Fd.this.a(exc.getMessage());
        }

        public void onResult(Object obj) {
            Fd.this.c();
        }
    }

    public Fd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    @SuppressLint({"NewApi"})
    public final void c(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        d();
        try {
            MeasurementManager measurementManagerA = C3547k0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.f26536d, a());
            }
        } catch (Exception e10) {
            a(e10.getMessage());
            C3676r4.d().a(e10);
        }
    }

    public Fd(F7 f10, bk.a<Long> aVar, L7 l10, Executor executor) {
        ck.p.j(f10, "eventManager");
        ck.p.j(aVar, "getTimeFunction");
        ck.p.j(l10, "serviceProvider");
        ck.p.j(executor, "executor");
        this.f26533a = f10;
        this.f26534b = aVar;
        this.f26535c = l10;
        this.f26536d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C3649pa.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29880b) : null;
        String str = list != null ? (String) nj.b0.f0(list) : null;
        return str == null ? "" : str;
    }

    private final void d() {
        this.f26533a.a(new C5(D5.REGISTER_TRIGGER, (JSONObject) null));
    }

    private final Uri a(Context context) {
        B7 b7I = this.f26535c.i();
        String strA = IronSourceUtils.a(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(Q6.V0, b7I.I(context)).appendQueryParameter(Q6.L0, b7I.y(context)).appendQueryParameter("auid", b7I.d(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(Q6.f27440j0, String.valueOf(C3547k0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.f26534b.invoke().longValue())).appendQueryParameter("deviceLanguage", b7I.c(context)).appendQueryParameter("deviceCarrier", b7I.u(context)).appendQueryParameter("connectionType", strA).appendQueryParameter("wifi", String.valueOf(lk.x.E(strA, "wifi", true))).build();
        ck.p.i(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Fd(F7 f10, bk.a aVar, L7 l10, Executor executor, int i10, ck.i iVar) {
        f10 = (i10 & 1) != 0 ? Lb.f26968s.d().q() : f10;
        aVar = (i10 & 2) != 0 ? a.f26537a : aVar;
        l10 = (i10 & 4) != 0 ? Lb.f26968s.d() : l10;
        if ((i10 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            ck.p.i(executor, "newSingleThreadExecutor()");
        }
        this(f10, aVar, l10, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f26533a.a(new C5(D5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f26533a.a(new C5(D5.REGISTER_TRIGGER_FAIL, IronSourceVideoBridge.jsonObjectInit().put("reason", str)));
    }
}
