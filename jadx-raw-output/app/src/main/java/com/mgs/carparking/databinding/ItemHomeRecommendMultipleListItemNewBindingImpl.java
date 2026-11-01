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
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import ea.c0;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemHomeRecommendMultipleListItemNewBindingImpl extends ItemHomeRecommendMultipleListItemNewBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40733o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40734p = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f40736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f40737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f40739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f40740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f40741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f40743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40744n;

    public ItemHomeRecommendMultipleListItemNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f40733o, f40734p));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40744n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40744n = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((c0) obj);
        return true;
    }

    public ItemHomeRecommendMultipleListItemNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[2], (RoundedImageView) objArr[1]);
        this.f40744n = -1L;
        this.f40730b.setTag(null);
        this.f40731c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40735e = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f40736f = textView;
        textView.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f40737g = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f40738h = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f40739i = view2;
        view2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[6];
        this.f40740j = imageView2;
        imageView2.setTag(null);
        View view3 = (View) objArr[7];
        this.f40741k = view3;
        view3.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f40742l = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.f40743m = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40744n |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40744n |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40744n |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40744n |= 1;
        }
        return true;
    }

    public void e(@Nullable c0 c0Var) {
        this.f40732d = c0Var;
        synchronized (this) {
            this.f40744n |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c A[PHI: r2
  0x004c: PHI (r2v4 long) = (r2v0 long), (r2v13 long) binds: [B:9:0x0020, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        long j11;
        String str;
        Drawable drawable;
        String str2;
        String vod_pic;
        b bVar;
        SpannableString spannableString;
        String str3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        String vod_name;
        int i14;
        long j12;
        RecommandVideosEntity recommandVideosEntity;
        int i15;
        int i16;
        int vod_is_update;
        int vod_is_cam;
        synchronized (this) {
            j10 = this.f40744n;
            this.f40744n = 0L;
        }
        c0 c0Var = this.f40732d;
        String str4 = null;
        if ((63 & j10) != 0) {
            long j13 = j10 & 49;
            if (j13 == 0) {
                i10 = 0;
            } else {
                ObservableField<Boolean> observableField = c0Var != null ? c0Var.f52482g : null;
                updateRegistration(0, observableField);
                boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField != null ? observableField.get() : null);
                if (j13 != 0) {
                    j10 |= zSafeUnbox ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                }
                if (zSafeUnbox) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            if ((j10 & 50) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField2 = c0Var != null ? c0Var.f52481f : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str2 = observableField2.get();
                } else {
                    str2 = null;
                }
            }
            long j14 = j10 & 48;
            if (j14 != 0) {
                if (c0Var != null) {
                    recommandVideosEntity = c0Var.f52477b;
                    bVar = c0Var.f52484i;
                    drawable = c0Var.f52479d;
                } else {
                    drawable = null;
                    recommandVideosEntity = null;
                    bVar = null;
                }
                if (recommandVideosEntity != null) {
                    vod_is_update = recommandVideosEntity.getVod_is_update();
                    int type_pid = recommandVideosEntity.getType_pid();
                    int icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_is_cam = recommandVideosEntity.getVod_is_cam();
                    vod_pic = recommandVideosEntity.getVod_pic();
                    i15 = type_pid;
                    i16 = icon_type;
                } else {
                    vod_pic = null;
                    vod_name = null;
                    i15 = 0;
                    i16 = 0;
                    vod_is_update = 0;
                    vod_is_cam = 0;
                }
                boolean z12 = vod_is_update == 0;
                z11 = i15 != 1;
                z10 = i15 == 1;
                boolean z13 = i16 == 0;
                boolean z14 = vod_is_cam == 0;
                if (j14 != 0) {
                    j10 |= z12 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z13 ? 128L : 64L;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z14 ? 512L : 256L;
                }
                i12 = z12 ? 8 : 0;
                i11 = z13 ? 8 : 0;
                i14 = z14 ? 8 : 0;
                j12 = 52;
            } else {
                drawable = null;
                vod_pic = null;
                bVar = null;
                vod_name = null;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i14 = 0;
                j12 = 52;
                z11 = false;
            }
            if ((j10 & j12) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField3 = c0Var != null ? c0Var.f52480e : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    spannableString = observableField3.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 56) != 0) {
                ObservableField<String> observableField4 = c0Var != null ? c0Var.f52483h : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str4 = observableField4.get();
                }
            }
            str3 = str4;
            i13 = i14;
            str = vod_name;
            j11 = 48;
        } else {
            j11 = 48;
            str = null;
            drawable = null;
            str2 = null;
            vod_pic = null;
            bVar = null;
            spannableString = null;
            str3 = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            z11 = false;
        }
        if ((j10 & j11) != 0) {
            this.f40730b.setVisibility(i12);
            a.a(this.f40731c, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40735e, bVar, false);
            TextViewBindingAdapter.setText(this.f40736f, str);
            this.f40738h.setVisibility(i13);
            xl.a.a(this.f40739i, Boolean.valueOf(z11));
            this.f40740j.setVisibility(i11);
            ImageViewBindingAdapter.setImageDrawable(this.f40740j, drawable);
            xl.a.a(this.f40741k, Boolean.valueOf(z11));
            xl.a.a(this.f40742l, Boolean.valueOf(z10));
            xl.a.a(this.f40743m, Boolean.valueOf(z11));
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40737g, str2);
        }
        if ((49 & j10) != 0) {
            this.f40737g.setVisibility(i10);
        }
        if ((52 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40742l, spannableString);
        }
        if ((j10 & 56) != 0) {
            TextViewBindingAdapter.setText(this.f40743m, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableField) obj, i11);
        }
        if (i10 == 1) {
            return a((ObservableField) obj, i11);
        }
        if (i10 == 2) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return c((ObservableField) obj, i11);
    }
}
