package com.mgs.carparking.model;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.mgs.carparking.ui.login.LoginActivity;
import com.mgs.carparking.ui.mine.DownloadActivity;
import com.mgs.carparking.ui.mine.EditMineActivity;
import com.mgs.carparking.ui.mine.HistoryActivity;
import com.mgs.carparking.ui.mine.OrderListActivity;
import com.mgs.carparking.ui.mine.SettingActivity;
import com.mgs.carparking.ui.mine.collection.CollectionActivity;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.mgs.carparking.ui.web.GameActivity;
import com.mgs.carparking.ui.web.WebActivity;
import com.vungle.ads.internal.signals.SignalManager;
import em.d;
import em.k;
import em.o;
import em.r;
import ii.u;
import java.text.ParseException;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import sa.c;
import sa.e;
import sa.f0;
import sa.j0;
import sa.o0;
import w9.l;

/* JADX INFO: loaded from: classes8.dex */
public class MINEVIEWMODEL extends BaseViewModel<n9.a> {
    public ul.b A;
    public ul.b B;
    public ul.b C;
    public ul.b D;
    public ul.b E;
    public ul.b F;
    public ul.b G;
    public ul.b H;
    public ul.b I;
    public ul.b J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f41283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f41284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f41285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f41286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f41287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f41288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f41289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f41290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f41291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f41292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f41294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f41296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f41297t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f41298u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f41299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ul.b f41300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ul.b f41301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ul.b f41302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ul.b f41303z;

    public class a implements u<BaseResponse<MineUserInfo>> {
        public a() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            MINEVIEWMODEL.this.c();
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            MINEVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                ObservableField<String> observableField = MINEVIEWMODEL.this.f41295r;
                Resources resources = r.a().getResources();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(baseResponse.getResult().getInvited_count());
                String str = "";
                sb2.append("");
                observableField.set(resources.getString(R.string.str_sharenum, sb2.toString()));
                if (baseResponse.getResult().is_vip() == 0) {
                    MINEVIEWMODEL.this.f41296s.set(r.a().getResources().getString(R.string.str_mine_share_tips1));
                } else {
                    MINEVIEWMODEL.this.f41296s.set(r.a().getResources().getString(R.string.str_mine_no_ad_time) + d.b(Long.valueOf(baseResponse.getResult().getVip_validity() * 1000)));
                }
                o0.h1(baseResponse.getResult().getSvip_validity());
                if (baseResponse.getResult().is_svip() == 1) {
                    MINEVIEWMODEL.this.f41288k.set(r.a().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(baseResponse.getResult().getSvip_validity() * 1000)));
                    ObservableField<Boolean> observableField2 = MINEVIEWMODEL.this.f41285h;
                    Boolean bool = Boolean.TRUE;
                    observableField2.set(bool);
                    MINEVIEWMODEL.this.f41284g.set(bool);
                } else if (baseResponse.getResult().is_vip() == 1) {
                    MINEVIEWMODEL.this.f41288k.set(r.a().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(baseResponse.getResult().getVip_validity() * 1000)));
                    ObservableField<Boolean> observableField3 = MINEVIEWMODEL.this.f41285h;
                    Boolean bool2 = Boolean.TRUE;
                    observableField3.set(bool2);
                    MINEVIEWMODEL.this.f41284g.set(bool2);
                } else {
                    MINEVIEWMODEL.this.f41288k.set(r.a().getResources().getString(R.string.str_not_opened));
                    ObservableField<Boolean> observableField4 = MINEVIEWMODEL.this.f41285h;
                    Boolean bool3 = Boolean.FALSE;
                    observableField4.set(bool3);
                    MINEVIEWMODEL.this.f41284g.set(bool3);
                }
                if (baseResponse.getResult().is_vip() == 1) {
                    o0.F0(true);
                } else {
                    o0.F0(false);
                }
                o0.e1(baseResponse.getResult().is_svip());
                o0.b1(baseResponse.getResult().is_update());
                if (baseResponse.getResult().is_update() == 1) {
                    if (baseResponse.getResult().getSex() == 0) {
                        str = "2";
                    } else if (baseResponse.getResult().getSex() == 1) {
                        str = "1";
                    }
                    o0.U0(str);
                    o0.p0(baseResponse.getResult().getBirthday());
                }
            }
        }
    }

    public class b implements u<BaseResponse<UserDeviceEntity>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41305b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public b(String str) {
            this.f41305b = str;
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
                    o0.e1(baseResponse.getResult().getUser_info().is_vip());
                    o0.d1(baseResponse.getResult().getUser_info().getUser_id());
                    o0.a1(baseResponse.getResult().getUser_info().getToken());
                    o0.K0(baseResponse.getResult().getUser_info().getLogin_type());
                    if (o.b(o0.t()) && !o.b(baseResponse.getResult().getUser_info().getCreate_time())) {
                        o0.z0(baseResponse.getResult().getUser_info().getCreate_time());
                        try {
                            if (System.currentTimeMillis() - d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                                o0.V0(1);
                            } else {
                                o0.V0(0);
                            }
                        } catch (ParseException e10) {
                            e10.printStackTrace();
                        }
                    }
                    try {
                        if (System.currentTimeMillis() - d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                            o0.l0(1);
                        }
                    } catch (ParseException e11) {
                        e11.printStackTrace();
                    }
                }
                MINEVIEWMODEL.this.P();
                if (baseResponse.getResult().getSys_conf() != null) {
                    if (baseResponse.getResult().getSys_conf() != null && baseResponse.getResult().getSys_conf().getApi_conf() != null) {
                        AppApplication.apiList = baseResponse.getResult().getSys_conf().getApi_conf();
                        k.i(r.a()).p("CACHE_DOMAIN_LIST", baseResponse.getResult().getSys_conf().getApi_conf());
                    }
                    if (!o.b(baseResponse.getResult().getSys_conf().getApi_url2()) && !o0.p().equals(baseResponse.getResult().getSys_conf().getApi_url2())) {
                        o0.u0(baseResponse.getResult().getSys_conf().getApi_url2());
                        RetrofitUrlManager.getInstance().setGlobalDomain(baseResponse.getResult().getSys_conf().getApi_url2());
                    }
                    o0.I0(baseResponse.getResult().getSys_conf().is_projection());
                    o0.k1(baseResponse.getResult().getSys_conf().getWebsite());
                    o0.L0(baseResponse.getResult().getSys_conf().getMax_view_num());
                    o0.o0(baseResponse.getResult().getSys_conf().getAd_view_time() * 1000);
                    o0.g0(baseResponse.getResult().getSys_conf().getShow_ad_time() * 1000);
                    o0.Z0(baseResponse.getResult().getSys_conf().getToday_view_ad());
                    o0.h0(baseResponse.getResult().getSys_conf().getAd_download_num());
                    if (!o.b(baseResponse.getResult().getSys_conf().getHide_ad())) {
                        o0.n0(Integer.parseInt(baseResponse.getResult().getSys_conf().getHide_ad()));
                    }
                    o0.C0(baseResponse.getResult().getSys_conf().getFeedback_tags());
                    if (!o.b(baseResponse.getResult().getSys_conf().getVod_feedback_tags())) {
                        o0.j1(baseResponse.getResult().getSys_conf().getVod_feedback_tags());
                    }
                    if (baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time() > 0) {
                        o0.l1(baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time());
                    }
                    o0.m1(baseResponse.getResult().getSys_conf().getPrivacy_url());
                    c.e(1);
                    c.d(2);
                    if (!TextUtils.isEmpty(this.f41305b) && this.f41305b.equals("logout")) {
                        c.a(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        startActivity(DownloadActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        startActivity(ExtensionShareActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f41298u.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        startActivity(LoginActivity.class);
    }

    public static /* synthetic */ void F() {
        e.c(o0.T() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        startActivity(EditMineActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        Bundle bundle = new Bundle();
        bundle.putString("web_url", o0.G() + "?vod_id=0&collection=0");
        bundle.putString("web_title", r.a().getResources().getString(R.string.str_vipweb_title));
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        Bundle bundle = new Bundle();
        bundle.putInt("flag", 2);
        startActivity(FeedbackActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        startActivity(HistoryActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        startActivity(OrderListActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        startActivity(CollectionActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        startActivity(SettingActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f41291n.call();
    }

    public void A(String str) {
        HashMap map = new HashMap();
        if (!str.equals("logout")) {
            map.put("invited_by", str);
        }
        map.put("is_install", e.p() ? "1" : "0");
        i9.a.a().G(map).k(new f0()).e(new l()).e(new w9.c()).b(new b(str));
    }

    public void P() {
        ((n9.a) this.f64407b).c(new HashMap()).k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    public MINEVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f41283f = new ObservableField<>(bool);
        this.f41284g = new ObservableField<>(bool);
        this.f41285h = new ObservableField<>(bool);
        this.f41286i = new ObservableField<>();
        this.f41287j = new ObservableField<>();
        this.f41288k = new ObservableField<>();
        this.f41289l = new ObservableField<>(bool);
        this.f41290m = new SingleLiveEvent<>();
        this.f41291n = new SingleLiveEvent<>();
        this.f41292o = new SingleLiveEvent<>();
        this.f41293p = new SingleLiveEvent<>();
        this.f41294q = new ObservableField<>(bool);
        this.f41295r = new ObservableField<>(r.a().getResources().getString(R.string.str_sharenum, "0"));
        this.f41296s = new ObservableField<>(r.a().getResources().getString(R.string.str_mine_share_tips1));
        this.f41297t = new ObservableField<>("分享可得终身免广告特权>");
        this.f41298u = new SingleLiveEvent<>();
        this.f41299v = new ObservableField<>(bool);
        this.f41300w = new ul.b(new ul.a() { // from class: w9.x3
            @Override // ul.a
            public final void call() {
                this.f73855a.B();
            }
        });
        this.f41301x = new ul.b(new ul.a() { // from class: w9.g4
            @Override // ul.a
            public final void call() {
                this.f73631a.C();
            }
        });
        this.f41302y = new ul.b(new ul.a() { // from class: w9.h4
            @Override // ul.a
            public final void call() {
                this.f73639a.H();
            }
        });
        this.f41303z = new ul.b(new ul.a() { // from class: w9.i4
            @Override // ul.a
            public final void call() {
                this.f73645a.I();
            }
        });
        this.A = new ul.b(new ul.a() { // from class: w9.j4
            @Override // ul.a
            public final void call() {
                this.f73655a.J();
            }
        });
        this.B = new ul.b(new ul.a() { // from class: w9.k4
            @Override // ul.a
            public final void call() {
                this.f73675a.K();
            }
        });
        this.C = new ul.b(new ul.a() { // from class: w9.y3
            @Override // ul.a
            public final void call() {
                this.f73897a.L();
            }
        });
        this.D = new ul.b(new ul.a() { // from class: w9.z3
            @Override // ul.a
            public final void call() {
                this.f73904a.M();
            }
        });
        this.E = new ul.b(new ul.a() { // from class: w9.a4
            @Override // ul.a
            public final void call() {
                this.f73561a.N();
            }
        });
        this.F = new ul.b(new ul.a() { // from class: w9.b4
            @Override // ul.a
            public final void call() {
                this.f73567a.O();
            }
        });
        this.G = new ul.b(new ul.a() { // from class: w9.c4
            @Override // ul.a
            public final void call() {
                this.f73590a.D();
            }
        });
        this.H = new ul.b(new ul.a() { // from class: w9.d4
            @Override // ul.a
            public final void call() {
                this.f73602a.E();
            }
        });
        this.I = new ul.b(new ul.a() { // from class: w9.e4
            @Override // ul.a
            public final void call() {
                MINEVIEWMODEL.F();
            }
        });
        this.J = new ul.b(new ul.a() { // from class: w9.f4
            @Override // ul.a
            public final void call() {
                this.f73625a.G();
            }
        });
        if (o0.B() > 0) {
            this.f41283f.set(Boolean.TRUE);
        } else {
            this.f41283f.set(bool);
        }
        this.f41299v.set(Boolean.valueOf(j0.f67168a.d(true)));
        this.f41286i.set(o0.V());
        this.f41287j.set(r.a().getResources().getString(R.string.str_oferta) + " (ID:" + o0.T() + ")");
        if (o0.W() != 0 && o0.U() == 1) {
            this.f41288k.set(r.a().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(o0.W() * 1000)));
            this.f41285h.set(Boolean.TRUE);
        } else {
            this.f41288k.set(r.a().getResources().getString(R.string.str_not_opened));
            this.f41285h.set(bool);
        }
        this.f41284g.set(Boolean.valueOf(o0.U() == 1));
        this.f41290m.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        if (!o.c(o0.F()) && !o0.F().equals("none")) {
            startActivity(GameActivity.class);
        }
    }
}
