package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes8.dex */
public class DialogVideoDeleteBindingImpl extends DialogVideoDeleteBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40073i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40074j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40078h;

    public DialogVideoDeleteBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40073i, f40074j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f40078h;
            this.f40078h = 0L;
        }
        DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel = this.f40072d;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 == 0 || downloadvideoviewmodel == null) {
            bVar = null;
        } else {
            bVar = downloadvideoviewmodel.f41138y;
            bVar2 = downloadvideoviewmodel.f41137x;
        }
        if (j11 != 0) {
            a.b(this.f40076f, bVar2, false);
            a.b(this.f40077g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40078h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40078h = 2L;
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
        a((DOWNLOADVIDEOVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40074j = sparseIntArray;
        sparseIntArray.put(R.id.tv_message, 3);
        sparseIntArray.put(R.id.f14800ll, 4);
    }

    public DialogVideoDeleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.f40078h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40075e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40076f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f40077g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.DialogVideoDeleteBinding
    public void a(@Nullable DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel) {
        this.f40072d = downloadvideoviewmodel;
        synchronized (this) {
            this.f40078h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
