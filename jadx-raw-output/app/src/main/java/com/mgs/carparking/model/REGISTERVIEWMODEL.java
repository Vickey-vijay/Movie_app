package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RegisterEntity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.c;
import sa.e;
import sa.f0;
import sa.o0;
import ul.b;
import w9.l;
import x9.c0;

/* JADX INFO: loaded from: classes11.dex */
public class REGISTERVIEWMODEL extends ToolbarViewModel<n9.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f41313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f41315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f41317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f41318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f41319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f41320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f41321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f41322x;

    public class a implements u<BaseResponse<RegisterEntity>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RegisterEntity> baseResponse) {
            REGISTERVIEWMODEL.this.c();
            if (!baseResponse.isOk()) {
                p.b(baseResponse.getMessage());
                return;
            }
            if (baseResponse.getResult() != null) {
                if (baseResponse.getResult().getUser_id() > 0) {
                    o0.d1(baseResponse.getResult().getUser_id());
                }
                if (!o.b(baseResponse.getResult().getAccount())) {
                    o0.f1(baseResponse.getResult().getAccount());
                }
                if (!o.b(baseResponse.getResult().getNickname())) {
                    o0.g1(baseResponse.getResult().getNickname());
                }
                if (!o.b(baseResponse.getResult().getHead_img())) {
                    o0.c1(baseResponse.getResult().getHead_img());
                }
                if (!o.b(baseResponse.getResult().getToken())) {
                    o0.a1(baseResponse.getResult().getToken());
                }
                o0.K0(1);
                o0.z0("");
                c.f("");
                tl.a.a().b(new c0());
                REGISTERVIEWMODEL.this.d();
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            REGISTERVIEWMODEL.this.c();
            p.b(r.a().getResources().getString(R.string.str_register_fail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f41313o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f41314p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f41318t.call();
    }

    public void v() {
        if (o.b(this.f41315q.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_no_account));
            return;
        }
        if (o.b(this.f41316r.get()) || o.b(this.f41317s.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_no_password));
            return;
        }
        if (this.f41315q.get().length() < 6) {
            p.b(r.a().getResources().getString(R.string.str_login_account_not6));
            return;
        }
        if (this.f41316r.get().length() < 6) {
            p.b(r.a().getResources().getString(R.string.str_login_password_not6));
            return;
        }
        if (!e.s(this.f41315q.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_account_type_err));
            return;
        }
        if (!e.s(this.f41316r.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_password_type_err));
            return;
        }
        if (!this.f41316r.get().equals(this.f41317s.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_password_err_two));
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("account", this.f41315q.get().trim());
        map.put("password", this.f41316r.get().trim());
        ((n9.a) this.f64407b).A(map).k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    public REGISTERVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41313o = new SingleLiveEvent<>();
        this.f41314p = new SingleLiveEvent<>();
        this.f41315q = new ObservableField<>("");
        this.f41316r = new ObservableField<>("");
        this.f41317s = new ObservableField<>("");
        this.f41318t = new SingleLiveEvent<>();
        this.f41319u = new b(new ul.a() { // from class: w9.m4
            @Override // ul.a
            public final void call() {
                this.f73702a.r();
            }
        });
        this.f41320v = new b(new ul.a() { // from class: w9.n4
            @Override // ul.a
            public final void call() {
                this.f73708a.s();
            }
        });
        this.f41321w = new b(new ul.a() { // from class: w9.o4
            @Override // ul.a
            public final void call() {
                this.f73722a.t();
            }
        });
        this.f41322x = new b(new ul.a() { // from class: w9.p4
            @Override // ul.a
            public final void call() {
                this.f73748a.u();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.text_register_register));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        d();
    }
}
