package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J2 implements Ea {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashSet f55375n = new HashSet(Arrays.asList(1, 13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H2 f55376o = new H2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f55378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PublicLogger f55379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Sn f55380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Fg f55381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final C4613w6 f55382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4127d0 f55383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4650xi f55384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4444pb f55385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Df f55386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N9 f55387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ke f55388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4227gn f55389m;

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f55379c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f55379c.info("Put error environment pair <%s, %s>", str, str2);
        Gh gh2 = this.f55378b;
        synchronized (gh2) {
            E8 e10 = gh2.f55268c;
            e10.f55174b.b(e10.f55173a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        Eg eg2 = new Eg(str, a(th2));
        C4650xi c4650xi = this.f55384h;
        byte[] byteArray = MessageNano.toByteArray(this.f55381e.fromModel(eg2));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, str, 5892, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f55379c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3("", str, 1, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        Rn rnA = Un.a(th2, new V(null, null, this.f55386j.a()), null, (String) this.f55387k.f55618b.a(), (Boolean) this.f55387k.f55619c.a());
        C4650xi c4650xi = this.f55384h;
        c4650xi.a(c4650xi.a(rnA, this.f55378b));
        this.f55379c.info("Unhandled exception received: " + rnA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f55379c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f55379c.info("Clear app environment", new Object[0]);
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        Q5 q5N = N3.n();
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(q5N, false, 1, null, new Gh(cf2, counterConfiguration, e10, str)));
    }

    public final void d(String str) {
        if (this.f55378b.f()) {
            return;
        }
        this.f55384h.f57941d.c();
        C4444pb c4444pb = this.f55385i;
        c4444pb.f57501a.removeCallbacks(c4444pb.f57503c, c4444pb.f57502b.f55378b.f55335b.getApiKey());
        this.f55378b.f55270e = true;
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3("", str, 3, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    public final void e(String str) {
        this.f55384h.f57941d.b();
        C4444pb c4444pb = this.f55385i;
        C4444pb.a(c4444pb.f57501a, c4444pb.f57502b, c4444pb.f57503c);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3("", str, 6400, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55378b.f55270e = false;
    }

    public void k() {
        String str;
        C4497rf c4497rf;
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        C4597vf c4597vf = gh2.f55269d;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey());
        Set set = AbstractC4641x9.f57918a;
        JSONObject jSONObject = new JSONObject();
        if (c4597vf != null && (c4497rf = c4597vf.f57820a) != null) {
            try {
                jSONObject.put("preloadInfo", c4497rf.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(string, "", 6144, 0, orCreatePublicLogger);
        n10.c(str);
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f55379c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        String str;
        C4650xi c4650xi = this.f55384h;
        E e10 = new E(adRevenue, z10, this.f55389m, this.f55379c);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey()), e10);
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e11 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(n3A, false, 1, null, new Gh(cf2, counterConfiguration, e11, str)));
        this.f55379c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC4241hb.b(adRevenue.payload) + ", autoCollected=" + z10 + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C4152e0 c4152e0 = new C4152e0(new C4178f0(this, map));
        C4368ma c4368ma = new C4368ma();
        C4513s6 c4513s6 = C4105c4.l().f56436a;
        Thread threadA = c4152e0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c4152e0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C4655xn c4655xn = (C4655xn) c4368ma.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Cn());
        try {
            mapC = c4152e0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C4655xn) c4368ma.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c4655xn, arrayList, c4513s6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f55379c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        for (Ei ei2 : eCommerceEvent.toProto()) {
            N3 n10 = new N3(LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey()));
            EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
            n10.f55776d = 41000;
            n10.f55774b = n10.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ei2.f55185a)));
            n10.f55779g = ei2.f55186b.getBytesTruncated();
            Cf cf2 = new Cf(gh2.f55334a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
            E8 e10 = gh2.f55268c;
            synchronized (gh2) {
                str = gh2.f55271f;
            }
            c4650xi.a(new C4624wh(n10, false, 1, null, new Gh(cf2, counterConfiguration, e10, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Oi oi2 = I2.f55333a;
        oi2.getClass();
        ro roVarA = oi2.a(revenue);
        if (!roVarA.f57616a) {
            this.f55379c.warning("Passed revenue is not valid. Reason: " + roVarA.f57617b, new Object[0]);
            return;
        }
        C4650xi c4650xi = this.f55384h;
        Pi pi2 = new Pi(revenue, this.f55379c);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey()), pi2);
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(n3A, false, 1, null, new Gh(cf2, counterConfiguration, e10, str)));
        this.f55379c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + com.ironsource.Z7.f27998r + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C4176eo c4176eo = new C4176eo(C4176eo.f56699c);
        Iterator<UserProfileUpdate<? extends InterfaceC4202fo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC4202fo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f55379c);
            userProfileUpdatePatcher.a(c4176eo);
        }
        C4305jo c4305jo = new C4305jo();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c4176eo.f56700a.size(); i10++) {
            SparseArray sparseArray = c4176eo.f56700a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i10))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C4228go) it2.next());
            }
        }
        c4305jo.f57061a = (C4228go[]) arrayList.toArray(new C4228go[arrayList.size()]);
        ro roVarA = f55376o.a(c4305jo);
        if (!roVarA.f57616a) {
            this.f55379c.warning("UserInfo wasn't sent because " + roVarA.f57617b, new Object[0]);
            return;
        }
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        Q5 q5A = N3.a(c4305jo);
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(q5A, false, 1, null, new Gh(cf2, counterConfiguration, e10, str)));
        this.f55379c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f55379c.info("Send event buffer", new Object[0]);
        C4650xi c4650xi = this.f55384h;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        N3 n10 = new N3("", "", 256, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f55378b.f55335b.setDataSendingEnabled(z10);
        this.f55379c.info("Updated data sending enabled: %s", Boolean.valueOf(z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        n10.f55788p = Collections.singletonMap(str, bArr);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        N3 n10 = new N3(LoggerStorage.getOrCreatePublicLogger(gh2.f55335b.getApiKey()));
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        n10.f55776d = 40962;
        n10.c(str);
        n10.f55774b = n10.e(str);
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str2 = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(n10, false, 1, null, new Gh(cf2, counterConfiguration, e10, str2)));
        this.f55379c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    public J2(Context context, C4650xi c4650xi, Gh gh2, N9 n10, C4513s6 c4513s6, Sn sn2, Fg fg2, C4613w6 c4613w6, C4127d0 c4127d0, Ke ke2) {
        Context applicationContext = context.getApplicationContext();
        this.f55377a = applicationContext;
        this.f55384h = c4650xi;
        this.f55378b = gh2;
        this.f55387k = n10;
        this.f55380d = sn2;
        this.f55381e = fg2;
        this.f55382f = c4613w6;
        this.f55383g = c4127d0;
        this.f55388l = ke2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.b().getApiKey());
        this.f55379c = orCreatePublicLogger;
        if (Z2.a(gh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f55386j = c4513s6;
        this.f55389m = new C4227gn(applicationContext);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f55379c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f55379c.info("Put app environment: <%s, %s>", str, str2);
        C4650xi c4650xi = this.f55384h;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        Q5 q5B = N3.b(str, str2);
        Cf cf2 = new Cf(gh2.f55334a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f55335b);
        E8 e10 = gh2.f55268c;
        synchronized (gh2) {
            str3 = gh2.f55271f;
        }
        c4650xi.a(new C4624wh(q5B, false, 1, null, new Gh(cf2, counterConfiguration, e10, str3)));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str, @Nullable String str2) {
        this.f55379c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(str2, str, 1, 0, publicLogger);
        n10.f55784l = EnumC4392n9.JS;
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f55379c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(str2, str, 1, 0, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public final Rn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof O1) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return Un.a(th3, new V(null, null, this.f55386j.a()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f55387k.f55618b.a(), (Boolean) this.f55387k.f55619c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        C4588v6 c4588v6 = new C4588v6(new Eg(str2, a(th2)), str);
        C4650xi c4650xi = this.f55384h;
        byte[] byteArray = MessageNano.toByteArray(this.f55382f.fromModel(c4588v6));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, str2, 5896, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Rn rnA = this.f55388l.a(pluginErrorDetails);
        C4650xi c4650xi = this.f55384h;
        Hn hn2 = rnA.f55830a;
        String str = hn2 != null ? (String) WrapUtils.getOrDefault(hn2.f55325a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f55380d.fromModel(rnA));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, str, 5891, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str) {
        C4650xi c4650xi = this.f55384h;
        Q5 q5A = Q5.a(str);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(q5A, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        C4650xi c4650xi = this.f55384h;
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        c4650xi.a(new N3("", str, 1, 0, publicLogger), this.f55378b, 1, map);
        PublicLogger publicLogger2 = this.f55379c;
        StringBuilder sb2 = new StringBuilder("Event received: ");
        sb2.append(WrapUtils.wrapToTag(str));
        sb2.append(". With value: ");
        sb2.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final boolean b() {
        return this.f55378b.f();
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Rn rn2) {
        C4650xi c4650xi = this.f55384h;
        C4624wh c4624whA = c4650xi.a(rn2, this.f55378b);
        Gh gh2 = c4624whA.f57891e;
        Ql ql2 = c4650xi.f57942e;
        if (ql2 != null) {
            gh2.f55335b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        c4650xi.f57940c.b(c4624whA);
        this.f55379c.info("Unhandled exception received: " + rn2, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        Rn rnA;
        Ke ke2 = this.f55388l;
        if (pluginErrorDetails != null) {
            rnA = ke2.a(pluginErrorDetails);
        } else {
            ke2.getClass();
            rnA = null;
        }
        Eg eg2 = new Eg(str, rnA);
        C4650xi c4650xi = this.f55384h;
        byte[] byteArray = MessageNano.toByteArray(this.f55381e.fromModel(eg2));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, str, 5896, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC4392n9 enumC4392n9;
        if (f55375n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i10 = F8.f55228a[moduleEvent.getCategory().ordinal()];
        if (i10 == 1) {
            enumC4392n9 = EnumC4392n9.NATIVE;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC4392n9 = EnumC4392n9.SYSTEM;
        }
        n10.f55784l = enumC4392n9;
        n10.f55775c = AbstractC4241hb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            n10.f55788p = moduleEvent.getExtras();
        }
        this.f55384h.a(n10, this.f55378b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC4204g0
    public final void a(@NonNull V v10) {
        C4101c0 c4101c0 = new C4101c0(v10, (String) this.f55387k.f55618b.a(), (Boolean) this.f55387k.f55619c.a());
        C4650xi c4650xi = this.f55384h;
        byte[] byteArray = MessageNano.toByteArray(this.f55383g.fromModel(c4101c0));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, "", 5968, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        String str = null;
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        PublicLogger publicLogger2 = this.f55379c;
        StringBuilder sb2 = new StringBuilder("ANR was reported ");
        C4655xn c4655xn = v10.f56001a;
        if (c4655xn != null) {
            str = "Thread[name=" + c4655xn.f57972a + ",tid={" + c4655xn.f57974c + ", priority=" + c4655xn.f57973b + ", group=" + c4655xn.f57975d + "}] at " + nj.b0.p0(c4655xn.f57977f, "\n", null, null, 0, null, null, 62, null);
        }
        sb2.append(str);
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        Rn rnA;
        Ke ke2 = this.f55388l;
        if (pluginErrorDetails != null) {
            rnA = ke2.a(pluginErrorDetails);
        } else {
            ke2.getClass();
            rnA = null;
        }
        C4588v6 c4588v6 = new C4588v6(new Eg(str2, rnA), str);
        C4650xi c4650xi = this.f55384h;
        byte[] byteArray = MessageNano.toByteArray(this.f55382f.fromModel(c4588v6));
        PublicLogger publicLogger = this.f55379c;
        Set set = AbstractC4641x9.f57918a;
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        N3 n10 = new N3(byteArray, str2, 5896, publicLogger);
        Gh gh2 = this.f55378b;
        c4650xi.getClass();
        c4650xi.a(C4650xi.a(n10, gh2), gh2, 1, (Map) null);
        this.f55379c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
