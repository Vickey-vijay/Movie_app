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
import ea.j;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes8.dex */
public class ItemHomeRecommendMultipleListItemHotBindingImpl extends ItemHomeRecommendMultipleListItemHotBinding {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40709l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40710m = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f40712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f40713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40718k;

    public ItemHomeRecommendMultipleListItemHotBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f40709l, f40710m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40718k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40718k = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((j) obj);
        return true;
    }

    public ItemHomeRecommendMultipleListItemHotBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1]);
        this.f40718k = -1L;
        this.f40707b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40711d = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40712e = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40713f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40714g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40715h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40716i = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[7];
        this.f40717j = textView4;
        textView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40718k |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40718k |= 2;
        }
        return true;
    }

    public void c(@Nullable j jVar) {
        this.f40708c = jVar;
        synchronized (this) {
            this.f40718k |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        boolean z11;
        String vod_name;
        String str;
        SpannableString spannableString;
        String str2;
        b bVar;
        Drawable drawable;
        String vod_pic;
        RecommandVideosEntity recommandVideosEntity;
        int i11;
        int icon_type;
        synchronized (this) {
            j10 = this.f40718k;
            this.f40718k = 0L;
        }
        j jVar = this.f40708c;
        if ((15 & j10) != 0) {
            long j12 = j10 & 12;
            if (j12 != 0) {
                if (jVar != null) {
                    recommandVideosEntity = jVar.f52504b;
                    bVar = jVar.f52509g;
                    drawable = jVar.f52505c;
                } else {
                    bVar = null;
                    drawable = null;
                    recommandVideosEntity = null;
                }
                if (recommandVideosEntity != null) {
                    int type_pid = recommandVideosEntity.getType_pid();
                    String remarks = recommandVideosEntity.getRemarks();
                    icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    i11 = type_pid;
                    str = remarks;
                } else {
                    i11 = 0;
                    icon_type = 0;
                    str = null;
                    vod_pic = null;
                    vod_name = null;
                }
                z11 = i11 != 1;
                z10 = i11 == 1;
                boolean z12 = icon_type == 0;
                if (j12 != 0) {
                    j10 |= z12 ? 32L : 16L;
                }
                i10 = z12 ? 8 : 0;
            } else {
                i10 = 0;
                z10 = false;
                z11 = false;
                str = null;
                bVar = null;
                drawable = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 13) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = jVar != null ? jVar.f52506d : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    spannableString = observableField.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 14) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = jVar != null ? jVar.f52507e : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            j11 = 12;
        } else {
            j11 = 12;
            i10 = 0;
            z10 = false;
            z11 = false;
            vod_name = null;
            str = null;
            spannableString = null;
            str2 = null;
            bVar = null;
            drawable = null;
            vod_pic = null;
        }
        if ((j11 & j10) != 0) {
            a.a(this.f40707b, vod_pic, R.drawable.ic_video_default_smart_horiz);
            xl.a.b(this.f40711d, bVar, false);
            this.f40712e.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40712e, drawable);
            xl.a.a(this.f40713f, Boolean.valueOf(z11));
            xl.a.a(this.f40714g, Boolean.valueOf(z10));
            xl.a.a(this.f40715h, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40716i, vod_name);
            TextViewBindingAdapter.setText(this.f40717j, str);
        }
        if ((13 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40714g, spannableString);
        }
        if ((j10 & 14) != 0) {
            TextViewBindingAdapter.setText(this.f40715h, str2);
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
