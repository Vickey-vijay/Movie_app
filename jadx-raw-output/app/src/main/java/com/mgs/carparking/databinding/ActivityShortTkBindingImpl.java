package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.shorttk.SHORTTKVIEWMODEL;

/* JADX INFO: loaded from: classes9.dex */
public class ActivityShortTkBindingImpl extends ActivityShortTkBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39970e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39971f = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39972d;

    public ActivityShortTkBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f39970e, f39971f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f39972d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39972d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39972d = 2L;
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
        a((SHORTTKVIEWMODEL) obj);
        return true;
    }

    public ActivityShortTkBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0]);
        this.f39972d = -1L;
        this.f39968b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable SHORTTKVIEWMODEL shorttkviewmodel) {
        this.f39969c = shorttkviewmodel;
    }
}
