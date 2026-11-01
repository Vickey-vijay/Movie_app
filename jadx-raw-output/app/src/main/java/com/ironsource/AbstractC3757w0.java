package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC3757w0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f31502r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f31503s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3476g0 f31504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<NetworkSettings> f31507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3649pa f31508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3641p2 f31509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f31513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final O0 f31515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f31516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f31517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f31518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f31519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31520q;

    /* JADX INFO: renamed from: com.ironsource.w0$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(C3476g0 c3476g0, C3379ab c3379ab, bk.l<? super T3, ? extends AdFormatConfig> lVar, bk.p<? super C3740v0, ? super AdFormatConfig, ? extends AdUnitData> pVar) {
            List<C3803yc> listK;
            Ne neD;
            ck.p.j(c3476g0, "adProperties");
            ck.p.j(lVar, "getAdFormatConfig");
            ck.p.j(pVar, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = lVar.invoke((c3379ab == null || (neD = c3379ab.d()) == null) ? null : neD.c());
            if (adformatconfigInvoke == null) {
                throw new IllegalStateException("Error getting " + c3476g0.a() + " configurations");
            }
            if (c3379ab == null || (listK = c3379ab.d(c3476g0.e(), c3476g0.c())) == null) {
                listK = nj.s.k();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(nj.t.v(listK, 10));
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3803yc) it.next()).f());
            }
            C3649pa c3649paB = C3649pa.b();
            ck.p.i(c3649paB, "getInstance()");
            return pVar.mo1invoke(new C3740v0(strF, arrayList, c3649paB), adformatconfigInvoke);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3757w0(C3476g0 c3476g0, boolean z10, String str, List<? extends NetworkSettings> list, C3649pa c3649pa, C3641p2 c3641p2, int i10, int i11, boolean z11, int i12, int i13, O0 o10, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(list, "providerList");
        ck.p.j(c3649pa, "publisherDataHolder");
        ck.p.j(c3641p2, "auctionSettings");
        ck.p.j(o10, "loadingData");
        this.f31504a = c3476g0;
        this.f31505b = z10;
        this.f31506c = str;
        this.f31507d = list;
        this.f31508e = c3649pa;
        this.f31509f = c3641p2;
        this.f31510g = i10;
        this.f31511h = i11;
        this.f31512i = z11;
        this.f31513j = i12;
        this.f31514k = i13;
        this.f31515l = o10;
        this.f31516m = j10;
        this.f31517n = z12;
        this.f31518o = z13;
        this.f31519p = z14;
        this.f31520q = z15;
    }

    public final void a(int i10) {
        this.f31510g = i10;
    }

    public C3476g0 b() {
        return this.f31504a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract String c();

    public abstract String j();

    public final void a(boolean z10) {
        this.f31512i = z10;
    }

    public final void b(boolean z10) {
        this.f31520q = z10;
    }

    public final boolean d() {
        return this.f31512i;
    }

    public final C3641p2 e() {
        return this.f31509f;
    }

    public final long f() {
        return this.f31516m;
    }

    public final int g() {
        return this.f31513j;
    }

    public final int h() {
        return this.f31511h;
    }

    public final O0 i() {
        return this.f31515l;
    }

    public final int k() {
        return this.f31510g;
    }

    public final List<NetworkSettings> m() {
        return this.f31507d;
    }

    public final boolean n() {
        return this.f31517n;
    }

    public final C3649pa o() {
        return this.f31508e;
    }

    public final boolean p() {
        return this.f31519p;
    }

    public final boolean q() {
        return this.f31520q;
    }

    public final String r() {
        return this.f31506c;
    }

    public final boolean s() {
        return this.f31518o;
    }

    public final boolean t() {
        return this.f31509f.g() > 0;
    }

    public boolean u() {
        return this.f31505b;
    }

    public final int a() {
        return this.f31514k;
    }

    public final String l() {
        String strC;
        C3489gd c3489gdF = b().f();
        if (c3489gdF == null || (strC = c3489gdF.c()) == null) {
            return "";
        }
        return strC;
    }

    public final String v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", "parallelLoad", Integer.valueOf(this.f31510g), "bidderExclusive", Boolean.valueOf(this.f31512i), com.ironsource.mediationsdk.d.f29614z, Boolean.valueOf(this.f31520q));
        ck.p.i(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final NetworkSettings a(String str) {
        Object next;
        ck.p.j(str, "instanceName");
        Iterator<T> it = this.f31507d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                return (NetworkSettings) next;
            }
        }
        next = null;
        return (NetworkSettings) next;
    }

    public AdData a(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), this.f31506c);
        ck.p.i(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC3757w0(C3476g0 c3476g0, boolean z10, String str, List list, C3649pa c3649pa, C3641p2 c3641p2, int i10, int i11, boolean z11, int i12, int i13, O0 o10, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, ck.i iVar) {
        this(c3476g0, z10, str, list, c3649pa, c3641p2, i10, i11, z11, i12, i13, o10, j10, z12, z13, z14, (i14 & 65536) != 0 ? false : z15);
    }
}
