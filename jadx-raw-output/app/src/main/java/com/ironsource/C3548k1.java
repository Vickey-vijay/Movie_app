package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3548k1 implements InterfaceC3566l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IronSource.a f29309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29312f;

    public C3548k1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12) {
        ck.p.j(str, "version");
        ck.p.j(str2, "instanceId");
        ck.p.j(aVar, "adFormat");
        this.f29307a = str;
        this.f29308b = str2;
        this.f29309c = aVar;
        this.f29310d = z10;
        this.f29311e = z11;
        this.f29312f = z12;
    }

    /* JADX INFO: renamed from: com.ironsource.k1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29313a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29314b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29315c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29316d = 1;

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC3566l1
    public ArrayList<InterfaceC3604n1> a() {
        ArrayList<InterfaceC3604n1> arrayList = new ArrayList<>();
        arrayList.add(new C3584m1.v(this.f29307a));
        arrayList.add(new C3584m1.x(this.f29308b));
        arrayList.add(new C3584m1.a(this.f29309c));
        if (this.f29310d) {
            arrayList.add(new C3584m1.p(1));
        }
        if (this.f29311e) {
            arrayList.add(new C3584m1.e(1));
        }
        if (this.f29312f) {
            arrayList.add(new C3584m1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C3548k1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, ck.i iVar) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
