package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.LoginUserEntity;
import com.mgs.carparking.ui.login.RegisterActivity;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.mgs.carparking.ui.web.WebActivity;
import em.o;
import em.p;
import em.r;
import ii.u;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.c;
import sa.f0;
import sa.o0;
import ul.b;
import w9.l;
import x9.c0;

/* JADX INFO: loaded from: classes11.dex */
public class LOGINVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f41238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f41239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SingleLiveEvent<Void> f41240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f41241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f41242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f41243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f41244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f41245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f41246n;

    public class a implements u<BaseResponse<LoginUserEntity>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<LoginUserEntity> baseResponse) {
            LOGINVIEWMODEL.this.c();
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
                o0.h1(baseResponse.getResult().getSvip_validity());
                o0.e1(baseResponse.getResult().is_svip());
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
                p.b(baseResponse.getMessage());
                LOGINVIEWMODEL.this.d();
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            LOGINVIEWMODEL.this.c();
            p.b(r.a().getResources().getString(R.string.str_login_fail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f41240h.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        startActivity(RegisterActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        Bundle bundle = new Bundle();
        bundle.putInt("flag", 3);
        startActivity(FeedbackActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        Bundle bundle = new Bundle();
        bundle.putString("web_title", r.a().getResources().getString(R.string.text_mine_privacy));
        bundle.putString("web_url", o0.b0());
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void w() {
        if (o.b(this.f41238f.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_no_account));
            return;
        }
        if (o.b(this.f41239g.get())) {
            p.b(r.a().getResources().getString(R.string.str_login_no_password));
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("account", this.f41238f.get().trim());
        map.put("password", this.f41239g.get().trim());
        ((n9.a) this.f64407b).s(map).k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    public LOGINVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41238f = new ObservableField<>("");
        this.f41239g = new ObservableField<>("");
        this.f41240h = new SingleLiveEvent<>();
        this.f41241i = new b(new ul.a() { // from class: w9.f3
            @Override // ul.a
            public final void call() {
                this.f73624a.s();
            }
        });
        this.f41242j = new b(new ul.a() { // from class: w9.g3
            @Override // ul.a
            public final void call() {
                this.f73630a.t();
            }
        });
        this.f41243k = new b(new ul.a() { // from class: w9.h3
            @Override // ul.a
            public final void call() {
                this.f73638a.u();
            }
        });
        this.f41244l = new b(new ul.a() { // from class: w9.i3
            @Override // ul.a
            public final void call() {
                this.f73644a.v();
            }
        });
        this.f41245m = new b(new ul.a() { // from class: w9.j3
            @Override // ul.a
            public final void call() {
                this.f73654a.w();
            }
        });
        this.f41246n = new b(new ul.a() { // from class: w9.k3
            @Override // ul.a
            public final void call() {
                this.f73674a.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        d();
    }
}
