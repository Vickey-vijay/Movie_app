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
import ea.w;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleListItemCategoryBindingImpl extends ItemHomeRecommendMultipleListItemCategoryBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40684k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40685l = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f40687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f40688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40692j;

    public ItemHomeRecommendMultipleListItemCategoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f40684k, f40685l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40692j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40692j = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((w) obj);
        return true;
    }

    public ItemHomeRecommendMultipleListItemCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1]);
        this.f40692j = -1L;
        this.f40682b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40686d = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40687e = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40688f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40689g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40690h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40691i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40692j |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40692j |= 2;
        }
        return true;
    }

    public void c(@Nullable w wVar) {
        this.f40683c = wVar;
        synchronized (this) {
            this.f40692j |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        String vod_name;
        SpannableString spannableString;
        b bVar;
        Drawable drawable;
        String vod_pic;
        String str;
        RecommandVideosEntity recommandVideosEntity;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.f40692j;
            this.f40692j = 0L;
        }
        w wVar = this.f40683c;
        if ((15 & j10) != 0) {
            long j12 = j10 & 12;
            if (j12 != 0) {
                if (wVar != null) {
                    recommandVideosEntity = wVar.f52553b;
                    bVar = wVar.f52558g;
                    drawable = wVar.f52555d;
                } else {
                    bVar = null;
                    drawable = null;
                    recommandVideosEntity = null;
                }
                if (recommandVideosEntity != null) {
                    int type_pid = recommandVideosEntity.getType_pid();
                    int icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    i11 = type_pid;
                    i12 = icon_type;
                } else {
                    i11 = 0;
                    i12 = 0;
                    vod_pic = null;
                    vod_name = null;
                }
                z10 = i11 != 1;
                boolean z11 = i12 == 0;
                if (j12 != 0) {
                    j10 |= z11 ? 32L : 16L;
                }
                i10 = z11 ? 8 : 0;
            } else {
                i10 = 0;
                z10 = false;
                bVar = null;
                drawable = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 13) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = wVar != null ? wVar.f52556e : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    spannableString = observableField.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 14) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField2 = wVar != null ? wVar.f52557f : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str = observableField2.get();
                } else {
                    str = null;
                }
            }
            j11 = 12;
        } else {
            j11 = 12;
            i10 = 0;
            z10 = false;
            vod_name = null;
            spannableString = null;
            bVar = null;
            drawable = null;
            vod_pic = null;
            str = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40682b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40686d, bVar, false);
            this.f40687e.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40687e, drawable);
            xl.a.a(this.f40688f, Boolean.valueOf(z10));
            xl.a.a(this.f40690h, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40691i, vod_name);
        }
        if ((j10 & 13) != 0) {
            TextViewBindingAdapter.setText(this.f40689g, spannableString);
        }
        if ((j10 & 14) != 0) {
            TextViewBindingAdapter.setText(this.f40690h, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return a((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }
}
