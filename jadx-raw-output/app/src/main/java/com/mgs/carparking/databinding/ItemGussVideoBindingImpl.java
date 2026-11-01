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
import w9.s1;
import wl.a;

/* JADX INFO: loaded from: classes9.dex */
public class ItemGussVideoBindingImpl extends ItemGussVideoBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40421k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40422l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f40424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f40425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40428j;

    public ItemGussVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f40421k, f40422l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40428j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40428j = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((s1) obj);
        return true;
    }

    public ItemGussVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1], (TextView) objArr[6]);
        this.f40428j = -1L;
        this.f40418b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40423e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40424f = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40425g = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40426h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40427i = textView2;
        textView2.setTag(null);
        this.f40419c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40428j |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40428j |= 2;
        }
        return true;
    }

    public void c(@Nullable s1 s1Var) {
        this.f40420d = s1Var;
        synchronized (this) {
            this.f40428j |= 4;
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
        Drawable drawable;
        b bVar;
        String vod_pic;
        String str;
        RecommandVideosEntity recommandVideosEntity;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.f40428j;
            this.f40428j = 0L;
        }
        s1 s1Var = this.f40420d;
        if ((15 & j10) != 0) {
            long j12 = j10 & 12;
            if (j12 != 0) {
                if (s1Var != null) {
                    recommandVideosEntity = s1Var.f73776b;
                    drawable = s1Var.f73777c;
                    bVar = s1Var.f73780f;
                } else {
                    drawable = null;
                    bVar = null;
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
                drawable = null;
                bVar = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 13) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = s1Var != null ? s1Var.f73778d : null;
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
                ObservableField<String> observableField2 = s1Var != null ? s1Var.f73779e : null;
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
            drawable = null;
            bVar = null;
            vod_pic = null;
            str = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40418b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40423e, bVar, false);
            this.f40424f.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40424f, drawable);
            xl.a.a(this.f40425g, Boolean.valueOf(z10));
            xl.a.a(this.f40427i, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40419c, vod_name);
        }
        if ((j10 & 13) != 0) {
            TextViewBindingAdapter.setText(this.f40426h, spannableString);
        }
        if ((j10 & 14) != 0) {
            TextViewBindingAdapter.setText(this.f40427i, str);
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
