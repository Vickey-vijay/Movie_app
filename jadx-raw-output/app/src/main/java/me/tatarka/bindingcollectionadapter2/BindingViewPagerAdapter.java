package me.tatarka.bindingcollectionadapter2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import fm.b;
import fm.c;
import fm.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BindingViewPagerAdapter<T> extends PagerAdapter implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f64481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<T> f64482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f64483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a<T> f64484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f64485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<View> f64486g = new ArrayList();

    public interface a<T> {
        @Nullable
        CharSequence a(int i10, T t10);
    }

    @NonNull
    public ViewDataBinding b(@NonNull LayoutInflater layoutInflater, @LayoutRes int i10, @NonNull ViewGroup viewGroup) {
        return DataBindingUtil.inflate(layoutInflater, i10, viewGroup, false);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public void a(@NonNull ViewDataBinding viewDataBinding, int i10, @LayoutRes int i11, int i12, T t10) {
        if (this.f64481b.a(viewDataBinding, t10)) {
            viewDataBinding.executePendingBindings();
            LifecycleOwner lifecycleOwner = this.f64485f;
            if (lifecycleOwner != null) {
                viewDataBinding.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public final void c(View view) {
        LifecycleOwner lifecycleOwner = this.f64485f;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            this.f64485f = e.b(view);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        View view = (View) obj;
        this.f64486g.remove(view);
        viewGroup.removeView(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<T> list = this.f64482c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        Object tag = ((View) obj).getTag();
        if (this.f64482c == null) {
            return -2;
        }
        for (int i10 = 0; i10 < this.f64482c.size(); i10++) {
            if (tag == this.f64482c.get(i10)) {
                return i10;
            }
        }
        return -2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i10) {
        a<T> aVar = this.f64484e;
        if (aVar == null) {
            return null;
        }
        return aVar.a(i10, this.f64482c.get(i10));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        if (this.f64483d == null) {
            this.f64483d = LayoutInflater.from(viewGroup.getContext());
        }
        c(viewGroup);
        T t10 = this.f64482c.get(i10);
        this.f64481b.e(i10, t10);
        ViewDataBinding viewDataBindingB = b(this.f64483d, this.f64481b.b(), viewGroup);
        View root = viewDataBindingB.getRoot();
        a(viewDataBindingB, this.f64481b.g(), this.f64481b.b(), i10, t10);
        viewGroup.addView(root);
        root.setTag(t10);
        this.f64486g.add(root);
        return root;
    }
}
