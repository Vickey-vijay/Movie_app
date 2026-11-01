package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.SearchExtendEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import em.o;
import em.r;
import fm.c;
import ii.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.g;
import ul.b;
import w9.f2;
import w9.h2;
import w9.l;

/* JADX INFO: loaded from: classes8.dex */
public class SEARCHCONTENTVIDEOVIEWMODEL extends BaseViewModel<n9.a> {
    public b A;
    public b B;
    public b C;
    public b D;
    public b<String> E;
    public b F;
    public ObservableList<h2> G;
    public c<h2> H;
    public ObservableList<f2> I;
    public c<f2> J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HotNewSearchEntry f41324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f41325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f41326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f41327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f41328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableBoolean f41329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableBoolean f41330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f41332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f41333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<String> f41335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f41336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<String> f41337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f41338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f41339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f41340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f41341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f41342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f41343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f41344z;

    public class a implements u<BaseResponse<List<SearchExtendEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41345b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public a(String str) {
            this.f41345b = str;
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            SEARCHCONTENTVIDEOVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<SearchExtendEntry>> baseResponse) {
            if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                SEARCHCONTENTVIDEOVIEWMODEL.this.f41332n.set(Boolean.FALSE);
                SEARCHCONTENTVIDEOVIEWMODEL.this.I.clear();
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = SEARCHCONTENTVIDEOVIEWMODEL.this;
                    searchcontentvideoviewmodel.I.add(new f2(searchcontentvideoviewmodel, baseResponse.getResult().get(i10).getVod_name(), this.f41345b));
                }
                return;
            }
            SEARCHCONTENTVIDEOVIEWMODEL.this.I.clear();
            SEARCHCONTENTVIDEOVIEWMODEL.this.f41332n.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        if (this.f41325g.get().equals(r.a().getResources().getString(R.string.text_cannel))) {
            d();
            return;
        }
        if (o.b(this.f41326h.get())) {
            return;
        }
        this.f41333o.set(this.f41326h.get());
        this.f41336r.call();
        this.f41335q.setValue(this.f41326h.get());
        this.f41337s.setValue(this.f41326h.get());
        this.f41334p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        if (o.b(this.f41326h.get())) {
            return;
        }
        this.f41333o.set(this.f41326h.get());
        this.f41336r.call();
        this.f41335q.setValue(this.f41326h.get());
        this.f41337s.setValue(this.f41326h.get());
        this.f41334p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f41336r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f41338t.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f41338t.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f41339u.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        if (this.f41324f != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f41324f.getVod_id());
            startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    public void E() {
        ArrayList arrayList = new ArrayList();
        List<HotNewSearchEntry> listD = g.d("CACHE_HOT_SEARCH", HotNewSearchEntry.class);
        if (listD == null || listD.size() <= 0) {
            return;
        }
        this.G.clear();
        for (HotNewSearchEntry hotNewSearchEntry : listD) {
            if (!o.b(hotNewSearchEntry.getPic())) {
                arrayList.add(hotNewSearchEntry);
            }
            this.G.add(new h2(this, hotNewSearchEntry));
        }
        this.f41341w.call();
    }

    public void F(String str) {
        HashMap map = new HashMap();
        map.put("kw", str);
        ((n9.a) this.f64407b).o(map).e(new l()).e(new w9.c()).b(new a(str));
    }

    public SEARCHCONTENTVIDEOVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41325g = new ObservableField<>(r.a().getResources().getString(R.string.text_cannel));
        this.f41326h = new ObservableField<>("");
        this.f41327i = new ObservableBoolean(true);
        this.f41328j = new ObservableBoolean();
        this.f41329k = new ObservableBoolean(true);
        this.f41330l = new ObservableBoolean(false);
        Boolean bool = Boolean.FALSE;
        this.f41331m = new ObservableField<>(bool);
        this.f41332n = new ObservableField<>(bool);
        this.f41333o = new ObservableField<>("");
        this.f41334p = new SingleLiveEvent<>();
        this.f41335q = new SingleLiveEvent<>();
        this.f41336r = new SingleLiveEvent<>();
        this.f41337s = new SingleLiveEvent<>();
        this.f41338t = new SingleLiveEvent<>();
        this.f41339u = new SingleLiveEvent<>();
        this.f41340v = new ObservableField<>(bool);
        this.f41341w = new SingleLiveEvent<>();
        this.f41342x = new b(new ul.a() { // from class: w9.q4
            @Override // ul.a
            public final void call() {
                this.f73761a.v();
            }
        });
        this.f41343y = new b(new ul.a() { // from class: w9.r4
            @Override // ul.a
            public final void call() {
                this.f73768a.w();
            }
        });
        this.f41344z = new b(new ul.a() { // from class: w9.s4
            @Override // ul.a
            public final void call() {
                this.f73783a.x();
            }
        });
        this.A = new b(new ul.a() { // from class: w9.t4
            @Override // ul.a
            public final void call() {
                this.f73808a.y();
            }
        });
        this.B = new b(new ul.a() { // from class: w9.u4
            @Override // ul.a
            public final void call() {
                this.f73821a.z();
            }
        });
        this.C = new b(new ul.a() { // from class: w9.v4
            @Override // ul.a
            public final void call() {
                this.f73832a.A();
            }
        });
        this.D = new b(new ul.a() { // from class: w9.w4
            @Override // ul.a
            public final void call() {
                this.f73847a.B();
            }
        });
        this.E = new b<>(new ul.c() { // from class: w9.x4
            @Override // ul.c
            public final void call(Object obj) {
                this.f73856a.C((String) obj);
            }
        });
        this.F = new b(new ul.a() { // from class: w9.y4
            @Override // ul.a
            public final void call() {
                this.f73898a.D();
            }
        });
        this.G = new ObservableArrayList();
        this.H = c.c(7, R.layout.item_home_search_hot_search);
        this.I = new ObservableArrayList();
        this.J = c.c(7, R.layout.item_search_extend_list);
        this.f41328j.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        if (o.b(str)) {
            this.f41330l.set(false);
            this.f41329k.set(true);
            this.f41333o.set("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        d();
    }
}
