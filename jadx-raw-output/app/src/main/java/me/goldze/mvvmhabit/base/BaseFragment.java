package me.goldze.mvvmhabit.base;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.safedk.android.utils.Logger;
import com.trello.rxlifecycle2.components.support.RxFragment;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.widget.CustomProgressDialog;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseFragment<V extends ViewDataBinding, VM extends BaseViewModel> extends RxFragment {
    public V binding;
    private CustomProgressDialog dialog;
    private mi.a mCompositeDisposable;
    public VM viewModel;
    private int viewModelId;

    public class a implements Observer<String> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String str) {
            BaseFragment.this.showDialog(str);
        }
    }

    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseFragment.this.dismissDialog();
        }
    }

    public class c implements Observer<Map<String, Object>> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseFragment.this.startActivity((Class<?>) map.get(BaseViewModel.a.f64418a), (Bundle) map.get(BaseViewModel.a.f64420c));
        }
    }

    public class d implements Observer<Map<String, Object>> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Map<String, Object> map) {
            BaseFragment.this.startContainerActivity((String) map.get(BaseViewModel.a.f64419b), (Bundle) map.get(BaseViewModel.a.f64420c));
        }
    }

    public class e implements Observer<Void> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseFragment.this.getActivity().finish();
        }
    }

    public class f implements Observer<Void> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void r10) {
            BaseFragment.this.getActivity().onBackPressed();
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public abstract int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

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

    public boolean isBackPressed() {
        return false;
    }

    public void setstatusBarMargin(View view) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = em.e.a(getActivity());
        view.setLayoutParams(layoutParams);
    }

    public void startActivity(Class<?> cls) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getActivity(), new Intent(getContext(), cls));
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void startContainerActivity(String str) {
        startContainerActivity(str, null);
    }

    public void addSubscribe(mi.b bVar) {
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new mi.a();
        }
        this.mCompositeDisposable.b(bVar);
    }

    public void dismissDialog() {
        CustomProgressDialog customProgressDialog = this.dialog;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        this.dialog.dismiss();
    }

    public void refreshLayout() {
        VM vm2 = this.viewModel;
        if (vm2 != null) {
            this.binding.setVariable(this.viewModelId, vm2);
        }
    }

    public void registorUIChangeLiveDataCallBack() {
        this.viewModel.e().k().observe(this, new a());
        this.viewModel.e().h().observe(this, new b());
        this.viewModel.e().l().observe(this, new c());
        this.viewModel.e().m().observe(this, new d());
        this.viewModel.e().i().observe(this, new e());
        this.viewModel.e().j().observe(this, new f());
    }

    public void showDialog(String str) {
        CustomProgressDialog customProgressDialog = this.dialog;
        if (customProgressDialog != null) {
            customProgressDialog.show();
            return;
        }
        CustomProgressDialog customProgressDialog2 = CustomProgressDialog.getInstance(getActivity(), str, true, null);
        this.dialog = customProgressDialog2;
        customProgressDialog2.show();
    }

    public void startContainerActivity(String str, Bundle bundle) {
        Intent intent = new Intent(getContext(), (Class<?>) ContainerActivity.class);
        intent.putExtra(ContainerActivity.FRAGMENT, str);
        if (bundle != null) {
            intent.putExtra(ContainerActivity.BUNDLE, bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getActivity(), intent);
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void initViewDataBinding() {
        Class<BaseViewModel> cls;
        this.viewModelId = initVariableId();
        VM vm2 = (VM) initViewModel();
        this.viewModel = vm2;
        if (vm2 == null) {
            Type genericSuperclass = getClass().getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType) {
                cls = (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
            } else {
                cls = BaseViewModel.class;
            }
            this.viewModel = (VM) createViewModel(this, cls);
        }
        this.binding.setVariable(this.viewModelId, this.viewModel);
        getLifecycle().addObserver(this.viewModel);
        this.viewModel.f(this);
    }

    public <T extends ViewModel> T createViewModel(Fragment fragment, Class<T> cls) {
        return (T) ViewModelProviders.of(fragment).get(cls);
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCompositeDisposable = new mi.a();
        initParam();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        V v10 = (V) DataBindingUtil.inflate(layoutInflater, initContentView(layoutInflater, viewGroup, bundle), viewGroup, false);
        this.binding = v10;
        return v10.getRoot();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCompositeDisposable.dispose();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        sl.d.c().d(this.viewModel);
        VM vm2 = this.viewModel;
        if (vm2 != null) {
            vm2.i();
        }
        V v10 = this.binding;
        if (v10 != null) {
            v10.unbind();
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initViewDataBinding();
        registorUIChangeLiveDataCallBack();
        initData();
        initViewObservable();
        this.viewModel.h();
    }

    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent(getContext(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getActivity(), intent);
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
