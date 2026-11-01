package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
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
import ul.b;
import w9.w2;
import wl.a;

/* JADX INFO: loaded from: classes7.dex */
public class ItemSpecialDetailNewItemResultBindingImpl extends ItemSpecialDetailNewItemResultBinding {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40903q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40904r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f40906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f40907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f40910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f40911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f40912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f40913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f40914p;

    public ItemSpecialDetailNewItemResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f40903q, f40904r));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40914p != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40914p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        h((w2) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40904r = sparseIntArray;
        sparseIntArray.put(R.id.rl_left, 12);
    }

    public ItemSpecialDetailNewItemResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (RoundedImageView) objArr[1], (RelativeLayout) objArr[12], (TextView) objArr[10], (TextView) objArr[11]);
        this.f40914p = -1L;
        this.f40898b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40905g = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f40906h = imageView;
        imageView.setTag(null);
        View view2 = (View) objArr[3];
        this.f40907i = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40908j = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f40909k = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f40910l = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[7];
        this.f40911m = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[8];
        this.f40912n = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[9];
        this.f40913o = textView6;
        textView6.setTag(null);
        this.f40900d.setTag(null);
        this.f40901e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 8;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 64;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 16;
        }
        return true;
    }

    public final boolean d(ObservableField<SpannableString> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 4;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 32;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x013a  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String vod_name;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Drawable drawable;
        boolean z10;
        SpannableString spannableString;
        int i10;
        b bVar;
        boolean z11;
        String vod_pic;
        String str8;
        RecommandVideosEntity recommandVideosEntity;
        int type_pid;
        int icon_type;
        synchronized (this) {
            j10 = this.f40914p;
            this.f40914p = 0L;
        }
        w2 w2Var = this.f40902f;
        if ((511 & j10) != 0) {
            if ((j10 & 385) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField = w2Var != null ? w2Var.f73843i : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    str3 = observableField.get();
                } else {
                    str3 = null;
                }
            }
            long j11 = j10 & 384;
            if (j11 != 0) {
                if (w2Var != null) {
                    recommandVideosEntity = w2Var.f73836b;
                    bVar = w2Var.f73845k;
                    drawable = w2Var.f73837c;
                } else {
                    recommandVideosEntity = null;
                    drawable = null;
                    bVar = null;
                }
                if (recommandVideosEntity != null) {
                    type_pid = recommandVideosEntity.getType_pid();
                    icon_type = recommandVideosEntity.getIcon_type();
                    vod_name = recommandVideosEntity.getVod_name();
                    vod_pic = recommandVideosEntity.getVod_pic();
                } else {
                    vod_pic = null;
                    type_pid = 0;
                    icon_type = 0;
                    vod_name = null;
                }
                z11 = type_pid != 1;
                z10 = type_pid == 1;
                boolean z12 = icon_type == 0;
                if (j11 != 0) {
                    j10 |= z12 ? 1024L : 512L;
                }
                i10 = z12 ? 8 : 0;
            } else {
                vod_pic = null;
                drawable = null;
                z10 = false;
                bVar = null;
                i10 = 0;
                vod_name = null;
                z11 = false;
            }
            if ((j10 & 386) == 0) {
                str8 = null;
            } else {
                ObservableField<String> observableField2 = w2Var != null ? w2Var.f73842h : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str8 = observableField2.get();
                } else {
                    str8 = null;
                }
            }
            if ((j10 & 388) == 0) {
                spannableString = null;
            } else {
                ObservableField<SpannableString> observableField3 = w2Var != null ? w2Var.f73838d : null;
                updateRegistration(2, observableField3);
                if (observableField3 != null) {
                    spannableString = observableField3.get();
                } else {
                    spannableString = null;
                }
            }
            if ((j10 & 392) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField4 = w2Var != null ? w2Var.f73840f : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str6 = observableField4.get();
                } else {
                    str6 = null;
                }
            }
            if ((j10 & 400) == 0) {
                str7 = null;
            } else {
                ObservableField<String> observableField5 = w2Var != null ? w2Var.f73839e : null;
                updateRegistration(4, observableField5);
                if (observableField5 != null) {
                    str7 = observableField5.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 416) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField6 = w2Var != null ? w2Var.f73844j : null;
                updateRegistration(5, observableField6);
                if (observableField6 != null) {
                    str = observableField6.get();
                } else {
                    str = null;
                }
            }
            if ((j10 & 448) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableField7 = w2Var != null ? w2Var.f73841g : null;
                updateRegistration(6, observableField7);
                if (observableField7 != null) {
                    str2 = observableField7.get();
                } else {
                    str2 = null;
                }
            }
            String str9 = str8;
            str5 = vod_pic;
            str4 = str9;
        } else {
            vod_name = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            drawable = null;
            z10 = false;
            spannableString = null;
            i10 = 0;
            bVar = null;
            z11 = false;
        }
        if ((j10 & 384) != 0) {
            a.a(this.f40898b, str5, R.drawable.ic_video_default);
            xl.a.b(this.f40905g, bVar, false);
            this.f40906h.setVisibility(i10);
            ImageViewBindingAdapter.setImageDrawable(this.f40906h, drawable);
            xl.a.a(this.f40907i, Boolean.valueOf(z11));
            xl.a.a(this.f40908j, Boolean.valueOf(z10));
            xl.a.a(this.f40909k, Boolean.valueOf(z11));
            TextViewBindingAdapter.setText(this.f40910l, vod_name);
        }
        if ((j10 & 388) != 0) {
            TextViewBindingAdapter.setText(this.f40908j, spannableString);
        }
        if ((416 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40909k, str);
        }
        if ((400 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40911m, str7);
        }
        if ((392 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40912n, str6);
        }
        if ((j10 & 385) != 0) {
            TextViewBindingAdapter.setText(this.f40913o, str3);
        }
        if ((448 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40900d, str2);
        }
        if ((j10 & 386) != 0) {
            TextViewBindingAdapter.setText(this.f40901e, str4);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 1;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40914p |= 2;
        }
        return true;
    }

    public void h(@Nullable w2 w2Var) {
        this.f40902f = w2Var;
        synchronized (this) {
            this.f40914p |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return f((ObservableField) obj, i11);
            case 1:
                return g((ObservableField) obj, i11);
            case 2:
                return d((ObservableField) obj, i11);
            case 3:
                return a((ObservableField) obj, i11);
            case 4:
                return c((ObservableField) obj, i11);
            case 5:
                return e((ObservableField) obj, i11);
            case 6:
                return b((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
