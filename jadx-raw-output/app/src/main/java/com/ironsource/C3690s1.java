package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3690s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30665a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30666b;

    /* JADX INFO: renamed from: com.ironsource.s1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3714t8.e f30668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f30670d;

        public final String a() {
            return this.f30667a;
        }

        public a(String str, C3714t8.e eVar, String str2, JSONObject jSONObject) {
            ck.p.j(str, "name");
            ck.p.j(eVar, C3426d4.i.f28552m);
            ck.p.j(str2, "demandSourceName");
            ck.p.j(jSONObject, "params");
            this.f30667a = str;
            this.f30668b = eVar;
            this.f30669c = str2;
            this.f30670d = jSONObject;
        }

        public final a a(String str, C3714t8.e eVar, String str2, JSONObject jSONObject) {
            ck.p.j(str, "name");
            ck.p.j(eVar, C3426d4.i.f28552m);
            ck.p.j(str2, "demandSourceName");
            ck.p.j(jSONObject, "params");
            return new a(str, eVar, str2, jSONObject);
        }

        public final C3714t8.e b() {
            return this.f30668b;
        }

        public final String c() {
            return this.f30669c;
        }

        public final JSONObject d() {
            return this.f30670d;
        }

        public final String e() {
            return this.f30669c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return ck.p.e(this.f30667a, aVar.f30667a) && this.f30668b == aVar.f30668b && ck.p.e(this.f30669c, aVar.f30669c) && ck.p.e(this.f30670d.toString(), aVar.f30670d.toString());
        }

        public final String f() {
            return this.f30667a;
        }

        public final JSONObject g() {
            return this.f30670d;
        }

        public final C3714t8.e h() {
            return this.f30668b;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f30667a + ", productType=" + this.f30668b + ", demandSourceName=" + this.f30669c + ", params=" + this.f30670d + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, C3714t8.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f30667a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f30668b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f30669c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f30670d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit(this.f30670d.toString()).put(C3426d4.i.f28552m, this.f30668b).put("demandSourceName", this.f30669c);
            ck.p.i(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$b */
    public static final class b {
        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$c */
    @tj.d(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30671a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MeasurementManager f30673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f30674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f30675e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, rj.c<? super c> cVar) {
            super(2, cVar);
            this.f30673c = measurementManager;
            this.f30674d = uri;
            this.f30675e = motionEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return C3690s1.this.new c(this.f30673c, this.f30674d, this.f30675e, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f30671a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C3690s1 c3690s1 = C3690s1.this;
                MeasurementManager measurementManager = this.f30673c;
                Uri uri = this.f30674d;
                ck.p.i(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                MotionEvent motionEvent = this.f30675e;
                this.f30671a = 1;
                if (c3690s1.a(measurementManager, uri, motionEvent, this) == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$d */
    @tj.d(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30676a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MeasurementManager f30678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f30679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, rj.c<? super d> cVar) {
            super(2, cVar);
            this.f30678c = measurementManager;
            this.f30679d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return C3690s1.this.new d(this.f30678c, this.f30679d, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.f30676a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                C3690s1 c3690s1 = C3690s1.this;
                MeasurementManager measurementManager = this.f30678c;
                Uri uri = this.f30679d;
                ck.p.i(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                this.f30676a = 1;
                if (c3690s1.a(measurementManager, uri, null, this) == objF) {
                    return objF;
                }
            }
            return mj.r.f64562a;
        }
    }

    static {
        String name = b.class.getName();
        ck.p.i(name, "this::class.java.name");
        f30666b = name;
    }

    public final a a(Context context, InterfaceC3724u1 interfaceC3724u1) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(interfaceC3724u1, "message");
        if (interfaceC3724u1 instanceof InterfaceC3724u1.a) {
            return a(context, (InterfaceC3724u1.a) interfaceC3724u1);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a a(Context context, InterfaceC3724u1.a aVar) {
        MeasurementManager measurementManagerA = C3547k0.a(context);
        if (measurementManagerA == null) {
            Logger.i(f30666b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC3724u1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC3724u1.a.C0289a) {
                return a((InterfaceC3724u1.a.C0289a) aVar, measurementManagerA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return a(aVar, "failed to handle attribution, message: " + e10.getMessage());
        }
    }

    private final a a(InterfaceC3724u1.a aVar, MeasurementManager measurementManager) throws InterruptedException {
        nk.i.b(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC3724u1.a.C0289a c0289a, MeasurementManager measurementManager) throws InterruptedException {
        Uri uri = Uri.parse(c0289a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        nk.i.b(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0289a.n(), c0289a.o().c(), c0289a.o().d(), c0289a.p()), null), 1, null);
        return a(c0289a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, rj.c<? super mj.r> cVar) throws Throwable {
        rj.f fVar = new rj.f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C3707t1.a(fVar));
        Object objA = fVar.a();
        if (objA == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    private final a a(InterfaceC3724u1.a aVar) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("params", IronSourceVideoBridge.jsonObjectInit().put("type", aVar instanceof InterfaceC3724u1.a.C0289a ? "click" : "impression"));
        String strA = aVar.a();
        C3714t8.e eVarD = aVar.d();
        String strE = aVar.e();
        ck.p.i(jSONObjectPut, "params");
        return new a(strA, eVarD, strE, jSONObjectPut);
    }

    private final a a(InterfaceC3724u1 interfaceC3724u1, String str) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("reason", str).put("type", interfaceC3724u1 instanceof InterfaceC3724u1.a.C0289a ? "click" : "impression");
        String strC = interfaceC3724u1.c();
        C3714t8.e eVarD = interfaceC3724u1.d();
        String strE = interfaceC3724u1.e();
        JSONObject jSONObjectPut2 = IronSourceVideoBridge.jsonObjectInit().put("params", jSONObjectPut);
        ck.p.i(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }
}
