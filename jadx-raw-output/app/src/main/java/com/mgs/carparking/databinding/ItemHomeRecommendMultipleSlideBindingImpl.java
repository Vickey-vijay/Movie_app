package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.widgets.BannerView;
import ea.m0;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleSlideBindingImpl extends ItemHomeRecommendMultipleSlideBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40786f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40787g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40789e;

    public ItemHomeRecommendMultipleSlideBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f40786f, f40787g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f40789e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40789e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40789e = 2L;
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
        a((m0) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40787g = sparseIntArray;
        sparseIntArray.put(R.id.home_banner, 1);
    }

    public ItemHomeRecommendMultipleSlideBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (BannerView) objArr[1]);
        this.f40789e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40788d = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable m0 m0Var) {
        this.f40785c = m0Var;
    }
}
