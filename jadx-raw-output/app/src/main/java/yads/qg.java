package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* JADX INFO: loaded from: classes10.dex */
public final class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMetricaAdapter f81847a;

    public qg(Context context, zg zgVar) {
        AppMetricaAdapter appMetricaAdapter = null;
        if (zgVar.c()) {
            try {
                appMetricaAdapter = new AppMetricaAdapter(context);
            } catch (Throwable th2) {
                th2.toString();
                boolean z10 = ad1.f75480a;
            }
        }
        this.f81847a = appMetricaAdapter;
    }
}
