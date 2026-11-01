package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4132d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4080b5 f56555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4106c5 f56556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f56557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R4 f56558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4437p4 f56559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W4 f56560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final C4226gm f56561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4272ih f56562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final I8 f56563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f56564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Gb f56565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC4541t9 f56566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56567m;

    public C4132d5(Context context, R4 r10, C4437p4 c4437p4, W4 w10, C4226gm c4226gm, InterfaceC4272ih interfaceC4272ih, ICommonExecutor iCommonExecutor, int i10, Gb gb2, InterfaceC4541t9 interfaceC4541t9) {
        this(context, r10, c4437p4, w10, c4226gm, interfaceC4272ih, iCommonExecutor, new I8(), i10, new C4080b5(c4437p4.f57475a), new C4106c5(context, r10), gb2, interfaceC4541t9);
    }

    public static Y8 c(Y4 y10) {
        return new Y8(y10);
    }

    public final N8 a() {
        Context context = this.f56557c;
        R4 r10 = this.f56558d;
        return new N8(new S8(context, r10), this.f56567m);
    }

    public final M6 b(Y4 y10) {
        return new M6(y10, C4418oa.I.B().c(this.f56557c, this.f56558d), new I6(y10.c()), new C4211g7());
    }

    public final C4080b5 d() {
        return this.f56555a;
    }

    public C4132d5(Context context, R4 r10, C4437p4 c4437p4, W4 w10, C4226gm c4226gm, InterfaceC4272ih interfaceC4272ih, ICommonExecutor iCommonExecutor, I8 i10, int i11, C4080b5 c4080b5, C4106c5 c4106c5, Gb gb2, InterfaceC4541t9 interfaceC4541t9) {
        this.f56557c = context;
        this.f56558d = r10;
        this.f56559e = c4437p4;
        this.f56560f = w10;
        this.f56561g = c4226gm;
        this.f56562h = interfaceC4272ih;
        this.f56564j = iCommonExecutor;
        this.f56563i = i10;
        this.f56567m = i11;
        this.f56555a = c4080b5;
        this.f56556b = c4106c5;
        this.f56565k = gb2;
        this.f56566l = interfaceC4541t9;
    }

    public final Kk c() {
        return new Kk(this.f56557c, this.f56558d);
    }

    public final C4625wi d(Y4 y10) {
        C4625wi c4625wi = new C4625wi(y10, this.f56560f.a(), this.f56564j);
        Gb gb2 = this.f56565k;
        synchronized (gb2) {
            gb2.f55264c.add(c4625wi);
        }
        return c4625wi;
    }

    public final C4106c5 e() {
        return this.f56556b;
    }

    public final yo f() {
        yo yoVar;
        Co c4111ca;
        Bo boD = C4418oa.I.D();
        R4 r10 = this.f56558d;
        synchronized (boD) {
            String strValueOf = String.valueOf(r10);
            LinkedHashMap linkedHashMap = boD.f55045b;
            Object yoVar2 = linkedHashMap.get(strValueOf);
            if (yoVar2 == null) {
                Xe xe2 = new Xe(C4418oa.I.B().b(boD.f55044a, r10));
                if (r10.d()) {
                    String str = "appmetrica_vital_" + r10.f55817b + ".dat";
                    c4111ca = new C4235h5(nj.s.n(mj.h.a(str, new C4111ca(boD.f55044a, str)), mj.h.a("appmetrica_vital_main.dat", new C4111ca(boD.f55044a, "appmetrica_vital_main.dat"))));
                } else {
                    c4111ca = new C4111ca(boD.f55044a, "appmetrica_vital_" + r10.f55817b + ".dat");
                }
                yoVar2 = new yo(xe2, c4111ca, strValueOf);
                linkedHashMap.put(strValueOf, yoVar2);
            }
            yoVar = (yo) yoVar2;
        }
        return yoVar;
    }

    public final Rg a(Y4 y10) {
        return new Rg(new C4298jh(y10, this.f56562h, new D3()), this.f56561g, new C4221gh(this.f56559e));
    }

    public static Sk a(Y4 y10, yo yoVar, X4 x10) {
        Rk rk2 = new Rk(yoVar);
        return new Sk(y10, rk2, x10, new C4266ia(y10, rk2, new Vk(y10.h(), "foreground"), AbstractC4658y1.a(), new SystemTimeProvider()), new A2(y10, rk2, new Vk(y10.h(), A2.f54950g), AbstractC4658y1.a(), new SystemTimeProvider()));
    }

    public static T4 b() {
        return new T4();
    }

    public final C4386n3 b(Xe xe2) {
        Context context = this.f56557c;
        return new C4386n3(context, xe2, context.getPackageName(), new SafePackageManager());
    }

    public final C4342l9 a(Xe xe2, yo yoVar, Sk sk2, M6 m10, C4281j0 c4281j0, Kk kk2, C4625wi c4625wi) {
        return new C4342l9(xe2, yoVar, sk2, m10, c4281j0, this.f56563i, kk2, this.f56567m, new C4054a5(c4625wi), new SystemTimeProvider());
    }

    public static C4575ui a(Y4 y10, Y8 y11) {
        return new C4575ui(y11, y10);
    }

    public InterfaceC4491r9 a(InterfaceC4616w9 interfaceC4616w9, M6 m10, Rg rg2, C4437p4 c4437p4, R4 r10, Xe xe2) {
        return this.f56566l.a(interfaceC4616w9, m10, rg2, c4437p4, r10, xe2).a();
    }

    public final C4460q2 a(Xe xe2) {
        return new C4460q2(this.f56558d, xe2);
    }
}
