package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
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
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.green.hand.library.widget.EmojiTextview;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.rv.ChildRecycleView;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.u0;
import w9.y0;
import wl.a;

/* JADX INFO: loaded from: classes9.dex */
public class ItemVideoCommitListBindingImpl extends ItemVideoCommitListBinding {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40933s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40934t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ChildRecycleView f40938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f40939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f40940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f40942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final EmojiTextview f40943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40944r;

    public ItemVideoCommitListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f40933s, f40934t));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40944r != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40944r = 1024L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        j((y0) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40934t = sparseIntArray;
        sparseIntArray.put(R.id.rl_filter, 13);
        sparseIntArray.put(R.id.iv_filter, 14);
    }

    public ItemVideoCommitListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (ImageView) objArr[14], (CircularImageView) objArr[1], (LinearLayout) objArr[4], (RelativeLayout) objArr[13], (TextView) objArr[6], (TextView) objArr[2]);
        this.f40944r = -1L;
        this.f40927c.setTag(null);
        this.f40928d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40935i = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f40936j = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[11];
        this.f40937k = relativeLayout;
        relativeLayout.setTag(null);
        ChildRecycleView childRecycleView = (ChildRecycleView) objArr[12];
        this.f40938l = childRecycleView;
        childRecycleView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.f40939m = textView2;
        textView2.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.f40940n = imageView;
        imageView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[7];
        this.f40941o = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.f40942p = textView3;
        textView3.setTag(null);
        EmojiTextview emojiTextview = (EmojiTextview) objArr[9];
        this.f40943q = emojiTextview;
        emojiTextview.setTag(null);
        this.f40930f.setTag(null);
        this.f40931g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 128;
        }
        return true;
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 256;
        }
        return true;
    }

    public final boolean c(ObservableList<u0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0131  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Drawable drawable;
        SpannableStringBuilder spannableStringBuilder;
        Boolean bool;
        b bVar;
        String str;
        String str2;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        b bVar2;
        c<u0> cVar;
        ObservableList observableList;
        SpannableStringBuilder spannableStringBuilder2;
        ObservableField<String> observableField;
        synchronized (this) {
            j10 = this.f40944r;
            this.f40944r = 0L;
        }
        y0 y0Var = this.f40932h;
        if ((2047 & j10) != 0) {
            if ((j10 & 1536) == 0 || y0Var == null) {
                bVar = null;
                drawable = null;
                bVar2 = null;
            } else {
                bVar = y0Var.f73877u;
                drawable = y0Var.f73875s;
                bVar2 = y0Var.f73876t;
            }
            if ((j10 & 1537) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField2 = y0Var != null ? y0Var.f73865i : null;
                updateRegistration(0, observableField2);
                if (observableField2 != null) {
                    str3 = observableField2.get();
                } else {
                    str3 = null;
                }
            }
            if ((j10 & 1540) != 0) {
                if (y0Var != null) {
                    cVar = y0Var.f73863g;
                    observableList = y0Var.f73862f;
                } else {
                    observableList = null;
                    cVar = null;
                }
                updateRegistration(2, observableList);
            } else {
                observableList = null;
                cVar = null;
            }
            if ((j10 & 1538) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField3 = y0Var != null ? y0Var.f73871o : null;
                updateRegistration(1, observableField3);
                if (observableField3 != null) {
                    bool2 = observableField3.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 1544) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableField4 = y0Var != null ? y0Var.f73868l : null;
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str4 = observableField4.get();
                } else {
                    str4 = null;
                }
            }
            if ((j10 & 1552) == 0) {
                str5 = null;
            } else {
                ObservableField<String> observableField5 = y0Var != null ? y0Var.f73867k : null;
                updateRegistration(4, observableField5);
                if (observableField5 != null) {
                    str5 = observableField5.get();
                } else {
                    str5 = null;
                }
            }
            if ((j10 & 1568) == 0) {
                spannableStringBuilder2 = null;
            } else {
                ObservableField<SpannableStringBuilder> observableField6 = y0Var != null ? y0Var.f73873q : null;
                updateRegistration(5, observableField6);
                if (observableField6 != null) {
                    spannableStringBuilder2 = observableField6.get();
                } else {
                    spannableStringBuilder2 = null;
                }
            }
            if ((j10 & 1600) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField7 = y0Var != null ? y0Var.f73872p : null;
                updateRegistration(6, observableField7);
                if (observableField7 != null) {
                    bool = observableField7.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 1664) != 0) {
                ObservableField<String> observableField8 = y0Var != null ? y0Var.f73866j : null;
                updateRegistration(7, observableField8);
                String str6 = observableField8 != null ? observableField8.get() : null;
                if ((j10 & 1792) == 0) {
                    str = null;
                } else {
                    if (y0Var != null) {
                        observableField = y0Var.f73864h;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(8, observableField);
                    if (observableField != null) {
                        str = observableField.get();
                    } else {
                        str = null;
                    }
                }
                str2 = str6;
                spannableStringBuilder = spannableStringBuilder2;
            } else {
                spannableStringBuilder2 = spannableStringBuilder2;
            }
            if ((j10 & 1792) == 0) {
                str = null;
            } else {
                if (y0Var != null) {
                    observableField = y0Var.f73864h;
                } else {
                    observableField = null;
                }
                updateRegistration(8, observableField);
                if (observableField != null) {
                    str = observableField.get();
                } else {
                    str = null;
                }
            }
            str2 = str6;
            spannableStringBuilder = spannableStringBuilder2;
        } else {
            drawable = null;
            spannableStringBuilder = null;
            bool = null;
            bVar = null;
            str = null;
            str2 = null;
            str3 = null;
            bool2 = null;
            str4 = null;
            str5 = null;
            bVar2 = null;
            cVar = null;
            observableList = null;
        }
        if ((j10 & 1664) != 0) {
            a.a(this.f40927c, str2, R.mipmap.ic_launcher_round);
        }
        if ((j10 & 1536) != 0) {
            xl.a.b(this.f40928d, bVar, false);
            ImageViewBindingAdapter.setImageDrawable(this.f40940n, drawable);
            xl.a.b(this.f40941o, bVar2, false);
            xl.a.b(this.f40943q, bVar2, false);
        }
        if ((j10 & 1538) != 0) {
            xl.a.a(this.f40936j, bool2);
        }
        if ((1600 & j10) != 0) {
            xl.a.a(this.f40937k, bool);
        }
        if ((1024 & j10) != 0) {
            ViewAdapter.b(this.f40938l, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
            xl.a.d(this.f40943q, Boolean.TRUE);
        }
        if ((j10 & 1540) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40938l, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 1537) != 0) {
            TextViewBindingAdapter.setText(this.f40939m, str3);
        }
        if ((1552 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40942p, str5);
        }
        if ((1568 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40943q, spannableStringBuilder);
        }
        if ((1544 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40930f, str4);
        }
        if ((j10 & 1792) != 0) {
            TextViewBindingAdapter.setText(this.f40931g, str);
        }
    }

    public final boolean f(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 2;
        }
        return true;
    }

    public final boolean g(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 64;
        }
        return true;
    }

    public final boolean h(ObservableField<SpannableStringBuilder> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 32;
        }
        return true;
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40944r |= 1;
        }
        return true;
    }

    public void j(@Nullable y0 y0Var) {
        this.f40932h = y0Var;
        synchronized (this) {
            this.f40944r |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return i((ObservableField) obj, i11);
            case 1:
                return f((ObservableField) obj, i11);
            case 2:
                return c((ObservableList) obj, i11);
            case 3:
                return d((ObservableField) obj, i11);
            case 4:
                return e((ObservableField) obj, i11);
            case 5:
                return h((ObservableField) obj, i11);
            case 6:
                return g((ObservableField) obj, i11);
            case 7:
                return a((ObservableField) obj, i11);
            case 8:
                return b((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
