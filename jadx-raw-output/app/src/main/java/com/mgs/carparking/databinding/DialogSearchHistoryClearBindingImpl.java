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
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes8.dex */
public class DialogSearchHistoryClearBindingImpl extends DialogSearchHistoryClearBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40051i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40052j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40056h;

    public DialogSearchHistoryClearBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40051i, f40052j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f40056h;
            this.f40056h = 0L;
        }
        SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = this.f40050d;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 == 0 || searchcontentvideoviewmodel == null) {
            bVar = null;
        } else {
            bVar = searchcontentvideoviewmodel.f41344z;
            bVar2 = searchcontentvideoviewmodel.f41343y;
        }
        if (j11 != 0) {
            a.b(this.f40054f, bVar2, false);
            a.b(this.f40055g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40056h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40056h = 2L;
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
        a((SEARCHCONTENTVIDEOVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40052j = sparseIntArray;
        sparseIntArray.put(R.id.tv_message, 3);
        sparseIntArray.put(R.id.f14800ll, 4);
    }

    public DialogSearchHistoryClearBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.f40056h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40053e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40054f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f40055g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.DialogSearchHistoryClearBinding
    public void a(@Nullable SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel) {
        this.f40050d = searchcontentvideoviewmodel;
        synchronized (this) {
            this.f40056h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
