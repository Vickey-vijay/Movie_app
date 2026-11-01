package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ou3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg f81153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f81154b;

    public final void a(String str) {
        if (this.f81154b.c()) {
            qg qgVar = this.f81153a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f81847a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setExperiments(str);
                }
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    public ou3(qg qgVar, zg zgVar) {
        this.f81153a = qgVar;
        this.f81154b = zgVar;
    }

    public final void a(Set set) {
        if (this.f81154b.c()) {
            qg qgVar = this.f81153a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f81847a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
                boolean z10 = ad1.f75480a;
            }
        }
    }
}
