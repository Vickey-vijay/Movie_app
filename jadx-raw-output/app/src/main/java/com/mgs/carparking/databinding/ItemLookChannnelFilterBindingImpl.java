package com.mgs.carparking.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
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
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import ul.b;
import w9.a2;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemLookChannnelFilterBindingImpl extends ItemLookChannnelFilterBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40800f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40801g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f40803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40804e;

    public ItemLookChannnelFilterBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f40800f, f40801g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40804e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40804e = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((a2) obj);
        return true;
    }

    public ItemLookChannnelFilterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f40804e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40802c = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40803d = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40804e |= 1;
        }
        return true;
    }

    public void b(@Nullable a2 a2Var) {
        this.f40799b = a2Var;
        synchronized (this) {
            this.f40804e |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        String name;
        b bVar;
        Context context;
        int i10;
        long j11;
        long j12;
        ChannnelFilterEntry channnelFilterEntry;
        synchronized (this) {
            j10 = this.f40804e;
            this.f40804e = 0L;
        }
        a2 a2Var = this.f40799b;
        long j13 = j10 & 7;
        Drawable drawable = null;
        if (j13 != 0) {
            if ((j10 & 6) != 0) {
                if (a2Var != null) {
                    channnelFilterEntry = a2Var.f73554b;
                    bVar = a2Var.f73557e;
                } else {
                    channnelFilterEntry = null;
                    bVar = null;
                }
                name = channnelFilterEntry != null ? channnelFilterEntry.getName() : null;
            } else {
                name = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = a2Var != null ? a2Var.f73556d : null;
            updateRegistration(0, observableField);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j13 != 0) {
                if (zSafeUnbox) {
                    j11 = j10 | 16;
                    j12 = 64;
                } else {
                    j11 = j10 | 8;
                    j12 = 32;
                }
                j10 = j11 | j12;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f40803d, zSafeUnbox ? R.color.color_text_light_5 : R.color.color_999999);
            if (zSafeUnbox) {
                context = this.f40803d.getContext();
                i10 = R.drawable.bg_channel_filter_type_selector;
            } else {
                context = this.f40803d.getContext();
                i10 = R.drawable.bg_channel_filter_type_normal;
            }
            drawable = AppCompatResources.getDrawable(context, i10);
        } else {
            colorFromResource = 0;
            name = null;
            bVar = null;
        }
        if ((7 & j10) != 0) {
            this.f40803d.setTextColor(colorFromResource);
            ViewBindingAdapter.setBackground(this.f40803d, drawable);
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40803d, name);
            a.b(this.f40803d, bVar, false);
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
