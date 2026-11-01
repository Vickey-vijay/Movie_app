package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: InternalAppEventsLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dB\u0013\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 B\u001d\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\"B%\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001c\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J$\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J.\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J+\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0006R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006'"}, d2 = {"Lcom/facebook/appevents/x;", "", "", C3426d4.i.f28547j0, "Landroid/os/Bundle;", "parameters", "Lmj/r;", "d", "", "valueToSum", "c", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "j", "buttonText", "e", "i", InneractiveMediationDefs.GENDER_FEMALE, "h", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "g", "b", "a", "Lcom/facebook/appevents/o;", "Lcom/facebook/appevents/o;", "loggerImpl", "<init>", "(Lcom/facebook/appevents/o;)V", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "(Landroid/content/Context;)V", "applicationId", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final o loggerImpl;

    /* JADX INFO: renamed from: com.facebook.appevents.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InternalAppEventsLogger.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0007J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/x$a;", "", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "c", "Ljava/util/concurrent/Executor;", "b", "", "d", "", "ud", "Lmj/r;", "e", "activityName", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/appevents/x;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final x a(String activityName, String applicationId, AccessToken accessToken) {
            ck.p.j(activityName, "activityName");
            return new x(activityName, applicationId, accessToken);
        }

        public final Executor b() {
            return o.INSTANCE.h();
        }

        public final AppEventsLogger.FlushBehavior c() {
            return o.INSTANCE.j();
        }

        public final String d() {
            return o.INSTANCE.l();
        }

        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        public final void e(Map<String, String> map) {
            ck.p.j(map, "ud");
            a0.g(map);
        }
    }

    public x(o oVar) {
        ck.p.j(oVar, "loggerImpl");
        this.loggerImpl = oVar;
    }

    public final void a() {
        this.loggerImpl.j();
    }

    public final void b(Bundle bundle) {
        ck.p.j(bundle, "parameters");
        if (((bundle.getInt("previous") & 2) != 0) || q1.t.p()) {
            this.loggerImpl.o("fb_sdk_settings_changed", null, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.loggerImpl.n(str, str2);
    }

    public x(Context context) {
        this(new o(context, (String) null, (AccessToken) null));
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (q1.t.p()) {
            this.loggerImpl.k(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (q1.t.p()) {
            this.loggerImpl.l(str, bundle);
        }
    }

    public final void f(String str) {
        if (q1.t.p()) {
            this.loggerImpl.o(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (q1.t.p()) {
            this.loggerImpl.o(str, null, bundle);
        }
    }

    public final void h(String eventName, Double valueToSum, Bundle parameters) {
        if (q1.t.p()) {
            this.loggerImpl.o(eventName, valueToSum, parameters);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (q1.t.p()) {
            this.loggerImpl.p(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (q1.t.p()) {
            this.loggerImpl.r(bigDecimal, currency, bundle);
        }
    }

    public x(Context context, String str) {
        this(new o(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(String str, String str2, AccessToken accessToken) {
        this(new o(str, str2, accessToken));
        ck.p.j(str, "activityName");
    }
}
