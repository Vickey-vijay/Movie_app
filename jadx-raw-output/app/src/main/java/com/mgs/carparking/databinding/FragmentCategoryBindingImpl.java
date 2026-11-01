package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.CATEGORYVIEWMODEL;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes7.dex */
public class FragmentCategoryBindingImpl extends FragmentCategoryBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40088i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40089j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40092h;

    public FragmentCategoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40088i, f40089j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f40092h;
            this.f40092h = 0L;
        }
        b bVar = null;
        CATEGORYVIEWMODEL categoryviewmodel = this.f40087e;
        long j11 = j10 & 3;
        if (j11 != 0 && categoryviewmodel != null) {
            bVar = categoryviewmodel.f41072f;
        }
        if (j11 != 0) {
            a.b(this.f40091g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40092h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40092h = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        a((CATEGORYVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40089j = sparseIntArray;
        sparseIntArray.put(R.id.view_top, 2);
        sparseIntArray.put(R.id.tab_layout, 3);
        sparseIntArray.put(R.id.vp_content, 4);
    }

    public FragmentCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TabLayout) objArr[3], (View) objArr[2], (SuperViewPager) objArr[4]);
        this.f40092h = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40090f = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[1];
        this.f40091g = relativeLayout2;
        relativeLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable CATEGORYVIEWMODEL categoryviewmodel) {
        this.f40087e = categoryviewmodel;
        synchronized (this) {
            this.f40092h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
