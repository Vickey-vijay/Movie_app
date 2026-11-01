package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Rb {
    public static void a(bk.l lVar) {
        ck.p.j(lVar, "runnable");
        nk.j.d(A9.f22351c, null, null, new Nb(lVar, null), 3, null);
    }

    public static Object a(bk.a aVar) {
        Semaphore semaphore;
        ck.p.j(aVar, "run");
        try {
            Result.a aVar2 = Result.Companion;
            try {
                try {
                    semaphore = Sb.f23497b;
                    semaphore.acquire();
                    aVar.invoke();
                } catch (Exception e10) {
                    mj.g gVar = P9.f23321a;
                    P9.a(new L2(e10));
                    semaphore = Sb.f23497b;
                }
                semaphore.release();
                return Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Sb.f23497b.release();
                throw th2;
            }
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th3));
        }
    }

    public static String a(Context context, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j10 + ".txt";
    }

    public static String a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return context.getFilesDir() + "/logging";
    }
}
