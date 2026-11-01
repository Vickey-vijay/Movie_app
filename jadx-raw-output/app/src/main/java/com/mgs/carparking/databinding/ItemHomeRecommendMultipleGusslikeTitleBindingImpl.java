package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import ea.m;

/* JADX INFO: loaded from: classes6.dex */
public class ItemHomeRecommendMultipleGusslikeTitleBindingImpl extends ItemHomeRecommendMultipleGusslikeTitleBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40671f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40672g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40674e;

    public ItemHomeRecommendMultipleGusslikeTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f40671f, f40672g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f40674e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40674e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40674e = 2L;
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
        a((m) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40672g = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
    }

    public ItemHomeRecommendMultipleGusslikeTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f40674e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40673d = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable m mVar) {
        this.f40670c = mVar;
    }
}
