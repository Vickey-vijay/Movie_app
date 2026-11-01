package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.FeedbackTypeEntry;
import ul.b;
import w9.q1;

/* JADX INFO: loaded from: classes6.dex */
public class ItemFeedbackTypeNewBindingImpl extends ItemFeedbackTypeNewBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40410h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40411i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CheckBox f40413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InverseBindingListener f40415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40416g;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemFeedbackTypeNewBindingImpl.this.f40413d.isChecked();
            q1 q1Var = ItemFeedbackTypeNewBindingImpl.this.f40409b;
            if (q1Var != null) {
                ObservableField<Boolean> observableField = q1Var.f73757e;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemFeedbackTypeNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40410h, f40411i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40416g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40416g = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((q1) obj);
        return true;
    }

    public ItemFeedbackTypeNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f40415f = new a();
        this.f40416g = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40412c = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[1];
        this.f40413d = checkBox;
        checkBox.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40414e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40416g |= 1;
        }
        return true;
    }

    public void c(@Nullable q1 q1Var) {
        this.f40409b = q1Var;
        synchronized (this) {
            this.f40416g |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zSafeUnbox;
        int colorFromResource;
        String name;
        b bVar;
        FeedbackTypeEntry feedbackTypeEntry;
        synchronized (this) {
            j10 = this.f40416g;
            this.f40416g = 0L;
        }
        q1 q1Var = this.f40409b;
        long j11 = j10 & 7;
        if (j11 != 0) {
            if ((j10 & 6) != 0) {
                if (q1Var != null) {
                    feedbackTypeEntry = q1Var.f73756d;
                    bVar = q1Var.f73759g;
                } else {
                    feedbackTypeEntry = null;
                    bVar = null;
                }
                name = feedbackTypeEntry != null ? feedbackTypeEntry.getName() : null;
            } else {
                name = null;
                bVar = null;
            }
            ObservableField<Boolean> observableField = q1Var != null ? q1Var.f73757e : null;
            updateRegistration(0, observableField);
            zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 16L : 8L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.f40414e, zSafeUnbox ? R.color.color_333333 : R.color.color_666666);
        } else {
            zSafeUnbox = false;
            colorFromResource = 0;
            name = null;
            bVar = null;
        }
        if ((6 & j10) != 0) {
            xl.a.b(this.f40412c, bVar, false);
            TextViewBindingAdapter.setText(this.f40414e, name);
        }
        if ((7 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f40413d, zSafeUnbox);
            this.f40414e.setTextColor(colorFromResource);
        }
        if ((j10 & 4) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f40413d, null, this.f40415f);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
