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
import com.mgs.carparking.model.SETTINGVIEWMODEL;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes9.dex */
public class DialogSettingLogoutBindingImpl extends DialogSettingLogoutBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40060i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40061j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40065h;

    public DialogSettingLogoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40060i, f40061j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        synchronized (this) {
            j10 = this.f40065h;
            this.f40065h = 0L;
        }
        SETTINGVIEWMODEL settingviewmodel = this.f40059d;
        long j11 = j10 & 3;
        b bVar2 = null;
        if (j11 == 0 || settingviewmodel == null) {
            bVar = null;
        } else {
            bVar2 = settingviewmodel.F;
            bVar = settingviewmodel.G;
        }
        if (j11 != 0) {
            a.b(this.f40063f, bVar2, false);
            a.b(this.f40064g, bVar, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40065h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40065h = 2L;
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
        a((SETTINGVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40061j = sparseIntArray;
        sparseIntArray.put(R.id.tv_message, 3);
        sparseIntArray.put(R.id.f14800ll, 4);
    }

    public DialogSettingLogoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.f40065h = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40062e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f40063f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f40064g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // com.mgs.carparking.databinding.DialogSettingLogoutBinding
    public void a(@Nullable SETTINGVIEWMODEL settingviewmodel) {
        this.f40059d = settingviewmodel;
        synchronized (this) {
            this.f40065h |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
