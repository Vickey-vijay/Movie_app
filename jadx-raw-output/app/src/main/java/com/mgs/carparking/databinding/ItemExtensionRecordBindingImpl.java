package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.widgets.CircularImageView;
import w9.l1;
import wl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ItemExtensionRecordBindingImpl extends ItemExtensionRecordBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40385h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40386i = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40390g;

    public ItemExtensionRecordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f40385h, f40386i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40390g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40390g = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((l1) obj);
        return true;
    }

    public ItemExtensionRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (CircularImageView) objArr[1]);
        this.f40390g = -1L;
        this.f40383b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40387d = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40388e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f40389f = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40390g |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40390g |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40390g |= 1;
        }
        return true;
    }

    public void d(@Nullable l1 l1Var) {
        this.f40384c = l1Var;
        synchronized (this) {
            this.f40390g |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.f40390g;
            this.f40390g = 0L;
        }
        l1 l1Var = this.f40384c;
        String str3 = null;
        if ((31 & j10) != 0) {
            if ((j10 & 25) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = l1Var != null ? l1Var.f73681d : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 26) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = l1Var != null ? l1Var.f73682e : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 28) != 0) {
                ObservableField<String> observableField3 = l1Var != null ? l1Var.f73680c : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str3 = observableField3.get();
                }
            }
        } else {
            str = null;
            str2 = null;
        }
        if ((28 & j10) != 0) {
            a.a(this.f40383b, str3, R.drawable.ic_avatar_login_default);
        }
        if ((25 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40388e, str);
        }
        if ((j10 & 26) != 0) {
            TextViewBindingAdapter.setText(this.f40389f, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return a((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
