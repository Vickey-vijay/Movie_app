package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.C3426d4;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3301x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f25710a;

    public static String a() {
        Boolean bool = Tg.f23565b;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "user_info_store");
                ck.p.j("user_age_restricted", C3426d4.i.W);
                Tg.f23565b = Boolean.valueOf(eaA.f22577a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f23565b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            ck.p.i("x8", "TAG");
            return null;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        C2924i4 c2924i5 = Y3.f23815a;
        if (nj.b0.U(((RootConfig) c2924i5.a(RootConfig.class)).getIPAddrTPSupport(), Ki.f23020b)) {
            ck.p.i("x8", "TAG");
            return f25710a;
        }
        ck.p.i("x8", "TAG");
        ck.p.j(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c2924i5.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    static {
        String simpleName = AbstractC3301x8.class.getSimpleName();
        a(AbstractC3252v9.a());
        ck.p.i(simpleName, "TAG");
        AbstractC3252v9.a();
    }

    public static void a(String str) {
        Boolean bool = Tg.f23565b;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "user_info_store");
                ck.p.j("user_age_restricted", C3426d4.i.W);
                Tg.f23565b = Boolean.valueOf(eaA.f22577a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f23565b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (!zBooleanValue) {
            f25710a = str;
            AbstractC3252v9.a(str);
        } else {
            f25710a = null;
            AbstractC3252v9.a(null);
        }
    }
}
