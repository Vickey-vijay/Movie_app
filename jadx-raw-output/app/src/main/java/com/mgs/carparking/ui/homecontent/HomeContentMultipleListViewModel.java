package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import ca.a1;
import ca.c1;
import ca.g1;
import ca.j0;
import ca.m0;
import ca.s0;
import ca.y0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import em.p;
import em.r;
import ii.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import sa.g;
import sl.e;
import w9.l;

/* JADX INFO: loaded from: classes.dex */
public class HomeContentMultipleListViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f41801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f41802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f41803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f41804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f41805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f41807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<HomeMultipleEntry> f41808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableList<e> f41809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fm.c<e> f41810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ul.b f41811r;

    public class a implements fm.d<e> {
        public a() {
        }

        @Override // fm.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(fm.c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_HOME_VIDEO_SLIDE")) {
                cVar.f(7, R.layout.item_home_content_multiple_slide);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HOT")) {
                cVar.f(7, R.layout.item_home_content_multiple_hot);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_NEW")) {
                cVar.f(7, R.layout.item_home_content_multiple_new);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HISTORY")) {
                cVar.f(7, R.layout.item_home_content_multiple_category);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_CATEGORY_LIST")) {
                cVar.f(7, R.layout.item_home_content_multiple_category_list);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GALLERY")) {
                cVar.f(7, R.layout.item_home_content_multiple_gallery);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_NO_TITLE")) {
                cVar.f(7, R.layout.item_home_content_multiple_no_title);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_SPECIAL_LIST")) {
                cVar.f(7, R.layout.item_home_content_multiple_special_list);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f41813b;

        public b(Handler handler) {
            this.f41813b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeContentMultipleListViewModel.this.f41801h.set(Boolean.FALSE);
            HomeContentMultipleListViewModel homeContentMultipleListViewModel = HomeContentMultipleListViewModel.this;
            homeContentMultipleListViewModel.s(homeContentMultipleListViewModel.f41808o, true);
            HomeContentMultipleListViewModel.this.v(true, true);
            this.f41813b.removeCallbacksAndMessages(null);
        }
    }

    public class c implements u<BaseResponse<List<HomeMultipleEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f41816c;

        public c(boolean z10, boolean z11) {
            this.f41815b = z10;
            this.f41816c = z11;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (HomeContentMultipleListViewModel.this.f41800g == 1) {
                HomeContentMultipleListViewModel.this.f41803j.call();
            }
            if (HomeContentMultipleListViewModel.this.f41800g == 1 && HomeContentMultipleListViewModel.this.f41808o.size() > 0 && this.f41816c) {
                HomeContentMultipleListViewModel.this.f41800g = 2;
            }
            HomeContentMultipleListViewModel.this.f41805l.call();
            if (HomeContentMultipleListViewModel.this.f41800g == 1 && HomeContentMultipleListViewModel.this.f41808o.size() == 0 && HomeContentMultipleListViewModel.this.f41809p.size() == 0) {
                HomeContentMultipleListViewModel.this.f41801h.set(Boolean.FALSE);
                HomeContentMultipleListViewModel.this.f41802i.set(Boolean.TRUE);
            }
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HomeContentMultipleListViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<HomeMultipleEntry>> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f41815b) {
                    HomeContentMultipleListViewModel.this.f41809p.clear();
                    HomeContentMultipleListViewModel.this.f41803j.call();
                }
                ObservableField<Boolean> observableField = HomeContentMultipleListViewModel.this.f41801h;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                HomeContentMultipleListViewModel.this.f41802i.set(bool);
                HomeContentMultipleListViewModel.this.f41800g++;
                if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                    HomeContentMultipleListViewModel.this.s(baseResponse.getResult(), false);
                    if (HomeContentMultipleListViewModel.this.f41800g == 2) {
                        g.f("CACHE_HOME_MODEL_LIST_" + HomeContentMultipleListViewModel.this.f41799f, baseResponse.getResult());
                    }
                } else {
                    if (HomeContentMultipleListViewModel.this.f41800g == 2) {
                        HomeContentMultipleListViewModel.this.f41802i.set(Boolean.TRUE);
                        HomeContentMultipleListViewModel.this.f41801h.set(bool);
                    }
                    if (HomeContentMultipleListViewModel.this.f41800g >= 2) {
                        HomeContentMultipleListViewModel.this.f41804k.call();
                    }
                }
                HomeContentMultipleListViewModel.this.f41805l.call();
            }
        }
    }

    public class d implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ObservableList f41818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f41819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f41820d;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public d(ObservableList observableList, y0 y0Var, int i10) {
            this.f41818b = observableList;
            this.f41819c = y0Var;
            this.f41820d = i10;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            HomeContentMultipleListViewModel.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                this.f41818b.clear();
                this.f41819c.f5801c = "";
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    if (i10 == baseResponse.getResult().size() - 1) {
                        this.f41819c.f5801c = this.f41819c.f5801c + baseResponse.getResult().get(i10).getId();
                    } else {
                        this.f41819c.f5801c = this.f41819c.f5801c + baseResponse.getResult().get(i10).getId() + StringUtils.COMMA;
                    }
                    this.f41818b.add(new s0(HomeContentMultipleListViewModel.this, baseResponse.getResult().get(i10), this.f41820d));
                }
            }
        }
    }

    public void r(y0 y0Var, int i10, ObservableList<s0> observableList, String str, int i11) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("psize", 6);
        map.put("not_vod_ids", str);
        ((n9.a) this.f64407b).x(map).k(new f0()).e(new l()).e(new w9.c()).b(new d(observableList, y0Var, i11));
    }

    public void s(List<HomeMultipleEntry> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getType() == 1 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new c1(this, list.get(i10).getBlock_list(), list.get(i10).getModule_id(), z10, "TYPE_HOME_VIDEO_SLIDE"));
            } else if (list.get(i10).getType() == 10 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new g1(this, list.get(i10), "TYPE_HOME_VIDEO_SPECIAL_LIST", this.f41799f));
            } else if (list.get(i10).getType() == 7 && list.get(i10).is_title() == 0) {
                arrayList.add(new a1(this, list.get(i10), "TYPE_HOME_VIDEO_NO_TITLE"));
            } else if (list.get(i10).getType() == 6) {
                arrayList.add(new m0(this, list.get(i10), "TYPE_HOME_VIDEO_HOT"));
            } else if (list.get(i10).getType() == 7 && list.get(i10).is_title() == 1) {
                arrayList.add(new y0(this, list.get(i10), "TYPE_HOME_VIDEO_NEW"));
            } else if (list.get(i10).getType() == 9) {
                arrayList.add(new j0(this, list.get(i10), "TYPE_HOME_VIDEO_HISTORY"));
            }
            if (i10 == 1 && AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0) {
                arrayList.add(new m0(this, list.get(i10), "TYPE_HOME_VIDEO_ADS"));
            }
        }
        this.f41809p.addAll(arrayList);
    }

    public void u(Handler handler) {
        List<HomeMultipleEntry> listD = g.d("CACHE_HOME_MODEL_LIST_" + this.f41799f, HomeMultipleEntry.class);
        this.f41808o = listD;
        if (listD == null || listD.size() <= 0) {
            v(true, false);
        } else {
            this.f41800g = 2;
            handler.postDelayed(new b(handler), 500L);
        }
    }

    public void v(boolean z10, boolean z11) {
        if (z10) {
            this.f41800g = 1;
        }
        HashMap map = new HashMap();
        map.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, Integer.valueOf(this.f41799f));
        map.put("pn", Integer.valueOf(this.f41800g));
        if (sa.e.j() == 8) {
            map.put("cgi", sa.e.l());
        }
        ((n9.a) this.f64407b).k(map).k(new f0()).e(new l()).e(new w9.c()).b(new c(z10, z11));
    }

    public void w(int i10) {
        this.f41799f = i10;
    }

    public HomeContentMultipleListViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41799f = 0;
        this.f41800g = 1;
        this.f41801h = new ObservableField<>(Boolean.TRUE);
        this.f41802i = new ObservableField<>(Boolean.FALSE);
        this.f41803j = new SingleLiveEvent<>();
        this.f41804k = new SingleLiveEvent<>();
        this.f41805l = new SingleLiveEvent<>();
        this.f41806m = new SingleLiveEvent<>();
        this.f41807n = new SingleLiveEvent<>();
        this.f41808o = new ArrayList();
        this.f41809p = new ObservableArrayList();
        this.f41810q = fm.c.d(new a());
        this.f41811r = new ul.b(new ul.a() { // from class: ca.o
            @Override // ul.a
            public final void call() {
                this.f5760a.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!sa.e.q()) {
            this.f41809p.clear();
            this.f41802i.set(Boolean.FALSE);
            this.f41801h.set(Boolean.TRUE);
            v(true, false);
        }
    }
}
