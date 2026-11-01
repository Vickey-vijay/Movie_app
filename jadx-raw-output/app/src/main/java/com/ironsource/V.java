package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f27765q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f27766r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f27767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<NetworkSettings> f27769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3641p2 f27770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f27774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final O0 f27776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I0 f27777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f27778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f27780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f27781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27782p;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V(IronSource.a aVar, String str, List<? extends NetworkSettings> list, C3641p2 c3641p2, int i10, int i11, boolean z10, int i12, int i13, O0 o10, I0 i14, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ck.p.j(aVar, "adUnit");
        ck.p.j(c3641p2, "auctionSettings");
        ck.p.j(o10, "loadingData");
        ck.p.j(i14, "interactionData");
        this.f27767a = aVar;
        this.f27768b = str;
        this.f27769c = list;
        this.f27770d = c3641p2;
        this.f27771e = i10;
        this.f27772f = i11;
        this.f27773g = z10;
        this.f27774h = i12;
        this.f27775i = i13;
        this.f27776j = o10;
        this.f27777k = i14;
        this.f27778l = j10;
        this.f27779m = z11;
        this.f27780n = z12;
        this.f27781o = z13;
        this.f27782p = z14;
    }

    public final void a(int i10) {
        this.f27771e = i10;
    }

    public final IronSource.a b() {
        return this.f27767a;
    }

    public final void a(boolean z10) {
        this.f27773g = z10;
    }

    public final void b(boolean z10) {
        this.f27782p = z10;
    }

    public final boolean c() {
        return this.f27773g;
    }

    public final C3641p2 d() {
        return this.f27770d;
    }

    public final long e() {
        return this.f27778l;
    }

    public final int f() {
        return this.f27774h;
    }

    public final I0 g() {
        return this.f27777k;
    }

    public final O0 h() {
        return this.f27776j;
    }

    public final int i() {
        return this.f27771e;
    }

    public List<NetworkSettings> j() {
        return this.f27769c;
    }

    public final boolean k() {
        return this.f27779m;
    }

    public final boolean l() {
        return this.f27781o;
    }

    public final boolean m() {
        return this.f27782p;
    }

    public final int n() {
        return this.f27772f;
    }

    public String o() {
        return this.f27768b;
    }

    public final boolean p() {
        return this.f27780n;
    }

    public final boolean q() {
        return this.f27770d.g() > 0;
    }

    public final int a() {
        return this.f27775i;
    }

    public final String r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", "parallelLoad", Integer.valueOf(this.f27771e), "bidderExclusive", Boolean.valueOf(this.f27773g), com.ironsource.mediationsdk.d.f29614z, Boolean.valueOf(this.f27782p));
        ck.p.i(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final NetworkSettings a(String str) {
        ck.p.j(str, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (Object obj2 : listJ) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ V(IronSource.a aVar, String str, List list, C3641p2 c3641p2, int i10, int i11, boolean z10, int i12, int i13, O0 o10, I0 i14, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i15, ck.i iVar) {
        this(aVar, str, list, c3641p2, i10, i11, z10, i12, i13, o10, i14, j10, z11, z12, z13, (i15 & 32768) != 0 ? false : z14);
    }
}
