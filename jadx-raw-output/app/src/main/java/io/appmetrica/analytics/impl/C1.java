package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class C1 implements B1, InterfaceC4507s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f55062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f55063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1 f55064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4079b4 f55065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1 f55066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Tg f55067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4188fa f55068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4232h2 f55069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D1 f55070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4169eh f55071j;

    @MainThread
    public C1(@NonNull Context context, @NonNull A1 a10) {
        this(context, a10, new C4157e5(context));
    }

    public final void a() {
        this.f55066e.c(new J1() { // from class: af.a
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                this.f3540a.d(intent);
            }
        });
    }

    public C1(Context context, A1 a10, C4157e5 c4157e5) {
        this(context, a10, new C4079b4(context, c4157e5), new K1(), C4188fa.f56753d, C4418oa.k().e(), new D1());
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent) {
        K1 k10 = this.f55066e;
        if (intent == null) {
            k10.getClass();
            return;
        }
        k10.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k10.f55442a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k10.f55443b.entrySet()) {
            J1 j10 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j10.a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void b(Intent intent) {
        this.f55066e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i10 = Integer.parseInt(data.getQueryParameter("pid"));
            this.f55065d.a(encodedAuthority, Integer.valueOf(i10), data.getQueryParameter("psid"));
            this.f55069h.a(i10);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void c(Intent intent) {
        K1 k10 = this.f55066e;
        if (intent == null) {
            k10.getClass();
            return;
        }
        k10.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k10.f55442a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k10.f55443b.entrySet()) {
            J1 j10 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j10.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C4418oa.I.v().a(AbstractC4241hb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C4418oa.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void onCreate() {
        if (this.f55062a) {
            C4418oa.I.v().a(this.f55063b.getResources().getConfiguration());
        } else {
            this.f55068g.b(this.f55063b);
            C4418oa c4418oa = C4418oa.I;
            synchronized (c4418oa) {
                c4418oa.B.initAsync();
                c4418oa.f57423u.a(c4418oa.f57403a);
                c4418oa.f57423u.a(new C4331ko(c4418oa.B));
                NetworkServiceLocator.init(new C4209g5(new C4476qi(c4418oa.h()), new C4463q5(c4418oa.f57403a)));
                c4418oa.l().a(c4418oa.f57419q);
                c4418oa.E();
            }
            Xj.f56166a.e();
            C4277im c4277im = C4418oa.I.f57423u;
            c4277im.b();
            C4226gm c4226gmB = c4277im.b();
            C4677yk c4677ykP = C4418oa.I.p();
            c4677ykP.a(new C4147dk(new C4088bd(this.f55066e)), c4226gmB);
            c4277im.a(c4677ykP);
            ((Bl) C4418oa.I.z()).getClass();
            a();
            C4418oa.I.m().init();
            C4418oa.I.c().init();
            D1 d10 = this.f55070i;
            Context context = this.f55063b;
            C4079b4 c4079b4 = this.f55065d;
            d10.getClass();
            this.f55067f = new Tg(context, c4079b4);
            Context context2 = this.f55063b;
            AbstractC4583v1.f57784a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f55063b;
            Tg tg2 = this.f55067f;
            Pd pdR = C4418oa.k().r();
            IHandlerExecutor iHandlerExecutorD = C4418oa.k().w().d();
            C4236h6 c4236h6 = new C4236h6(context3, tg2, EnumC4112cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C4236h6 c4236h7 = new C4236h6(context3, tg2, EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C4394nb(), iHandlerExecutorD, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC4184f6 fileObserverC4184f6 = new FileObserverC4184f6(crashesDirectory, c4236h7, new C4085ba());
                iHandlerExecutorD.execute(new Vf(crashesDirectory, c4236h6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC4184f6.startWatching();
                C4418oa.I.E.storeReference(fileObserverC4184f6);
            }
            pdR.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                pdR.f55731a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = pdR.f55731a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Kd kdB = pdR.f55732b.b(context3, tg2);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        kdB.newCrash((NativeCrash) it.next());
                    }
                }
                pdR.f55731a.setDefaultCrashHandler(pdR.f55732b.a(context3, tg2));
            }
            new J5(nj.r.e(new Zg())).run();
            this.f55062a = true;
        }
        C4418oa.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.B1
    @MainThread
    public final void onDestroy() {
        Gb gbL = C4418oa.I.l();
        synchronized (gbL) {
            Iterator it = gbL.f55264c.iterator();
            while (it.hasNext()) {
                ((InterfaceC4378mk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Cf cf2;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.f55102c;
        try {
            cf2 = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf2 = null;
        }
        Integer asInteger = cf2 != null ? cf2.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f55069h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void reportData(int i10, Bundle bundle) {
        this.f55071j.getClass();
        List listK = (List) C4418oa.I.f57424v.f56779a.get(Integer.valueOf(i10));
        if (listK == null) {
            listK = nj.s.k();
        }
        if (listK.isEmpty()) {
            return;
        }
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            ((InterfaceC4172ek) it.next()).reportData(i10, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Cf cf2;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.f55102c;
        try {
            cf2 = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf2 = null;
        }
        Integer asInteger = cf2 != null ? cf2.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f55069h.c(asInteger.intValue());
        }
    }

    public C1(Context context, A1 a10, C4079b4 c4079b4, K1 k10, C4188fa c4188fa, C4232h2 c4232h2, D1 d10) {
        this.f55062a = false;
        this.f55063b = context;
        this.f55064c = a10;
        this.f55065d = c4079b4;
        this.f55066e = k10;
        this.f55068g = c4188fa;
        this.f55069h = c4232h2;
        this.f55070i = d10;
        this.f55071j = new C4169eh();
    }

    @WorkerThread
    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        Q5.b(bundle);
        Tg tg2 = this.f55067f;
        if (tg2 != null) {
            tg2.a(Q5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent, int i10) {
        ((C4557u0) this.f55064c).f57742a.stopSelf(i10);
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent, int i10, int i11) {
        ((C4557u0) this.f55064c).f57742a.stopSelf(i11);
    }
}
