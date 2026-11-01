package me.goldze.mvvmhabit.base;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.trello.rxlifecycle2.LifecycleProvider;
import em.r;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import me.goldze.mvvmhabit.R$string;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import mi.b;
import oi.g;
import yl.a;

/* JADX INFO: loaded from: classes9.dex */
public class BaseViewModel<M extends yl.a> extends AndroidViewModel implements IBaseViewModel, g<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f64407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseViewModel<M>.UIChangeLiveData f64408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<LifecycleProvider> f64409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mi.a f64410e;

    public final class UIChangeLiveData extends SingleLiveEvent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SingleLiveEvent<String> f64411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SingleLiveEvent<Void> f64412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SingleLiveEvent<Map<String, Object>> f64413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SingleLiveEvent<Map<String, Object>> f64414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SingleLiveEvent<Void> f64415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SingleLiveEvent<Void> f64416g;

        public UIChangeLiveData() {
        }

        public final SingleLiveEvent g(SingleLiveEvent singleLiveEvent) {
            return singleLiveEvent == null ? new SingleLiveEvent() : singleLiveEvent;
        }

        public SingleLiveEvent<Void> h() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f64412c);
            this.f64412c = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Void> i() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f64415f);
            this.f64415f = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Void> j() {
            SingleLiveEvent<Void> singleLiveEventG = g(this.f64416g);
            this.f64416g = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<String> k() {
            SingleLiveEvent<String> singleLiveEventG = g(this.f64411b);
            this.f64411b = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Map<String, Object>> l() {
            SingleLiveEvent<Map<String, Object>> singleLiveEventG = g(this.f64413d);
            this.f64413d = singleLiveEventG;
            return singleLiveEventG;
        }

        public SingleLiveEvent<Map<String, Object>> m() {
            SingleLiveEvent<Map<String, Object>> singleLiveEventG = g(this.f64414e);
            this.f64414e = singleLiveEventG;
            return singleLiveEventG;
        }

        @Override // me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent, androidx.lifecycle.LiveData
        public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
            super.observe(lifecycleOwner, observer);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f64418a = "CLASS";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f64419b = "CANONICAL_NAME";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f64420c = "BUNDLE";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f64421d = "FROM_CLASS";
    }

    public BaseViewModel(@NonNull Application application) {
        this(application, null);
    }

    public void h() {
    }

    public void i() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onAny(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onPause() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onResume() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onStart() {
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onStop() {
    }

    public void startActivity(Class<?> cls) {
        startActivity(cls, new Bundle());
    }

    public BaseViewModel(@NonNull Application application, M m10) {
        super(application);
        this.f64407b = m10;
        this.f64410e = new mi.a();
    }

    public void b(b bVar) {
        if (this.f64410e == null) {
            this.f64410e = new mi.a();
        }
        this.f64410e.b(bVar);
    }

    public void c() {
        this.f64408c.f64412c.call();
    }

    public void d() {
        this.f64408c.f64415f.call();
    }

    public BaseViewModel<M>.UIChangeLiveData e() {
        if (this.f64408c == null) {
            this.f64408c = new UIChangeLiveData();
        }
        return this.f64408c;
    }

    public void f(LifecycleProvider lifecycleProvider) {
        this.f64409d = new WeakReference<>(lifecycleProvider);
    }

    public void g() {
        this.f64408c.f64416g.call();
    }

    public void k(String str) {
        this.f64408c.f64411b.postValue(str);
    }

    @Override // me.goldze.mvvmhabit.base.IBaseViewModel
    public void onCreate() {
        em.g.a("onCreate");
    }

    public void onDestroy() {
        em.g.a("onDestroy:" + getClass().getName());
        onCleared();
    }

    public void startActivity(Class<?> cls, Bundle bundle) {
        HashMap map = new HashMap();
        map.put(a.f64418a, cls);
        if (bundle != null) {
            bundle.putString(a.f64421d, getClass().getName());
            map.put(a.f64420c, bundle);
        }
        this.f64408c.f64413d.postValue(map);
    }

    @Override // oi.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(b bVar) throws Exception {
        b(bVar);
    }

    public void j() {
        k(r.a().getResources().getString(R$string.str_wait));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        em.g.a("onCleared");
        M m10 = this.f64407b;
        if (m10 != null) {
            m10.X();
        }
        mi.a aVar = this.f64410e;
        if (aVar != null) {
            aVar.c();
        }
    }
}
