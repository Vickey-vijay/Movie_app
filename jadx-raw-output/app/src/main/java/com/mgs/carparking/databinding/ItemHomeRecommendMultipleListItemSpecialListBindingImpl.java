package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ea.o0;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes5.dex */
public class ItemHomeRecommendMultipleListItemSpecialListBindingImpl extends ItemHomeRecommendMultipleListItemSpecialListBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40757e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40758f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40760d;

    public ItemHomeRecommendMultipleListItemSpecialListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f40757e, f40758f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        BlockListEntry blockListEntry;
        synchronized (this) {
            j10 = this.f40760d;
            this.f40760d = 0L;
        }
        o0 o0Var = this.f40756b;
        long j11 = j10 & 3;
        String banner_pic = null;
        if (j11 != 0) {
            if (o0Var != null) {
                bVar = o0Var.f52535d;
                blockListEntry = o0Var.f52533b;
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
            a.a(this.f40759c, banner_pic, R.drawable.ic_video_default_smart_horiz);
            xl.a.b(this.f40759c, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40760d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40760d = 2L;
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
        a((o0) obj);
        return true;
    }

    public ItemHomeRecommendMultipleListItemSpecialListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f40760d = -1L;
        RoundedImageView roundedImageView = (RoundedImageView) objArr[0];
        this.f40759c = roundedImageView;
        roundedImageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable o0 o0Var) {
        this.f40756b = o0Var;
        synchronized (this) {
            this.f40760d |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
