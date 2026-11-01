package com.mgs.carparking.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import ul.b;
import w9.f2;
import xl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemSearchExtendListBindingImpl extends ItemSearchExtendListBinding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40887g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40888h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40891f;

    public ItemSearchExtendListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f40887g, f40888h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        SpannableString spannableString;
        synchronized (this) {
            j10 = this.f40891f;
            this.f40891f = 0L;
        }
        f2 f2Var = this.f40886c;
        long j11 = 7 & j10;
        b bVar = null;
        if (j11 != 0) {
            b bVar2 = ((j10 & 6) == 0 || f2Var == null) ? null : f2Var.f73623d;
            ObservableField<SpannableString> observableField = f2Var != null ? f2Var.f73622c : null;
            updateRegistration(0, observableField);
            spannableString = observableField != null ? observableField.get() : null;
            bVar = bVar2;
        } else {
            spannableString = null;
        }
        if ((j10 & 6) != 0) {
            a.b(this.f40889d, bVar, false);
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f40890e, spannableString);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40891f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40891f = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((f2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40888h = sparseIntArray;
        sparseIntArray.put(R.id.iv_search, 2);
    }

    public ItemSearchExtendListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[2]);
        this.f40891f = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40889d = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40890e = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40891f |= 1;
        }
        return true;
    }

    public void b(@Nullable f2 f2Var) {
        this.f40886c = f2Var;
        synchronized (this) {
            this.f40891f |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
