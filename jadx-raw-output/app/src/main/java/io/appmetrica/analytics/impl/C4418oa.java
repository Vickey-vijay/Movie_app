package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4418oa {
    public static volatile C4418oa I;
    public volatile N9 C;
    public C4702zk H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C4374mg f57404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile F6 f57405c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile S2 f57407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C4402nj f57408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile U f57409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C4077b2 f57410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f57411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile C4572uf f57412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile A3 f57413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile C4064af f57414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Bo f57415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C4197fj f57416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Gb f57417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bl f57418p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile C4677yk f57420r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Lb f57425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C4456pn f57426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C4578ul f57427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C4620wd f57428z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4393na f57419q = new C4393na();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Tc f57421s = new Tc();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Vc f57422t = new Vc();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C4277im f57423u = new C4277im();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C4198fk f57424v = new C4198fk();
    public final Pd A = new Pd();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C4403nk D = new C4403nk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C4652xk F = new C4652xk();
    public final C4280j G = new C4280j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4353lk f57406d = new C4353lk();

    public static void a(Context context) {
        if (I == null) {
            synchronized (C4418oa.class) {
                if (I == null) {
                    I = new C4418oa(context.getApplicationContext());
                }
            }
        }
    }

    public final synchronized Bo D() {
        if (this.f57415m == null) {
            this.f57415m = new Bo(this.f57403a);
        }
        return this.f57415m;
    }

    public final synchronized L2 z() {
        if (this.f57418p == null) {
            Bl bl2 = new Bl(this.f57403a);
            this.f57418p = bl2;
            this.f57423u.a(bl2);
        }
        return this.f57418p;
    }

    public static C4418oa k() {
        return I;
    }

    public final C4277im A() {
        return this.f57423u;
    }

    public final C4702zk B() {
        File file;
        C4702zk c4702zk = this.H;
        if (c4702zk == null) {
            synchronized (this) {
                c4702zk = this.H;
                if (c4702zk == null) {
                    Context context = this.f57403a;
                    String systemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String systemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (lk.a0.n0(systemProperty)) {
                        systemProperty = systemProperty2;
                    }
                    if (!lk.a0.n0(systemProperty)) {
                        file = new File(systemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                            file = null;
                        }
                        c4702zk = new C4702zk(file);
                        this.H = c4702zk;
                    }
                    file = null;
                    c4702zk = new C4702zk(file);
                    this.H = c4702zk;
                }
            }
        }
        return c4702zk;
    }

    public final C4456pn C() {
        C4456pn c4456pn = this.f57426x;
        if (c4456pn == null) {
            synchronized (this) {
                c4456pn = this.f57426x;
                if (c4456pn == null) {
                    c4456pn = new C4456pn(this.f57403a);
                    this.f57426x = c4456pn;
                }
            }
        }
        return c4456pn;
    }

    public final void E() {
        if (this.f57412j == null) {
            synchronized (this) {
                if (this.f57412j == null) {
                    Rm rmA = Qm.a(C4167ef.class);
                    Context context = this.f57403a;
                    Sm sm2 = (Sm) rmA;
                    ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                    C4167ef c4167ef = (C4167ef) protobufStateStorageA.read();
                    this.f57412j = new C4572uf(this.f57403a, protobufStateStorageA, new C4348lf(), new C4116cf(c4167ef), new C4547tf(), new C4322kf(this.f57403a), new C4448pf(k().y()), new C4193ff(), c4167ef, "[PreloadInfoStorage]");
                }
            }
        }
    }

    public final C4280j b() {
        return this.G;
    }

    public final U c() {
        U u10 = this.f57409g;
        if (u10 == null) {
            synchronized (this) {
                u10 = this.f57409g;
                if (u10 == null) {
                    u10 = new U(this.f57403a, this.f57406d.a(), this.f57423u.b());
                    this.f57423u.a(u10);
                    this.f57409g = u10;
                }
            }
        }
        return u10;
    }

    public final C4077b2 d() {
        C4077b2 c4077b2 = this.f57410h;
        if (c4077b2 == null) {
            synchronized (this) {
                c4077b2 = this.f57410h;
                if (c4077b2 == null) {
                    c4077b2 = new C4077b2(this.f57403a, AbstractC4103c2.a());
                    this.f57410h = c4077b2;
                }
            }
        }
        return c4077b2;
    }

    public final A3 f() {
        if (this.f57413k == null) {
            synchronized (this) {
                if (this.f57413k == null) {
                    Rm rmA = Qm.a(C4535t3.class);
                    Context context = this.f57403a;
                    Sm sm2 = (Sm) rmA;
                    ProtobufStateStorage<Object> protobufStateStorageA = sm2.a(context, sm2.a(context));
                    this.f57413k = new A3(this.f57403a, protobufStateStorageA, new B3(), new C4411o3(), new E3(), new Ui(this.f57403a), new C3(y()), new C4436p3(), (C4535t3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f57413k;
    }

    public final Context g() {
        return this.f57403a;
    }

    public final F6 h() {
        if (this.f57405c == null) {
            synchronized (this) {
                if (this.f57405c == null) {
                    this.f57405c = new F6(new E6(y()));
                }
            }
        }
        return this.f57405c;
    }

    public final N9 i() {
        N9 n10 = this.C;
        if (n10 == null) {
            synchronized (this) {
                n10 = this.C;
                if (n10 == null) {
                    n10 = new N9(this.f57403a);
                    this.C = n10;
                }
            }
        }
        return n10;
    }

    public final PermissionExtractor j() {
        C4578ul c4578ul = this.f57427y;
        if (c4578ul != null) {
            return c4578ul;
        }
        synchronized (this) {
            C4578ul c4578ul2 = this.f57427y;
            if (c4578ul2 != null) {
                return c4578ul2;
            }
            C4578ul c4578ul3 = new C4578ul(p().f58035c.getAskForPermissionStrategy());
            this.f57427y = c4578ul3;
            return c4578ul3;
        }
    }

    public final Gb l() {
        Gb gb2 = this.f57417o;
        if (gb2 == null) {
            synchronized (this) {
                gb2 = this.f57417o;
                if (gb2 == null) {
                    gb2 = new Gb(new P2(this.f57403a, this.f57406d.a()), new C4232h2());
                    this.f57417o = gb2;
                }
            }
        }
        return gb2;
    }

    public final Lb m() {
        Lb nb2 = this.f57425w;
        if (nb2 == null) {
            synchronized (this) {
                nb2 = this.f57425w;
                if (nb2 == null) {
                    Context context = this.f57403a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    nb2 = locationClient == null ? new Nb() : new Mb(context, new Tb(), locationClient);
                    this.f57425w = nb2;
                }
            }
        }
        return nb2;
    }

    public final Vc o() {
        return this.f57422t;
    }

    public final C4677yk p() {
        C4677yk c4677yk = this.f57420r;
        if (c4677yk == null) {
            synchronized (this) {
                c4677yk = this.f57420r;
                if (c4677yk == null) {
                    c4677yk = new C4677yk();
                    this.f57420r = c4677yk;
                }
            }
        }
        return c4677yk;
    }

    public final C4620wd q() {
        C4620wd c4620wd = this.f57428z;
        if (c4620wd == null) {
            synchronized (this) {
                c4620wd = this.f57428z;
                if (c4620wd == null) {
                    c4620wd = new C4620wd(this.f57403a, new oo());
                    this.f57428z = c4620wd;
                }
            }
        }
        return c4620wd;
    }

    public final Pd r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers = this.f57411i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                platformIdentifiers = this.f57411i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f57411i = platformIdentifiers;
                }
            }
        }
        return platformIdentifiers;
    }

    public final C4374mg u() {
        if (this.f57404b == null) {
            synchronized (this) {
                if (this.f57404b == null) {
                    this.f57404b = new C4374mg(this.f57403a, I.D().f55046c);
                }
            }
        }
        return this.f57404b;
    }

    public final C4197fj v() {
        C4197fj c4197fj = this.f57416n;
        if (c4197fj == null) {
            synchronized (this) {
                c4197fj = this.f57416n;
                if (c4197fj == null) {
                    c4197fj = new C4197fj(this.f57403a);
                    this.f57416n = c4197fj;
                }
            }
        }
        return c4197fj;
    }

    public final C4353lk w() {
        return this.f57406d;
    }

    public final C4652xk x() {
        return this.F;
    }

    public final C4064af y() {
        if (this.f57414l == null) {
            synchronized (this) {
                if (this.f57414l == null) {
                    this.f57414l = new C4064af(B().d(this.f57403a));
                }
            }
        }
        return this.f57414l;
    }

    public C4418oa(Context context) {
        this.f57403a = context;
    }

    public final C4232h2 e() {
        return l().f55263b;
    }

    public final Lb n() {
        return m();
    }

    public final C4572uf t() {
        E();
        return this.f57412j;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
