package com.mgs.carparking.model;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import com.mgs.carparking.ui.web.WebActivity;
import com.safedk.android.utils.Logger;
import em.r;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import sa.o0;
import sa.y;
import ul.b;

/* JADX INFO: loaded from: classes9.dex */
public class SETTINGVIEWMODEL extends ToolbarViewModel<n9.a> {
    public b A;
    public SingleLiveEvent<Boolean> B;
    public SingleLiveEvent<Boolean> C;
    public b D;
    public b E;
    public b F;
    public b G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f41347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f41348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f41349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f41351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f41352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<Boolean> f41353u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f41354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f41355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f41356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f41357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f41358z;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f41349q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        Bundle bundle = new Bundle();
        bundle.putString("web_title", r.a().getResources().getString(R.string.text_mine_privacy));
        bundle.putString("web_url", o0.b0());
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.fvvcl.flickverse"));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getApplication(), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.B.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.B.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.C.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.C.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f41348p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f41351s.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f41352t.call();
    }

    public SETTINGVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41347o = new ObservableField<>();
        this.f41348p = new SingleLiveEvent<>();
        this.f41349q = new SingleLiveEvent<>();
        this.f41350r = new ObservableField<>();
        this.f41351s = new SingleLiveEvent<>();
        this.f41352t = new SingleLiveEvent<>();
        Boolean bool = Boolean.FALSE;
        this.f41353u = new ObservableField<>(bool);
        this.f41354v = new b(new ul.a() { // from class: w9.z4
            @Override // ul.a
            public final void call() {
                this.f73905a.x();
            }
        });
        this.f41355w = new b(new ul.a() { // from class: w9.a5
            @Override // ul.a
            public final void call() {
                this.f73562a.y();
            }
        });
        this.f41356x = new b(new ul.a() { // from class: w9.b5
            @Override // ul.a
            public final void call() {
                this.f73568a.z();
            }
        });
        this.f41357y = new b(new ul.a() { // from class: w9.c5
            @Override // ul.a
            public final void call() {
                this.f73591a.A();
            }
        });
        this.f41358z = new b(new ul.a() { // from class: w9.d5
            @Override // ul.a
            public final void call() {
                this.f73603a.B();
            }
        });
        this.A = new b(new ul.a() { // from class: w9.e5
            @Override // ul.a
            public final void call() {
                this.f73611a.C();
            }
        });
        this.B = new SingleLiveEvent<>();
        this.C = new SingleLiveEvent<>();
        this.D = new b(new ul.a() { // from class: w9.f5
            @Override // ul.a
            public final void call() {
                this.f73626a.D();
            }
        });
        this.E = new b(new ul.a() { // from class: w9.g5
            @Override // ul.a
            public final void call() {
                this.f73632a.E();
            }
        });
        this.F = new b(new ul.a() { // from class: w9.h5
            @Override // ul.a
            public final void call() {
                this.f73640a.F();
            }
        });
        this.G = new b(new ul.a() { // from class: w9.i5
            @Override // ul.a
            public final void call() {
                this.f73646a.G();
            }
        });
        this.f42194g.set(r.a().getResources().getString(R.string.text_mine_setting));
        this.f41347o.set(r.a().getResources().getString(R.string.str_now_version) + Z7.f27998r + y.a(application));
        if (o0.B() > 0) {
            this.f41353u.set(Boolean.TRUE);
        } else {
            this.f41353u.set(bool);
        }
    }
}
