package com.mgs.carparking.ui.login;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityLoginBinding;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import em.n;
import em.o;
import me.goldze.mvvmhabit.base.BaseApplication;
import oi.g;
import x9.c0;

/* JADX INFO: loaded from: classes9.dex */
public class LoginActivity extends BaseActivity<ActivityLoginBinding, LOGINVIEWMODEL> {

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
            if (((LOGINVIEWMODEL) LoginActivity.this.f39698d).f41238f.get().length() <= 0 || ((LOGINVIEWMODEL) LoginActivity.this.f39698d).f41239g.get().length() <= 0) {
                ((ActivityLoginBinding) LoginActivity.this.f39697c).f39866b.setEnabled(false);
                ((ActivityLoginBinding) LoginActivity.this.f39697c).f39866b.setBackground(LoginActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_no_click));
            } else {
                ((ActivityLoginBinding) LoginActivity.this.f39697c).f39866b.setEnabled(true);
                ((ActivityLoginBinding) LoginActivity.this.f39697c).f39866b.setBackground(LoginActivity.this.getResources().getDrawable(R.drawable.shape_login_submit_click));
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_login;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r10) {
        if (((ActivityLoginBinding) this.f39697c).f39867c.getInputType() == 129) {
            ((ActivityLoginBinding) this.f39697c).f39867c.setInputType(128);
            ((ActivityLoginBinding) this.f39697c).f39869e.setImageResource(R.drawable.ic_login_password_show);
            if (o.b(((ActivityLoginBinding) this.f39697c).f39867c.getText().toString().trim())) {
                return;
            }
            V v10 = this.f39697c;
            ((ActivityLoginBinding) v10).f39867c.setSelection(((ActivityLoginBinding) v10).f39867c.getText().toString().trim().length());
            return;
        }
        ((ActivityLoginBinding) this.f39697c).f39867c.setInputType(129);
        ((ActivityLoginBinding) this.f39697c).f39869e.setImageResource(R.drawable.ic_login_password_hint);
        if (o.b(((ActivityLoginBinding) this.f39697c).f39867c.getText().toString().trim())) {
            return;
        }
        V v11 = this.f39697c;
        ((ActivityLoginBinding) v11).f39867c.setSelection(((ActivityLoginBinding) v11).f39867c.getText().toString().trim().length());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public LOGINVIEWMODEL initViewModel() {
        return new LOGINVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c0 c0Var) throws Exception {
        finish();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        a aVar = new a();
        ((ActivityLoginBinding) this.f39697c).f39868d.addTextChangedListener(aVar);
        ((ActivityLoginBinding) this.f39697c).f39867c.addTextChangedListener(aVar);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(tl.a.a().d(c0.class).subscribe(new g() { // from class: ha.a
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f53815b.v((c0) obj);
            }
        }));
        ((LOGINVIEWMODEL) this.f39698d).f41240h.observe(this, new Observer() { // from class: ha.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53816b.w((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
