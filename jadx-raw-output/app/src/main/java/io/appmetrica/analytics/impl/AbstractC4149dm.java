package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4149dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f56613a = nj.q0.j("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f56614b = new SystemTimeProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3 f56615c = new D3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean a(C4226gm c4226gm, Collection collection, Map map, bk.a aVar) {
        boolean zA;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c4226gm.f56834d);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 155670667:
                    if (!str.equals("appmetrica_get_ad_url")) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c4226gm.f56839i);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 299713912:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c4226gm.f56832b);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 530949152:
                    if (!str.equals("appmetrica_clids")) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    D3 d10 = f56615c;
                    A3 a10 = (A3) aVar.invoke();
                    d10.getClass();
                    zA = D3.a(map, c4226gm, a10);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 703740463:
                    if (!str.equals("appmetrica_report_ad_url")) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c4226gm.f56840j);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                case 1117383061:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        if (!c4226gm.f56853w) {
                            if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                                break;
                            }
                        }
                        return false;
                    }
                    zA = a(c4226gm.f56831a);
                    if (!zA) {
                        return false;
                    }
                    break;
                    break;
                default:
                    if (!c4226gm.f56853w) {
                        if (f56614b.currentTimeSeconds() <= c4226gm.f56845o + ((long) c4226gm.f56856z.f55151a)) {
                            break;
                        }
                    }
                    return false;
            }
        }
        return true;
    }
}
