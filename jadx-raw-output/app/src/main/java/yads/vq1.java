package yads;

import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import yads.vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class vq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f83986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ro1 f83987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sq1 f83988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rq1 f83989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final go1 f83990e;

    public vq1(Executor executor, ro1 ro1Var, sq1 sq1Var, rq1 rq1Var, go1 go1Var) {
        this.f83986a = executor;
        this.f83987b = ro1Var;
        this.f83988c = sq1Var;
        this.f83989d = rq1Var;
        this.f83990e = go1Var;
    }

    public final void a(final Context context, a03 a03Var, final qq1 qq1Var, final ep epVar, final tq1 tq1Var) {
        fo1 fo1Var;
        String str;
        final com.monetization.ads.mediation.base.a aVarA = this.f83987b.a(context, qq1Var, com.monetization.ads.mediation.base.a.class);
        if (aVarA != null) {
            this.f83990e.getClass();
            fo1Var = new fo1(aVarA);
        } else {
            fo1Var = null;
        }
        if (!(aVarA instanceof MediatedBidderTokenLoader)) {
            if (aVarA == null) {
                tq1Var.a(null);
                return;
            } else {
                a(context, qq1Var, fo1Var, "Can't create bidder token loader.", null, tq1Var);
                return;
            }
        }
        try {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final HashMap map = new HashMap(qq1Var.f81931c);
            Map map2 = qq1Var.f81936h;
            if (map2 != null && (str = (String) map2.get("app_id")) != null) {
                map.put("app_id", str);
            }
            if (a03Var != null) {
                map.put("width", String.valueOf(a03Var.getWidth()));
                map.put("height", String.valueOf(a03Var.getHeight()));
            }
            final fo1 fo1Var2 = fo1Var;
            this.f83986a.execute(new Runnable() { // from class: cp.pb
                @Override // java.lang.Runnable
                public final void run() {
                    vq1.a(aVarA, context, map, qq1Var, this, fo1Var2, tq1Var, epVar, jElapsedRealtime);
                }
            });
        } catch (Throwable th2) {
            a(context, qq1Var, fo1Var, th2.toString(), null, tq1Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq1(xo1 xo1Var) {
        this(ng1.a().a(), new ro1(xo1Var), new sq1(), new rq1(xo1Var), new go1());
        Object obj = og1.f81031d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.monetization.ads.mediation.base.a aVar, Context context, HashMap map, qq1 qq1Var, vq1 vq1Var, fo1 fo1Var, tq1 tq1Var, ep epVar, long j10) {
        ((MediatedBidderTokenLoader) aVar).loadBidderToken(context, map, new uq1(qq1Var, vq1Var, context, fo1Var, tq1Var, epVar, j10));
    }

    public final void a(Context context, qq1 qq1Var, fo1 fo1Var, String str, Long l10, tq1 tq1Var) {
        MediatedAdapterInfo mediatedAdapterInfoB;
        rq1 rq1Var = this.f83989d;
        rq1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("failure_reason", str);
        linkedHashMap.put("status", "error");
        if (l10 != null) {
            linkedHashMap.put("response_time", l10);
        }
        if (fo1Var != null) {
            rq1Var.f82392b.getClass();
            linkedHashMap.putAll(so1.a(fo1Var));
        }
        String networkName = (fo1Var == null || (mediatedAdapterInfoB = fo1Var.b()) == null) ? null : mediatedAdapterInfoB.getNetworkName();
        xo1 xo1Var = rq1Var.f82391a;
        xo1Var.getClass();
        xo1Var.a(context, co2.f76358i, qq1Var, networkName, linkedHashMap);
        tq1Var.a(null);
    }
}
