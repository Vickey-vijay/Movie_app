package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import ca.e1;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.BlockListEntry;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes9.dex */
public class ItemHomeContentMultipleListItemSpecialListBindingImpl extends ItemHomeContentMultipleListItemSpecialListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40514e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40515f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f40516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40517d;

    public ItemHomeContentMultipleListItemSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f40514e, f40515f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        BlockListEntry blockListEntry;
        synchronized (this) {
            j10 = this.f40517d;
            this.f40517d = 0L;
        }
        e1 e1Var = this.f40513b;
        long j11 = j10 & 3;
        String banner_pic = null;
        if (j11 != 0) {
            if (e1Var != null) {
                bVar = e1Var.f5729e;
                blockListEntry = e1Var.f5726b;
            } else {
                bVar = null;
                blockListEntry = null;
            }
            if (blockListEntry != null) {
                banner_pic = blockListEntry.getBanner_pic();
            }
        } else {
            bVar = null;
        }
        if (j11 != 0) {
            a.a(this.f40516c, banner_pic, R.drawable.ic_video_default_smart_horiz);
            xl.a.b(this.f40516c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40517d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40517d = 2L;
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
        a((e1) obj);
        return true;
    }

    public ItemHomeContentMultipleListItemSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f40517d = -1L;
        ImageView imageView = (ImageView) objArr[0];
        this.f40516c = imageView;
        imageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable e1 e1Var) {
        this.f40513b = e1Var;
        synchronized (this) {
            this.f40517d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
