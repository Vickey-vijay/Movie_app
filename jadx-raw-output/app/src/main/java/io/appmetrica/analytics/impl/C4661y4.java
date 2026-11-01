package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4661y4 implements Fa, Rl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f57997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bm f57998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ah f57999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F4 f58000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4381mn f58001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f58002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S4 f58003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4374mg f58004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f58005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4498rg f58006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f58007l;

    public C4661y4(@NonNull Context context, @NonNull Il il2, @NonNull R4 r10, @NonNull C4462q4 c4462q4, @NonNull C4374mg c4374mg) {
        this(context, il2, r10, c4462q4, new Ah(c4462q4.f57545b), c4374mg, new S4(), new A4(), new C4498rg());
    }

    public static void b(C4462q4 c4462q4) {
        C4418oa.I.c().b(!Boolean.FALSE.equals(c4462q4.f57545b.f57488n));
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(@NonNull C4437p4 c4437p4) {
        Ah ah2 = this.f57999d;
        ah2.f54964a = ah2.f54964a.mergeFrom(c4437p4);
    }

    public C4661y4(Context context, Il il2, R4 r10, C4462q4 c4462q4, Ah ah2, C4374mg c4374mg, S4 s10, A4 a10, C4498rg c4498rg) {
        this.f58002g = new ArrayList();
        this.f58007l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f57996a = applicationContext;
        this.f57997b = r10;
        this.f57999d = ah2;
        this.f58003h = s10;
        this.f58000e = A4.a(this);
        b(c4462q4);
        Bm bmA = il2.a(applicationContext, r10, c4462q4.f57544a);
        this.f57998c = bmA;
        this.f58005j = V3.a(bmA, C4418oa.k().c());
        this.f58001f = a10.a(this, bmA);
        this.f58004i = c4374mg;
        this.f58006k = c4498rg;
        il2.a(r10, this);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C4437p4 d() {
        return this.f57999d.f54964a;
    }

    @NonNull
    public final C4374mg e() {
        return this.f58004i;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f57996a;
    }

    public final synchronized void a(@NonNull C4586v4 c4586v4) {
        this.f58003h.f55849a.add(c4586v4);
        C6.a(c4586v4.f57791c, this.f58005j.a(Gm.a(this.f57998c.e().f56842l)));
    }

    public final synchronized void b(@NonNull C4586v4 c4586v4) {
        this.f58003h.f55849a.remove(c4586v4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f57997b;
    }

    public final void a(@NonNull Q5 q10, @NonNull C4586v4 c4586v4) {
        F4 f10 = this.f58000e;
        f10.getClass();
        f10.a(q10, new E4(c4586v4));
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull Kl kl2, @Nullable C4226gm c4226gm) {
        synchronized (this.f58007l) {
            for (Ya ya2 : this.f58002g) {
                C6.a(ya2.f56240a, kl2, this.f58005j.a(ya2.f56242c));
            }
            this.f58002g.clear();
        }
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull C4226gm c4226gm) {
        synchronized (this.f58007l) {
            for (C4586v4 c4586v4 : this.f58003h.f55849a) {
                C6.a(c4586v4.f57791c, this.f58005j.a(Gm.a(c4226gm.f56842l)));
            }
            ArrayList arrayList = new ArrayList();
            for (Ya ya2 : this.f58002g) {
                if (AbstractC4149dm.a(c4226gm, ya2.f56241b, ya2.f56242c, new Wa())) {
                    C6.a(ya2.f56240a, this.f58005j.a(ya2.f56242c));
                } else {
                    arrayList.add(ya2);
                }
            }
            this.f58002g = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f58001f.c();
            }
        }
    }

    public final void a(@Nullable Ya ya2) {
        ResultReceiver resultReceiver;
        HashMap map = new HashMap();
        List<String> list = null;
        if (ya2 != null) {
            list = ya2.f56241b;
            resultReceiver = ya2.f56240a;
            map = ya2.f56242c;
        } else {
            resultReceiver = null;
        }
        boolean zA = this.f57998c.a(list, map);
        if (!zA) {
            C6.a(resultReceiver, this.f58005j.a(map));
        }
        if (!this.f57998c.g()) {
            if (zA) {
                C6.a(resultReceiver, this.f58005j.a(map));
            }
        } else {
            synchronized (this.f58007l) {
                if (zA && ya2 != null) {
                    this.f58002g.add(ya2);
                }
            }
            this.f58001f.c();
        }
    }

    public final void a(@Nullable ResultReceiver resultReceiver) {
        this.f58006k.a(new C4636x4(resultReceiver));
    }

    @NonNull
    public final U3 a() {
        return this.f58005j;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(@NonNull C4462q4 c4462q4) {
        this.f57998c.a(c4462q4.f57544a);
        a(c4462q4.f57545b);
    }
}
