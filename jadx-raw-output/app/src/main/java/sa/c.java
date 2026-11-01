package sa;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.SpecialCollectionDao;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.AdSysConfEntry;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.Response;

/* JADX INFO: compiled from: ApiRequestUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class a implements ii.u<BaseResponse<String>> {
        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class b implements x.b {
        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            Log.i("wangyi", "get成功：");
        }
    }

    /* JADX INFO: renamed from: sa.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class C0641c implements ii.u<BaseResponse<String>> {
        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class d implements ii.u<BaseResponse<UserDeviceEntity>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            Log.i("wangyi", "错误为：" + th2.toString());
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UserDeviceEntity> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                if (baseResponse.getResult().getUser_info() != null) {
                    o0.h1(baseResponse.getResult().getUser_info().getSvip_validity());
                    o0.e1(baseResponse.getResult().getUser_info().is_svip());
                    o0.d1(baseResponse.getResult().getUser_info().getUser_id());
                    o0.a1(baseResponse.getResult().getUser_info().getToken());
                    o0.K0(baseResponse.getResult().getUser_info().getLogin_type());
                    if (baseResponse.getResult().getUser_info().is_vip() == 1) {
                        o0.F0(true);
                    } else {
                        o0.F0(false);
                    }
                    if (em.o.b(o0.t()) && !em.o.b(baseResponse.getResult().getUser_info().getCreate_time())) {
                        o0.z0(baseResponse.getResult().getUser_info().getCreate_time());
                        try {
                            if (System.currentTimeMillis() - em.d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                                o0.V0(1);
                            } else {
                                o0.V0(0);
                            }
                        } catch (ParseException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                if (baseResponse.getResult().getSys_conf() != null) {
                    if (baseResponse.getResult().getSys_conf() != null && baseResponse.getResult().getSys_conf().getApi_conf() != null) {
                        AppApplication.apiList = baseResponse.getResult().getSys_conf().getApi_conf();
                        AppApplication.ex_tab_name = baseResponse.getResult().getSys_conf().getEx_tab_name();
                        em.k.i(em.r.a()).p("CACHE_DOMAIN_LIST", baseResponse.getResult().getSys_conf().getApi_conf());
                        tl.a.a().b(new x9.h());
                    }
                    if (!em.o.b(baseResponse.getResult().getSys_conf().getApi_url2()) && !o0.p().equals(baseResponse.getResult().getSys_conf().getApi_url2())) {
                        o0.u0(baseResponse.getResult().getSys_conf().getApi_url2());
                        RetrofitUrlManager.getInstance().setGlobalDomain(baseResponse.getResult().getSys_conf().getApi_url2());
                    }
                    if (!em.o.c(baseResponse.getResult().getSys_conf().getExternal_h5_url())) {
                        o0.Y0(baseResponse.getResult().getSys_conf().getExternal_h5_url());
                    }
                    if (!em.o.c(baseResponse.getResult().getSys_conf().getUser_h5_url())) {
                        o0.O0(baseResponse.getResult().getSys_conf().getUser_h5_url());
                    }
                    o0.T0(baseResponse.getResult().getSys_conf().getShare_content());
                    o0.I0(baseResponse.getResult().getSys_conf().is_projection());
                    o0.k1(baseResponse.getResult().getSys_conf().getWebsite());
                    o0.L0(baseResponse.getResult().getSys_conf().getMax_view_num());
                    o0.o0(baseResponse.getResult().getSys_conf().getAd_view_time() * 1000);
                    o0.g0(baseResponse.getResult().getSys_conf().getShow_ad_time() * 1000);
                    o0.Z0(baseResponse.getResult().getSys_conf().getToday_view_ad());
                    o0.h0(baseResponse.getResult().getSys_conf().getAd_download_num());
                    o0.m0(baseResponse.getResult().getSys_conf().getNetCineVarShort_play_ad_freq());
                    if (!em.o.b(baseResponse.getResult().getSys_conf().getHide_ad())) {
                        o0.n0(Integer.parseInt(baseResponse.getResult().getSys_conf().getHide_ad()));
                    }
                    o0.C0(baseResponse.getResult().getSys_conf().getFeedback_tags());
                    if (!em.o.b(baseResponse.getResult().getSys_conf().getVod_feedback_tags())) {
                        o0.j1(baseResponse.getResult().getSys_conf().getVod_feedback_tags());
                    }
                    if (baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time() > 0) {
                        o0.l1(baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time());
                    }
                    o0.m1(baseResponse.getResult().getSys_conf().getPrivacy_url());
                    o0.w0(baseResponse.getResult().getSys_conf().getCustomer_service_url());
                    o0.P0(baseResponse.getResult().getSys_conf().getIos_p_card_list());
                    o0.x0(baseResponse.getResult().getSys_conf().getNetCineVarApp_language_options());
                }
                c.e(1);
                c.d(2);
            }
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class e implements ii.u<BaseResponse<List<VideoCollectionEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67133b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public e(int i10) {
            this.f67133b = i10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<VideoCollectionEntry>> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null && baseResponse.getResult().size() > 0 && this.f67133b == 1) {
                VideoCollectionDao.getInstance().clearHistory();
                Iterator<VideoCollectionEntry> it = baseResponse.getResult().iterator();
                while (it.hasNext()) {
                    VideoCollectionDao.getInstance().insert(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class f implements ii.u<BaseResponse<List<SpecialCollectionEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67134b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public f(int i10) {
            this.f67134b = i10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<SpecialCollectionEntry>> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null && baseResponse.getResult().size() > 0 && this.f67134b == 2) {
                SpecialCollectionDao.getInstance().clearHistory();
                Iterator<SpecialCollectionEntry> it = baseResponse.getResult().iterator();
                while (it.hasNext()) {
                    SpecialCollectionDao.getInstance().insert(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class g implements ii.u<BaseResponse<String>> {
        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class h implements ii.u<BaseResponse<AdInfoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f67135b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public h(boolean z10) {
            this.f67135b = z10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdInfoEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                em.k.i(em.r.a()).n(baseResponse.getResult());
                AppApplication.adInfoEntry = baseResponse.getResult();
                c.i(this.f67135b, false);
            }
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class i implements ii.u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f67136b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public i(boolean z10) {
            this.f67136b = z10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                o0.S0(baseResponse.getResult());
                if (this.f67136b) {
                    AppApplication.loadP2pSdk();
                }
            }
        }
    }

    /* JADX INFO: compiled from: ApiRequestUtil.java */
    public class j implements ii.u<BaseResponse<AdSysConfEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f67137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f67138c;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public j(boolean z10, boolean z11) {
            this.f67137b = z10;
            this.f67138c = z11;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<AdSysConfEntry> baseResponse) {
            Log.e("conftime", "AppApplicationconf结束:" + System.currentTimeMillis());
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                if (this.f67137b) {
                    AppApplication.loadAdConf(o0.b(), o0.c(), o0.a());
                    return;
                }
                return;
            }
            if (this.f67137b) {
                AppApplication.loadAdConf(baseResponse.getResult().getSdk_4(), baseResponse.getResult().getSdk_2(), baseResponse.getResult().getSdk_2_key());
            } else if (!this.f67138c && (!o0.b().equals(baseResponse.getResult().getSdk_4()) || !o0.c().equals(baseResponse.getResult().getSdk_2()))) {
                AppApplication.loadAdConf(baseResponse.getResult().getSdk_4(), baseResponse.getResult().getSdk_2(), baseResponse.getResult().getSdk_2_key());
            }
            o0.e0(baseResponse.getResult().getSdk_4());
            o0.f0(baseResponse.getResult().getSdk_2());
            o0.d0(baseResponse.getResult().getSdk_2_key());
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (this.f67137b) {
                AppApplication.loadAdConf(o0.b(), o0.c(), o0.a());
            }
        }
    }

    public static void b(String str) {
        HashMap map = new HashMap();
        map.put("type", 5);
        map.put("content", str);
        i9.a.a().t(map).e(new w9.l()).e(new w9.c()).b(new C0641c());
    }

    public static void c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put("log_type", Integer.valueOf(i10));
        map.put("ad_type", Integer.valueOf(i11));
        map.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, Integer.valueOf(i12));
        map.put("ad_position", Integer.valueOf(i13));
        map.put(CreativeInfo.f44321c, Integer.valueOf(i14));
        map.put("is_success", Integer.valueOf(i15));
        map.put("vod_id", Integer.valueOf(i16));
        map.put("collection", Integer.valueOf(i17));
        i9.a.a().j(map).e(new w9.l()).e(new w9.c()).b(new a());
    }

    public static void d(int i10) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        if (sa.e.j() == 18) {
            map.put("uvgl", sa.e.l());
        }
        i9.a.a().e(map).e(new w9.l()).e(new w9.c()).b(new f(i10));
    }

    public static void e(int i10) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        if (sa.e.j() == 18) {
            map.put("uvgl", sa.e.l());
        }
        i9.a.a().J(map).e(new w9.l()).e(new w9.c()).b(new e(i10));
    }

    public static void f(String str) {
        HashMap map = new HashMap();
        map.put("invited_by", str);
        map.put("is_install", sa.e.p() ? "1" : "0");
        i9.a.a().G(map).k(new f0()).e(new w9.l()).e(new w9.c()).b(new d());
    }

    public static void g(int i10) {
        x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=net_info&nettype=" + i10, new b());
    }

    public static void h(boolean z10) {
        HashMap map = new HashMap();
        map.put("conf_key", "p2p_config");
        i9.a.a().h(map).e(new w9.l()).e(new w9.c()).k(new f0()).b(new i(z10));
    }

    public static void i(boolean z10, boolean z11) {
        Log.e("conftime", "AppApplicationconf开始:" + System.currentTimeMillis());
        HashMap map = new HashMap();
        map.put("conf_key", "ad_appid");
        i9.a.a().O(map).e(new w9.l()).e(new w9.c()).k(new f0()).b(new j(z10, z11));
    }

    public static void j(String str, int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("tj_code", str);
        map.put("type", Integer.valueOf(i10));
        map.put("data_id", Integer.valueOf(i11));
        map.put("data_pid", Integer.valueOf(i12));
        map.put("user_id", o0.T() + "");
        map.put("vod_id", Integer.valueOf(i13));
        map.put("user_id", Integer.valueOf(i14));
        i9.a.a().y(map).e(new w9.l()).e(new w9.c()).b(new g());
    }

    public static void a(boolean z10) {
        i9.a.a().getAdInfo().e(new w9.l()).e(new w9.c()).k(new f0()).b(new h(z10));
    }
}
