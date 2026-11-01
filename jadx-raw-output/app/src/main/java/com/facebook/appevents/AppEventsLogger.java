package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventsLogger.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0002\n\u0014B%\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "", C3426d4.i.f28547j0, "Landroid/os/Bundle;", "parameters", "Lmj/r;", "c", "b", "Lcom/facebook/appevents/o;", "a", "Lcom/facebook/appevents/o;", "loggerImpl", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "FlushBehavior", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventsLogger {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14163c = AppEventsLogger.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final o loggerImpl;

    /* JADX INFO: compiled from: AppEventsLogger.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static FlushBehavior[] valuesCustom() {
            FlushBehavior[] flushBehaviorArrValuesCustom = values();
            return (FlushBehavior[]) Arrays.copyOf(flushBehaviorArrValuesCustom, flushBehaviorArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEventsLogger$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEventsLogger.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0007J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/AppEventsLogger$a;", "", "Landroid/app/Application;", "application", "Lmj/r;", "a", "", "applicationId", "b", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/appevents/AppEventsLogger;", "g", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "d", "h", "e", "c", "ACTION_APP_EVENTS_FLUSHED", "Ljava/lang/String;", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "kotlin.jvm.PlatformType", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void a(Application application) {
            ck.p.j(application, "application");
            o.INSTANCE.f(application, null);
        }

        public final void b(Application application, String str) {
            ck.p.j(application, "application");
            o.INSTANCE.f(application, str);
        }

        public final String c(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            return o.INSTANCE.i(context);
        }

        public final FlushBehavior d() {
            return o.INSTANCE.j();
        }

        public final void f(Context context, String str) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            o.INSTANCE.m(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppEventsLogger g(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void h() {
            o.INSTANCE.s();
        }

        public final String e() {
            return b.b();
        }
    }

    public AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new o(context, str, accessToken);
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, ck.i iVar) {
        this(context, str, accessToken);
    }

    public static final void a(Application application) {
        INSTANCE.a(application);
    }

    public final void b() {
        this.loggerImpl.j();
    }

    public final void c(String str, Bundle bundle) {
        this.loggerImpl.l(str, bundle);
    }
}
