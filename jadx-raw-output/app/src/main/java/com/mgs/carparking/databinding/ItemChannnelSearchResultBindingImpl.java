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
import w9.p0;
import wl.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemChannnelSearchResultBindingImpl extends ItemChannnelSearchResultBinding {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40325k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40326l = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f40328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f40329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40332j;

    public ItemChannnelSearchResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f40325k, f40326l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40332j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40332j = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((p0) obj);
        return true;
    }

    public ItemChannnelSearchResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundedImageView) objArr[1], (TextView) objArr[6]);
        this.f40332j = -1L;
        this.f40322b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40327e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40328f = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40329g = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40330h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40331i = textView2;
        textView2.setTag(null);
        this.f40323c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40332j |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40332j |= 2;
        }
        return true;
    }

    public void c(@Nullable p0 p0Var) {
        this.f40324d = p0Var;
        synchronized (this) {
            this.f40332j |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        boolean z11;
        SpannableString spannableString;
        String str;
        Drawable drawable;
        b bVar;
        String vod_pic;
        String str2;
        RecommandVideosEntity recommandVideosEntity;
        int i11;
        int topType;
        synchronized (this) {
            j10 = this.f40332j;
            this.f40332j = 0L;
        }
        p0 p0Var = this.f40324d;
        if ((15 & j10) != 0) {
            long j12 = j10 & 12;
            if (j12 != 0) {
                if (p0Var != null) {
                    recommandVideosEntity = p0Var.f73726b;
                    drawable = p0Var.f73727c;
                    bVar = p0Var.f73730f;
                } else {
                    drawable = null;
                    bVar = null;
                    recommandVideosEntity = null;
                }
                if (recommandVideosEntity != null) {
                    vod_pic = recommandVideosEntity.getVod_pic();
                    int type_pid = recommandVideosEntity.getType_pid();
                    String vod_name = recommandVideosEntity.getVod_name();
                    topType = recommandVideosEntity.getTopType();
                    i11 = type_pid;
                    str = vod_name;
                } else {
                    i11 = 0;
                    topType = 0;
                    str = null;
                    vod_pic = null;
                }
                z11 = i11 != 1;
                z10 = i11 == 1;
                boolean z12 = topType == 0;
                if (j12 != 0) {
                    j10 |= z12 ? 32L : 16L;
                }
                i10 = z12 ? 8 : 0;
            } else {
                i10 = 0;
                z10 = false;
                z11 = false;
                str = null;
                drawable = null;
                bVar = null;
                vod_pic = null;
            }
            if ((j10 & 13) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField = p0Var != null ? p0Var.f73728d : null;
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
                ObservableField<String> observableField2 = p0Var != null ? p0Var.f73729e : null;
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
            spannableString = null;
            str = null;
            drawable = null;
            bVar = null;
            vod_pic = null;
            str2 = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40322b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40327e, bVar, false);
            this.f40328f.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40328f, drawable);
            xl.a.a(this.f40329g, Boolean.valueOf(z11));
            xl.a.a(this.f40330h, Boolean.valueOf(z10));
            xl.a.a(this.f40331i, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40323c, str);
        }
        if ((j10 & 13) != 0) {
            TextViewBindingAdapter.setText(this.f40330h, spannableString);
        }
        if ((j10 & 14) != 0) {
            TextViewBindingAdapter.setText(this.f40331i, str2);
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
