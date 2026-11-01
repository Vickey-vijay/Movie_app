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
import ca.u0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeRecommendMultipleListItemNoTitleBindingImpl extends ItemHomeRecommendMultipleListItemNoTitleBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40747k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40748l = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f40750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f40751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f40752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40755j;

    public ItemHomeRecommendMultipleListItemNoTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f40747k, f40748l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40755j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40755j = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((u0) obj);
        return true;
    }

    public ItemHomeRecommendMultipleListItemNoTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1]);
        this.f40755j = -1L;
        this.f40745b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40749d = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40750e = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40751f = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40752g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40753h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40754i = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40755j |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40755j |= 2;
        }
        return true;
    }

    public void c(@Nullable u0 u0Var) {
        this.f40746c = u0Var;
        synchronized (this) {
            this.f40755j |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        boolean z11;
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
            j10 = this.f40755j;
            this.f40755j = 0L;
        }
        u0 u0Var = this.f40746c;
        if ((15 & j10) != 0) {
            long j12 = j10 & 12;
            if (j12 != 0) {
                if (u0Var != null) {
                    recommandVideosEntity = u0Var.f5790b;
                    bVar = u0Var.f5795g;
                    drawable = u0Var.f5792d;
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
                z11 = i11 != 1;
                z10 = i11 == 1;
                boolean z12 = i12 == 0;
                if (j12 != 0) {
                    j10 |= z12 ? 32L : 16L;
                }
                i10 = z12 ? 8 : 0;
            } else {
                i10 = 0;
                z10 = false;
                z11 = false;
                bVar = null;
                drawable = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 13) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = u0Var != null ? u0Var.f5793e : null;
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
                ObservableField<String> observableField2 = u0Var != null ? u0Var.f5794f : null;
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
            z11 = false;
            vod_name = null;
            spannableString = null;
            bVar = null;
            drawable = null;
            vod_pic = null;
            str = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40745b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40749d, bVar, false);
            this.f40750e.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40750e, drawable);
            xl.a.a(this.f40751f, Boolean.valueOf(z11));
            xl.a.a(this.f40752g, Boolean.valueOf(z10));
            xl.a.a(this.f40753h, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40754i, vod_name);
        }
        if ((j10 & 13) != 0) {
            TextViewBindingAdapter.setText(this.f40752g, spannableString);
        }
        if ((j10 & 14) != 0) {
            TextViewBindingAdapter.setText(this.f40753h, str);
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
