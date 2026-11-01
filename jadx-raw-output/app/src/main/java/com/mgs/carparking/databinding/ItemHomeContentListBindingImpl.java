package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import ca.e0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeContentListBindingImpl extends ItemHomeContentListBinding {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40432h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40433i = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40437g;

    public ItemHomeContentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f40432h, f40433i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String name;
        b bVar;
        String str;
        RecommandVideosEntity recommandVideosEntity;
        synchronized (this) {
            j10 = this.f40437g;
            this.f40437g = 0L;
        }
        e0 e0Var = this.f40431c;
        long j11 = j10 & 3;
        String str2 = null;
        if (j11 != 0) {
            if (e0Var != null) {
                recommandVideosEntity = e0Var.f5724b;
                bVar = e0Var.f5725c;
            } else {
                recommandVideosEntity = null;
                bVar = null;
            }
            if (recommandVideosEntity != null) {
                String videoDesc = recommandVideosEntity.getVideoDesc();
                String vod_pic = recommandVideosEntity.getVod_pic();
                name = recommandVideosEntity.getName();
                str = videoDesc;
                str2 = vod_pic;
            } else {
                name = null;
                str = null;
            }
        } else {
            name = null;
            bVar = null;
            str = null;
        }
        if (j11 != 0) {
            a.a(this.f40430b, str2, R.drawable.ic_video_default);
            xl.a.b(this.f40434d, bVar, false);
            TextViewBindingAdapter.setText(this.f40435e, name);
            TextViewBindingAdapter.setText(this.f40436f, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40437g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40437g = 2L;
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
        a((e0) obj);
        return true;
    }

    public ItemHomeContentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundedImageView) objArr[1]);
        this.f40437g = -1L;
        this.f40430b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40434d = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f40435e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f40436f = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable e0 e0Var) {
        this.f40431c = e0Var;
        synchronized (this) {
            this.f40437g |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }
}
