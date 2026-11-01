package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import w9.d2;

/* JADX INFO: loaded from: classes9.dex */
public class ItemOrderListBindingImpl extends ItemOrderListBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40838i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40839j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40841h;

    public ItemOrderListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40838i, f40839j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40841h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40841h = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((d2) obj);
        return true;
    }

    public ItemOrderListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f40841h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f40840g = constraintLayout;
        constraintLayout.setTag(null);
        this.f40833b.setTag(null);
        this.f40834c.setTag(null);
        this.f40835d.setTag(null);
        this.f40836e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40841h |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40841h |= 8;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40841h |= 1;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40841h |= 4;
        }
        return true;
    }

    public void e(@Nullable d2 d2Var) {
        this.f40837f = d2Var;
        synchronized (this) {
            this.f40841h |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j10 = this.f40841h;
            this.f40841h = 0L;
        }
        d2 d2Var = this.f40837f;
        if ((63 & j10) != 0) {
            if ((j10 & 49) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField = d2Var != null ? d2Var.f73598e : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str2 = observableField.get();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & 50) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField2 = d2Var != null ? d2Var.f73599f : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str3 = observableField2.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 52) == 0) {
                str5 = null;
            } else {
                ObservableField<String> observableField3 = d2Var != null ? d2Var.f73600g : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str5 = observableField3.get();
                } else {
                    str5 = null;
                }
            }
            if ((j10 & 56) == 0) {
                str4 = str5;
                str = null;
            } else {
                ObservableField<String> observableField4 = d2Var != null ? d2Var.f73597d : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str = observableField4.get();
                    str4 = str5;
                } else {
                    str4 = str5;
                    str = null;
                }
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j10 & 52) != 0) {
            TextViewBindingAdapter.setText(this.f40833b, str4);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40834c, str3);
        }
        if ((56 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40835d, str);
        }
        if ((j10 & 49) != 0) {
            TextViewBindingAdapter.setText(this.f40836e, str2);
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
        if (i10 == 2) {
            return d((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
