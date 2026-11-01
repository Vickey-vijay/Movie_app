package io.bidmachine.analytics;

import android.content.Context;
import android.util.Base64;
import bk.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.internal.AbstractC4735e;
import io.bidmachine.analytics.internal.C;
import io.bidmachine.analytics.internal.C4731a;
import io.bidmachine.analytics.internal.C4741k;
import io.bidmachine.analytics.internal.C4743m;
import io.bidmachine.analytics.internal.C4748s;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import mj.g;
import mj.r;
import nj.n;
import nk.j;
import nk.j2;
import nk.l0;
import nk.l1;
import rj.c;
import tj.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ/\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00100\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rR!\u0010\u001f\u001a\u00020\u00198@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lio/bidmachine/analytics/BidMachineAnalytics;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;)V", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "configure", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/ConfigureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/ConfigureListener;)V", "", "typeId", "", "", "getImpData", "(I)Ljava/util/Map;", "", "outPublicKey", "Lio/bidmachine/analytics/internal/s;", "a", "([B)Lio/bidmachine/analytics/internal/s;", "Lnk/l0;", "Lmj/g;", "getScope$bidmachine_android_sdk_bh_3_3_0", "()Lnk/l0;", "getScope$bidmachine_android_sdk_bh_3_3_0$annotations", "()V", "scope", "<set-?>", "b", "Ljava/lang/String;", "getSessionId$bidmachine_android_sdk_bh_3_3_0", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "c", "Lio/bidmachine/analytics/internal/s;", "getEncryptionManager$bidmachine_android_sdk_bh_3_3_0", "()Lio/bidmachine/analytics/internal/s;", "setEncryptionManager$bidmachine_android_sdk_bh_3_3_0", "(Lio/bidmachine/analytics/internal/s;)V", "encryptionManager", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final g scope = kotlin.b.a(b.f58644a);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String sessionId = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static C4748s encryptionManager;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @d(c = "io.bidmachine.analytics.BidMachineAnalytics$configure$2", f = "BidMachineAnalytics.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f58639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnalyticsConfig f58640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f58641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f58642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ConfigureListener f58643f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, c<? super a> cVar) {
            super(2, cVar);
            this.f58640c = analyticsConfig;
            this.f58641d = str;
            this.f58642e = context;
            this.f58643f = configureListener;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            a aVar = new a(this.f58640c, this.f58641d, this.f58642e, this.f58643f, cVar);
            aVar.f58639b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM3458constructorimpl;
            Object objM3458constructorimpl2;
            sj.a.f();
            if (this.f58638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            AnalyticsConfig analyticsConfig = this.f58640c;
            try {
                Result.a aVar = Result.Companion;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_bh_3_3_0(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            }
            Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            try {
                BidMachineAnalytics.INSTANCE.a(this.f58642e, this.f58640c, this.f58643f);
                objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th3) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th3));
            }
            if (Result.m3464isSuccessimpl(objM3458constructorimpl2)) {
            }
            Result.m3461exceptionOrNullimpl(objM3458constructorimpl2);
            return r.f64562a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnk/l0;", "a", "()Lnk/l0;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58644a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0 invoke() {
            return kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(l1.c(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        C4743m.f58896a.a(context, analyticsConfig);
        C4741k.f58885a.a(context, analyticsConfig);
        if (listener != null) {
            listener.onConfigured();
        }
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int typeId) {
        AbstractC4735e.a aVar = (AbstractC4735e.a) n.R(AbstractC4735e.a.values(), typeId);
        return aVar == null ? kotlin.collections.a.j() : C4741k.f58885a.a(aVar);
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_bh_3_3_0$annotations() {
    }

    public static final void initialize(Context context) {
        C4741k.f58885a.b(context.getApplicationContext());
    }

    public final l0 getScope$bidmachine_android_sdk_bh_3_3_0() {
        return (l0) scope.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_bh_3_3_0() {
        return sessionId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4748s a(byte[] outPublicKey) {
        C4731a c4731a = new C4731a();
        return new C4748s(c4731a, new C(outPublicKey, c4731a.getName(), null, false, 12, null));
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener listener) {
        String str = analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
        sessionId = str;
        initialize(context);
        j.d(INSTANCE.getScope$bidmachine_android_sdk_bh_3_3_0(), null, null, new a(analyticsConfig, str, context.getApplicationContext(), listener, null), 3, null);
    }

    public final C4748s getEncryptionManager$bidmachine_android_sdk_bh_3_3_0() {
        return encryptionManager;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_bh_3_3_0(C4748s c4748s) {
        encryptionManager = c4748s;
    }
}
