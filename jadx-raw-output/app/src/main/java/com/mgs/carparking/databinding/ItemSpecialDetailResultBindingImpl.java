package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
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
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import w9.x2;
import wl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ItemSpecialDetailResultBindingImpl extends ItemSpecialDetailResultBinding {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40918i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40919j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f40921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40923h;

    public ItemSpecialDetailResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f40918i, f40919j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40923h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40923h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        b((x2) obj);
        return true;
    }

    public ItemSpecialDetailResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RoundedImageView) objArr[1], (TextView) objArr[4]);
        this.f40923h = -1L;
        this.f40915b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40920e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40921f = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f40922g = textView;
        textView.setTag(null);
        this.f40916c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40923h |= 1;
        }
        return true;
    }

    public void b(@Nullable x2 x2Var) {
        this.f40917d = x2Var;
        synchronized (this) {
            this.f40923h |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        String str;
        SpannableString spannableString;
        Drawable drawable;
        b bVar;
        String name;
        String vod_pic;
        RecommandVideosEntity recommandVideosEntity;
        int topType;
        synchronized (this) {
            j10 = this.f40923h;
            this.f40923h = 0L;
        }
        x2 x2Var = this.f40917d;
        String str2 = null;
        if ((j10 & 7) != 0) {
            long j11 = j10 & 6;
            if (j11 != 0) {
                if (x2Var != null) {
                    recommandVideosEntity = x2Var.f73851b;
                    drawable = x2Var.f73852c;
                    bVar = x2Var.f73854e;
                } else {
                    recommandVideosEntity = null;
                    drawable = null;
                    bVar = null;
                }
                if (recommandVideosEntity != null) {
                    name = recommandVideosEntity.getName();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    topType = recommandVideosEntity.getTopType();
                } else {
                    topType = 0;
                    name = null;
                    vod_pic = null;
                }
                boolean z10 = topType == 0;
                if (j11 != 0) {
                    j10 |= z10 ? 16L : 8L;
                }
                i10 = z10 ? 8 : 0;
            } else {
                i10 = 0;
                drawable = null;
                bVar = null;
                name = null;
                vod_pic = null;
            }
            ObservableField<SpannableString> observableField = x2Var != null ? x2Var.f73853d : null;
            updateRegistration(0, observableField);
            spannableString = observableField != null ? observableField.get() : null;
            str = name;
            str2 = vod_pic;
        } else {
            i10 = 0;
            str = null;
            spannableString = null;
            drawable = null;
            bVar = null;
        }
        if ((6 & j10) != 0) {
            a.a(this.f40915b, str2, R.drawable.ic_video_default);
            xl.a.b(this.f40920e, bVar, false);
            this.f40921f.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40921f, drawable);
            TextViewBindingAdapter.setText(this.f40916c, str);
        }
        if ((j10 & 7) != 0) {
            TextViewBindingAdapter.setText(this.f40922g, spannableString);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
