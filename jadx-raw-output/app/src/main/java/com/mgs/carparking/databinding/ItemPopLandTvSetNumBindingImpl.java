package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import w9.c3;

/* JADX INFO: loaded from: classes10.dex */
public class ItemPopLandTvSetNumBindingImpl extends ItemPopLandTvSetNumBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40846g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40847h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40848f;

    public ItemPopLandTvSetNumBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40846g, f40847h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f40848f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40848f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40848f = 2L;
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
        a((c3) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40847h = sparseIntArray;
        sparseIntArray.put(R.id.tv_name, 1);
        sparseIntArray.put(R.id.iv_is_play, 2);
    }

    public ItemPopLandTvSetNumBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (RelativeLayout) objArr[0], (TextView) objArr[1]);
        this.f40848f = -1L;
        this.f40843c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable c3 c3Var) {
        this.f40845e = c3Var;
    }
}
