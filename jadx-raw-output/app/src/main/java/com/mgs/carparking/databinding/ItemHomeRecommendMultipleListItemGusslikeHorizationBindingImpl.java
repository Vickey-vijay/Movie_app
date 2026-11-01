package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import ea.y;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl extends ItemHomeRecommendMultipleListItemGusslikeHorizationBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40696n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40697o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f40699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f40702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40706m;

    public ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f40696n, f40697o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40706m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40706m = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        d((y) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40697o = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 9);
    }

    public ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (RoundedImageView) objArr[3], (RelativeLayout) objArr[9]);
        this.f40706m = -1L;
        this.f40693b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40698e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f40699f = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.f40700g = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.f40701h = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[5];
        this.f40702i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f40703j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.f40704k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f40705l = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40706m |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40706m |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40706m |= 4;
        }
        return true;
    }

    public void d(@Nullable y yVar) {
        this.f40695d = yVar;
        synchronized (this) {
            this.f40706m |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        String vod_name;
        b bVar;
        Drawable drawable;
        Boolean bool;
        SpannableString spannableString;
        String str;
        String vod_pic;
        RecommandVideosEntity recommandVideosEntity;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.f40706m;
            this.f40706m = 0L;
        }
        y yVar = this.f40695d;
        if ((31 & j10) != 0) {
            long j12 = j10 & 24;
            if (j12 != 0) {
                if (yVar != null) {
                    recommandVideosEntity = yVar.f52560b;
                    bVar = yVar.f52566h;
                    drawable = yVar.f52562d;
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
                boolean z13 = i12 == 0;
                if (j12 != 0) {
                    j10 |= z13 ? 64L : 32L;
                }
                i10 = z13 ? 8 : 0;
            } else {
                i10 = 0;
                z10 = false;
                z11 = false;
                bVar = null;
                drawable = null;
                vod_pic = null;
                vod_name = null;
            }
            if ((j10 & 25) != 0) {
                ObservableField<Boolean> observableField = yVar != null ? yVar.f52565g : null;
                updateRegistration(0, observableField);
                bool = observableField != null ? observableField.get() : null;
                z12 = !ViewDataBinding.safeUnbox(bool);
            } else {
                z12 = false;
                bool = null;
            }
            if ((j10 & 26) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField2 = yVar != null ? yVar.f52563e : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    spannableString = observableField2.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 28) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField3 = yVar != null ? yVar.f52564f : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    str = observableField3.get();
                } else {
                    str = null;
                }
            }
            j11 = 24;
        } else {
            j11 = 24;
            i10 = 0;
            z10 = false;
            z11 = false;
            z12 = false;
            vod_name = null;
            bVar = null;
            drawable = null;
            bool = null;
            spannableString = null;
            str = null;
            vod_pic = null;
        }
        if ((j10 & j11) != 0) {
            a.a(this.f40693b, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40698e, bVar, false);
            this.f40701h.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40701h, drawable);
            xl.a.a(this.f40702i, Boolean.valueOf(z11));
            xl.a.a(this.f40703j, Boolean.valueOf(z10));
            xl.a.a(this.f40704k, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40705l, vod_name);
        }
        if ((25 & j10) != 0) {
            xl.a.a(this.f40699f, bool);
            xl.a.a(this.f40700g, Boolean.valueOf(z12));
        }
        if ((26 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40703j, spannableString);
        }
        if ((j10 & 28) != 0) {
            TextViewBindingAdapter.setText(this.f40704k, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return a((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }
}
