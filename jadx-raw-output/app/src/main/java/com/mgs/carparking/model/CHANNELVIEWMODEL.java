package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import em.o;
import em.p;
import em.r;
import fm.c;
import fm.d;
import ii.u;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.e;
import sa.f0;
import w9.l;
import w9.p0;
import w9.q0;
import w9.s0;

/* JADX INFO: loaded from: classes9.dex */
public class CHANNELVIEWMODEL extends BaseViewModel<n9.a> {
    public ObservableList<q0> A;
    public c<q0> B;
    public ObservableList<s0> C;
    public c<s0> D;
    public ObservableList<s0> E;
    public c<s0> F;
    public ObservableList<s0> G;
    public c<s0> H;
    public ObservableList<s0> I;
    public c<s0> J;
    public ul.b K;
    public ul.b L;
    public ul.b M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f41075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f41078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f41079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f41081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f41084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f41086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f41087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f41088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Void> f41089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f41090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObservableList<p0> f41092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c<p0> f41093z;

    public class a implements u<BaseResponse<List<ChannnelFilterEntry>>> {
        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ChannnelFilterEntry>> baseResponse) {
            ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f41081n;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            CHANNELVIEWMODEL.this.f41082o.set(bool);
            CHANNELVIEWMODEL.this.D(baseResponse.getResult());
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            CHANNELVIEWMODEL.this.f41082o.set(Boolean.FALSE);
            CHANNELVIEWMODEL.this.f41081n.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            CHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41095b;

        public b(boolean z10) {
            this.f41095b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f41084q;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            CHANNELVIEWMODEL.this.f41082o.set(bool);
            CHANNELVIEWMODEL.this.f41081n.set(Boolean.TRUE);
            CHANNELVIEWMODEL.this.f41083p.set(bool);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            CHANNELVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null) {
                    if (CHANNELVIEWMODEL.this.f41073f == 1) {
                        CHANNELVIEWMODEL.this.f41092y.clear();
                    }
                    if (this.f41095b) {
                        CHANNELVIEWMODEL.this.f41086s.call();
                    }
                    ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f41083p;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    CHANNELVIEWMODEL.this.f41081n.set(bool);
                    if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                        CHANNELVIEWMODEL.this.f41084q.set(bool);
                        for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                            CHANNELVIEWMODEL.this.f41092y.add(new p0(CHANNELVIEWMODEL.this, baseResponse.getResult().get(i10)));
                        }
                    } else {
                        if (CHANNELVIEWMODEL.this.f41073f == 1) {
                            CHANNELVIEWMODEL.this.f41083p.set(bool);
                            CHANNELVIEWMODEL.this.f41084q.set(Boolean.TRUE);
                        }
                        CHANNELVIEWMODEL.this.f41087t.call();
                    }
                    CHANNELVIEWMODEL.this.f41073f++;
                    CHANNELVIEWMODEL.this.f41088u.call();
                    return;
                }
                return;
            }
            CHANNELVIEWMODEL.this.f41086s.call();
            CHANNELVIEWMODEL.this.f41084q.set(Boolean.TRUE);
            ObservableField<Boolean> observableField2 = CHANNELVIEWMODEL.this.f41082o;
            Boolean bool2 = Boolean.FALSE;
            observableField2.set(bool2);
            CHANNELVIEWMODEL.this.f41081n.set(bool2);
            CHANNELVIEWMODEL.this.f41083p.set(bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        startActivity(SearchContentVideoActivity.class);
    }

    public void A(int i10, String str) {
        if (this.f41080m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            if (i10 == i11 && !this.G.get(i10).f73772c.get().booleanValue()) {
                this.G.get(i10).f73772c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.G.get(i11).f73772c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41078k = "";
        } else {
            this.f41078k = str;
        }
        this.f41084q.set(Boolean.FALSE);
        this.f41092y.clear();
        this.f41083p.set(Boolean.TRUE);
        this.f41090w.call();
        S(true);
    }

    public void B(int i10, String str) {
        if (this.f41080m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            if (i10 == i11 && !this.I.get(i10).f73772c.get().booleanValue()) {
                this.I.get(i10).f73772c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.I.get(i11).f73772c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.str_paixu))) {
            this.f41079l = "";
        } else {
            this.f41079l = str;
        }
        this.f41084q.set(Boolean.FALSE);
        this.f41092y.clear();
        this.f41083p.set(Boolean.TRUE);
        this.f41090w.call();
        S(true);
    }

    public void C(List<String> list) {
        this.E.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.E.add(new s0(this, list.get(i10), i10, 2));
        }
    }

    public void D(List<ChannnelFilterEntry> list) {
        this.A.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ChannnelFilterEntry channnelFilterEntry = list.get(i10);
            Log.i("wangyi", "数据为：" + channnelFilterEntry.getId() + "--" + channnelFilterEntry.getName() + "---" + this.f41074g);
            if (channnelFilterEntry.getId() == this.f41074g && channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
                for (int i11 = 0; i11 < channnelFilterEntry.getMsg().size(); i11++) {
                    if (channnelFilterEntry.getMsg().get(i11).getName().equals("type")) {
                        G(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("area")) {
                        C(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("year")) {
                        H(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("sort")) {
                        E(channnelFilterEntry.getMsg().get(i11).getData());
                    }
                }
            }
        }
    }

    public void E(List<String> list) {
        this.I.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.I.add(new s0(this, list.get(i10), i10, 4));
        }
    }

    public String F() {
        String string;
        String str;
        String str2;
        int i10 = this.f41074g;
        String string2 = "";
        if (i10 == 1) {
            string = r.a().getResources().getString(R.string.text_movie);
        } else if (i10 == 2) {
            string = r.a().getResources().getString(R.string.text_tv);
        } else if (i10 == 3) {
            string = r.a().getResources().getString(R.string.text_zongyi);
        } else {
            string = i10 == 4 ? r.a().getResources().getString(R.string.text_dongman) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        if (o.b(this.f41077j)) {
            str = "";
        } else {
            str = Z7.f27998r + this.f41077j;
        }
        sb2.append(str);
        if (o.b(this.f41076i)) {
            str2 = "";
        } else {
            str2 = Z7.f27998r + this.f41076i;
        }
        sb2.append(str2);
        if (!o.b(this.f41078k)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Z7.f27998r);
            sb3.append(this.f41078k);
            if (!o.b(this.f41079l)) {
                string2 = Z7.f27998r + this.f41079l;
            }
            sb3.append(string2);
            string2 = sb3.toString();
        }
        sb2.append(string2);
        return sb2.toString();
    }

    public void G(List<String> list) {
        this.C.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (o.b(this.f41077j)) {
                s0 s0Var = new s0(this, list.get(i11), i11, 1);
                if (i11 == 0) {
                    s0Var.f73772c.set(Boolean.TRUE);
                }
                this.C.add(s0Var);
            } else if (list.get(i11).equals(this.f41077j)) {
                s0 s0Var2 = new s0(this, list.get(i11), i11, 1);
                s0Var2.f73772c.set(Boolean.TRUE);
                this.C.add(s0Var2);
                i10 = i11;
            } else {
                this.C.add(new s0(this, list.get(i11), i11, 1));
            }
        }
        this.f41091x.setValue(Integer.valueOf(i10));
    }

    public void H(List<String> list) {
        this.G.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.G.add(new s0(this, list.get(i10), i10, 3));
        }
    }

    public void R() {
        ((n9.a) this.f64407b).n().k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    public void S(boolean z10) {
        if (z10) {
            this.f41073f = 1;
            this.f41080m.set(Boolean.TRUE);
        }
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(this.f41074g));
        map.put("type", this.f41077j);
        map.put("area", this.f41076i);
        map.put("year", this.f41078k);
        map.put("sort", this.f41079l);
        map.put("pn", Integer.valueOf(this.f41073f));
        ((n9.a) this.f64407b).C(map).k(new f0()).e(new l()).e(new w9.c()).b(new b(z10));
    }

    public void y(int i10, String str) {
        if (this.f41080m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            if (i10 == i11 && !this.C.get(i10).f73772c.get().booleanValue()) {
                this.C.get(i10).f73772c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.C.get(i11).f73772c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41077j = "";
        } else {
            this.f41077j = str;
        }
        this.f41092y.clear();
        this.f41084q.set(Boolean.FALSE);
        this.f41083p.set(Boolean.TRUE);
        this.f41090w.call();
        S(true);
    }

    public void z(int i10, String str) {
        if (this.f41080m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            if (i10 == i11 && !this.E.get(i10).f73772c.get().booleanValue()) {
                this.E.get(i10).f73772c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.E.get(i11).f73772c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41076i = "";
        } else {
            this.f41076i = str;
        }
        this.f41084q.set(Boolean.FALSE);
        this.f41092y.clear();
        this.f41083p.set(Boolean.TRUE);
        this.f41090w.call();
        S(true);
    }

    public CHANNELVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41073f = 1;
        this.f41074g = 1;
        this.f41075h = new ObservableField<>();
        this.f41076i = "";
        this.f41077j = "";
        this.f41078k = "";
        this.f41079l = "";
        Boolean bool = Boolean.TRUE;
        this.f41080m = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f41081n = new ObservableField<>(bool2);
        this.f41082o = new ObservableField<>(bool);
        this.f41083p = new ObservableField<>(bool2);
        this.f41084q = new ObservableField<>(bool2);
        this.f41085r = new ObservableField<>("");
        this.f41086s = new SingleLiveEvent<>();
        this.f41087t = new SingleLiveEvent<>();
        this.f41088u = new SingleLiveEvent<>();
        this.f41089v = new SingleLiveEvent<>();
        this.f41090w = new SingleLiveEvent<>();
        this.f41091x = new SingleLiveEvent<>();
        this.f41092y = new ObservableArrayList();
        this.f41093z = c.d(new d() { // from class: w9.b
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_search_result);
            }
        });
        this.A = new ObservableArrayList();
        this.B = c.d(new d() { // from class: w9.d
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter);
            }
        });
        this.C = new ObservableArrayList();
        this.D = c.d(new d() { // from class: w9.e
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.E = new ObservableArrayList();
        this.F = c.d(new d() { // from class: w9.f
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.G = new ObservableArrayList();
        this.H = c.d(new d() { // from class: w9.g
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.I = new ObservableArrayList();
        this.J = c.d(new d() { // from class: w9.h
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.K = new ul.b(new ul.a() { // from class: w9.i
            @Override // ul.a
            public final void call() {
                this.f73641a.O();
            }
        });
        this.L = new ul.b(new ul.a() { // from class: w9.j
            @Override // ul.a
            public final void call() {
                this.f73648a.P();
            }
        });
        this.M = new ul.b(new ul.a() { // from class: w9.k
            @Override // ul.a
            public final void call() {
                this.f73657a.Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (!e.q()) {
            this.f41081n.set(Boolean.FALSE);
            this.f41082o.set(Boolean.TRUE);
            this.f41076i = "";
            this.f41077j = "";
            this.f41078k = "";
            this.f41079l = "";
            R();
            S(true);
        }
    }

    public void T(RecommandVideosEntity recommandVideosEntity) {
        if (!e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }
}
