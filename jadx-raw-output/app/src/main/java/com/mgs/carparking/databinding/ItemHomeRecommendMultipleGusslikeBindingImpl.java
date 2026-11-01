package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
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
import com.mgs.carparking.widgets.OvalImageView;
import ea.l;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes10.dex */
public class ItemHomeRecommendMultipleGusslikeBindingImpl extends ItemHomeRecommendMultipleGusslikeBinding {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40646p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40647q = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f40650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final OvalImageView f40652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f40654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f40655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f40656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f40658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f40659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f40660o;

    public ItemHomeRecommendMultipleGusslikeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f40646p, f40647q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40660o != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40660o = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((l) obj);
        return true;
    }

    public ItemHomeRecommendMultipleGusslikeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4);
        this.f40660o = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40648c = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f40649d = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f40650e = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.f40651f = textView2;
        textView2.setTag(null);
        OvalImageView ovalImageView = (OvalImageView) objArr[2];
        this.f40652g = ovalImageView;
        ovalImageView.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f40653h = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.f40654i = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.f40655j = imageView3;
        imageView3.setTag(null);
        View view2 = (View) objArr[6];
        this.f40656k = view2;
        view2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.f40657l = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[8];
        this.f40658m = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[9];
        this.f40659n = textView5;
        textView5.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40660o |= 4;
        }
        return true;
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40660o |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40660o |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40660o |= 1;
        }
        return true;
    }

    public void e(@Nullable l lVar) {
        this.f40645b = lVar;
        synchronized (this) {
            this.f40660o |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        String str;
        String str2;
        b bVar;
        Boolean bool;
        SpannableString spannableString;
        String vod_pic;
        Drawable drawable;
        SpannableString spannableString2;
        String str3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        String remarks;
        String vod_name;
        int i13;
        SpannableString spannableString3;
        RecommandVideosEntity recommandVideosEntity;
        int i14;
        int vod_is_update;
        int icon_type;
        int vod_is_cam;
        synchronized (this) {
            j10 = this.f40660o;
            this.f40660o = 0L;
        }
        l lVar = this.f40645b;
        String str4 = null;
        if ((63 & j10) != 0) {
            long j12 = j10 & 48;
            if (j12 != 0) {
                if (lVar != null) {
                    recommandVideosEntity = lVar.f52518c;
                    drawable = lVar.f52523h;
                    bVar = lVar.f52524i;
                } else {
                    bVar = null;
                    recommandVideosEntity = null;
                    drawable = null;
                }
                if (recommandVideosEntity != null) {
                    vod_is_update = recommandVideosEntity.getVod_is_update();
                    int type_pid = recommandVideosEntity.getType_pid();
                    remarks = recommandVideosEntity.getRemarks();
                    icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_is_cam = recommandVideosEntity.getVod_is_cam();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    i14 = type_pid;
                } else {
                    vod_pic = null;
                    remarks = null;
                    vod_name = null;
                    i14 = 0;
                    vod_is_update = 0;
                    icon_type = 0;
                    vod_is_cam = 0;
                }
                boolean z12 = vod_is_update == 0;
                z11 = i14 != 1;
                z10 = i14 == 1;
                boolean z13 = icon_type == 0;
                boolean z14 = vod_is_cam == 0;
                if (j12 != 0) {
                    j10 |= z12 ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z13 ? 128L : 64L;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z14 ? 512L : 256L;
                }
                i10 = 8;
                i11 = z12 ? 8 : 0;
                i13 = z13 ? 8 : 0;
                if (!z14) {
                    i10 = 0;
                }
            } else {
                bVar = null;
                vod_pic = null;
                drawable = null;
                remarks = null;
                vod_name = null;
                i10 = 0;
                z10 = false;
                i11 = 0;
                i13 = 0;
                z11 = false;
            }
            if ((j10 & 49) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField = lVar != null ? lVar.f52522g : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool = observableField.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 50) == 0) {
                spannableString3 = null;
            } else {
                ObservableField<SpannableString> observableField2 = lVar != null ? lVar.f52520e : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    spannableString3 = observableField2.get();
                } else {
                    spannableString3 = null;
                }
            }
            if ((j10 & 52) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField3 = lVar != null ? lVar.f52519d : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    spannableString = observableField3.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 56) != 0) {
                ObservableField<String> observableField4 = lVar != null ? lVar.f52521f : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str4 = observableField4.get();
                }
            }
            spannableString2 = spannableString3;
            str3 = str4;
            str = remarks;
            i12 = i13;
            str2 = vod_name;
            j11 = 48;
        } else {
            j11 = 48;
            str = null;
            str2 = null;
            bVar = null;
            bool = null;
            spannableString = null;
            vod_pic = null;
            drawable = null;
            spannableString2 = null;
            str3 = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            z11 = false;
        }
        if ((j10 & j11) != 0) {
            a.b(this.f40649d, bVar, false);
            TextViewBindingAdapter.setText(this.f40651f, str);
            wl.a.a(this.f40652g, vod_pic, R.drawable.ic_default_varical);
            this.f40653h.setVisibility(i12);
            ImageViewBindingAdapter.setImageDrawable(this.f40653h, drawable);
            this.f40654i.setVisibility(i11);
            this.f40655j.setVisibility(i10);
            a.a(this.f40656k, Boolean.valueOf(z11));
            a.a(this.f40657l, Boolean.valueOf(z10));
            a.a(this.f40658m, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40659n, str2);
        }
        if ((52 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40650e, spannableString);
        }
        if ((49 & j10) != 0) {
            a.a(this.f40651f, bool);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40657l, spannableString2);
        }
        if ((j10 & 56) != 0) {
            TextViewBindingAdapter.setText(this.f40658m, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return b((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return a((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }
}
