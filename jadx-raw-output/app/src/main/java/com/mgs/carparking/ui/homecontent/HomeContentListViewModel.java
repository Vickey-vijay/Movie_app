package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import ca.e0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HomeVideoPageEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import fm.c;
import fm.d;
import ii.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import oi.g;
import ul.b;
import w9.l;

/* JADX INFO: loaded from: classes9.dex */
public class HomeContentListViewModel extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f41777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f41778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<List<RecommandVideosEntity>> f41779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f41780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f41781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f41782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableList<e0> f41784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c<e0> f41785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b<e0> f41786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f41787s;

    public class a implements u<BaseResponse<HomeVideoPageEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41788b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a(boolean z10) {
            this.f41788b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            HomeContentListViewModel.this.f41782n.call();
            HomeContentListViewModel.this.f41777i.set(Boolean.FALSE);
            HomeContentListViewModel.this.f41778j.set(Boolean.TRUE);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<HomeVideoPageEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f41788b) {
                    HomeContentListViewModel.this.f41780l.call();
                }
                ObservableField<Boolean> observableField = HomeContentListViewModel.this.f41777i;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                HomeContentListViewModel.this.f41778j.set(bool);
                HomeContentListViewModel.this.f41775g = baseResponse.getResult().getPageNum() + 1;
                if (!baseResponse.getResult().isHasNextPage()) {
                    HomeContentListViewModel.this.f41781m.call();
                }
                if (baseResponse.getResult().getList() != null && baseResponse.getResult().getList().size() > 0) {
                    Iterator<RecommandVideosEntity> it = baseResponse.getResult().getList().iterator();
                    while (it.hasNext()) {
                        HomeContentListViewModel.this.f41784p.add(new e0(HomeContentListViewModel.this, it.next()));
                    }
                }
                HomeContentListViewModel.this.f41782n.call();
            }
        }
    }

    public static /* synthetic */ void s(Throwable th2) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        this.f41783o.postValue(e0Var.f5724b);
    }

    public void w(boolean z10) {
        if (z10) {
            this.f41775g = 1;
            this.f41784p.clear();
        }
        HashMap map = new HashMap();
        map.put("videoType", Integer.valueOf(this.f41774f));
        map.put("curPage", Integer.valueOf(this.f41775g));
        map.put("pageSize", Integer.valueOf(this.f41776h));
        ((n9.a) this.f64407b).U(map).e(new l()).e(new w9.c()).b(new a(z10));
    }

    public void x() {
        HashMap map = new HashMap();
        map.put("videoType", Integer.valueOf(this.f41774f));
        b(((n9.a) this.f64407b).V(map).e(new l()).e(new w9.c()).l(new g() { // from class: ca.f
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f5730b.r((BaseResponse) obj);
            }
        }, new g() { // from class: ca.g
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                HomeContentListViewModel.s((Throwable) obj);
            }
        }));
    }

    public void y(int i10) {
        this.f41774f = i10;
    }

    public HomeContentListViewModel(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41774f = 0;
        this.f41775g = 1;
        this.f41776h = 20;
        this.f41777i = new ObservableField<>(Boolean.TRUE);
        this.f41778j = new ObservableField<>(Boolean.FALSE);
        this.f41779k = new SingleLiveEvent<>();
        this.f41780l = new SingleLiveEvent<>();
        this.f41781m = new SingleLiveEvent<>();
        this.f41782n = new SingleLiveEvent<>();
        this.f41783o = new SingleLiveEvent<>();
        this.f41784p = new ObservableArrayList();
        this.f41785q = c.d(new d() { // from class: ca.h
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_list);
            }
        });
        this.f41786r = new b<>(new ul.c() { // from class: ca.i
            @Override // ul.c
            public final void call(Object obj) {
                this.f5741a.u((e0) obj);
            }
        });
        this.f41787s = new b(new ul.a() { // from class: ca.j
            @Override // ul.a
            public final void call() {
                this.f5743a.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(BaseResponse baseResponse) throws Exception {
        if (baseResponse.getResult() != null && ((List) baseResponse.getResult()).size() > 0) {
            this.f41779k.setValue((List) baseResponse.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        x();
        w(true);
    }
}
