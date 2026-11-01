package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoBean;
import ul.b;
import w9.e3;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemVideoPlayVarietySetNumBindingImpl extends ItemVideoPlayVarietySetNumBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40973g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40974h = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40977f;

    public ItemVideoPlayVarietySetNumBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40973g, f40974h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40977f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40977f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((e3) obj);
        return true;
    }

    public ItemVideoPlayVarietySetNumBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[2]);
        this.f40977f = -1L;
        this.f40971b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40975d = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40976e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40977f |= 1;
        }
        return true;
    }

    public void b(@Nullable e3 e3Var) {
        this.f40972c = e3Var;
        synchronized (this) {
            this.f40977f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        int colorFromResource;
        String title;
        b bVar;
        long j11;
        long j12;
        VideoBean videoBean;
        synchronized (this) {
            j10 = this.f40977f;
            this.f40977f = 0L;
        }
        e3 e3Var = this.f40972c;
        long j13 = j10 & 7;
        Drawable drawable = null;
        if (j13 != 0) {
            if ((j10 & 6) != 0) {
                if (e3Var != null) {
                    videoBean = e3Var.f73608b;
                    bVar = e3Var.f73610d;
                } else {
                    videoBean = null;
                    bVar = null;
                }
                title = videoBean != null ? videoBean.getTitle() : null;
            } else {
                title = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = e3Var != null ? e3Var.f73609c : null;
            updateRegistration(0, observableField);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j13 != 0) {
                if (zSafeUnbox) {
                    j11 = j10 | 16 | 64;
                    j12 = 256;
                } else {
                    j11 = j10 | 8 | 32;
                    j12 = 128;
                }
                j10 = j11 | j12;
            }
            drawable = AppCompatResources.getDrawable(this.f40976e.getContext(), zSafeUnbox ? R.drawable.bg_home_search_tv_set_num_selector : R.drawable.bg_home_search_tv_set_num);
            colorFromResource = ViewDataBinding.getColorFromResource(this.f40976e, zSafeUnbox ? R.color.color_42BD56 : R.color.black);
            i10 = zSafeUnbox ? 0 : 8;
        } else {
            i10 = 0;
            colorFromResource = 0;
            title = null;
            bVar = null;
        }
        if ((7 & j10) != 0) {
            this.f40971b.setVisibility(i10);
            ViewBindingAdapter.setBackground(this.f40976e, drawable);
            this.f40976e.setTextColor(colorFromResource);
        }
        if ((j10 & 6) != 0) {
            a.b(this.f40975d, bVar, false);
            TextViewBindingAdapter.setText(this.f40976e, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
