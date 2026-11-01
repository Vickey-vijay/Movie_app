package ja;

import android.util.Log;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.db.VideoAdLookDao;
import com.mgs.carparking.db.VideoStayTimeDao;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.ShortVideoSysConfEntry;
import com.vungle.ads.internal.signals.SignalManager;
import em.d;
import em.k;
import em.o;
import em.r;
import ii.u;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.http.BaseResponse;
import oi.g;
import sa.e;
import sa.f0;
import sa.o0;
import w9.l;

/* JADX INFO: compiled from: SplashImp.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ia.a f61723a;

    /* JADX INFO: compiled from: SplashImp.java */
    public class a implements u<BaseResponse<List<ShortVideoSysConfEntry>>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ShortVideoSysConfEntry>> baseResponse) {
            Log.e("conftime", "conf完成:" + System.currentTimeMillis());
            Log.e("conftime", "resp.isOk():" + baseResponse.getCode());
            if (!baseResponse.isOk()) {
                if (c.this.f61723a != null) {
                    c.this.f61723a.isConf(false);
                    return;
                }
                return;
            }
            Log.e("conftime", "resp.getResult()" + baseResponse.getResult().size());
            if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                k.i(r.a()).j("key_vip_online_audit", false);
            } else {
                ShortVideoSysConfEntry shortVideoSysConfEntry = null;
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    if (40000 == baseResponse.getResult().get(i10).getVersion()) {
                        shortVideoSysConfEntry = baseResponse.getResult().get(i10);
                    }
                }
                if (shortVideoSysConfEntry == null || !e.t(shortVideoSysConfEntry.getChannel(), e.f(BaseApplication.getInstance()))) {
                    k.i(r.a()).j("key_vip_online_audit", false);
                } else {
                    k.i(r.a()).j("key_vip_online_audit", true);
                }
            }
            if (c.this.f61723a != null) {
                c.this.f61723a.isConf(true);
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            Log.e("conftime", "conf完成:" + th2.toString());
            if (c.this.f61723a != null) {
                c.this.f61723a.isConf(false);
            }
        }
    }

    /* JADX INFO: compiled from: SplashImp.java */
    public class b implements u<BaseResponse<AdInfoEntry>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public b() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (c.this.f61723a != null) {
                c.this.f61723a.setAdInfo(null);
            }
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdInfoEntry> baseResponse) {
            if (!baseResponse.isOk()) {
                if (c.this.f61723a != null) {
                    c.this.f61723a.setAdInfo(null);
                }
            } else if (c.this.f61723a != null) {
                c.this.f61723a.setAdInfo(baseResponse.getResult());
            }
        }
    }

    public static /* synthetic */ void g(Throwable th2) throws Exception {
    }

    public void e() {
        Log.e("conftime", "conf开始:" + System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("conf_key", "conf_key1");
        i9.a.a().R(map).e(new l()).e(new w9.c()).k(new f0()).b(new a());
    }

    public final void h() {
        HashMap map = new HashMap();
        if (e.j() == 5) {
            map.put("cgl", e.l());
        }
        i9.a.a().d(map).e(new l()).e(new w9.c()).l(new g() { // from class: ja.a
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                c.f((BaseResponse) obj);
            }
        }, new g() { // from class: ja.b
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                c.g((Throwable) obj);
            }
        });
    }

    public c(ia.a aVar) {
        this.f61723a = aVar;
        AdNumShowDao.getInstance().insertHistory();
        sa.c.h(false);
        h();
        if (o0.u() > 0) {
            if (System.currentTimeMillis() - o0.u() > 604800000) {
                o0.q0(1);
            } else {
                o0.q0(0);
            }
        }
        o0.A0(System.currentTimeMillis());
        if (o.b(o0.v())) {
            o0.B0(d.c());
        }
        if (!o0.v().equals(d.c())) {
            o0.s0(0);
            o0.N0(0);
            o0.B0(d.c());
            VideoStayTimeDao.getInstance().clearHistory();
            o0.i1(0L);
            o0.D0(0);
            o0.M0(0);
            o0.Q0(0);
            o0.j0(0);
            AdNumShowDao.getInstance().update();
            VideoAdLookDao.getInstance().clearHistory();
        }
        try {
            if (!o.b(o0.t()) && System.currentTimeMillis() - d.a(o0.t()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (o.b(o0.K())) {
                    o0.V0(1);
                } else if (!o0.K().equals(d.c())) {
                    o0.V0(1);
                }
            }
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void f(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            sa.g.f("CACHE_HOME_TITLE_LIST", (List) baseResponse.getResult());
        }
    }

    public void d() {
        i9.a.a().getAdInfo().e(new l()).e(new w9.c()).k(new f0()).b(new b());
    }
}
