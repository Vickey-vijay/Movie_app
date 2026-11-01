package com.mgs.carparking.ui.mine;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySettingBinding;
import com.mgs.carparking.databinding.DialogSearchCacheClearBinding;
import com.mgs.carparking.databinding.DialogSettingLogoutBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;
import em.n;
import em.p;
import em.r;
import gb.h;
import i9.a;
import ka.j0;
import me.goldze.mvvmhabit.base.BaseApplication;
import sa.e;
import sa.o0;
import x9.d0;
import yl.b;

/* JADX INFO: loaded from: classes2.dex */
public class SettingActivity extends BaseActivity<ActivitySettingBinding, SETTINGVIEWMODEL> implements View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DialogSearchCacheClearBinding f42074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DialogSettingLogoutBinding f42075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Dialog f42076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Dialog f42077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42078l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42079m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f42080n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[] f42081o = new long[4];

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Void r10) {
        toggleClearHistoryDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r10) {
        toggleLogoutDialog(true);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_setting;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r10) {
        if (e.r(1000L)) {
            new j0().H(this, this, true);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SETTINGVIEWMODEL initViewModel() {
        return new SETTINGVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    public final void t() {
        long[] jArr = this.f42081o;
        System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
        long[] jArr2 = this.f42081o;
        jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
        if (this.f42081o[0] >= SystemClock.uptimeMillis() - 3000) {
            this.f42081o = new long[4];
            p.b("channel：" + this.f42078l);
        }
    }

    public void toggleClearHistoryDialog(boolean z10) {
        if (z10) {
            if (this.f42076j == null) {
                this.f42076j = h.a(this, this.f42074h.getRoot(), true);
            }
            this.f42076j.show();
        } else {
            Dialog dialog = this.f42076j;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void toggleLogoutDialog(boolean z10) {
        if (z10) {
            if (this.f42077k == null) {
                this.f42077k = h.a(this, this.f42075i.getRoot(), true);
            }
            this.f42077k.show();
        } else {
            Dialog dialog = this.f42077k;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Boolean bool) {
        if (bool.booleanValue()) {
            try {
                sa.h.a(this);
                ((SETTINGVIEWMODEL) this.f39698d).f41350r.set(sa.h.e(this) + "");
                p.b(r.a().getResources().getString(R.string.str_success));
            } catch (Exception unused) {
            }
        }
        Dialog dialog = this.f42076j;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Boolean bool) {
        if (bool.booleanValue()) {
            if (b.a(this)) {
                ((SETTINGVIEWMODEL) this.f39698d).f41353u.set(Boolean.FALSE);
                o0.K0(0);
                o0.d1(0);
                o0.h1(0L);
                o0.e1(0);
                o0.f1("");
                o0.a1("");
                tl.a.a().b(new d0());
                Dialog dialog = this.f42077k;
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            }
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        Dialog dialog2 = this.f42077k;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r10) {
        t();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f42078l = e.f(BaseApplication.getInstance());
        if (o0.X() > 0) {
            this.f42080n = o0.X() / 1000;
        }
        DialogSearchCacheClearBinding dialogSearchCacheClearBinding = (DialogSearchCacheClearBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_search_cache_clear, null, false);
        this.f42074h = dialogSearchCacheClearBinding;
        dialogSearchCacheClearBinding.a((SETTINGVIEWMODEL) this.f39698d);
        DialogSettingLogoutBinding dialogSettingLogoutBinding = (DialogSettingLogoutBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_setting_logout, null, false);
        this.f42075i = dialogSettingLogoutBinding;
        dialogSettingLogoutBinding.a((SETTINGVIEWMODEL) this.f39698d);
        try {
            ((SETTINGVIEWMODEL) this.f39698d).f41350r.set(sa.h.e(this) + "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SETTINGVIEWMODEL) this.f39698d).f41348p.observe(this, new Observer() { // from class: ka.d0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62671b.u((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f39698d).B.observe(this, new Observer() { // from class: ka.e0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62673b.v((Boolean) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f39698d).f41349q.observe(this, new Observer() { // from class: ka.f0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62675b.w((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f39698d).C.observe(this, new Observer() { // from class: ka.g0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62677b.x((Boolean) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f39698d).f41351s.observe(this, new Observer() { // from class: ka.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62679b.y((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f39698d).f41352t.observe(this, new Observer() { // from class: ka.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62681b.z((Void) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f42076j != null) {
            this.f42076j = null;
        }
        if (this.f42077k != null) {
            this.f42077k = null;
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }
}
