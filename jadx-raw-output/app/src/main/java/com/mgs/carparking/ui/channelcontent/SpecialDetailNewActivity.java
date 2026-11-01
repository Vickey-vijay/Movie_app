package com.mgs.carparking.ui.channelcontent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import cc.f;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySpecialDetailNewBinding;
import com.mgs.carparking.model.SPECIALDETAILNEWVIEWMODEL;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import em.n;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes2.dex */
public class SpecialDetailNewActivity extends BaseActivity<ActivitySpecialDetailNewBinding, SPECIALDETAILNEWVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41763i;

    public class a implements g {
        public a() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            ((SPECIALDETAILNEWVIEWMODEL) SpecialDetailNewActivity.this.f39698d).x(SpecialDetailNewActivity.this.f41762h, true);
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            ((SPECIALDETAILNEWVIEWMODEL) SpecialDetailNewActivity.this.f39698d).x(SpecialDetailNewActivity.this.f41762h, false);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_special_detail_new;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Void r10) {
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r10) {
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).x(this.f41762h, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Integer num) {
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).z(this.f41762h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r10) {
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r10) {
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.n();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SPECIALDETAILNEWVIEWMODEL initViewModel() {
        return new SPECIALDETAILNEWVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public final void v() {
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.L(new a());
        ((ActivitySpecialDetailNewBinding) this.f39697c).f39975d.K(new b());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f41762h = getIntent().getIntExtra("id", 0);
        int intExtra = getIntent().getIntExtra("flag", 0);
        this.f41763i = intExtra;
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41360g = intExtra;
        v();
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).x(this.f41762h, true);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((ActivitySpecialDetailNewBinding) this.f39697c).f39974c);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41370q.observe(this, new Observer() { // from class: aa.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3513b.w((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41371r.observe(this, new Observer() { // from class: aa.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3514b.x((Integer) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41372s.observe(this, new Observer() { // from class: aa.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3515b.y((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41374u.observe(this, new Observer() { // from class: aa.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3516b.z((Void) obj);
            }
        });
        ((SPECIALDETAILNEWVIEWMODEL) this.f39698d).f41373t.observe(this, new Observer() { // from class: aa.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3517b.A((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
