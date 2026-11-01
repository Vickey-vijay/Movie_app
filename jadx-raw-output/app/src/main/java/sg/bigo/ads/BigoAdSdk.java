package sg.bigo.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.Gc;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.m;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.n.e;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.core.b.b.j;

/* JADX INFO: loaded from: classes8.dex */
public class BigoAdSdk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static sg.bigo.ads.controller.e.a f67248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f67249e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f67245a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f67246b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f67247c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<InitListener> f67250f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Pair<String, String>> f67251g = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.BigoAdSdk$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67258a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f67258a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67258a[ConsentOptions.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67258a[ConsentOptions.CCPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67258a[ConsentOptions.COPPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface InitListener {
        void onInitialized();
    }

    @NonNull
    public static a a(@NonNull Context context) {
        if (f67249e == null) {
            f67249e = new a(context);
        }
        if (!f67249e.f69511c) {
            f67249e.b(context);
        }
        return f67249e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> a(final sg.bigo.ads.api.b bVar, sg.bigo.ads.controller.c cVar) {
        String str;
        bVar.f69326h.f69332f = System.currentTimeMillis();
        sg.bigo.ads.controller.a aVar = new sg.bigo.ads.controller.a(cVar);
        if (!f67245a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair<>(bVar, null));
            return null;
        }
        b(f67248d.f70747a);
        final sg.bigo.ads.controller.e.a aVar2 = f67248d;
        if (q.a((CharSequence) aVar2.f70751e.f70804a.getAppKey())) {
            aVar.a(0, 1013, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", new Pair(bVar, null));
            return null;
        }
        sg.bigo.ads.api.core.c cVarB = bVar.b();
        if (cVarB != null) {
            aVar.a(0, cVarB.f69356a, cVarB.f69357b, cVarB.f69358c, new Pair(bVar, null));
            return null;
        }
        int i10 = 0;
        Object[] objArr = 0;
        if (!sg.bigo.ads.common.x.a.q()) {
            final sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = new sg.bigo.ads.controller.e.a.C0725a<>(bVar, aVar, objArr == true ? 1 : 0);
            d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    if (bVar.f()) {
                        ((sg.bigo.ads.api.b) c0725a.f70790a).b(0);
                        a.a(a.this, c0725a);
                    } else {
                        a.this.f70758l.b();
                        a.this.f70752f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.9.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11) {
                                a.a(a.this, 1, (Map) null);
                                ((sg.bigo.ads.api.b) c0725a.f70790a).b(i11);
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                a.a(a.this, c0725a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11, int i12, String str2) {
                                ((sg.bigo.ads.api.b) c0725a.f70790a).b(i11);
                                if (a.this.f70748b.N()) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    a.a(a.this, c0725a);
                                } else {
                                    AnonymousClass9 anonymousClass10 = AnonymousClass9.this;
                                    a.this.a(c0725a, 1008, i12, str2);
                                }
                            }
                        }, 1);
                    }
                }
            });
            return c0725a;
        }
        String str2 = "Missing CCPA consent";
        if (sg.bigo.ads.common.x.a.m() == 2) {
            str = "Missing GDPR consent";
            i10 = 1;
        } else {
            str = "Missing CCPA consent";
        }
        if (sg.bigo.ads.common.x.a.o() == 2) {
            i10++;
            str = "Missing LGPD consent";
        }
        if (sg.bigo.ads.common.x.a.n() == 2) {
            i10++;
        } else {
            str2 = str;
        }
        if (sg.bigo.ads.common.x.a.p() == 2) {
            i10++;
            str2 = "Missing COPPA consent";
        }
        aVar.a(0, 1001, 800, i10 > 1 ? "Missing user consent" : str2, new Pair(bVar, null));
        return null;
    }

    private static void a(final Context context, @NonNull final ConsentOptions consentOptions, boolean z10) {
        boolean zA = a(consentOptions, z10);
        if (z10 || !zA) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.2
            @Override // java.lang.Runnable
            public final void run() {
                HashMap map = new HashMap();
                map.put(ConsentOptions.GDPR, Integer.valueOf(sg.bigo.ads.common.x.a.m()));
                map.put(ConsentOptions.LGPD, Integer.valueOf(sg.bigo.ads.common.x.a.o()));
                map.put(ConsentOptions.CCPA, Integer.valueOf(sg.bigo.ads.common.x.a.n()));
                map.put(ConsentOptions.COPPA, Integer.valueOf(sg.bigo.ads.common.x.a.p()));
                map.remove(consentOptions);
                int iL = sg.bigo.ads.common.x.a.l();
                sg.bigo.ads.common.t.a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
                sg.bigo.ads.core.d.b.b bVar = sg.bigo.ads.core.d.c.a().f71253b;
                if (bVar != null) {
                    bVar.f71233c.f();
                }
                sg.bigo.ads.core.b.b bVarA = sg.bigo.ads.core.b.b.a();
                sg.bigo.ads.core.b.b.a aVar = bVarA.f71125a;
                if (aVar != null) {
                    aVar.f71134b.e();
                }
                j jVar = bVarA.f71127c;
                if (jVar != null) {
                    jVar.f71174c.g();
                    jVar.f71173b.g();
                }
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                dVarA.f71325e = context.getApplicationContext();
                dVarA.b();
                dVarA.f71321a.clear();
                sg.bigo.ads.core.player.b bVarA2 = sg.bigo.ads.core.player.b.a();
                Context context2 = context;
                sg.bigo.ads.common.h.b bVar2 = bVarA2.f71803g;
                if (bVar2 != null) {
                    sg.bigo.ads.common.h.b.b.a();
                    bVar2.f69684a.clear();
                    bVar2.f69686c.clear();
                    bVar2.f69685b.clear();
                    bVar2.f69687d.clear();
                }
                List<n> list = bVarA2.f71800d;
                if (list != null) {
                    list.clear();
                }
                List<n> list2 = bVarA2.f71801e;
                if (list2 != null) {
                    list2.clear();
                }
                Map<String, sg.bigo.ads.core.player.b.a> map2 = bVarA2.f71802f;
                if (map2 != null) {
                    map2.clear();
                }
                h.a.f69886a.e(context2);
                f.b(new File(o.a(context)));
                sg.bigo.ads.common.g.a.a.a();
                sg.bigo.ads.common.x.a.s();
                BigoAdSdk.a(consentOptions);
                for (Map.Entry entry : map.entrySet()) {
                    int i10 = AnonymousClass5.f67258a[((ConsentOptions) entry.getKey()).ordinal()];
                    if (i10 == 1) {
                        sg.bigo.ads.common.x.a.e(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 2) {
                        sg.bigo.ads.common.x.a.c(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 3) {
                        sg.bigo.ads.common.x.a.d(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 4) {
                        sg.bigo.ads.common.x.a.f(((Integer) entry.getValue()).intValue());
                    }
                }
                sg.bigo.ads.common.x.a.b(iL);
            }
        });
    }

    public static /* synthetic */ void a(final String str) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f67248d != null) {
                    for (Pair pair : BigoAdSdk.f67251g) {
                        BigoAdSdk.f67248d.a((String) pair.first, (String) pair.second);
                    }
                    Map<String, String> mapB = sg.bigo.ads.controller.a.d.b(str);
                    if (!k.a(mapB)) {
                        for (Map.Entry<String, String> entry : mapB.entrySet()) {
                            BigoAdSdk.f67248d.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                BigoAdSdk.f67251g.clear();
            }
        });
    }

    public static /* synthetic */ boolean a(ConsentOptions consentOptions) {
        return a(consentOptions, false);
    }

    private static boolean a(@NonNull ConsentOptions consentOptions, boolean z10) {
        int i10 = z10 ? 1 : 2;
        boolean z11 = false;
        int i11 = AnonymousClass5.f67258a[consentOptions.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && i10 != sg.bigo.ads.common.x.a.p()) {
                        sg.bigo.ads.common.x.a.f(i10);
                        z11 = true;
                    }
                } else if (i10 != sg.bigo.ads.common.x.a.n()) {
                    sg.bigo.ads.common.x.a.d(i10);
                    z11 = true;
                }
            } else if (i10 != sg.bigo.ads.common.x.a.m()) {
                sg.bigo.ads.common.x.a.c(i10);
                z11 = true;
            }
        } else if (i10 != sg.bigo.ads.common.x.a.o()) {
            sg.bigo.ads.common.x.a.e(i10);
            z11 = true;
        }
        if (z11) {
            f67247c.set(true);
        }
        return z11;
    }

    public static void addExtraHost(@Nullable final String str, @Nullable final String str2) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.3
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f67248d == null || !BigoAdSdk.f67245a.get()) {
                    BigoAdSdk.f67251g.add(Pair.create(str, str2));
                } else {
                    BigoAdSdk.f67248d.a(str, str2);
                }
            }
        });
    }

    private static void b(@NonNull Context context) {
        if (!sg.bigo.ads.common.m.b.f()) {
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPRContent is not changed, so return");
            return;
        }
        sg.bigo.ads.common.m.b.g();
        f67247c.set(true);
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f70322a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        if (!sg.bigo.ads.common.m.b.e(context)) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.x.a.l() != 2);
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPR applies is null, so return");
        } else if (sg.bigo.ads.common.m.a.b()) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.m.a.a());
        } else {
            a(context, ConsentOptions.GDPR, true);
        }
    }

    @Nullable
    public static String getBidderToken() {
        String str;
        String str2;
        if (!f67245a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (f67248d != null) {
                if (f67247c.compareAndSet(true, false)) {
                    sg.bigo.ads.controller.e.a aVar = f67248d;
                    sg.bigo.ads.controller.e.f fVar = aVar.f70753g;
                    if (fVar == null) {
                        fVar = new sg.bigo.ads.controller.e.f();
                        aVar.f70753g = fVar;
                    }
                    if (fVar.f70856a != null) {
                        synchronized (sg.bigo.ads.controller.e.f.class) {
                            fVar.f70856a = null;
                        }
                    }
                }
                sg.bigo.ads.controller.e.a aVar2 = f67248d;
                if (aVar2.f70751e == null) {
                    return null;
                }
                sg.bigo.ads.controller.e.f fVar2 = aVar2.f70753g;
                if (fVar2 == null) {
                    fVar2 = new sg.bigo.ads.controller.e.f();
                    aVar2.f70753g = fVar2;
                }
                sg.bigo.ads.controller.e.d dVar = aVar2.f70751e;
                sg.bigo.ads.controller.e.f.f70855b = true;
                sg.bigo.ads.api.a.h hVar = i.f69318a;
                int iW = hVar != null ? hVar.w() : 0;
                if (iW == 1) {
                    return fVar2.b(dVar);
                }
                if (iW != 2) {
                    return fVar2.a(dVar);
                }
                return (fVar2.f70856a == null || fVar2.f70857c == 0 || System.currentTimeMillis() - fVar2.f70857c > 300000) ? fVar2.b(dVar) : fVar2.a(dVar);
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        sg.bigo.ads.common.t.a.a(0, str, str2);
        return null;
    }

    @NonNull
    public static String getHashId() {
        return "4240b30";
    }

    @NonNull
    public static String getSDKVersion() {
        return "50602";
    }

    @NonNull
    public static String getSDKVersionName() {
        return "5.6.2";
    }

    public static void initialize(@NonNull Context context, @NonNull AdConfig adConfig, @Nullable InitListener initListener) {
        boolean z10 = !f67245a.get();
        if (!z10) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (sg.bigo.ads.controller.e.c.a().f70803b.get() == -1) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z10 = true;
        }
        if (!z10) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f67250f.add(initListener);
        }
        m.a(context);
        m.a(adConfig);
        Context applicationContext = context.getApplicationContext();
        m.a(applicationContext);
        if (f67246b.getAndSet(true)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsDebug = adConfig.isDebug();
        sg.bigo.ads.common.y.a.a((int) (System.currentTimeMillis() / 1000));
        sg.bigo.ads.common.x.b.f70322a = applicationContext;
        sg.bigo.ads.common.m.b.a(applicationContext);
        sg.bigo.ads.common.d.a.a().a(applicationContext);
        b(context);
        t.a(zIsDebug);
        final String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        final sg.bigo.ads.controller.e.a aVar = new sg.bigo.ads.controller.e.a(applicationContext, adConfig);
        f67248d = aVar;
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                BigoAdSdk.f67245a.set(true);
                BigoAdSdk.f67246b.set(false);
                BigoAdSdk.a(extra);
                sg.bigo.ads.common.t.a.a(2, 4, "", "Initialized Bigo Ads SDK successfully.");
                for (InitListener initListener2 : BigoAdSdk.f67250f) {
                    if (initListener2 != null) {
                        initListener2.onInitialized();
                    }
                }
                BigoAdSdk.f67250f.clear();
                if (c.a.a().isEmpty()) {
                    return;
                }
                d.a(3, new Runnable() { // from class: sg.bigo.ads.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.d.b.c(a.c());
                        a.b();
                    }
                });
            }
        };
        aVar.f70756j = jElapsedRealtime;
        aVar.f70751e.f70804a = adConfig;
        aVar.f70753g = new sg.bigo.ads.controller.e.f();
        d.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.4
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
        d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.5
            /* JADX WARN: Code duplicated, block: B:24:0x022f  */
            /* JADX WARN: Code duplicated, block: B:25:0x0235  */
            /* JADX WARN: Code duplicated, block: B:28:0x0270  */
            /* JADX WARN: Code duplicated, block: B:29:0x0277  */
            /* JADX WARN: Code duplicated, block: B:34:0x029b  */
            /* JADX WARN: Code duplicated, block: B:37:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:38:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:41:0x0334  */
            /* JADX WARN: Code duplicated, block: B:44:0x03d5  */
            /* JADX WARN: Code duplicated, block: B:47:0x03ea  */
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                sg.bigo.ads.core.d.c cVarA;
                Context context2;
                sg.bigo.ads.core.d.a.a aVar2;
                sg.bigo.ads.controller.d.g gVar;
                d dVar;
                sg.bigo.ads.core.b.b bVarA;
                Context context3;
                sg.bigo.ads.core.b.a.a aVar3;
                sg.bigo.ads.controller.d.b bVar;
                d dVar2;
                sg.bigo.ads.core.b.a.a aVar4;
                sg.bigo.ads.common.h.a.a aVar5;
                sg.bigo.ads.api.a.j jVarN;
                sg.bigo.ads.core.player.b bVarA2;
                Context context4;
                boolean zA;
                Runnable runnable2;
                final a aVar6 = a.this;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                HashMap map = new HashMap();
                d dVar3 = aVar6.f70751e;
                dVar3.f70807d = dVar3.f70805b.getPackageName();
                dVar3.f70808e = sg.bigo.ads.common.utils.c.a(dVar3.f70805b);
                dVar3.f70809f = sg.bigo.ads.common.utils.c.b(dVar3.f70805b);
                dVar3.f70810g = sg.bigo.ads.common.aa.b.b(dVar3.f70805b);
                dVar3.f70811h = q.d(Build.MANUFACTURER);
                dVar3.f70812i = q.d(Build.MODEL);
                dVar3.f70813j = sg.bigo.ads.common.aa.b.d(dVar3.f70805b);
                Point pointD = sg.bigo.ads.common.utils.e.d(dVar3.f70805b);
                dVar3.f70814k = pointD.x + VastAttributes.HORIZONTAL_POSITION + pointD.y;
                float fA = sg.bigo.ads.common.utils.e.a(dVar3.f70805b);
                dVar3.f70815l = (int) (10.0f * fA);
                if (fA > 0.0f) {
                    dVar3.f70816m = Math.round(pointD.x / fA) + VastAttributes.HORIZONTAL_POSITION + Math.round(pointD.y / fA);
                }
                PackageInfo packageInfoE = sg.bigo.ads.common.utils.c.e(dVar3.f70805b, "com.google.android.gms");
                if (packageInfoE != null) {
                    dVar3.f70817n = packageInfoE.versionName;
                }
                dVar3.f70818o = sg.bigo.ads.common.aa.b.f(dVar3.f70805b);
                dVar3.f70819p = sg.bigo.ads.common.aa.a.a();
                dVar3.f70820q = sg.bigo.ads.common.aa.a.b();
                dVar3.f70821r = p.b(dVar3.f70805b);
                dVar3.f70823t = sg.bigo.ads.common.utils.c.f(dVar3.f70805b, dVar3.f70807d);
                dVar3.f70822s = sg.bigo.ads.common.z.a.a();
                dVar3.f70824u = sg.bigo.ads.common.utils.c.c(dVar3.f70805b);
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                map.put("1", String.valueOf(jElapsedRealtime4));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 1 cost: " + String.valueOf(jElapsedRealtime4));
                sg.bigo.ads.a aVarA = BigoAdSdk.a(aVar6.f70747a);
                if (q.a((CharSequence) aVarA.f67260a)) {
                    aVarA.f67260a = aVar6.f70751e.f70804a.getAppKey();
                }
                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                map.put("2", String.valueOf(jElapsedRealtime6));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 2 cost: " + String.valueOf(jElapsedRealtime6));
                if (TextUtils.equals(aVar6.f70751e.f70804a.getAppKey(), aVarA.f67260a)) {
                    aVar6.f70750d.f70407a.b(aVar6.f70747a);
                    aVar6.f70748b.b(aVar6.f70747a);
                    aVar6.f70749c.b(aVar6.f70747a);
                }
                long jElapsedRealtime7 = SystemClock.elapsedRealtime();
                long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime5;
                map.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(jElapsedRealtime8));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 3 cost: " + String.valueOf(jElapsedRealtime8));
                aVar6.f70748b.B();
                h.a().a(aVar6.f70748b.J());
                sg.bigo.ads.common.g.a.a.a(aVar6.f70747a, new sg.bigo.ads.common.g.a.a.InterfaceC0706a() { // from class: sg.bigo.ads.controller.e.a.7
                    @Override // sg.bigo.ads.common.g.a.a.InterfaceC0706a
                    public final void a() {
                        sg.bigo.ads.common.g.a.a.b("tb_addata", "end_time < " + System.currentTimeMillis(), null);
                        t.a();
                    }

                    @Override // sg.bigo.ads.common.g.a.a.InterfaceC0706a
                    public final void a(String str2) {
                        sg.bigo.ads.core.d.b.a(3000, 10101, str2);
                    }
                });
                long jElapsedRealtime9 = SystemClock.elapsedRealtime();
                long jElapsedRealtime10 = SystemClock.elapsedRealtime() - jElapsedRealtime7;
                map.put("4", String.valueOf(jElapsedRealtime10));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 4 cost: " + String.valueOf(jElapsedRealtime10));
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                Context context5 = aVar6.f70747a;
                sg.bigo.ads.api.core.q qVar = aVar6.f70748b.f70544a;
                sg.bigo.ads.controller.d.e eVar = new sg.bigo.ads.controller.d.e(aVar6.f70750d);
                dVarA.f71325e = context5;
                if (!dVarA.f71322b.getAndSet(true)) {
                    dVarA.f71323c = qVar;
                    dVarA.f71324d = eVar;
                    if (qVar.f69419a) {
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "init retry tracker");
                                Set set = d.this.f71321a;
                                g gVar2 = g.a.f71361a;
                                set.addAll(g.a(0L, d.this.f71323c));
                                d.this.d();
                            }
                        });
                    } else {
                        str = "config invalid";
                    }
                    cVarA = sg.bigo.ads.core.d.c.a();
                    context2 = aVar6.f70747a;
                    aVar2 = aVar6.f70748b.f70546f;
                    gVar = new sg.bigo.ads.controller.d.g(aVar6.f70751e, aVar6.f70750d);
                    dVar = aVar6.f70751e;
                    if (cVarA.f71254c.getAndSet(true)) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Stats", "already init.");
                    } else {
                        cVarA.f71252a = aVar2;
                        cVarA.f71255d = dVar;
                        cVarA.f71253b = new sg.bigo.ads.core.d.b.b(context2, aVar2, gVar, dVar);
                    }
                    bVarA = sg.bigo.ads.core.b.b.a();
                    context3 = aVar6.f70747a;
                    aVar3 = aVar6.f70748b.f70547g;
                    bVar = new sg.bigo.ads.controller.d.b(aVar6.f70751e, aVar6.f70750d);
                    sg.bigo.ads.controller.d.d dVar4 = new sg.bigo.ads.controller.d.d(aVar6.f70751e, aVar6.f70750d);
                    dVar2 = aVar6.f70751e;
                    bVarA.f71128d = aVar3;
                    bVarA.f71129e = context3;
                    bVarA.f71130f = bVar;
                    bVarA.f71131g = dVar4;
                    bVarA.f71132h = dVar2;
                    if (bVarA.f71126b.getAndSet(true)) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Callback", "already init.");
                    } else {
                        aVar4 = bVarA.f71128d;
                        if (aVar4 == null && aVar4.f71122d) {
                            bVarA.f71127c = new j(bVarA.f71129e, aVar4, bVarA.f71130f, bVarA.f71131g, bVarA.f71132h);
                        } else {
                            bVarA.f71125a = new sg.bigo.ads.core.b.b.a(context3, aVar3, bVar, dVar2);
                        }
                    }
                    sg.bigo.ads.common.form.b bVarA3 = sg.bigo.ads.common.form.b.a();
                    sg.bigo.ads.controller.d.c cVar = new sg.bigo.ads.controller.d.c(aVar6.f70751e, aVar6.f70750d);
                    bVarA3.f69551a.set(true);
                    bVarA3.f69552b = cVar;
                    sg.bigo.ads.core.d.a.a().f71219a = new sg.bigo.ads.controller.d.f(aVar6.f70751e, aVar6.f70750d);
                    sg.bigo.ads.controller.b.d dVar5 = aVar6.f70748b;
                    aVar5 = dVar5.f70545e;
                    jVarN = dVar5.n();
                    bVarA2 = sg.bigo.ads.core.player.b.a();
                    context4 = aVar6.f70747a;
                    zA = jVarN.a(12);
                    bVarA2.f71799c = context4;
                    if (bVarA2.f71798b.getAndSet(true)) {
                        sg.bigo.ads.common.h.b.a("already init.", (sg.bigo.ads.common.h.a) null);
                    } else {
                        bVarA2.f71805i = aVar5;
                        bVarA2.f71803g = new sg.bigo.ads.common.h.b(context4, aVar5, zA, bVarA2);
                        bVarA2.f71804h = new sg.bigo.ads.core.player.a(bVarA2);
                        bVarA2.f71800d = new ArrayList();
                        bVarA2.f71801e = new ArrayList();
                        bVarA2.f71802f = new Hashtable();
                        bVarA2.c();
                        sg.bigo.ads.common.p.h.a.f69886a.a(aVar5);
                        sg.bigo.ads.common.p.d.a.f69876a.a(aVar5);
                        sg.bigo.ads.common.p.h.a.f69886a.d(context4);
                        sg.bigo.ads.common.p.d.a.f69876a.d(context4);
                    }
                    if (jVarN.a(15)) {
                        sg.bigo.ads.common.aa.b.i(aVar6.f70747a);
                    }
                    long jElapsedRealtime11 = SystemClock.elapsedRealtime();
                    long jElapsedRealtime12 = SystemClock.elapsedRealtime() - jElapsedRealtime9;
                    map.put(CampaignEx.CLICKMODE_ON, String.valueOf(jElapsedRealtime12));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 5 cost: " + String.valueOf(jElapsedRealtime12));
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.e.a.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.core.c.c cVar2 = sg.bigo.ads.core.c.c.a.f71217a;
                            a aVar7 = a.this;
                            cVar2.a(aVar7.f70747a, aVar7.f70748b.I());
                        }
                    });
                    long jElapsedRealtime13 = SystemClock.elapsedRealtime();
                    long jElapsedRealtime14 = SystemClock.elapsedRealtime() - jElapsedRealtime11;
                    map.put("6", String.valueOf(jElapsedRealtime14));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 6 cost: " + String.valueOf(jElapsedRealtime14));
                    sg.bigo.ads.controller.f.a.a(aVar6.f70747a, aVar6);
                    sg.bigo.ads.common.aa.b.g(aVar6.f70747a);
                    aVar6.f70758l.a();
                    aVar6.f70750d.a(8000L, "[sdk init]");
                    long jElapsedRealtime15 = SystemClock.elapsedRealtime() - jElapsedRealtime13;
                    map.put(Gc.f26641e, String.valueOf(jElapsedRealtime15));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 7 cost: " + String.valueOf(jElapsedRealtime15));
                    if (sg.bigo.ads.api.a.i.f69318a.x()) {
                        sg.bigo.ads.controller.a.b.d.a.f70471a.a(aVar6.f70750d, aVar6.f70751e, aVar6.f70748b, aVar6.f70749c, aVar6.f70752f);
                    }
                    runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    a.a(a.this, 0, map);
                }
                str = "already init";
                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", str);
                cVarA = sg.bigo.ads.core.d.c.a();
                context2 = aVar6.f70747a;
                aVar2 = aVar6.f70748b.f70546f;
                gVar = new sg.bigo.ads.controller.d.g(aVar6.f70751e, aVar6.f70750d);
                dVar = aVar6.f70751e;
                if (cVarA.f71254c.getAndSet(true)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "already init.");
                } else {
                    cVarA.f71252a = aVar2;
                    cVarA.f71255d = dVar;
                    cVarA.f71253b = new sg.bigo.ads.core.d.b.b(context2, aVar2, gVar, dVar);
                }
                bVarA = sg.bigo.ads.core.b.b.a();
                context3 = aVar6.f70747a;
                aVar3 = aVar6.f70748b.f70547g;
                bVar = new sg.bigo.ads.controller.d.b(aVar6.f70751e, aVar6.f70750d);
                sg.bigo.ads.controller.d.d dVar6 = new sg.bigo.ads.controller.d.d(aVar6.f70751e, aVar6.f70750d);
                dVar2 = aVar6.f70751e;
                bVarA.f71128d = aVar3;
                bVarA.f71129e = context3;
                bVarA.f71130f = bVar;
                bVarA.f71131g = dVar6;
                bVarA.f71132h = dVar2;
                if (bVarA.f71126b.getAndSet(true)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "already init.");
                } else {
                    aVar4 = bVarA.f71128d;
                    if (aVar4 == null) {
                        bVarA.f71125a = new sg.bigo.ads.core.b.b.a(context3, aVar3, bVar, dVar2);
                    } else {
                        bVarA.f71125a = new sg.bigo.ads.core.b.b.a(context3, aVar3, bVar, dVar2);
                    }
                }
                sg.bigo.ads.common.form.b bVarA4 = sg.bigo.ads.common.form.b.a();
                sg.bigo.ads.controller.d.c cVar2 = new sg.bigo.ads.controller.d.c(aVar6.f70751e, aVar6.f70750d);
                bVarA4.f69551a.set(true);
                bVarA4.f69552b = cVar2;
                sg.bigo.ads.core.d.a.a().f71219a = new sg.bigo.ads.controller.d.f(aVar6.f70751e, aVar6.f70750d);
                sg.bigo.ads.controller.b.d dVar7 = aVar6.f70748b;
                aVar5 = dVar7.f70545e;
                jVarN = dVar7.n();
                bVarA2 = sg.bigo.ads.core.player.b.a();
                context4 = aVar6.f70747a;
                zA = jVarN.a(12);
                bVarA2.f71799c = context4;
                if (bVarA2.f71798b.getAndSet(true)) {
                    sg.bigo.ads.common.h.b.a("already init.", (sg.bigo.ads.common.h.a) null);
                } else {
                    bVarA2.f71805i = aVar5;
                    bVarA2.f71803g = new sg.bigo.ads.common.h.b(context4, aVar5, zA, bVarA2);
                    bVarA2.f71804h = new sg.bigo.ads.core.player.a(bVarA2);
                    bVarA2.f71800d = new ArrayList();
                    bVarA2.f71801e = new ArrayList();
                    bVarA2.f71802f = new Hashtable();
                    bVarA2.c();
                    sg.bigo.ads.common.p.h.a.f69886a.a(aVar5);
                    sg.bigo.ads.common.p.d.a.f69876a.a(aVar5);
                    sg.bigo.ads.common.p.h.a.f69886a.d(context4);
                    sg.bigo.ads.common.p.d.a.f69876a.d(context4);
                }
                if (jVarN.a(15)) {
                    sg.bigo.ads.common.aa.b.i(aVar6.f70747a);
                }
                long jElapsedRealtime16 = SystemClock.elapsedRealtime();
                long jElapsedRealtime17 = SystemClock.elapsedRealtime() - jElapsedRealtime9;
                map.put(CampaignEx.CLICKMODE_ON, String.valueOf(jElapsedRealtime17));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 5 cost: " + String.valueOf(jElapsedRealtime17));
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.e.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.c.c cVar3 = sg.bigo.ads.core.c.c.a.f71217a;
                        a aVar7 = a.this;
                        cVar3.a(aVar7.f70747a, aVar7.f70748b.I());
                    }
                });
                long jElapsedRealtime18 = SystemClock.elapsedRealtime();
                long jElapsedRealtime19 = SystemClock.elapsedRealtime() - jElapsedRealtime16;
                map.put("6", String.valueOf(jElapsedRealtime19));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 6 cost: " + String.valueOf(jElapsedRealtime19));
                sg.bigo.ads.controller.f.a.a(aVar6.f70747a, aVar6);
                sg.bigo.ads.common.aa.b.g(aVar6.f70747a);
                aVar6.f70758l.a();
                aVar6.f70750d.a(8000L, "[sdk init]");
                long jElapsedRealtime110 = SystemClock.elapsedRealtime() - jElapsedRealtime18;
                map.put(Gc.f26641e, String.valueOf(jElapsedRealtime110));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 7 cost: " + String.valueOf(jElapsedRealtime110));
                if (sg.bigo.ads.api.a.i.f69318a.x()) {
                    sg.bigo.ads.controller.a.b.d.a.f70471a.a(aVar6.f70750d, aVar6.f70751e, aVar6.f70748b, aVar6.f70749c, aVar6.f70752f);
                }
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                a.a(a.this, 0, map);
            }
        });
        e.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.6
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                String name = Thread.currentThread().getName();
                if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
                    return;
                }
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
    }

    public static boolean isInitialized() {
        return f67245a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    public static void setUserConsent(@NonNull final Context context, @NonNull final ConsentOptions consentOptions, final boolean z10) {
        String strValueOf;
        String str;
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f70322a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        d.a(3, new Runnable() { // from class: sg.bigo.ads.c.1
            /* JADX WARN: Code duplicated, block: B:18:0x0050  */
            /* JADX WARN: Code duplicated, block: B:19:0x0052  */
            /* JADX WARN: Code duplicated, block: B:23:0x005a  */
            /* JADX WARN: Code duplicated, block: B:26:0x0063  */
            /* JADX WARN: Code duplicated, block: B:27:0x006c  */
            /* JADX WARN: Code duplicated, block: B:30:0x0083  */
            /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
            @Override // java.lang.Runnable
            public final void run() {
                String strValueOf2;
                String str2;
                String str3;
                String str4;
                String str5;
                String strValueOf3;
                a aVar;
                Context context2 = context;
                ConsentOptions consentOptions2 = consentOptions;
                boolean z11 = z10;
                int i10 = AnonymousClass3.f69445a[consentOptions2.ordinal()];
                if (i10 == 1) {
                    strValueOf2 = String.valueOf(sg.bigo.ads.common.x.a.o());
                    str2 = "lgpd";
                } else if (i10 == 2) {
                    strValueOf2 = String.valueOf(sg.bigo.ads.common.x.a.n());
                    str2 = "ccpa";
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            str3 = "";
                            str4 = str3;
                        } else {
                            strValueOf2 = String.valueOf(sg.bigo.ads.common.x.a.m());
                            str2 = InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES;
                        }
                        if (z11) {
                            str5 = "1";
                        } else {
                            str5 = "2";
                        }
                        String str6 = sg.bigo.ads.controller.e.f.f70855b ? "1" : "0";
                        if (sg.bigo.ads.common.m.b.e(context2)) {
                            strValueOf3 = String.valueOf(sg.bigo.ads.common.m.b.c(context2));
                        } else {
                            strValueOf3 = Y1.f27894f;
                        }
                        aVar = new a(str3, str4, str5, str6, strValueOf3, sg.bigo.ads.common.m.b.b(context2), sg.bigo.ads.common.m.b.d(context2));
                        if (BigoAdSdk.isInitialized()) {
                            a.a(aVar);
                            return;
                        }
                        HashMap map = new HashMap();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(a.b(aVar));
                        map.put("user_consent_event", jSONArray.toString());
                        map.put(CommonUrlParts.UUID, sg.bigo.ads.common.x.a.r());
                        sg.bigo.ads.core.d.b.c(map);
                    }
                    strValueOf2 = String.valueOf(sg.bigo.ads.common.x.a.p());
                    str2 = "coppa";
                }
                str3 = str2;
                str4 = strValueOf2;
                if (z11) {
                    str5 = "1";
                } else {
                    str5 = "2";
                }
                String str7 = sg.bigo.ads.controller.e.f.f70855b ? "1" : "0";
                if (sg.bigo.ads.common.m.b.e(context2)) {
                    strValueOf3 = String.valueOf(sg.bigo.ads.common.m.b.c(context2));
                } else {
                    strValueOf3 = Y1.f27894f;
                }
                aVar = new a(str3, str4, str5, str7, strValueOf3, sg.bigo.ads.common.m.b.b(context2), sg.bigo.ads.common.m.b.d(context2));
                if (BigoAdSdk.isInitialized()) {
                    a.a(aVar);
                    return;
                }
                HashMap map2 = new HashMap();
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(a.b(aVar));
                map2.put("user_consent_event", jSONArray2.toString());
                map2.put(CommonUrlParts.UUID, sg.bigo.ads.common.x.a.r());
                sg.bigo.ads.core.d.b.c(map2);
            }
        });
        if (consentOptions == ConsentOptions.GDPR) {
            sg.bigo.ads.common.x.a.a(z10);
            if (sg.bigo.ads.common.m.b.e(context)) {
                strValueOf = String.valueOf(z10);
                str = "Filter the consent status from user: ";
            } else {
                a(context, consentOptions, z10);
                strValueOf = String.valueOf(z10);
                str = "Update the consent status from user: ";
            }
        } else {
            a(context, consentOptions, z10);
            strValueOf = String.valueOf(z10);
            str = "Update the consent status from user: ";
        }
        sg.bigo.ads.common.t.a.a(2, 4, "", str.concat(strValueOf));
    }
}
