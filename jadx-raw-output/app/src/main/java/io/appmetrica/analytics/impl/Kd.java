package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Kd;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class Kd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l f55466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f55467b = C4418oa.k().w().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nd f55468c;

    public static final void a(Kd kd2, NativeCrash nativeCrash, File file) {
        kd2.f55466a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        G0 g10;
        C4059aa c4059aa;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 h0A = I0.a(nativeCrash.getMetadata());
            ck.p.g(h0A);
            g10 = new G0(source, handlerVersion, str, dumpFile, creationTime, h0A);
        } catch (Throwable unused) {
            g10 = null;
        }
        if (g10 == null) {
            this.f55466a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g10.f55255f.f55284a).info("Detected native crash with uuid = " + g10.f55252c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f55467b;
        Nd nd2 = this.f55468c;
        Consumer consumer = new Consumer() { // from class: af.j
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Kd.a(this.f3560a, nativeCrash, (File) obj);
            }
        };
        nd2.getClass();
        Gd gd2 = new Gd(new Id(g10.f55250a, g10.f55251b), nd2.f55630f);
        Dd dd2 = new Dd(nd2.f55626b, g10.f55255f, new Md(g10, nd2.f55628d));
        C4085ba c4085ba = nd2.f55629e;
        String str2 = g10.f55253d;
        c4085ba.getClass();
        File file = new File(str2);
        Context context = nd2.f55625a;
        if (C4059aa.f56344c == null) {
            synchronized (ck.s.b(C4059aa.class)) {
                if (C4059aa.f56344c == null) {
                    C4059aa.f56344c = new C4059aa(context);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        C4059aa c4059aa2 = C4059aa.f56344c;
        if (c4059aa2 == null) {
            ck.p.B("INSTANCE");
            c4059aa = null;
        } else {
            c4059aa = c4059aa2;
        }
        iHandlerExecutor.execute(new Uf(file, gd2, consumer, dd2, c4059aa, nd2.f55627c.a(g10)));
    }

    public Kd(Context context, Tg tg2, bk.l<? super String, mj.r> lVar, Sd sd2, EnumC4112cb enumC4112cb, String str) {
        this.f55466a = lVar;
        this.f55468c = new Nd(context, tg2, sd2, enumC4112cb);
    }
}
