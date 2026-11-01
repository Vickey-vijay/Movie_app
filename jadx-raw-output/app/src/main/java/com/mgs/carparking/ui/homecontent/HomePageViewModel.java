package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeTitleEntry;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import com.mgs.carparking.ui.mine.DownloadActivity;
import com.mgs.carparking.ui.mine.HistoryActivity;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.e;
import sa.f0;
import sa.g;
import sa.o0;
import ul.b;
import w9.c;
import w9.l;
import x9.n;

/* JADX INFO: loaded from: classes2.dex */
public class HomePageViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f41824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f41825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f41826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SingleLiveEvent<List<HomeTitleEntry>> f41827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<List<HotNewSearchEntry>> f41828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f41829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<HomeTitleEntry> f41830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f41831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f41832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f41833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f41834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f41835q;

    public class a implements u<BaseResponse<MineUserInfo>> {
        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public a() {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HomePageViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            String str;
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                if (baseResponse.getResult().getHas_feedback() == 1) {
                    tl.a.a().c(new n(true));
                } else {
                    tl.a.a().c(new n(false));
                }
                if (baseResponse.getResult().is_vip() == 1) {
                    o0.F0(true);
                } else {
                    o0.F0(false);
                }
                if (baseResponse.getResult().getAge_list() != null && baseResponse.getResult().getAge_list().size() > 0) {
                    g.f("CACHE_AGE_LIST", baseResponse.getResult().getAge_list());
                }
                o0.J0(baseResponse.getResult().is_update());
                if (baseResponse.getResult().is_update() == 1) {
                    if (baseResponse.getResult().getSex() == 0) {
                        str = "2";
                    } else if (baseResponse.getResult().getSex() == 1) {
                        str = "1";
                    } else {
                        str = "";
                    }
                    o0.U0(str);
                    o0.p0(baseResponse.getResult().getBirthday());
                }
            }
        }
    }

    public static /* synthetic */ void y(Throwable th2) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f41829k.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        startActivity(DownloadActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        startActivity(HistoryActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Throwable th2) throws Exception {
        if (this.f41830l.size() == 0) {
            this.f41824f.set(Boolean.FALSE);
            ObservableField<Boolean> observableField = this.f41826h;
            Boolean bool = Boolean.TRUE;
            observableField.set(bool);
            this.f41825g.set(bool);
            return;
        }
        ObservableField<Boolean> observableField2 = this.f41824f;
        Boolean bool2 = Boolean.FALSE;
        observableField2.set(bool2);
        this.f41826h.set(bool2);
        this.f41825g.set(bool2);
        this.f41827i.setValue(this.f41830l);
    }

    public void E() {
        List<HomeTitleEntry> listD = g.d("CACHE_HOME_TITLE_LIST", HomeTitleEntry.class);
        this.f41830l = listD;
        if (listD == null || listD.size() <= 0) {
            this.f41824f.set(Boolean.TRUE);
            F();
            return;
        }
        ObservableField<Boolean> observableField = this.f41826h;
        Boolean bool = Boolean.FALSE;
        observableField.set(bool);
        this.f41825g.set(bool);
        this.f41827i.setValue(this.f41830l);
    }

    public void F() {
        HashMap map = new HashMap();
        if (e.j() == 5) {
            map.put("cgl", e.l());
        }
        ((n9.a) this.f64407b).d(map).k(new f0()).e(new l()).e(new c()).l(new oi.g() { // from class: ca.b0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5711b.v((BaseResponse) obj);
            }
        }, new oi.g() { // from class: ca.c0
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5714b.w((Throwable) obj);
            }
        });
    }

    public void G() {
        b(((n9.a) this.f64407b).F().e(new l()).e(new c()).l(new oi.g() { // from class: ca.u
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5789b.x((BaseResponse) obj);
            }
        }, new oi.g() { // from class: ca.v
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                HomePageViewModel.y((Throwable) obj);
            }
        }));
    }

    public void H() {
        ((n9.a) this.f64407b).c(new HashMap()).e(new l()).e(new c()).b(new a());
    }

    public HomePageViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f41824f = new ObservableField<>(bool);
        this.f41825g = new ObservableField<>(bool);
        this.f41826h = new ObservableField<>(Boolean.TRUE);
        this.f41827i = new SingleLiveEvent<>();
        this.f41828j = new SingleLiveEvent<>();
        this.f41829k = new SingleLiveEvent<>();
        this.f41830l = new ArrayList();
        this.f41831m = new b(new ul.a() { // from class: ca.w
            @Override // ul.a
            public final void call() {
                this.f5796a.z();
            }
        });
        this.f41832n = new b(new ul.a() { // from class: ca.x
            @Override // ul.a
            public final void call() {
                this.f5798a.A();
            }
        });
        this.f41833o = new b(new ul.a() { // from class: ca.y
            @Override // ul.a
            public final void call() {
                this.f5800a.B();
            }
        });
        this.f41834p = new b(new ul.a() { // from class: ca.z
            @Override // ul.a
            public final void call() {
                this.f5807a.C();
            }
        });
        this.f41835q = new b(new ul.a() { // from class: ca.a0
            @Override // ul.a
            public final void call() {
                this.f5706a.D();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (!e.q()) {
            this.f41824f.set(Boolean.TRUE);
            this.f41825g.set(Boolean.FALSE);
            if (o.b(o0.R())) {
                sa.c.f("");
            }
            if (o.b(o0.J())) {
                sa.c.h(true);
            }
            F();
            G();
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk() && baseResponse.getResult() != null && ((List) baseResponse.getResult()).size() > 0) {
            ObservableField<Boolean> observableField = this.f41824f;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            this.f41826h.set(bool);
            this.f41825g.set(bool);
            this.f41827i.setValue((List) baseResponse.getResult());
            g.f("CACHE_HOME_TITLE_LIST", (List) baseResponse.getResult());
            return;
        }
        this.f41824f.set(Boolean.FALSE);
        ObservableField<Boolean> observableField2 = this.f41826h;
        Boolean bool2 = Boolean.TRUE;
        observableField2.set(bool2);
        this.f41825g.set(bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            g.f("CACHE_HOT_SEARCH", (List) baseResponse.getResult());
            this.f41828j.setValue((List) baseResponse.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        if (!e.q()) {
            startActivity(SearchContentVideoActivity.class);
        }
    }
}
