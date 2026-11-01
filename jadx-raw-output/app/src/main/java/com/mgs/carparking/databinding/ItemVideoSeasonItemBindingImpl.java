package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.SeriesInfoEntry;
import ul.b;
import w9.a3;
import xl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ItemVideoSeasonItemBindingImpl extends ItemVideoSeasonItemBinding {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40984e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40985f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f40986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40987d;

    public ItemVideoSeasonItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f40984e, f40985f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40987d != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40987d = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((a3) obj);
        return true;
    }

    public ItemVideoSeasonItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f40987d = -1L;
        TextView textView = (TextView) objArr[0];
        this.f40986c = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40987d |= 1;
        }
        return true;
    }

    public void b(@Nullable a3 a3Var) {
        this.f40983b = a3Var;
        synchronized (this) {
            this.f40987d |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        b bVar;
        String series;
        TextView textView;
        int i10;
        SeriesInfoEntry seriesInfoEntry;
        synchronized (this) {
            j10 = this.f40987d;
            this.f40987d = 0L;
        }
        a3 a3Var = this.f40983b;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if ((j10 & 6) != 0) {
                if (a3Var != null) {
                    seriesInfoEntry = a3Var.f73558b;
                    bVar = a3Var.f73560d;
                } else {
                    seriesInfoEntry = null;
                    bVar = null;
                }
                series = seriesInfoEntry != null ? seriesInfoEntry.getSeries() : null;
            } else {
                series = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = a3Var != null ? a3Var.f73559c : null;
            updateRegistration(0, observableField);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 16L : 8L;
            }
            if (zSafeUnbox) {
                textView = this.f40986c;
                i10 = R.color.color_commen;
            } else {
                textView = this.f40986c;
                i10 = R.color.theme_bg_color;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(textView, i10);
            str = series;
        } else {
            colorFromResource = 0;
            bVar = null;
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.f40986c, str);
            a.b(this.f40986c, bVar, false);
        }
        if ((j10 & 7) != 0) {
            this.f40986c.setTextColor(colorFromResource);
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
