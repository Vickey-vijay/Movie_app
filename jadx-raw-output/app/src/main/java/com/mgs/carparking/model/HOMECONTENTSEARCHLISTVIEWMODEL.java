package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import em.p;
import em.r;
import fm.c;
import fm.d;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import oi.o;
import sa.f0;
import sl.e;
import w9.k2;
import w9.l;
import w9.m2;
import w9.p2;
import w9.t2;
import w9.w1;

/* JADX INFO: loaded from: classes2.dex */
public class HOMECONTENTSEARCHLISTVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableBoolean f41216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableBoolean f41217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f41218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f41219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f41220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f41221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f41222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f41223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f41224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<VideoBean> f41226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableList<e> f41229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c<e> f41230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableList<w1> f41231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<w1> f41232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ul.b f41233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ul.b f41234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ul.b f41235z;

    public class a implements d<e> {
        public a() {
        }

        @Override // fm.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_MOVIE")) {
                cVar.f(7, R.layout.item_home_content_search_movie);
                return;
            }
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_TV")) {
                cVar.f(7, R.layout.item_home_content_search_tv);
                return;
            }
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_VARIETY")) {
                cVar.f(7, R.layout.item_home_content_search_variety);
            } else if (strValueOf.equals("TYPE_SEARCH_VIDEO_COMIC")) {
                cVar.f(7, R.layout.item_home_content_search_comic);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_video_search_ads);
            }
        }
    }

    public class b implements u<BaseResponse<List<e>>> {
        public b() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<e>> baseResponse) {
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41217h.set(false);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41218i.set(false);
            if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f41222m.call();
                if (HOMECONTENTSEARCHLISTVIEWMODEL.this.f41215f == 2) {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f41216g.set(true);
                } else {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f41216g.set(false);
                }
            } else {
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f41216g.set(false);
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f41229t.addAll(baseResponse.getResult());
                if (HOMECONTENTSEARCHLISTVIEWMODEL.this.f41229t.size() <= 4 && baseResponse.getResult().size() < 20) {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f41219j.set(true);
                }
            }
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41223n.call();
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            Log.i("wangyi", "失败数据为：" + th2.toString());
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41229t.clear();
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41216g.set(false);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41217h.set(true);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f41218i.set(false);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HOMECONTENTSEARCHLISTVIEWMODEL.this.b(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BaseResponse s(boolean z10, String str, BaseResponse baseResponse) throws Exception {
        BaseResponse baseResponse2 = new BaseResponse();
        if (baseResponse.isOk()) {
            if (z10) {
                this.f41229t.clear();
                this.f41221l.call();
            }
            ArrayList arrayList = new ArrayList();
            if (baseResponse.getResult() != null && ((List) baseResponse.getResult()).size() > 0) {
                for (int i10 = 0; i10 < ((List) baseResponse.getResult()).size(); i10++) {
                    if (i10 == 2 && AppApplication.adInfoEntry.getAd_position_20() != null && AppApplication.adInfoEntry.getAd_position_20().size() > 0 && AppApplication.adInfoEntry.getAd_position_20() != null && AppApplication.adInfoEntry.getAd_position_20().size() > 0) {
                        arrayList.add(new m2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(0), "TYPE_HOME_VIDEO_ADS", str));
                    }
                    if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 1) {
                        arrayList.add(new m2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_MOVIE", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 2) {
                        arrayList.add(new p2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_TV", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 3) {
                        arrayList.add(new t2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_VARIETY", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 4) {
                        arrayList.add(new k2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_COMIC", str));
                    }
                }
            }
            this.f41215f++;
            baseResponse2.setResult(arrayList);
        }
        return baseResponse2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f41220k.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f41219j.set(false);
    }

    public void x(final boolean z10, int i10, final String str) {
        if (this.f41215f == 2 && !this.f41219j.get()) {
            this.f41219j.set(true);
        }
        if (z10) {
            this.f41215f = 1;
        }
        HashMap map = new HashMap();
        map.put("kw", str);
        if (i10 != 0) {
            map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(i10));
        }
        map.put("pn", Integer.valueOf(this.f41215f));
        if (sa.e.j() == 15) {
            map.put("sr", sa.e.l());
        }
        ((n9.a) this.f64407b).l(map).k(new f0()).e(new l()).e(new w9.c()).h(new o() { // from class: w9.j0
            @Override // oi.o
            public final Object apply(Object obj) {
                return this.f73649b.s(z10, str, (BaseResponse) obj);
            }
        }).b(new b());
    }

    public HOMECONTENTSEARCHLISTVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41215f = 1;
        this.f41216g = new ObservableBoolean(false);
        this.f41217h = new ObservableBoolean(false);
        this.f41218i = new ObservableBoolean(true);
        this.f41219j = new ObservableBoolean(false);
        this.f41220k = new SingleLiveEvent<>();
        this.f41221l = new SingleLiveEvent<>();
        this.f41222m = new SingleLiveEvent<>();
        this.f41223n = new SingleLiveEvent<>();
        this.f41224o = new SingleLiveEvent<>();
        this.f41225p = new SingleLiveEvent<>();
        this.f41226q = new SingleLiveEvent<>();
        this.f41227r = new SingleLiveEvent<>();
        this.f41228s = new SingleLiveEvent<>();
        this.f41229t = new ObservableArrayList();
        this.f41230u = c.d(new a());
        this.f41231v = new ObservableArrayList();
        this.f41232w = c.d(new d() { // from class: w9.k0
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_search_recommend_list);
            }
        });
        this.f41233x = new ul.b(new ul.a() { // from class: w9.l0
            @Override // ul.a
            public final void call() {
                this.f73678a.u();
            }
        });
        this.f41234y = new ul.b(new ul.a() { // from class: w9.m0
            @Override // ul.a
            public final void call() {
                this.f73688a.v();
            }
        });
        this.f41235z = new ul.b(new ul.a() { // from class: w9.n0
            @Override // ul.a
            public final void call() {
                this.f73706a.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!sa.e.q()) {
            this.f41217h.set(false);
            this.f41218i.set(true);
            this.f41224o.call();
        }
    }
}
