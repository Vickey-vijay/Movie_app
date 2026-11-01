package com.mgs.carparking.app;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.mgs.carparking.ui.login.splash.SplashActivity;
import com.safedk.android.utils.Logger;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ContainerActivity;
import me.goldze.mvvmhabit.widget.CustomProgressDialog;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends RxAppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f39697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VM f39698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CustomProgressDialog f39700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mi.a f39701g;

    public class a implements Observer<String> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String str) {
            BaseActivity.this.showDialog(str);
        }
    }

    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseActivity.this.dismissDialog();
        }
    }

    public class c implements Observer<Map<String, Object>> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseActivity.this.startActivity((Class<?>) map.get(BaseViewModel.a.f64418a), (Bundle) map.get(BaseViewModel.a.f64420c));
        }
    }

    public class d implements Observer<Map<String, Object>> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseActivity.this.startContainerActivity((String) map.get(BaseViewModel.a.f64419b), (Bundle) map.get(BaseViewModel.a.f64420c));
        }
    }

    public class e implements Observer<Void> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseActivity.this.finish();
        }
    }

    public class f implements Observer<Void> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseActivity.this.onBackPressed();
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public abstract int initContentView(Bundle bundle);

    public void initData() {
    }

    public void initParam() {
    }

    public abstract int initVariableId();

    public VM initViewModel() {
        return null;
    }

    public void initViewObservable() {
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z10) {
        return super.moveTaskToBack(true);
    }

    public void setstatusBarMargin(View view) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = em.e.a(this);
        view.setLayoutParams(layoutParams);
    }

    public void startActivity(Class<?> cls) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, new Intent(this, cls));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startActivityForResult(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, 1);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startContainerActivity(String str) {
        startContainerActivity(str, null);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void dismissDialog() {
        CustomProgressDialog customProgressDialog = this.f39700f;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        this.f39700f.dismiss();
    }

    public void k(mi.b bVar) {
        if (this.f39701g == null) {
            this.f39701g = new mi.a();
        }
        this.f39701g.b(bVar);
    }

    public void m() {
        this.f39698d.e().k().observe(this, new a());
        this.f39698d.e().h().observe(this, new b());
        this.f39698d.e().l().observe(this, new c());
        this.f39698d.e().m().observe(this, new d());
        this.f39698d.e().i().observe(this, new e());
        this.f39698d.e().j().observe(this, new f());
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle = null;
        }
        super.onCreate(bundle);
        this.f39701g = new mi.a();
        if (sl.b.b().a() == 0) {
            Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
            intent.setFlags(32768);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
            return;
        }
        initParam();
        l(bundle);
        m();
        initData();
        initViewObservable();
        this.f39698d.h();
    }

    public void refreshLayout() {
        VM vm2 = this.f39698d;
        if (vm2 != null) {
            this.f39697c.setVariable(this.f39699e, vm2);
        }
    }

    public void showDialog(String str) {
        CustomProgressDialog customProgressDialog = this.f39700f;
        if (customProgressDialog != null) {
            customProgressDialog.show();
            return;
        }
        CustomProgressDialog customProgressDialog2 = CustomProgressDialog.getInstance(this, str, true, null);
        this.f39700f = customProgressDialog2;
        customProgressDialog2.show();
    }

    public <T extends ViewModel> T createViewModel(FragmentActivity fragmentActivity, Class<T> cls) {
        return (T) ViewModelProviders.of(fragmentActivity).get(cls);
    }

    public final void l(Bundle bundle) {
        Class<BaseViewModel> cls;
        this.f39697c = (V) DataBindingUtil.setContentView(this, initContentView(bundle));
        this.f39699e = initVariableId();
        VM vm2 = (VM) initViewModel();
        this.f39698d = vm2;
        if (vm2 == null) {
            Type genericSuperclass = getClass().getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType) {
                cls = (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
            } else {
                cls = BaseViewModel.class;
            }
            this.f39698d = (VM) createViewModel(this, cls);
        }
        this.f39697c.setVariable(this.f39699e, this.f39698d);
        getLifecycle().addObserver(this.f39698d);
        this.f39698d.f(this);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sl.d.c().d(this.f39698d);
        VM vm2 = this.f39698d;
        if (vm2 != null) {
            vm2.i();
        }
        V v10 = this.f39697c;
        if (v10 != null) {
            v10.unbind();
        }
        this.f39701g.dispose();
    }

    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startContainerActivity(String str, Bundle bundle) {
        Intent intent = new Intent(this, (Class<?>) ContainerActivity.class);
        intent.putExtra(ContainerActivity.FRAGMENT, str);
        if (bundle != null) {
            intent.putExtra(ContainerActivity.BUNDLE, bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startActivityForResult(Class<?> cls, Bundle bundle, int i10) {
        Intent intent = new Intent(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, i10);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
