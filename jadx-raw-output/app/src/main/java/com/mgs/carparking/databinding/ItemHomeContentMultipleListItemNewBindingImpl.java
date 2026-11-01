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
import ca.s0;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import com.ruffian.library.widget.RTextView;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes11.dex */
public class ItemHomeContentMultipleListItemNewBindingImpl extends ItemHomeContentMultipleListItemNewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40502n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40503o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f40505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f40506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f40508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40512m;

    public ItemHomeContentMultipleListItemNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f40502n, f40503o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40512m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40512m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        e((s0) obj);
        return true;
    }

    public ItemHomeContentMultipleListItemNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[3], (RoundedImageView) objArr[1]);
        this.f40512m = -1L;
        this.f40499b.setTag(null);
        this.f40500c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40504e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40505f = imageView;
        imageView.setTag(null);
        RTextView rTextView = (RTextView) objArr[4];
        this.f40506g = rTextView;
        rTextView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.f40507h = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[6];
        this.f40508i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f40509j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.f40510k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.f40511l = textView3;
        textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40512m |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40512m |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40512m |= 8;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40512m |= 1;
        }
        return true;
    }

    public void e(@Nullable s0 s0Var) {
        this.f40501d = s0Var;
        synchronized (this) {
            this.f40512m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c A[PHI: r2
  0x004c: PHI (r2v4 long) = (r2v0 long), (r2v14 long) binds: [B:9:0x0020, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
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
        String vod_name;
        ObservableField<String> observableField;
        ObservableField<SpannableString> observableField2;
        RecommandVideosEntity recommandVideosEntity;
        int i14;
        int i15;
        int vod_is_update;
        int vod_is_cam;
        synchronized (this) {
            j10 = this.f40512m;
            this.f40512m = 0L;
        }
        s0 s0Var = this.f40501d;
        String str4 = null;
        if ((63 & j10) != 0) {
            long j12 = j10 & 49;
            if (j12 == 0) {
                i10 = 0;
            } else {
                ObservableField<Boolean> observableField3 = s0Var != null ? s0Var.f5784g : null;
                updateRegistration(0, observableField3);
                boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField3 != null ? observableField3.get() : null);
                if (j12 != 0) {
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
                ObservableField<String> observableField4 = s0Var != null ? s0Var.f5783f : null;
                updateRegistration(1, observableField4);
                if (observableField4 != null) {
                    str2 = observableField4.get();
                } else {
                    str2 = null;
                }
            }
            long j13 = j10 & 48;
            if (j13 != 0) {
                if (s0Var != null) {
                    recommandVideosEntity = s0Var.f5779b;
                    bVar = s0Var.f5786i;
                    drawable = s0Var.f5781d;
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
                    i14 = type_pid;
                    i15 = icon_type;
                } else {
                    vod_pic = null;
                    vod_name = null;
                    i14 = 0;
                    i15 = 0;
                    vod_is_update = 0;
                    vod_is_cam = 0;
                }
                boolean z11 = vod_is_update == 0;
                z10 = i14 != 1;
                boolean z12 = i15 == 0;
                boolean z13 = vod_is_cam == 0;
                if (j13 != 0) {
                    j10 |= z11 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z12 ? 128L : 64L;
                }
                if ((j10 & 48) != 0) {
                    j10 |= z13 ? 512L : 256L;
                }
                i12 = z11 ? 8 : 0;
                i11 = z12 ? 8 : 0;
                int i16 = z13 ? 8 : 0;
                if ((j10 & 52) == 0) {
                    spannableString = null;
                } else {
                    if (s0Var != null) {
                        observableField2 = s0Var.f5782e;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(2, observableField2);
                    if (observableField2 != null) {
                        spannableString = observableField2.get();
                    } else {
                        spannableString = null;
                    }
                }
                if ((j10 & 56) != 0) {
                    if (s0Var != null) {
                        observableField = s0Var.f5785h;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(3, observableField);
                    if (observableField != null) {
                        str4 = observableField.get();
                    }
                }
                str3 = str4;
                i13 = i16;
                str = vod_name;
                j11 = 48;
            } else {
                drawable = null;
                vod_pic = null;
                bVar = null;
                vod_name = null;
                z10 = false;
                i11 = 0;
                i12 = 0;
            }
            if ((j10 & 52) == 0) {
                spannableString = null;
            } else {
                if (s0Var != null) {
                    observableField2 = s0Var.f5782e;
                } else {
                    observableField2 = null;
                }
                updateRegistration(2, observableField2);
                if (observableField2 != null) {
                    spannableString = observableField2.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 56) != 0) {
                if (s0Var != null) {
                    observableField = s0Var.f5785h;
                } else {
                    observableField = null;
                }
                updateRegistration(3, observableField);
                if (observableField != null) {
                    str4 = observableField.get();
                }
            }
            str3 = str4;
            i13 = i16;
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
        }
        if ((j10 & j11) != 0) {
            this.f40499b.setVisibility(i12);
            a.a(this.f40500c, vod_pic, R.drawable.ic_video_default);
            xl.a.b(this.f40504e, bVar, false);
            this.f40505f.setVisibility(i11);
            ImageViewBindingAdapter.setImageDrawable(this.f40505f, drawable);
            this.f40507h.setVisibility(i13);
            xl.a.a(this.f40508i, Boolean.valueOf(z10));
            xl.a.a(this.f40510k, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.f40511l, str);
        }
        if ((50 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40506g, str2);
        }
        if ((49 & j10) != 0) {
            this.f40506g.setVisibility(i10);
        }
        if ((52 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40509j, spannableString);
        }
        if ((j10 & 56) != 0) {
            TextViewBindingAdapter.setText(this.f40510k, str3);
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
