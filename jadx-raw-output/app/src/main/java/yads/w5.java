package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f84105a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc2 f84106b = new mc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f84107c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f84108d = new ArrayList();

    public final void a() {
        synchronized (this.f84105a) {
            this.f84107c.clear();
            this.f84108d.clear();
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(v5 v5Var) {
        a(v5Var, null);
    }

    public final void a(v5 v5Var) {
        a(v5Var, this.f84106b, null);
    }

    public final void a(v5 v5Var, nc2 nc2Var, qc3 qc3Var) {
        Long l10;
        synchronized (this.f84105a) {
            Map map = (Map) this.f84107c.get(v5Var);
            Long lValueOf = (map == null || (l10 = (Long) map.get(qc3Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
            if (lValueOf != null) {
                this.f84108d.add(new u5(v5Var, nc2Var.a(lValueOf.longValue())));
            }
            Map map2 = (Map) this.f84107c.get(v5Var);
            if (map2 != null) {
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void a(v5 v5Var, qc3 qc3Var) {
        synchronized (this.f84105a) {
            Map linkedHashMap = (Map) this.f84107c.get(v5Var);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            this.f84107c.put(v5Var, linkedHashMap);
            linkedHashMap.put(qc3Var, Long.valueOf(SystemClock.elapsedRealtime()));
            mj.r rVar = mj.r.f64562a;
        }
    }
}
