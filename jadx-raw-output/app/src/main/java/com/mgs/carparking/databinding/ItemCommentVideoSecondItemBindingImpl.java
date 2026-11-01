package com.mgs.carparking.databinding;

import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.green.hand.library.widget.EmojiTextview;
import ul.b;
import w9.u0;
import xl.a;

/* JADX INFO: loaded from: classes6.dex */
public class ItemCommentVideoSecondItemBindingImpl extends ItemCommentVideoSecondItemBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40335f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40336g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EmojiTextview f40338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40339e;

    public ItemCommentVideoSecondItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f40335f, f40336g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Spanned spanned;
        synchronized (this) {
            j10 = this.f40339e;
            this.f40339e = 0L;
        }
        u0 u0Var = this.f40334b;
        long j11 = 7 & j10;
        b bVar = null;
        if (j11 != 0) {
            ObservableField<Spanned> observableField = u0Var != null ? u0Var.f73814e : null;
            updateRegistration(0, observableField);
            spanned = observableField != null ? observableField.get() : null;
            if ((j10 & 6) != 0 && u0Var != null) {
                bVar = u0Var.f73817h;
            }
        } else {
            spanned = null;
        }
        if ((j10 & 6) != 0) {
            a.c(this.f40337c, bVar);
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f40338d, spanned);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40339e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40339e = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((u0) obj);
        return true;
    }

    public ItemCommentVideoSecondItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.f40339e = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40337c = linearLayout;
        linearLayout.setTag(null);
        EmojiTextview emojiTextview = (EmojiTextview) objArr[1];
        this.f40338d = emojiTextview;
        emojiTextview.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Spanned> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40339e |= 1;
        }
        return true;
    }

    public void b(@Nullable u0 u0Var) {
        this.f40334b = u0Var;
        synchronized (this) {
            this.f40339e |= 2;
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
