package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4429ol implements InterfaceC4530sn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f57452d = TimeUnit.SECONDS.toMillis(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f57454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f57455c;

    @Override // io.appmetrica.analytics.impl.InterfaceC4530sn
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C4302jl> a() {
        List<C4302jl> list;
        List<C4302jl> list2 = (List) this.f57455c.getData();
        if (list2 == null || (list2.isEmpty() && this.f57455c.shouldUpdateData())) {
            list = list2;
            list = list2;
            ArrayList arrayList = new ArrayList();
            if (C4418oa.I.f57423u.b().f56844n.f57244d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f57454b.hasPermission(this.f57453a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C4454pl.a(this.f57453a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f57455c.setData(arrayList);
            list = arrayList;
        }
        return list;
    }

    public final C4302jl b() {
        return new C4302jl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f57453a, "phone", "getting SimMcc", "TelephonyManager", new C4328kl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f57453a, "phone", "getting SimMnc", "TelephonyManager", new C4354ll()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f57453a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C4404nl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f57453a, "phone", "getting SimOperatorName", "TelephonyManager", new C4379ml()));
    }

    public C4429ol(Context context) {
        long j10 = f57452d;
        this.f57455c = new CachedDataProvider.CachedData(j10, j10, "sim-info");
        this.f57453a = context;
        this.f57454b = C4418oa.k().j();
    }
}
