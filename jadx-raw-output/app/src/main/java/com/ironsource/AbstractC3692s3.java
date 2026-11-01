package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3692s3 implements F7 {
    public static boolean O;
    private int[] A;
    private int[] B;
    private int[] C;
    public int G;
    public String H;
    public String I;
    public Set<Integer> J;
    private F5 K;
    private C3450ea L;
    private Oe M;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30691l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private G4 f30695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC3439e f30696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<C5> f30697r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private M8 f30700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f30701v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f30705z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30680a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30681b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30682c = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30683d = 90000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30684e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30685f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30686g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30687h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f30688i = "placement";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f30689j = "abt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f30690k = Q6.f27414a1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30692m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30693n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30694o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f30698s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f30702w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f30703x = 5000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f30704y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* JADX INFO: renamed from: com.ironsource.s3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3692s3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5 f30707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSource.a f30708b;

        public b(C5 c10, IronSource.a aVar) {
            this.f30707a = c10;
            this.f30708b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30707a.a("eventSessionId", AbstractC3692s3.this.f30700u.b());
            this.f30707a.a("essn", Integer.valueOf(AbstractC3692s3.this.f30700u.c()));
            String strA = IronSourceUtils.a(AbstractC3692s3.this.f30701v);
            if (AbstractC3692s3.this.g(this.f30707a)) {
                this.f30707a.a("connectionType", strA);
            }
            if (AbstractC3692s3.this.a(strA, this.f30707a)) {
                C5 c10 = this.f30707a;
                c10.a(AbstractC3692s3.this.b(c10));
            }
            String strD = C3372a4.d(AbstractC3692s3.this.f30701v);
            if (strD != null) {
                this.f30707a.a("rawConnectionType", strD);
            }
            int iA = AbstractC3692s3.this.a(this.f30707a.c(), this.f30708b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.f30707a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC3692s3.this.a(this.f30707a, "reason");
            AbstractC3692s3.this.a(this.f30707a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC3692s3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC3692s3.this.E.entrySet()) {
                    if (!this.f30707a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f30707a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC3692s3.this.i(this.f30707a)) {
                if (AbstractC3692s3.this.h(this.f30707a) && !AbstractC3692s3.this.e(this.f30707a)) {
                    this.f30707a.a("sessionDepth", Integer.valueOf(AbstractC3692s3.this.c(this.f30707a)));
                }
                if (AbstractC3692s3.this.j(this.f30707a)) {
                    AbstractC3692s3.this.f(this.f30707a);
                }
                long jA = AbstractC3692s3.this.f30700u.a();
                if (jA > 0) {
                    this.f30707a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f30707a.toString());
                AbstractC3692s3.this.f30697r.add(this.f30707a);
                AbstractC3692s3.this.f30699t++;
            }
            AbstractC3692s3 abstractC3692s3 = AbstractC3692s3.this;
            boolean zA = abstractC3692s3.a(abstractC3692s3.B) ? AbstractC3692s3.this.a(this.f30707a.c(), AbstractC3692s3.this.B) : AbstractC3692s3.this.d(this.f30707a);
            AbstractC3692s3 abstractC3692s4 = AbstractC3692s3.this;
            if (!abstractC3692s4.f30692m && zA) {
                abstractC3692s4.f30692m = true;
            }
            if (abstractC3692s4.f30695p != null) {
                if (abstractC3692s4.g()) {
                    AbstractC3692s3.this.f();
                    return;
                }
                AbstractC3692s3 abstractC3692s5 = AbstractC3692s3.this;
                if (abstractC3692s5.b((ArrayList<C5>) abstractC3692s5.f30697r) || zA) {
                    AbstractC3692s3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$c */
    public class c implements G7 {
        public void a(ArrayList<C5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error("clearData exception: " + e10.getMessage());
                }
            }
        }

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(G7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC3692s3 abstractC3692s3 = AbstractC3692s3.this;
                    ArrayList<C5> arrayListA = abstractC3692s3.f30695p.a(abstractC3692s3.I);
                    AbstractC3692s3.this.f30699t = arrayListA.size() + AbstractC3692s3.this.f30697r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC3692s3.this.a(AbstractC3692s3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
            }
            a(aVar.b());
        }

        @Override // com.ironsource.G7
        public synchronized void a(final G7.a aVar) {
            AbstractC3692s3.this.K.a(new Runnable() { // from class: com.ironsource.wl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31564b.b(aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3692s3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30718a;

        public int b() {
            return this.f30718a;
        }

        e(int i10) {
            this.f30718a = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C5 c10) {
        return c10.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<C5> arrayListA;
        try {
            this.f30692m = false;
            ArrayList<C5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.f30695p.a(this.I);
                    this.f30695p.b(this.I);
                }
                H5.c cVar = new H5.c(new H5.a(arrayListA, this.f30697r), this.f30703x);
                this.f30695p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th2.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f30697r);
            }
            if (arrayList.size() > 0) {
                this.f30697r.clear();
                this.f30699t = 0;
                JSONObject jSONObjectB = N6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strP = com.ironsource.mediationsdk.r.m().p();
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObjectB.put(Q6.f27414a1, strP);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new M5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th3) {
                    C3676r4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th3.getMessage());
                }
                String strA = this.f30696q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.f30691l && a(arrayList, D5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + strA);
                    O = true;
                }
                if (this.f30693n) {
                    try {
                        strA = Base64.encodeToString(U9.a(strA, this.f30694o), 0);
                    } catch (Exception e10) {
                        C3676r4.d().a(e10);
                    }
                }
                C3789xf.f31600a.a(new N5(new c(), strA, this.f30696q.b(), arrayList));
            }
        } catch (Throwable th4) {
            C3676r4.d().a(th4);
            IronLog.INTERNAL.error("Send event exception: " + th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f30699t >= this.f30702w || this.f30692m) && this.f30691l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C5 c10) {
        if (c10 == null) {
            return false;
        }
        if (a(this.f30705z)) {
            return true ^ a(c10.c(), this.f30705z);
        }
        if (a(this.A)) {
            return a(c10.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C3450ea c3450ea) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.f30696q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.f30695p = G4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f30705z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c3450ea;
        this.f30701v = context;
    }

    public abstract int c(C5 c10);

    @Override // com.ironsource.F7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    public abstract void d();

    @Override // com.ironsource.F7
    public void d(int i10) {
        if (i10 > 0) {
            this.f30703x = i10;
        }
    }

    public abstract boolean d(C5 c10);

    public abstract String e(int i10);

    public void e() {
        this.f30697r = new ArrayList<>();
        this.f30699t = 0;
        this.f30696q = K5.a(this.H, this.G);
        F5 f10 = new F5(this.I + "EventThread");
        this.K = f10;
        f10.start();
        this.K.a();
        this.f30700u = Lb.U().m();
        this.J = new HashSet();
        d();
    }

    public abstract void f(C5 c10);

    public void h() {
        this.K.a(new d());
    }

    public abstract boolean j(C5 c10);

    private void b(String str) {
        AbstractC3439e abstractC3439e = this.f30696q;
        if (abstractC3439e == null || !abstractC3439e.c().equals(str)) {
            this.f30696q = K5.a(str, this.G);
        }
    }

    @Override // com.ironsource.F7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public boolean g(C5 c10) {
        return (c10.c() == D5.CONSENT_TRUE_CODE.b() || c10.c() == D5.CONSENT_FALSE_CODE.b() || c10.c() == D5.SET_META_DATA.b() || c10.c() == D5.SET_META_DATA_AFTER_INIT.b() || c10.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    public boolean h(C5 c10) {
        return (c10.c() == D5.FIRST_INSTANCE.b() || c10.c() == D5.FIRST_INSTANCE_RESULT.b() || c10.c() == D5.INIT_COMPLETE.b() || c10.c() == D5.SDK_INIT_FAILED.b() || c10.c() == D5.SDK_INIT_SUCCESS.b() || c10.c() == D5.USING_CACHE_FOR_INIT_EVENT.b() || c10.c() == D5.CONSENT_TRUE_CODE.b() || c10.c() == D5.CONSENT_FALSE_CODE.b() || c10.c() == D5.SET_META_DATA.b() || c10.c() == D5.SET_META_DATA_AFTER_INIT.b() || c10.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.F7
    public void c(int i10) {
        this.f30694o = i10;
    }

    @Override // com.ironsource.F7
    public void b(int i10) {
        if (i10 > 0) {
            this.f30704y = i10;
        }
    }

    public void c(boolean z10) {
        this.f30691l = z10;
    }

    @Override // com.ironsource.F7
    public void b(int[] iArr, Context context) {
        this.f30705z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.F7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3439e abstractC3439e = this.f30696q;
        if (abstractC3439e != null) {
            abstractC3439e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C5 c10) {
        JSONObject jSONObjectB = c10.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.ironsource.F7
    public void b(boolean z10) {
        this.f30693n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f30704y;
    }

    public synchronized void a(Oe oe2) {
        this.M = oe2;
    }

    public String b() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, C5 c10) {
        boolean zContains;
        if (!str.equalsIgnoreCase("none")) {
            return false;
        }
        if (a(this.C)) {
            zContains = a(c10.c(), this.C);
        } else {
            zContains = this.J.contains(Integer.valueOf(c10.c()));
        }
        return zContains;
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.ironsource.F7
    public synchronized void a(C5 c10) {
        a(c10, (IronSource.a) null);
    }

    public synchronized void a(C5 c10, IronSource.a aVar) {
        if (c10 != null) {
            if (this.f30698s) {
                this.K.a(new b(c10, aVar));
            }
        }
    }

    private boolean a(ArrayList<C5> arrayList, int i10) {
        Iterator<C5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C5> a(ArrayList<C5> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<C5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    public void a(ArrayList<C5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.f30695p.a(arrayList, this.I);
                this.f30699t = this.f30695p.a(this.I).size() + this.f30697r.size();
            }
        }
    }

    @Override // com.ironsource.F7
    public void a(int i10) {
        if (i10 > 0) {
            this.f30702w = i10;
        }
    }

    @Override // com.ironsource.F7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.F7
    public void a(boolean z10) {
        this.f30698s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.f30695p.a(this.f30697r, this.I);
            this.f30697r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            C3450ea c3450ea = this.L;
            if (c3450ea != null) {
                if (c3450ea.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C3450ea.f28770n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Oe oe2 = this.M;
            if (oe2 != null) {
                String strB = oe2.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public int f(int i10) {
        return a(i10, (IronSource.a) null);
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put("auctionTrials", Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C5 c10, String str, int i10) {
        JSONObject jSONObjectB = c10.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c10.a(str, a(jSONObjectB.optString(str, null), i10));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c10, String str) {
        a(c10, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i10 < 1000 || i10 >= 2000) && (i10 < 91000 || i10 >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i10 < 2000 || i10 >= 3000) && (i10 < 92000 || i10 >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i10 >= 4000 && i10 < 5000) || (i10 >= 94000 && i10 < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C3450ea c3450ea) {
        this.L = c3450ea;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }
}
