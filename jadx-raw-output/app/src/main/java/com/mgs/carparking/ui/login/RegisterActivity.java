package com.mgs.carparking.ui.login;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityRegisterBinding;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import em.n;
import em.o;
import me.goldze.mvvmhabit.base.BaseApplication;
import sa.s;

/* JADX INFO: loaded from: classes2.dex */
public class RegisterActivity extends BaseActivity<ActivityRegisterBinding, REGISTERVIEWMODEL> {

    public class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f39698d).f41315q.get()) || o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f39698d).f41316r.get()) || o.b(((REGISTERVIEWMODEL) RegisterActivity.this.f39698d).f41317s.get())) {
                ((ActivityRegisterBinding) RegisterActivity.this.f39697c).f39909c.setBackground(RegisterActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_no_click));
                ((ActivityRegisterBinding) RegisterActivity.this.f39697c).f39909c.setEnabled(false);
            } else {
                ((ActivityRegisterBinding) RegisterActivity.this.f39697c).f39909c.setBackground(RegisterActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_click));
                ((ActivityRegisterBinding) RegisterActivity.this.f39697c).f39909c.setEnabled(true);
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_register;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Void r10) {
        if (((ActivityRegisterBinding) this.f39697c).f39910d.getInputType() == 129) {
            ((ActivityRegisterBinding) this.f39697c).f39910d.setInputType(128);
            ((ActivityRegisterBinding) this.f39697c).f39913g.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityRegisterBinding) this.f39697c).f39910d.getText().toString().trim())) {
                return;
            }
            V v10 = this.f39697c;
            ((ActivityRegisterBinding) v10).f39910d.setSelection(((ActivityRegisterBinding) v10).f39910d.getText().toString().trim().length());
            return;
        }
        ((ActivityRegisterBinding) this.f39697c).f39910d.setInputType(129);
        ((ActivityRegisterBinding) this.f39697c).f39913g.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityRegisterBinding) this.f39697c).f39910d.getText().toString().trim())) {
            return;
        }
        V v11 = this.f39697c;
        ((ActivityRegisterBinding) v11).f39910d.setSelection(((ActivityRegisterBinding) v11).f39910d.getText().toString().trim().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r10) {
        if (((ActivityRegisterBinding) this.f39697c).f39911e.getInputType() == 129) {
            ((ActivityRegisterBinding) this.f39697c).f39911e.setInputType(128);
            ((ActivityRegisterBinding) this.f39697c).f39914h.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityRegisterBinding) this.f39697c).f39911e.getText().toString().trim())) {
                return;
            }
            V v10 = this.f39697c;
            ((ActivityRegisterBinding) v10).f39911e.setSelection(((ActivityRegisterBinding) v10).f39911e.getText().toString().trim().length());
            return;
        }
        ((ActivityRegisterBinding) this.f39697c).f39911e.setInputType(129);
        ((ActivityRegisterBinding) this.f39697c).f39914h.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityRegisterBinding) this.f39697c).f39911e.getText().toString().trim())) {
            return;
        }
        V v11 = this.f39697c;
        ((ActivityRegisterBinding) v11).f39911e.setSelection(((ActivityRegisterBinding) v11).f39911e.getText().toString().trim().length());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public REGISTERVIEWMODEL initViewModel() {
        return new REGISTERVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r10) {
        s.b().a(this);
        ((REGISTERVIEWMODEL) this.f39698d).v();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        s.b().d(((ActivityRegisterBinding) this.f39697c).f39912f);
        a aVar = new a();
        ((ActivityRegisterBinding) this.f39697c).f39912f.addTextChangedListener(aVar);
        ((ActivityRegisterBinding) this.f39697c).f39910d.addTextChangedListener(aVar);
        ((ActivityRegisterBinding) this.f39697c).f39911e.addTextChangedListener(aVar);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((REGISTERVIEWMODEL) this.f39698d).f41313o.observe(this, new Observer() { // from class: ha.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53817b.x((Void) obj);
            }
        });
        ((REGISTERVIEWMODEL) this.f39698d).f41314p.observe(this, new Observer() { // from class: ha.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53818b.y((Void) obj);
            }
        });
        ((REGISTERVIEWMODEL) this.f39698d).f41318t.observe(this, new Observer() { // from class: ha.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53819b.z((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
