package sg.bigo.ads.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.core.e.a.e;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.api.b.a<T, U> implements sg.bigo.ads.common.f.b.a {
    private boolean A;
    private long B;
    private AdBid C;
    private final Set<String> D;
    private final Set<String> E;
    private final Map<String, Object> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public AdInteractionListener f67536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public f f67537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f67538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.core.e.a.b f67539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f67543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f67546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f67547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sg.bigo.ads.controller.landing.a f67548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f67551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public sg.bigo.ads.controller.landing.c f67553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f67554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f67555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f67556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f67557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public WeakReference<a> f67558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f67559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f67560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f67561z;

    public interface a {
        LandingPageStyleConfig a(Context context, String str, int i10, boolean z10);

        boolean f_();
    }

    public c(@NonNull f fVar) {
        super(fVar.f69378c);
        this.f67540e = false;
        this.f67560y = false;
        this.f67541f = false;
        this.f67561z = false;
        this.f67542g = false;
        this.A = false;
        this.f67543h = false;
        this.f67544i = false;
        this.f67545j = false;
        this.D = new HashSet();
        this.E = new HashSet();
        this.f67552q = false;
        this.f67555t = -1;
        this.f67556u = 0L;
        this.f67557v = 0L;
        this.F = new HashMap();
        this.f67559x = true;
        this.f67537b = fVar;
        A();
        B();
        this.Y = new sg.bigo.ads.common.v.a();
    }

    private void A() {
        sg.bigo.ads.api.core.b bVar = this.f67537b.f69376a;
        q qVarM = i.f69318a.m();
        sg.bigo.ads.api.core.b.f[] fVarArrC = bVar.C();
        e[] eVarArr = new e[0];
        if (fVarArrC != null && fVarArrC.length > 0) {
            eVarArr = new e[fVarArrC.length];
            for (int i10 = 0; i10 < fVarArrC.length; i10++) {
                eVarArr[i10] = new e(fVarArrC[i10].a(), this.f67537b.f69379d);
            }
        }
        sg.bigo.ads.api.core.b.f[] fVarArrD = bVar.D();
        e[] eVarArr2 = new e[0];
        if (fVarArrD != null && fVarArrD.length > 0) {
            eVarArr2 = new e[fVarArrD.length];
            for (int i11 = 0; i11 < fVarArrD.length; i11++) {
                eVarArr2[i11] = new e(fVarArrD[i11].a(), this.f67537b.f69379d);
            }
        }
        sg.bigo.ads.api.core.b.f[] fVarArrE = bVar.E();
        e[] eVarArr3 = new e[0];
        if (fVarArrE != null && fVarArrE.length > 0) {
            eVarArr3 = new e[fVarArrE.length];
            for (int i12 = 0; i12 < fVarArrE.length; i12++) {
                eVarArr3[i12] = new e(fVarArrE[i12].a(), this.f67537b.f69379d);
            }
        }
        sg.bigo.ads.api.core.b.f[] fVarArrF = bVar.F();
        e[] eVarArr4 = new e[0];
        if (fVarArrF != null && fVarArrF.length > 0) {
            eVarArr4 = new e[fVarArrF.length];
            for (int i13 = 0; i13 < fVarArrF.length; i13++) {
                eVarArr4[i13] = new e(fVarArrF[i13].a(), this.f67537b.f69379d);
            }
        }
        sg.bigo.ads.core.e.a.b bVarA = a(qVarM, eVarArr, eVarArr2, eVarArr3, eVarArr4);
        this.f67539d = bVarA;
        bVarA.b("express_id", bVar.ab());
    }

    private void B() {
        this.f67540e = false;
        this.f67560y = false;
        this.f67541f = false;
        this.f67561z = false;
        this.f67542g = false;
        this.A = false;
        this.f67543h = false;
        this.f67544i = false;
        this.f67546k = 0L;
        this.f67547l = 0L;
        this.C = null;
        this.f67545j = false;
        this.f69341ab = 0;
    }

    private int C() {
        sg.bigo.ads.api.core.b.a aVarO = this.f67537b.f69376a.O();
        if (aVarO != null) {
            return aVarO.a();
        }
        return 0;
    }

    private long D() {
        sg.bigo.ads.api.core.b.a aVarO = this.f67537b.f69376a.O();
        if (aVarO != null) {
            return aVarO.b();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        try {
            sg.bigo.ads.controller.landing.a aVar = this.f67548m;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(c cVar) {
        return cVar == null || cVar.f67544i;
    }

    private void d(String str) {
        if (this.D.contains(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, VastTagName.AD, "ignore callback action, action = ".concat(String.valueOf(str)));
            return;
        }
        sg.bigo.ads.api.core.b bVarF = f();
        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a(str, this.f67537b.f69377b, this.X, bVarF, Integer.valueOf(bVarF.aj()), null, null, this);
        str.hashCode();
        if (str.equals("impression") || str.equals("clicked")) {
            mapA.put("ad_size", j());
            mapA.put("show_proportion", b("show_proportion", ""));
            mapA.put("render_style", b("render_style", 0));
        }
        sg.bigo.ads.core.b.b.a().a(str, mapA);
    }

    @NonNull
    public sg.bigo.ads.core.e.a.b a(q qVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.b(qVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f67537b.f69376a, this));
    }

    public void a() {
        A();
        B();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10, int i11, String str) {
        if (this.f67541f) {
            return;
        }
        this.f67541f = true;
        this.f67537b.f69378c.f69326h.b();
        if (!this.f67537b.f69376a.ah() && a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, i10, i11, str);
        }
    }

    public final void a(int i10, int i11, String str, boolean z10) {
        sg.bigo.ads.core.d.b.a(this.f67537b.f69376a, new AdError(i10, i11, str), p(), z10);
    }

    public final void a(int i10, String str) {
        b(i10, 0, str);
    }

    @Override // sg.bigo.ads.common.f.b.a
    public final void a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            b(2005, 0, "Activity create error");
            sg.bigo.ads.core.d.b.a(f(), 3000, 10117, stringExtra);
        }
    }

    @CallSuper
    public void a(@Nullable Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        int i12;
        int i13;
        int width;
        int height;
        String str;
        sg.bigo.ads.api.core.b bVar;
        o();
        this.f67539d.b("action_type", String.valueOf(dVar.f69359a));
        sg.bigo.ads.core.e.a.b bVar2 = this.f67539d;
        boolean zA = false;
        if (point != null) {
            i13 = point.x;
            i12 = point.y;
        } else {
            i12 = 0;
            i13 = 0;
        }
        View view = this.f67538c;
        if (view != null) {
            width = view.getWidth();
            height = this.f67538c.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float fFloatValue = width > 0 ? new BigDecimal(i13 / width).setScale(3, 4).floatValue() : 0.0f;
        float fFloatValue2 = height > 0 ? new BigDecimal(i12 / height).setScale(3, 4).floatValue() : 0.0f;
        if (i11 == 1 || i11 == 2) {
            str = "direct";
        } else {
            str = i11 == 3 ? "confirm" : "unknown";
        }
        bVar2.b("click_prop", sg.bigo.ads.common.utils.q.e(sg.bigo.ads.common.utils.q.a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), str)));
        this.f67539d.b("click_source", String.valueOf(i11));
        this.f67539d.b("click_module", String.valueOf(i10));
        int i14 = dVar.f69359a;
        int i15 = 4;
        if (i14 != 1) {
            if (i14 == 4) {
                bVar = this.f67537b.f69376a;
                i15 = 8;
            }
            final boolean z10 = zA;
            final sg.bigo.ads.core.e.a.b bVar3 = this.f67539d;
            final Context context = this.f67537b.f69380e;
            final int iK = k();
            final int i16 = i();
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f71268a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f71269b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f71270c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f71271d;

                public AnonymousClass1() {
                    context = context;
                    z = z10;
                    i = iK;
                    i = i16;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, z, i, i);
                }
            });
            sg.bigo.ads.core.d.b.a(this.f67537b.f69376a, 1, dVar, this);
        }
        bVar = this.f67537b.f69376a;
        zA = bVar.a(i15);
        final boolean z11 = zA;
        final sg.bigo.ads.core.e.a.b bVar4 = this.f67539d;
        final Context context2 = this.f67537b.f69380e;
        final int iK2 = k();
        final int i17 = i();
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f71268a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f71269b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f71270c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f71271d;

            public AnonymousClass1() {
                context = context2;
                z = z11;
                i = iK2;
                i = i17;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(context, z, i, i);
            }
        });
        sg.bigo.ads.core.d.b.a(this.f67537b.f69376a, 1, dVar, this);
    }

    public final synchronized void a(String str, Object obj) {
        this.F.put(str, obj);
    }

    public void a(sg.bigo.ads.api.b.a aVar) {
        this.f69340aa = aVar;
        if (aVar != null) {
            HashMap map = new HashMap();
            sg.bigo.ads.core.d.b.a((Map<String, String>) map, (sg.bigo.ads.api.b.a) this, false);
            this.f67539d.a(map);
        }
    }

    @CallSuper
    public void a(@NonNull sg.bigo.ads.api.b.d.a<T> aVar) {
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        if (isExpired()) {
            str = "The ad is expired";
        } else {
            boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
            if (!this.f67544i || z10) {
                if (C() != 2 || (p() && SystemClock.elapsedRealtime() - this.f67546k >= D())) {
                    b(iVar, i10, i11, dVar);
                    return;
                }
                return;
            }
            str = "The ad is destroyed";
        }
        a(2000, 3, str, false);
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, @NonNull sg.bigo.ads.api.core.d dVar) {
        a(iVar, 0, 1, dVar);
    }

    public void a(sg.bigo.ads.controller.landing.c cVar) {
        this.f67553r = cVar;
    }

    public final boolean a(String str) {
        return !this.E.contains(str);
    }

    public void a_() {
        if (isExpired() || this.f67544i) {
            b(2000, 2, this.f67544i ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        this.f67546k = SystemClock.elapsedRealtime();
        h();
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @NonNull
    public <ValueType> ValueType b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.F.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b() {
        if (this.f67560y) {
            return;
        }
        this.f67560y = true;
        this.f67537b.f69378c.f69326h.b();
        if (a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, ((Boolean) b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    public final void b(int i10, int i11, String str) {
        AdError adError = new AdError(i10, i11, str);
        a(i10, i11, str, true);
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.D.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        this.f67551p = i10;
        boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
        if (!this.f67542g) {
            if (!this.f67544i || z10) {
                this.f67542g = true;
                a(iVar != null ? iVar.f69740b : null, i10, i11, dVar);
            }
        }
        long jElapsedRealtime = this.f67546k > 0 ? SystemClock.elapsedRealtime() - this.f67546k : 0L;
        String str2 = "";
        if (iVar == null || iVar.f69740b == null) {
            str = "";
        } else {
            str = iVar.f69740b.x + StringUtils.COMMA + iVar.f69740b.y;
        }
        if (iVar != null && iVar.f69739a != null) {
            str2 = iVar.f69739a.x + StringUtils.COMMA + iVar.f69739a.y;
        }
        if (a("06002011")) {
            String strA = !TextUtils.isEmpty(dVar.f69365g) ? dVar.f69365g : f().N().a();
            f fVar = this.f67537b;
            Context context = fVar.f69380e;
            sg.bigo.ads.api.core.b bVar = fVar.f69376a;
            String strJ = j();
            int i12 = dVar.f69359a;
            int i13 = dVar.f69369k;
            int i14 = this.f67549n + 1;
            this.f67549n = i14;
            int i15 = 1 + this.f67550o;
            this.f67550o = i15;
            sg.bigo.ads.core.d.b.a(context, bVar, strJ, str, str2, i10, i11, i12, i13, jElapsedRealtime, i14, i15, this, strA);
        }
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        if (z10) {
            ((sg.bigo.ads.api.b.f) this).h_();
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c() {
        if (this.f67540e) {
            return;
        }
        this.f67540e = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f67547l = jElapsedRealtime;
        sg.bigo.ads.api.b.a aVar = this.f69340aa;
        if (aVar instanceof c) {
            ((c) aVar).f67547l = jElapsedRealtime;
        }
        if (this.f67537b.f69376a.ah()) {
            return;
        }
        d("filled");
        if (this.f67537b.f69376a.N().k() == 1) {
            u();
        }
        if (this.f67537b.f69376a.N().c() == 2) {
            sg.bigo.ads.a.c.a(this.f67537b.f69380e);
        }
        sg.bigo.ads.common.f.b.a(this);
    }

    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.E.add(str);
    }

    @Override // sg.bigo.ads.api.b.a
    public final String d() {
        return f().H();
    }

    @Override // sg.bigo.ads.api.Ad
    @CallSuper
    public final void destroy() {
        this.f67544i = true;
        if (sg.bigo.ads.common.n.d.b()) {
            F();
            destroyInMainThread();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.F();
                    c.this.destroyInMainThread();
                }
            });
        }
        if (this.f67545j) {
            sg.bigo.ads.common.form.a.a(f().hashCode(), 4);
        }
        sg.bigo.ads.common.form.a.b(f().hashCode());
        setAdInteractionListener(null);
        sg.bigo.ads.common.f.b.b(this);
    }

    @MainThread
    public void destroyInMainThread() {
    }

    @Override // sg.bigo.ads.api.b.a
    public final long e() {
        return f().a();
    }

    @Override // sg.bigo.ads.api.b.a
    @NonNull
    public U f() {
        return (U) this.f67537b.f69376a;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        if (this.C == null) {
            f fVar = this.f67537b;
            sg.bigo.ads.api.core.b bVar = fVar.f69376a;
            this.C = bVar.ak() ? new sg.bigo.ads.ad.a.C0648a(fVar, bVar, this.f67539d) : null;
        }
        return this.C;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        f fVar = this.f67537b;
        sg.bigo.ads.api.core.b bVar = fVar != null ? fVar.f69376a : null;
        return bVar != null ? bVar.b(str) : "";
    }

    public void h() {
        int i10;
        n();
        int i11 = this.Z;
        int i12 = sg.bigo.ads.common.v.a.f70051e;
        if (i11 != i12) {
            sg.bigo.ads.common.v.a aVar = this.Y;
            View view = this.f67538c;
            if (aVar.f70053g == i12) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 4 - start activity from background");
                i10 = sg.bigo.ads.common.v.a.f70051e;
            } else if (sg.bigo.ads.common.v.a.a(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 5 - Lock screen");
                i10 = sg.bigo.ads.common.v.a.f70052f;
            } else if (sg.bigo.ads.common.v.a.b(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 3 - Float window");
                i10 = sg.bigo.ads.common.v.a.f70050d;
            } else {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 1 - not outside app");
                i10 = sg.bigo.ads.common.v.a.f70048b;
            }
            this.Z = i10;
        }
        this.f67539d.a(this.Z);
        this.f67539d.a(this.f67537b.f69380e, i());
        if (a("06002010")) {
            sg.bigo.ads.core.d.b.a(this.f67537b.f69380e, this, (String) b("show_proportion", ""), j(), ((Integer) b("render_style", 0)).intValue(), w(), ((Long) b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.f67547l, ((Integer) b("icon_sta", -1)).intValue(), ((Integer) b("img_sta", -1)).intValue(), ((Integer) b("vid_sta", -1)).intValue());
        }
        if (this.f67537b.f69376a.N().k() == 0) {
            u();
        }
    }

    public int i() {
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        return this.f67537b.f69376a.J();
    }

    public String j() {
        if (this.f67538c == null) {
            return "";
        }
        return this.f67538c.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.f67538c.getHeight();
    }

    public int k() {
        return 0;
    }

    public final void l() {
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    @CallSuper
    public void m() {
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.f67543h = true;
    }

    public void n() {
        d("impression");
    }

    public void o() {
        d("clicked");
    }

    public boolean p() {
        return this.A;
    }

    public final int q() {
        return this.f67537b.f69377b.b();
    }

    public final int r() {
        return this.f67537b.f69376a.w();
    }

    public final int s() {
        if (this.f67557v != f().y()) {
            return -1;
        }
        return this.f67555t;
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f67536a = adInteractionListener;
    }

    public final long t() {
        if (this.f67557v != f().y()) {
            return 0L;
        }
        return this.f67556u;
    }

    public void u() {
        if (this.f67537b.f69376a.N().f() > 0) {
            final sg.bigo.ads.controller.landing.a aVar = new sg.bigo.ads.controller.landing.a(this.f67537b.f69376a);
            this.f67548m = aVar;
            final Context context = this.f67537b.f69380e;
            final String strA = aVar.f70939b.a();
            final String strJ = aVar.f70939b.j();
            final int iC = aVar.f70939b.c();
            int i10 = aVar.f70940c;
            if (((i10 == 4 || i10 == 5) && TextUtils.isEmpty(strJ)) || sg.bigo.ads.core.landing.a.a(strA) || TextUtils.isEmpty(strA) || !strA.startsWith("http")) {
                return;
            }
            if (iC == 0 || iC == 2) {
                final sg.bigo.ads.controller.landing.a.InterfaceC0729a interfaceC0729a = new sg.bigo.ads.controller.landing.a.InterfaceC0729a() { // from class: sg.bigo.ads.controller.landing.a.3
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0729a
                    public final void a(String str) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preloadWebView onStart preloadType = " + a.this.f70940c + ", url = " + str);
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0729a
                    public final void a(String str, long j10, boolean z10, int i11) {
                        a.this.f70941d = z10;
                        HashMap map = new HashMap();
                        map.put("land_way", String.valueOf(i11));
                        sg.bigo.ads.core.d.b.a(a.this.f70938a, "preload_cost", j10, z10 ? 1 : 0, map);
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preload landing page onComplete preloadType=" + a.this.f70940c + ", success = " + z10 + ", cost = " + j10 + ", url = " + str);
                        if (z10) {
                            return;
                        }
                        a.this.a();
                    }
                };
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        int i11 = aVar2.f70940c;
                        if (i11 != 1) {
                            if (i11 == 4 || i11 == 5) {
                                a.a(aVar2, context, strJ, iC, interfaceC0729a);
                                return;
                            }
                            return;
                        }
                        Uri uri = Uri.parse(strA);
                        a.a(a.this, context, uri.getScheme() + "://" + uri.getHost(), iC, interfaceC0729a);
                    }
                });
            }
        }
    }

    public final void v() {
        if (this.f67561z) {
            return;
        }
        this.f67561z = true;
        this.B = SystemClock.elapsedRealtime();
    }

    public final long w() {
        if (this.B == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.B;
    }

    public final boolean x() {
        WeakReference<a> weakReference = this.f67558w;
        return (weakReference == null || weakReference.get() == null || !this.f67558w.get().f_()) ? false : true;
    }

    public sg.bigo.ads.controller.landing.c y() {
        return this.f67553r;
    }
}
