package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.widgets.cardbanner.view.StraightImageView;
import ul.b;
import w9.h2;
import wl.a;

/* JADX INFO: loaded from: classes6.dex */
public class ItemHomeSearchHotSearchBindingImpl extends ItemHomeSearchHotSearchBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40795i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40796j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40798h;

    public ItemHomeSearchHotSearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40795i, f40796j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        Drawable drawable;
        b bVar;
        String str2;
        HotNewSearchEntry hotNewSearchEntry;
        synchronized (this) {
            j10 = this.f40798h;
            this.f40798h = 0L;
        }
        h2 h2Var = this.f40794f;
        long j11 = j10 & 3;
        String str3 = null;
        if (j11 != 0) {
            if (h2Var != null) {
                hotNewSearchEntry = h2Var.f73635b;
                drawable = h2Var.f73636c;
                bVar = h2Var.f73637d;
            } else {
                hotNewSearchEntry = null;
                drawable = null;
                bVar = null;
            }
            if (hotNewSearchEntry != null) {
                String name = hotNewSearchEntry.getName();
                String vod_pic = hotNewSearchEntry.getVod_pic();
                String vod_director = hotNewSearchEntry.getVod_director();
                str = name;
                str3 = vod_pic;
                str2 = vod_director;
            } else {
                str = null;
                str2 = null;
            }
        } else {
            str = null;
            drawable = null;
            bVar = null;
            str2 = null;
        }
        if (j11 != 0) {
            a.a(this.f40790b, str3, R.drawable.ic_video_default);
            xl.a.b(this.f40797g, bVar, false);
            TextViewBindingAdapter.setDrawableRight(this.f40792d, drawable);
            TextViewBindingAdapter.setText(this.f40792d, str);
            TextViewBindingAdapter.setText(this.f40793e, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40798h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40798h = 2L;
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
        a((h2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40796j = sparseIntArray;
        sparseIntArray.put(R.id.ll_top, 4);
    }

    public ItemHomeSearchHotSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (StraightImageView) objArr[1], (LinearLayout) objArr[4], (TextView) objArr[2], (TextView) objArr[3]);
        this.f40798h = -1L;
        this.f40790b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40797g = relativeLayout;
        relativeLayout.setTag(null);
        this.f40792d.setTag(null);
        this.f40793e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable h2 h2Var) {
        this.f40794f = h2Var;
        synchronized (this) {
            this.f40798h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
