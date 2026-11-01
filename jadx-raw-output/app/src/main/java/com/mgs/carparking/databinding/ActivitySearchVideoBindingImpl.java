package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.MaxLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import ul.b;
import w9.f2;
import w9.h2;

/* JADX INFO: loaded from: classes11.dex */
public class ActivitySearchVideoBindingImpl extends ActivitySearchVideoBinding {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39934u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39935v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f39937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f39939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InverseBindingListener f39946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f39947t;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivitySearchVideoBindingImpl.this.f39927b);
            SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = ActivitySearchVideoBindingImpl.this.f39933h;
            if (searchcontentvideoviewmodel != null) {
                ObservableField<String> observableField = searchcontentvideoviewmodel.f41326h;
                if (observableField != null) {
                    observableField.set(textString);
                }
            }
        }
    }

    public ActivitySearchVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f39934u, f39935v));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39947t != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39947t = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((SEARCHCONTENTVIDEOVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39935v = sparseIntArray;
        sparseIntArray.put(R.id.tab_layout, 13);
        sparseIntArray.put(R.id.vp_content, 14);
        sparseIntArray.put(R.id.layout_adView, 15);
    }

    public ActivitySearchVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (ClearableEditText) objArr[1], (FlowLayout2) objArr[11], (MaxLayout) objArr[15], (LinearLayout) objArr[3], (TabLayout) objArr[13], (ViewPager) objArr[14]);
        this.f39946s = new a();
        this.f39947t = -1L;
        this.f39927b.setTag(null);
        this.f39928c.setTag(null);
        this.f39930e.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f39936i = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[10];
        this.f39937j = imageView;
        imageView.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[12];
        this.f39938k = recyclerView;
        recyclerView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f39939l = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.f39940m = linearLayout2;
        linearLayout2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.f39941n = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[6];
        this.f39942o = relativeLayout2;
        relativeLayout2.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[7];
        this.f39943p = recyclerView2;
        recyclerView2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[8];
        this.f39944q = linearLayout3;
        linearLayout3.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[9];
        this.f39945r = relativeLayout3;
        relativeLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 16;
        }
        return true;
    }

    public final boolean b(ObservableList<h2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 2;
        }
        return true;
    }

    public final boolean d(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 128;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 256;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184  */
    /* JADX WARN: Code duplicated, block: B:121:0x018f  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0027, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5 A[PHI: r2
  0x00a5: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:43:0x007f, B:56:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        boolean z10;
        Boolean bool;
        b bVar;
        Boolean bool2;
        int i10;
        b bVar2;
        String str2;
        c<h2> cVar;
        int i11;
        b<String> bVar3;
        b bVar4;
        ObservableList observableList;
        ObservableList observableList2;
        c<f2> cVar2;
        Boolean bool3;
        boolean z11;
        int i12;
        c<h2> cVar3;
        ObservableList observableList3;
        String str3;
        int i13;
        b<String> bVar5;
        b bVar6;
        b bVar7;
        b bVar8;
        Boolean bool4;
        boolean z12;
        long j11;
        Boolean bool5;
        ObservableField<String> observableField;
        ObservableBoolean observableBoolean;
        synchronized (this) {
            j10 = this.f39947t;
            this.f39947t = 0L;
        }
        SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = this.f39933h;
        if ((4095 & j10) != 0) {
            long j12 = j10 & 3073;
            if (j12 == 0) {
                i12 = 0;
            } else {
                ObservableBoolean observableBoolean2 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41329k : null;
                updateRegistration(0, observableBoolean2);
                boolean z13 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j12 != 0) {
                    j10 |= z13 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                }
                if (z13) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
            }
            if ((j10 & 3076) != 0) {
                if (searchcontentvideoviewmodel != null) {
                    cVar3 = searchcontentvideoviewmodel.H;
                    observableList3 = searchcontentvideoviewmodel.G;
                } else {
                    cVar3 = null;
                    observableList3 = null;
                }
                updateRegistration(2, observableList3);
            } else {
                cVar3 = null;
                observableList3 = null;
            }
            if ((j10 & 3074) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField2 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41326h : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    str3 = observableField2.get();
                } else {
                    str3 = null;
                }
            }
            long j13 = j10 & 3080;
            if (j13 == 0) {
                i13 = 0;
            } else {
                ObservableBoolean observableBoolean3 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41330l : null;
                updateRegistration(3, observableBoolean3);
                boolean z14 = observableBoolean3 != null ? observableBoolean3.get() : false;
                if (j13 != 0) {
                    j10 |= z14 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384L;
                }
                if (z14) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
            }
            if ((j10 & 3072) == 0 || searchcontentvideoviewmodel == null) {
                bVar5 = null;
                bVar6 = null;
                bVar7 = null;
                bVar8 = null;
            } else {
                bVar5 = searchcontentvideoviewmodel.E;
                bVar6 = searchcontentvideoviewmodel.F;
                bVar7 = searchcontentvideoviewmodel.f41342x;
                bVar8 = searchcontentvideoviewmodel.C;
            }
            if ((j10 & 3088) == 0) {
                bool = null;
            } else {
                ObservableField<Boolean> observableField3 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41340v : null;
                updateRegistration(4, observableField3);
                if (observableField3 != null) {
                    bool = observableField3.get();
                } else {
                    bool = null;
                }
            }
            if ((j10 & 3104) != 0) {
                ObservableField<Boolean> observableField4 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41331m : null;
                updateRegistration(5, observableField4);
                bool4 = observableField4 != null ? observableField4.get() : null;
                z12 = !ViewDataBinding.safeUnbox(bool4);
            } else {
                bool4 = null;
                z12 = false;
            }
            if ((j10 & 3584) != 0) {
                if (searchcontentvideoviewmodel != null) {
                    cVar2 = searchcontentvideoviewmodel.J;
                    observableList2 = searchcontentvideoviewmodel.I;
                } else {
                    observableList2 = null;
                    cVar2 = null;
                }
                updateRegistration(9, observableList2);
                j11 = 3136;
            } else {
                bool4 = bool4;
                observableList2 = null;
                j11 = 3136;
                cVar2 = null;
            }
            if ((j10 & j11) != 0) {
                ObservableField<Boolean> observableField5 = searchcontentvideoviewmodel != null ? searchcontentvideoviewmodel.f41332n : null;
                updateRegistration(6, observableField5);
                bool5 = observableField5 != null ? observableField5.get() : null;
                if ((j10 & 3200) != 0) {
                    if (searchcontentvideoviewmodel != null) {
                        observableBoolean = searchcontentvideoviewmodel.f41327i;
                    } else {
                        observableBoolean = null;
                    }
                    updateRegistration(7, observableBoolean);
                    z10 = observableBoolean != null ? observableBoolean.get() : false;
                    if ((j10 & 3328) == 0) {
                        str = null;
                    } else {
                        if (searchcontentvideoviewmodel != null) {
                            observableField = searchcontentvideoviewmodel.f41325g;
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
                    z11 = z12;
                    observableList = observableList3;
                    i11 = i13;
                    bVar2 = bVar7;
                    bVar3 = bVar5;
                    str2 = str3;
                    i10 = i12;
                    bVar = bVar8;
                    bVar4 = bVar6;
                    cVar = cVar3;
                    bool2 = bool4;
                    bool3 = bool5;
                } else {
                    bool5 = bool5;
                }
                if ((j10 & 3328) == 0) {
                    str = null;
                } else {
                    if (searchcontentvideoviewmodel != null) {
                        observableField = searchcontentvideoviewmodel.f41325g;
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
                z11 = z12;
                observableList = observableList3;
                i11 = i13;
                bVar2 = bVar7;
                bVar3 = bVar5;
                str2 = str3;
                i10 = i12;
                bVar = bVar8;
                bVar4 = bVar6;
                cVar = cVar3;
                bool2 = bool4;
                bool3 = bool5;
            } else {
                observableList2 = observableList2;
            }
            if ((j10 & 3200) != 0) {
                if (searchcontentvideoviewmodel != null) {
                    observableBoolean = searchcontentvideoviewmodel.f41327i;
                } else {
                    observableBoolean = null;
                }
                updateRegistration(7, observableBoolean);
                if (observableBoolean != null) {
                }
                if ((j10 & 3328) == 0) {
                    str = null;
                } else {
                    if (searchcontentvideoviewmodel != null) {
                        observableField = searchcontentvideoviewmodel.f41325g;
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
                z11 = z12;
                observableList = observableList3;
                i11 = i13;
                bVar2 = bVar7;
                bVar3 = bVar5;
                str2 = str3;
                i10 = i12;
                bVar = bVar8;
                bVar4 = bVar6;
                cVar = cVar3;
                bool2 = bool4;
                bool3 = bool5;
            } else {
                bool5 = bool5;
            }
            if ((j10 & 3328) == 0) {
                str = null;
            } else {
                if (searchcontentvideoviewmodel != null) {
                    observableField = searchcontentvideoviewmodel.f41325g;
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
            z11 = z12;
            observableList = observableList3;
            i11 = i13;
            bVar2 = bVar7;
            bVar3 = bVar5;
            str2 = str3;
            i10 = i12;
            bVar = bVar8;
            bVar4 = bVar6;
            cVar = cVar3;
            bool2 = bool4;
            bool3 = bool5;
        } else {
            str = null;
            z10 = false;
            bool = null;
            bVar = null;
            bool2 = null;
            i10 = 0;
            bVar2 = null;
            str2 = null;
            cVar = null;
            i11 = 0;
            bVar3 = null;
            bVar4 = null;
            observableList = null;
            observableList2 = null;
            cVar2 = null;
            bool3 = null;
            z11 = false;
        }
        Boolean bool6 = bool2;
        if ((j10 & 3074) != 0) {
            TextViewBindingAdapter.setText(this.f39927b, str2);
        }
        if ((j10 & 3200) != 0) {
            vl.a.b(this.f39927b, Boolean.valueOf(z10));
        }
        if ((j10 & 3072) != 0) {
            vl.a.a(this.f39927b, bVar3);
            xl.a.b(this.f39937j, bVar2, false);
            xl.a.b(this.f39939l, bVar, false);
            xl.a.b(this.f39940m, bVar4, false);
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH & j10) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.f39927b, null, null, null, this.f39946s);
            ViewAdapter.b(this.f39938k, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.a(1));
            ViewAdapter.b(this.f39943p, me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.b());
        }
        if ((3088 & j10) != 0) {
            xl.a.a(this.f39928c, bool);
            xl.a.a(this.f39945r, bool);
        }
        if ((j10 & 3080) != 0) {
            this.f39930e.setVisibility(i11);
        }
        if ((j10 & 3076) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39938k, cVar, observableList, null, null, null, null);
        }
        if ((3328 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f39939l, str);
        }
        if ((j10 & 3073) != 0) {
            this.f39940m.setVisibility(i10);
        }
        if ((3104 & j10) != 0) {
            xl.a.a(this.f39941n, bool6);
            xl.a.a(this.f39944q, Boolean.valueOf(z11));
        }
        if ((3136 & j10) != 0) {
            xl.a.a(this.f39942o, bool3);
        }
        if ((j10 & 3584) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f39943p, cVar2, observableList2, null, null, null, null);
        }
    }

    public final boolean f(ObservableList<f2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 512;
        }
        return true;
    }

    public final boolean g(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 8;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 32;
        }
        return true;
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 64;
        }
        return true;
    }

    public final boolean j(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f39947t |= 1;
        }
        return true;
    }

    public void k(@Nullable SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel) {
        this.f39933h = searchcontentvideoviewmodel;
        synchronized (this) {
            this.f39947t |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return j((ObservableBoolean) obj, i11);
            case 1:
                return c((ObservableField) obj, i11);
            case 2:
                return b((ObservableList) obj, i11);
            case 3:
                return g((ObservableBoolean) obj, i11);
            case 4:
                return a((ObservableField) obj, i11);
            case 5:
                return h((ObservableField) obj, i11);
            case 6:
                return i((ObservableField) obj, i11);
            case 7:
                return d((ObservableBoolean) obj, i11);
            case 8:
                return e((ObservableField) obj, i11);
            case 9:
                return f((ObservableList) obj, i11);
            default:
                return false;
        }
    }
}
