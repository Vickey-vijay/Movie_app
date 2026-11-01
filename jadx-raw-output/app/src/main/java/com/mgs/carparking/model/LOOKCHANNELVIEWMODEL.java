package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
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
import w9.a2;
import w9.c2;
import w9.l;
import w9.y1;

/* JADX INFO: loaded from: classes11.dex */
public class LOOKCHANNELVIEWMODEL extends BaseViewModel<n9.a> {
    public c<a2> A;
    public ObservableList<c2> B;
    public c<c2> C;
    public ObservableList<c2> D;
    public c<c2> E;
    public ObservableList<c2> F;
    public c<c2> G;
    public ObservableList<c2> H;
    public c<c2> I;
    public ul.b J;
    public ul.b K;
    public ul.b L;
    public ul.b M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f41253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f41254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f41256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f41257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f41258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f41259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f41260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f41261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f41262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f41263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f41265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableList<y1> f41266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c<y1> f41267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObservableList<a2> f41268z;

    public class a implements u<BaseResponse<List<ChannnelFilterEntry>>> {
        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ChannnelFilterEntry>> baseResponse) {
            ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f41255m;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            LOOKCHANNELVIEWMODEL.this.f41256n.set(bool);
            if (baseResponse.getResult() != null && baseResponse.getResult().size() != 0) {
                LOOKCHANNELVIEWMODEL.this.F(baseResponse.getResult());
            } else {
                LOOKCHANNELVIEWMODEL.this.f41256n.set(bool);
                LOOKCHANNELVIEWMODEL.this.f41255m.set(Boolean.TRUE);
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            LOOKCHANNELVIEWMODEL.this.f41256n.set(Boolean.FALSE);
            LOOKCHANNELVIEWMODEL.this.f41255m.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            LOOKCHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41270b;

        public b(boolean z10) {
            this.f41270b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f41258p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            LOOKCHANNELVIEWMODEL.this.f41256n.set(bool);
            LOOKCHANNELVIEWMODEL.this.f41255m.set(Boolean.TRUE);
            LOOKCHANNELVIEWMODEL.this.f41257o.set(bool);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            LOOKCHANNELVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null) {
                    if (LOOKCHANNELVIEWMODEL.this.f41248f == 1) {
                        LOOKCHANNELVIEWMODEL.this.f41266x.clear();
                    }
                    if (this.f41270b) {
                        LOOKCHANNELVIEWMODEL.this.f41259q.call();
                    }
                    ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f41257o;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    LOOKCHANNELVIEWMODEL.this.f41255m.set(bool);
                    if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                        LOOKCHANNELVIEWMODEL.this.f41258p.set(bool);
                        for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                            LOOKCHANNELVIEWMODEL.this.f41266x.add(new y1(LOOKCHANNELVIEWMODEL.this, baseResponse.getResult().get(i10)));
                        }
                    } else {
                        if (LOOKCHANNELVIEWMODEL.this.f41248f == 1) {
                            LOOKCHANNELVIEWMODEL.this.f41257o.set(bool);
                            LOOKCHANNELVIEWMODEL.this.f41258p.set(Boolean.TRUE);
                        }
                        LOOKCHANNELVIEWMODEL.this.f41260r.call();
                    }
                    LOOKCHANNELVIEWMODEL.this.f41248f++;
                    LOOKCHANNELVIEWMODEL.this.f41261s.call();
                    return;
                }
                return;
            }
            LOOKCHANNELVIEWMODEL.this.f41259q.call();
            LOOKCHANNELVIEWMODEL.this.f41258p.set(Boolean.TRUE);
            ObservableField<Boolean> observableField2 = LOOKCHANNELVIEWMODEL.this.f41256n;
            Boolean bool2 = Boolean.FALSE;
            observableField2.set(bool2);
            LOOKCHANNELVIEWMODEL.this.f41255m.set(bool2);
            LOOKCHANNELVIEWMODEL.this.f41257o.set(bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        startActivity(SearchContentVideoActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f41265w.call();
    }

    public void A(int i10, String str) {
        if (this.f41254l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            if (i10 == i11 && !this.B.get(i10).f73580c.get().booleanValue()) {
                this.B.get(i10).f73580c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.B.get(i11).f73580c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41251i = "";
        } else {
            this.f41251i = str;
        }
        this.f41266x.clear();
        this.f41258p.set(Boolean.FALSE);
        this.f41257o.set(Boolean.TRUE);
        this.f41263u.call();
        V(true);
    }

    public void B(int i10, String str) {
        if (this.f41254l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            if (i10 == i11 && !this.D.get(i10).f73580c.get().booleanValue()) {
                this.D.get(i10).f73580c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.D.get(i11).f73580c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41250h = "";
        } else {
            this.f41250h = str;
        }
        this.f41258p.set(Boolean.FALSE);
        this.f41266x.clear();
        this.f41257o.set(Boolean.TRUE);
        this.f41263u.call();
        V(true);
    }

    public void C(int i10, String str) {
        if (this.f41254l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            if (i10 == i11 && !this.F.get(i10).f73580c.get().booleanValue()) {
                this.F.get(i10).f73580c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.F.get(i11).f73580c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.text_video_type_all))) {
            this.f41252j = "";
        } else {
            this.f41252j = str;
        }
        this.f41258p.set(Boolean.FALSE);
        this.f41266x.clear();
        this.f41257o.set(Boolean.TRUE);
        this.f41263u.call();
        V(true);
    }

    public void D(int i10, String str) {
        if (this.f41254l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.H.size(); i11++) {
            if (i10 == i11 && !this.H.get(i10).f73580c.get().booleanValue()) {
                this.H.get(i10).f73580c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.H.get(i11).f73580c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.a().getResources().getString(R.string.str_paixu))) {
            this.f41253k = "";
        } else {
            this.f41253k = str;
        }
        this.f41258p.set(Boolean.FALSE);
        this.f41266x.clear();
        this.f41257o.set(Boolean.TRUE);
        this.f41263u.call();
        V(true);
    }

    public void E(List<String> list) {
        this.D.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.D.add(new c2(this, list.get(i10), i10, 2));
        }
    }

    public void F(List<ChannnelFilterEntry> list) {
        this.f41268z.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ChannnelFilterEntry channnelFilterEntry = list.get(i10);
            this.f41268z.add(new a2(this, channnelFilterEntry, i10, this.f41249g));
            if (i10 == 0) {
                this.f41249g = channnelFilterEntry.getId();
                this.f41257o.set(Boolean.TRUE);
                V(true);
                if (channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
                    for (int i11 = 0; i11 < channnelFilterEntry.getMsg().size(); i11++) {
                        if (channnelFilterEntry.getMsg().get(i11).getName().equals("type")) {
                            I(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("audio_lang")) {
                            E(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("year")) {
                            J(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("sort")) {
                            G(channnelFilterEntry.getMsg().get(i11).getData());
                        }
                    }
                }
            }
        }
    }

    public void G(List<String> list) {
        this.H.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.H.add(new c2(this, list.get(i10), i10, 4));
        }
    }

    public String H() {
        String string;
        String str;
        String str2;
        String str3;
        int i10 = this.f41249g;
        String str4 = "";
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
        if (o.b(this.f41251i)) {
            str = "";
        } else {
            str = Z7.f27998r + this.f41251i;
        }
        sb2.append(str);
        if (o.b(this.f41250h)) {
            str2 = "";
        } else {
            str2 = Z7.f27998r + this.f41250h;
        }
        sb2.append(str2);
        if (o.b(this.f41252j)) {
            str3 = "";
        } else {
            str3 = Z7.f27998r + this.f41252j;
        }
        sb2.append(str3);
        if (!o.b(this.f41253k)) {
            str4 = Z7.f27998r + this.f41253k;
        }
        sb2.append(str4);
        return sb2.toString();
    }

    public void I(List<String> list) {
        this.B.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.B.add(new c2(this, list.get(i10), i10, 1));
        }
    }

    public void J(List<String> list) {
        this.F.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.F.add(new c2(this, list.get(i10), i10, 3));
        }
    }

    public void U() {
        ((n9.a) this.f64407b).n().k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    public void V(boolean z10) {
        if (z10) {
            this.f41248f = 1;
            this.f41254l.set(Boolean.TRUE);
        }
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(this.f41249g));
        map.put("type", this.f41251i);
        map.put("audio_lang", this.f41250h);
        map.put("year", this.f41252j);
        map.put("sort", this.f41253k);
        map.put("pn", Integer.valueOf(this.f41248f));
        ((n9.a) this.f64407b).C(map).k(new f0()).e(new l()).e(new w9.c()).b(new b(z10));
    }

    public void z(int i10, ChannnelFilterEntry channnelFilterEntry) {
        if (this.f41254l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.f41268z.size(); i11++) {
            if (i10 == i11 && !this.f41268z.get(i10).f73556d.get().booleanValue()) {
                this.f41268z.get(i10).f73556d.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.f41268z.get(i11).f73556d.set(Boolean.FALSE);
            }
        }
        this.f41250h = "";
        this.f41251i = "";
        this.f41252j = "";
        this.f41253k = "";
        this.f41249g = channnelFilterEntry.getId();
        if (channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
            for (int i12 = 0; i12 < channnelFilterEntry.getMsg().size(); i12++) {
                if (channnelFilterEntry.getMsg().get(i12).getName().equals("type")) {
                    I(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("audio_lang")) {
                    E(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("year")) {
                    J(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("sort")) {
                    G(channnelFilterEntry.getMsg().get(i12).getData());
                }
            }
        }
        this.f41258p.set(Boolean.FALSE);
        this.f41257o.set(Boolean.TRUE);
        this.f41263u.call();
        V(true);
    }

    public LOOKCHANNELVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41248f = 1;
        this.f41249g = 1;
        this.f41250h = "";
        this.f41251i = "";
        this.f41252j = "";
        this.f41253k = "";
        Boolean bool = Boolean.TRUE;
        this.f41254l = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f41255m = new ObservableField<>(bool2);
        this.f41256n = new ObservableField<>(bool);
        this.f41257o = new ObservableField<>(bool2);
        this.f41258p = new ObservableField<>(bool2);
        this.f41259q = new SingleLiveEvent<>();
        this.f41260r = new SingleLiveEvent<>();
        this.f41261s = new SingleLiveEvent<>();
        this.f41262t = new SingleLiveEvent<>();
        this.f41263u = new SingleLiveEvent<>();
        this.f41264v = new SingleLiveEvent<>();
        this.f41265w = new SingleLiveEvent<>();
        this.f41266x = new ObservableArrayList();
        this.f41267y = c.d(new d() { // from class: w9.l3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_search_result);
            }
        });
        this.f41268z = new ObservableArrayList();
        this.A = c.d(new d() { // from class: w9.m3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter);
            }
        });
        this.B = new ObservableArrayList();
        this.C = c.d(new d() { // from class: w9.n3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.D = new ObservableArrayList();
        this.E = c.d(new d() { // from class: w9.o3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.F = new ObservableArrayList();
        this.G = c.d(new d() { // from class: w9.p3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.H = new ObservableArrayList();
        this.I = c.d(new d() { // from class: w9.q3
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.J = new ul.b(new ul.a() { // from class: w9.r3
            @Override // ul.a
            public final void call() {
                this.f73767a.Q();
            }
        });
        this.K = new ul.b(new ul.a() { // from class: w9.s3
            @Override // ul.a
            public final void call() {
                this.f73782a.R();
            }
        });
        this.L = new ul.b(new ul.a() { // from class: w9.t3
            @Override // ul.a
            public final void call() {
                this.f73807a.S();
            }
        });
        this.M = new ul.b(new ul.a() { // from class: w9.u3
            @Override // ul.a
            public final void call() {
                this.f73820a.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (!e.q()) {
            this.f41255m.set(Boolean.FALSE);
            this.f41256n.set(Boolean.TRUE);
            this.f41250h = "";
            this.f41251i = "";
            this.f41252j = "";
            this.f41253k = "";
            U();
        }
    }

    public void W(RecommandVideosEntity recommandVideosEntity) {
        if (!e.q()) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }
}
