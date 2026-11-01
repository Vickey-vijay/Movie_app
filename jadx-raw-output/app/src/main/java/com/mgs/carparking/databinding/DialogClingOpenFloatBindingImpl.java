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
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes2.dex */
public class DialogClingOpenFloatBindingImpl extends DialogClingOpenFloatBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40030i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40031j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40035h;

    public DialogClingOpenFloatBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40030i, f40031j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f40035h;
            this.f40035h = 0L;
        }
        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = this.f40029d;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 == 0 || videoplaydetailviewmodel == null) {
            bVar = null;
        } else {
            bVar2 = videoplaydetailviewmodel.f41384a1;
            bVar = videoplaydetailviewmodel.f41386b1;
        }
        if (j11 != 0) {
            a.b(this.f40033f, bVar2, false);
            a.b(this.f40034g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40035h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40035h = 2L;
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
        a((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40031j = sparseIntArray;
        sparseIntArray.put(R.id.tv_message, 3);
        sparseIntArray.put(R.id.f14800ll, 4);
    }

    public DialogClingOpenFloatBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.f40035h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40032e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40033f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f40034g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.DialogClingOpenFloatBinding
    public void a(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.f40029d = videoplaydetailviewmodel;
        synchronized (this) {
            this.f40035h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
