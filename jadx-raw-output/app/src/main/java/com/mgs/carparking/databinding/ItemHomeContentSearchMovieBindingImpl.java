package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
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
import com.ruffian.library.widget.RTextView;
import ul.b;
import w9.m2;
import wl.a;

/* JADX INFO: loaded from: classes2.dex */
public class ItemHomeContentSearchMovieBindingImpl extends ItemHomeContentSearchMovieBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40575s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40576t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RTextView f40579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f40580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final View f40581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f40582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40583r;

    public ItemHomeContentSearchMovieBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f40575s, f40576t));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40583r != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40583r = 1024L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        j((m2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40576t = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 14);
    }

    public ItemHomeContentSearchMovieBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (RoundedImageView) objArr[2], (RelativeLayout) objArr[14], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[13], (TextView) objArr[8], (TextView) objArr[9]);
        this.f40583r = -1L;
        this.f40565b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40577l = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f40578m = linearLayout2;
        linearLayout2.setTag(null);
        RTextView rTextView = (RTextView) objArr[3];
        this.f40579n = rTextView;
        rTextView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f40580o = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[5];
        this.f40581p = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f40582q = textView;
        textView.setTag(null);
        this.f40567d.setTag(null);
        this.f40568e.setTag(null);
        this.f40569f.setTag(null);
        this.f40570g.setTag(null);
        this.f40571h.setTag(null);
        this.f40572i.setTag(null);
        this.f40573j.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 32;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 128;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 16;
        }
        return true;
    }

    public final boolean e(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 256;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        boolean z10;
        int i11;
        String str;
        SpannableString spannableString;
        String str2;
        SpannableString spannableString2;
        SpannableString spannableString3;
        SpannableString spannableString4;
        String str3;
        Drawable drawable;
        b bVar;
        String str4;
        String str5;
        boolean z11;
        String str6;
        ObservableField<SpannableString> observableField;
        ObservableField<String> observableField2;
        RecommandVideosEntity recommandVideosEntity;
        int i12;
        int icon_type;
        synchronized (this) {
            j10 = this.f40583r;
            this.f40583r = 0L;
        }
        m2 m2Var = this.f40574k;
        if ((2047 & j10) != 0) {
            if ((j10 & 1537) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableField3 = m2Var != null ? m2Var.f73692f : null;
                updateRegistration(0, observableField3);
                if (observableField3 != null) {
                    str4 = observableField3.get();
                } else {
                    str4 = null;
                }
            }
            if ((j10 & 1538) == 0) {
                str5 = null;
            } else {
                ObservableField<String> observableField4 = m2Var != null ? m2Var.f73694h : null;
                updateRegistration(1, observableField4);
                if (observableField4 != null) {
                    str5 = observableField4.get();
                } else {
                    str5 = null;
                }
            }
            if ((j10 & 1540) == 0) {
                spannableString2 = null;
            } else {
                ObservableField<SpannableString> observableField5 = m2Var != null ? m2Var.f73698l : null;
                updateRegistration(2, observableField5);
                if (observableField5 != null) {
                    spannableString2 = observableField5.get();
                } else {
                    spannableString2 = null;
                }
            }
            if ((j10 & 1544) == 0) {
                spannableString3 = null;
            } else {
                ObservableField<SpannableString> observableField6 = m2Var != null ? m2Var.f73696j : null;
                updateRegistration(3, observableField6);
                if (observableField6 != null) {
                    spannableString3 = observableField6.get();
                } else {
                    spannableString3 = null;
                }
            }
            if ((j10 & 1552) == 0) {
                spannableString4 = null;
            } else {
                ObservableField<SpannableString> observableField7 = m2Var != null ? m2Var.f73693g : null;
                updateRegistration(4, observableField7);
                if (observableField7 != null) {
                    spannableString4 = observableField7.get();
                } else {
                    spannableString4 = null;
                }
            }
            long j11 = j10 & 1536;
            if (j11 != 0) {
                if (m2Var != null) {
                    drawable = m2Var.f73697k;
                    bVar = m2Var.f73701o;
                    recommandVideosEntity = m2Var.f73690d;
                } else {
                    drawable = null;
                    bVar = null;
                    recommandVideosEntity = null;
                }
                if (recommandVideosEntity != null) {
                    int type_pid = recommandVideosEntity.getType_pid();
                    String vod_pic = recommandVideosEntity.getVod_pic();
                    icon_type = recommandVideosEntity.getIcon_type();
                    i12 = type_pid;
                    str6 = vod_pic;
                } else {
                    i12 = 0;
                    str6 = null;
                    icon_type = 0;
                }
                z11 = i12 != 1;
                boolean z12 = icon_type == 0;
                if (j11 != 0) {
                    j10 |= z12 ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                }
                i11 = z12 ? 8 : 0;
            } else {
                z11 = false;
                str6 = null;
                i11 = 0;
                drawable = null;
                bVar = null;
            }
            if ((j10 & 1568) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField8 = m2Var != null ? m2Var.f73695i : null;
                updateRegistration(5, observableField8);
                if (observableField8 != null) {
                    str3 = observableField8.get();
                } else {
                    str3 = null;
                }
            }
            long j12 = j10 & 1600;
            z10 = z11;
            if (j12 != 0) {
                ObservableField<Boolean> observableField9 = m2Var != null ? m2Var.f73700n : null;
                updateRegistration(6, observableField9);
                boolean zSafeUnbox = ViewDataBinding.safeUnbox(observableField9 != null ? observableField9.get() : null);
                if (j12 != 0) {
                    j10 |= zSafeUnbox ? 16384L : PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                }
                if (!zSafeUnbox) {
                    i10 = 8;
                }
                if ((j10 & 1664) == 0) {
                    str = null;
                } else {
                    if (m2Var != null) {
                        observableField2 = m2Var.f73699m;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(7, observableField2);
                    if (observableField2 != null) {
                        str = observableField2.get();
                    } else {
                        str = null;
                    }
                }
                if ((j10 & 1792) == 0) {
                    spannableString = null;
                } else {
                    if (m2Var != null) {
                        observableField = m2Var.f73691e;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(8, observableField);
                    if (observableField != null) {
                        spannableString = observableField.get();
                    } else {
                        spannableString = null;
                    }
                }
                str2 = str6;
            } else {
                str6 = str6;
            }
            i10 = 0;
            if ((j10 & 1664) == 0) {
                str = null;
            } else {
                if (m2Var != null) {
                    observableField2 = m2Var.f73699m;
                } else {
                    observableField2 = null;
                }
                updateRegistration(7, observableField2);
                if (observableField2 != null) {
                    str = observableField2.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 1792) == 0) {
                spannableString = null;
            } else {
                if (m2Var != null) {
                    observableField = m2Var.f73691e;
                } else {
                    observableField = null;
                }
                updateRegistration(8, observableField);
                if (observableField != null) {
                    spannableString = observableField.get();
                } else {
                    spannableString = null;
                }
            }
            str2 = str6;
        } else {
            i10 = 0;
            z10 = false;
            i11 = 0;
            str = null;
            spannableString = null;
            str2 = null;
            spannableString2 = null;
            spannableString3 = null;
            spannableString4 = null;
            str3 = null;
            drawable = null;
            bVar = null;
            str4 = null;
            str5 = null;
        }
        if ((j10 & 1536) != 0) {
            a.a(this.f40565b, str2, R.drawable.ic_video_default);
            xl.a.b(this.f40578m, bVar, false);
            this.f40580o.setVisibility(i11);
            ImageViewBindingAdapter.setImageDrawable(this.f40580o, drawable);
            xl.a.a(this.f40581p, Boolean.valueOf(z10));
            xl.a.b(this.f40571h, bVar, false);
        }
        if ((j10 & 1664) != 0) {
            TextViewBindingAdapter.setText(this.f40579n, str);
        }
        if ((j10 & 1600) != 0) {
            this.f40579n.setVisibility(i10);
        }
        if ((1540 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40582q, spannableString2);
        }
        if ((1544 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40567d, spannableString3);
        }
        if ((1568 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40568e, str3);
        }
        if ((1552 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40569f, spannableString4);
        }
        if ((1792 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40570g, spannableString);
        }
        if ((j10 & 1537) != 0) {
            TextViewBindingAdapter.setText(this.f40572i, str4);
        }
        if ((j10 & 1538) != 0) {
            TextViewBindingAdapter.setText(this.f40573j, str5);
        }
    }

    public final boolean f(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 4;
        }
        return true;
    }

    public final boolean g(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 64;
        }
        return true;
    }

    public final boolean h(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 1;
        }
        return true;
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40583r |= 2;
        }
        return true;
    }

    public void j(@Nullable m2 m2Var) {
        this.f40574k = m2Var;
        synchronized (this) {
            this.f40583r |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return h((ObservableField) obj, i11);
            case 1:
                return i((ObservableField) obj, i11);
            case 2:
                return f((ObservableField) obj, i11);
            case 3:
                return a((ObservableField) obj, i11);
            case 4:
                return d((ObservableField) obj, i11);
            case 5:
                return b((ObservableField) obj, i11);
            case 6:
                return g((ObservableField) obj, i11);
            case 7:
                return c((ObservableField) obj, i11);
            case 8:
                return e((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
