package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class y91 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y91 f84865b = new y91();

    public y91() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        mj.g gVar = z91.f85255a;
        List listN0 = lk.a0.N0("adsdk.yandex.ru,yandex.ru", new String[]{StringUtils.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (!lk.a0.n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        mj.g gVar2 = z91.f85255a;
        return nj.b0.z0(arrayList, "yandex.com/ads");
    }
}
