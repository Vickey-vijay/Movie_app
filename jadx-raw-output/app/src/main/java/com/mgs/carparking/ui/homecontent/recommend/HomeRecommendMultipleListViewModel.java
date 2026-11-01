package com.mgs.carparking.ui.homecontent.recommend;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ea.c0;
import ea.g0;
import ea.k0;
import ea.l;
import ea.m;
import ea.m0;
import ea.q0;
import ea.s;
import em.p;
import em.r;
import ii.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import sa.g;
import sl.e;

/* JADX INFO: loaded from: classes9.dex */
public class HomeRecommendMultipleListViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f41880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Boolean> f41881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<RecommandVideosEntity> f41882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f41883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f41884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f41885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f41887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<HomeMultipleEntry> f41888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableList<e> f41889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fm.c<e> f41890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ul.b f41891u;

    public class a implements fm.d<e> {
        public a() {
        }

        @Override // fm.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(fm.c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_HOME_VIDEO_SLIDE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_slide);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HOT")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_hot);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_NEW")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_new);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HISTORY")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_category);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_MULTIPLE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_multiple);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE_TITLE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike_title);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE_HORIZATION")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike_horization);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_SPECIAL_LIST")) {
                cVar.f(7, R.layout.item_recommend_multiple_special_list);
            }
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {
        public b() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            HomeRecommendMultipleListViewModel.this.f41885o.call();
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HomeRecommendMultipleListViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (baseResponse.isOk()) {
                HomeRecommendMultipleListViewModel.this.f41877g++;
                if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                    for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                        HomeRecommendMultipleListViewModel.this.f41889s.add(new l(HomeRecommendMultipleListViewModel.this, baseResponse.getResult().get(i10), "TYPE_HOME_VIDEO_GUSSLIKE"));
                    }
                } else if (HomeRecommendMultipleListViewModel.this.f41877g > 2) {
                    HomeRecommendMultipleListViewModel.this.f41884n.call();
                }
                HomeRecommendMultipleListViewModel.this.f41885o.call();
                return;
            }
            HomeRecommendMultipleListViewModel.this.f41885o.call();
        }
    }

    public class c implements u<BaseResponse<List<HomeMultipleEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f41895c;

        public c(boolean z10, boolean z11) {
            this.f41894b = z10;
            this.f41895c = z11;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HomeRecommendMultipleListViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<HomeMultipleEntry>> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult().size() > 0) {
                if (this.f41894b) {
                    HomeRecommendMultipleListViewModel.this.f41889s.clear();
                    HomeRecommendMultipleListViewModel.this.f41883m.call();
                }
                ObservableField<Boolean> observableField = HomeRecommendMultipleListViewModel.this.f41880j;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                HomeRecommendMultipleListViewModel.this.f41881k.set(bool);
                HomeRecommendMultipleListViewModel.this.t(baseResponse.getResult(), false);
                g.f("CACHE_RECOMMEND_LIST", baseResponse.getResult());
                return;
            }
            HomeRecommendMultipleListViewModel.this.f41880j.set(Boolean.FALSE);
            HomeRecommendMultipleListViewModel.this.f41881k.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (!yl.b.a(BaseApplication.getInstance())) {
                p.b(r.a().getResources().getString(R.string.text_toast_nonet));
            }
            HomeRecommendMultipleListViewModel.this.f41883m.call();
            if (HomeRecommendMultipleListViewModel.this.f41888r.size() == 0 && this.f41895c) {
                HomeRecommendMultipleListViewModel.this.f41880j.set(Boolean.FALSE);
                HomeRecommendMultipleListViewModel.this.f41881k.set(Boolean.TRUE);
            }
        }
    }

    public class d implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ObservableList f41897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f41898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f41899d;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public d(ObservableList observableList, k0 k0Var, int i10) {
            this.f41897b = observableList;
            this.f41898c = k0Var;
            this.f41899d = i10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                this.f41897b.clear();
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    if (i10 == baseResponse.getResult().size() - 1) {
                        this.f41898c.f52512c = this.f41898c.f52512c + baseResponse.getResult().get(i10).getId();
                    } else {
                        this.f41898c.f52512c = this.f41898c.f52512c + baseResponse.getResult().get(i10).getId() + StringUtils.COMMA;
                    }
                    this.f41897b.add(new c0(HomeRecommendMultipleListViewModel.this, baseResponse.getResult().get(i10), this.f41899d));
                }
            }
        }
    }

    public void r(k0 k0Var, int i10, ObservableList<c0> observableList, String str, int i11) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("psize", 6);
        map.put("not_vod_ids", str);
        ((n9.a) this.f64407b).x(map).e(new w9.l()).e(new w9.c()).b(new d(observableList, k0Var, i11));
    }

    public void s() {
        this.f41887q.call();
    }

    public void t(List<HomeMultipleEntry> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getType() == 1 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new m0(this, list.get(i10).getBlock_list(), list.get(i10).getModule_id(), z10, "TYPE_HOME_VIDEO_SLIDE"));
            } else if (list.get(i10).getType() == 6) {
                arrayList.add(new ea.u(this, list.get(i10), "TYPE_HOME_VIDEO_HOT"));
            } else if (list.get(i10).getType() == 7) {
                arrayList.add(new k0(this, list.get(i10), "TYPE_HOME_VIDEO_NEW"));
            } else if (list.get(i10).getType() == 8) {
                arrayList.add(new g0(this, list.get(i10), "TYPE_HOME_VIDEO_MULTIPLE"));
            } else if (list.get(i10).getType() == 9) {
                arrayList.add(new ea.p(this, list.get(i10), "TYPE_HOME_VIDEO_HISTORY"));
            } else if (list.get(i10).getType() == 11) {
                arrayList.add(new s(this, list.get(i10), "TYPE_HOME_VIDEO_GUSSLIKE_HORIZATION"));
            } else if (list.get(i10).getType() == 10 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new q0(this, list.get(i10), "TYPE_HOME_VIDEO_SPECIAL_LIST"));
            }
            if (i10 == 1 && AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0) {
                arrayList.add(new k0(this, list.get(i10), "TYPE_HOME_VIDEO_ADS"));
            }
        }
        arrayList.add(new m(this, "TYPE_HOME_VIDEO_GUSSLIKE_TITLE"));
        this.f41889s.addAll(arrayList);
        this.f41879i = this.f41889s.size();
        if (z10) {
            return;
        }
        x(true);
    }

    public void v() {
        List<HomeMultipleEntry> listD = g.d("CACHE_RECOMMEND_LIST", HomeMultipleEntry.class);
        this.f41888r = listD;
        if (listD != null && listD.size() > 0) {
            this.f41880j.set(Boolean.FALSE);
            t(this.f41888r, true);
        }
        w(true, true);
    }

    public void w(boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, Integer.valueOf(this.f41876f));
        map.put("psize", 100);
        map.put("pn", 1);
        if (sa.e.j() == 8) {
            map.put("cgi", sa.e.l());
        }
        ((n9.a) this.f64407b).k(map).k(new f0()).e(new w9.l()).e(new w9.c()).b(new c(z10, z11));
    }

    public void x(boolean z10) {
        if (z10) {
            this.f41877g = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f41877g));
        ((n9.a) this.f64407b).r(map).k(new f0()).e(new w9.l()).e(new w9.c()).b(new b());
    }

    public void y(int i10) {
        this.f41876f = i10;
    }

    public HomeRecommendMultipleListViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41876f = 0;
        this.f41877g = 1;
        this.f41878h = 10;
        this.f41879i = 0;
        this.f41880j = new ObservableField<>(Boolean.TRUE);
        this.f41881k = new ObservableField<>(Boolean.FALSE);
        this.f41882l = new ArrayList();
        this.f41883m = new SingleLiveEvent<>();
        this.f41884n = new SingleLiveEvent<>();
        this.f41885o = new SingleLiveEvent<>();
        this.f41886p = new SingleLiveEvent<>();
        this.f41887q = new SingleLiveEvent<>();
        this.f41888r = new ArrayList();
        this.f41889s = new ObservableArrayList();
        this.f41890t = fm.c.d(new a());
        this.f41891u = new ul.b(new ul.a() { // from class: ea.h
            @Override // ul.a
            public final void call() {
                this.f52501a.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!sa.e.q()) {
            this.f41881k.set(Boolean.FALSE);
            this.f41880j.set(Boolean.TRUE);
            this.f41889s.clear();
            w(true, true);
        }
    }
}
