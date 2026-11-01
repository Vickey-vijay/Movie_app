package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ul.b;

/* JADX INFO: loaded from: classes7.dex */
public class ItemDownnloadingVideoBindingImpl extends ItemDownnloadingVideoBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40371n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40372o = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f40373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CheckBox f40374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f40375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f40376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f40378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InverseBindingListener f40380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40381m;

    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean zIsChecked = ItemDownnloadingVideoBindingImpl.this.f40374f.isChecked();
            com.mgs.carparking.model.a aVar = ItemDownnloadingVideoBindingImpl.this.f40370d;
            if (aVar != null) {
                ObservableField<Boolean> observableField = aVar.f41464b;
                if (observableField != null) {
                    observableField.set(Boolean.valueOf(zIsChecked));
                }
            }
        }
    }

    public ItemDownnloadingVideoBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f40371n, f40372o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40381m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40381m = 1024L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((com.mgs.carparking.model.a) obj);
        return true;
    }

    public ItemDownnloadingVideoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (ProgressBar) objArr[5], (RelativeLayout) objArr[1]);
        this.f40380l = new a();
        this.f40381m = -1L;
        this.f40368b.setTag(null);
        this.f40369c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f40373e = linearLayout;
        linearLayout.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[2];
        this.f40374f = checkBox;
        checkBox.setTag(null);
        RoundedImageView roundedImageView = (RoundedImageView) objArr[3];
        this.f40375g = roundedImageView;
        roundedImageView.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f40376h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.f40377i = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.f40378j = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[8];
        this.f40379k = textView4;
        textView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 128;
        }
        return true;
    }

    public final boolean c(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 8;
        }
        return true;
    }

    public final boolean e(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 256;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050 A[PHI: r2
  0x0050: PHI (r2v4 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0026, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        b bVar;
        String str2;
        b bVar2;
        boolean z10;
        int i10;
        boolean z11;
        Drawable drawable;
        boolean z12;
        String str3;
        String str4;
        b bVar3;
        int i11;
        String str5;
        int i12;
        String str6;
        boolean z13;
        Drawable drawable2;
        boolean z14;
        String str7;
        b bVar4;
        b bVar5;
        boolean zSafeUnbox;
        int iSafeUnbox;
        String str8;
        ObservableField<String> observableField;
        ObservableField<String> observableField2;
        synchronized (this) {
            j10 = this.f40381m;
            this.f40381m = 0L;
        }
        com.mgs.carparking.model.a aVar = this.f40370d;
        if ((2047 & j10) != 0) {
            long j11 = j10 & 1600;
            if (j11 == 0) {
                i12 = 0;
            } else {
                DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel = aVar != null ? aVar.f41470h : null;
                ObservableBoolean observableBoolean = downloadvideoviewmodel != null ? downloadvideoviewmodel.f41119f : null;
                updateRegistration(6, observableBoolean);
                boolean z15 = observableBoolean != null ? observableBoolean.get() : false;
                if (j11 != 0) {
                    j10 |= z15 ? 16384L : PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                }
                if (z15) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
            }
            if ((j10 & 1537) == 0) {
                str6 = null;
            } else {
                ObservableField<String> observableField3 = aVar != null ? aVar.f41478p : null;
                updateRegistration(0, observableField3);
                if (observableField3 != null) {
                    str6 = observableField3.get();
                } else {
                    str6 = null;
                }
            }
            long j12 = j10 & 1538;
            if (j12 != 0) {
                ObservableField<Integer> observableField4 = aVar != null ? aVar.f41480r : null;
                updateRegistration(1, observableField4);
                int iSafeUnbox2 = ViewDataBinding.safeUnbox(observableField4 != null ? observableField4.get() : null);
                z14 = iSafeUnbox2 != 2;
                z13 = iSafeUnbox2 == 2;
                if (j12 != 0) {
                    j10 |= z13 ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                }
                drawable2 = AppCompatResources.getDrawable(this.f40368b.getContext(), z13 ? R.drawable.shape_download_video_progress : R.drawable.shape_download_video_progress_grey);
            } else {
                z13 = false;
                drawable2 = null;
                z14 = false;
            }
            if ((j10 & 1540) == 0) {
                str7 = null;
            } else {
                ObservableField<String> observableField5 = aVar != null ? aVar.f41476n : null;
                updateRegistration(2, observableField5);
                if (observableField5 != null) {
                    str7 = observableField5.get();
                } else {
                    str7 = null;
                }
            }
            if ((j10 & 1536) == 0 || aVar == null) {
                bVar4 = null;
                bVar3 = null;
                bVar5 = null;
            } else {
                bVar3 = aVar.f41482t;
                bVar5 = aVar.f41485w;
                bVar4 = aVar.f41483u;
            }
            if ((j10 & 1544) != 0) {
                ObservableField<Boolean> observableField6 = aVar != null ? aVar.f41464b : null;
                updateRegistration(3, observableField6);
                zSafeUnbox = ViewDataBinding.safeUnbox(observableField6 != null ? observableField6.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j10 & 1552) != 0) {
                ObservableField<Integer> observableField7 = aVar != null ? aVar.f41477o : null;
                updateRegistration(4, observableField7);
                iSafeUnbox = ViewDataBinding.safeUnbox(observableField7 != null ? observableField7.get() : null);
            } else {
                iSafeUnbox = 0;
            }
            if ((j10 & 1568) != 0) {
                ObservableField<String> observableField8 = aVar != null ? aVar.f41479q : null;
                updateRegistration(5, observableField8);
                str8 = observableField8 != null ? observableField8.get() : null;
                if ((j10 & 1664) != 0) {
                    if (aVar != null) {
                        observableField2 = aVar.f41473k;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(7, observableField2);
                    String str9 = observableField2 != null ? observableField2.get() : null;
                    if ((j10 & 1792) == 0) {
                        str = null;
                    } else {
                        if (aVar != null) {
                            observableField = aVar.f41474l;
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
                    str3 = str6;
                    drawable = drawable2;
                    i10 = i12;
                    bVar2 = bVar5;
                    i11 = iSafeUnbox;
                    str4 = str7;
                    z12 = z14;
                    z11 = z13;
                    z10 = zSafeUnbox;
                    str2 = str9;
                    bVar = bVar4;
                    str5 = str8;
                } else {
                    str8 = str8;
                }
                if ((j10 & 1792) == 0) {
                    str = null;
                } else {
                    if (aVar != null) {
                        observableField = aVar.f41474l;
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
                str3 = str6;
                drawable = drawable2;
                i10 = i12;
                bVar2 = bVar5;
                i11 = iSafeUnbox;
                str4 = str7;
                z12 = z14;
                z11 = z13;
                z10 = zSafeUnbox;
                str2 = str9;
                bVar = bVar4;
                str5 = str8;
            } else {
                bVar4 = bVar4;
            }
            if ((j10 & 1664) != 0) {
                if (aVar != null) {
                    observableField2 = aVar.f41473k;
                } else {
                    observableField2 = null;
                }
                updateRegistration(7, observableField2);
                if (observableField2 != null) {
                }
                if ((j10 & 1792) == 0) {
                    str = null;
                } else {
                    if (aVar != null) {
                        observableField = aVar.f41474l;
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
                str3 = str6;
                drawable = drawable2;
                i10 = i12;
                bVar2 = bVar5;
                i11 = iSafeUnbox;
                str4 = str7;
                z12 = z14;
                z11 = z13;
                z10 = zSafeUnbox;
                str2 = str9;
                bVar = bVar4;
                str5 = str8;
            } else {
                str8 = str8;
            }
            if ((j10 & 1792) == 0) {
                str = null;
            } else {
                if (aVar != null) {
                    observableField = aVar.f41474l;
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
            str3 = str6;
            drawable = drawable2;
            i10 = i12;
            bVar2 = bVar5;
            i11 = iSafeUnbox;
            str4 = str7;
            z12 = z14;
            z11 = z13;
            z10 = zSafeUnbox;
            str2 = str9;
            bVar = bVar4;
            str5 = str8;
        } else {
            str = null;
            bVar = null;
            str2 = null;
            bVar2 = null;
            z10 = false;
            i10 = 0;
            z11 = false;
            drawable = null;
            z12 = false;
            str3 = null;
            str4 = null;
            bVar3 = null;
            i11 = 0;
            str5 = null;
        }
        if ((j10 & 1552) != 0) {
            this.f40368b.setProgress(i11);
        }
        if ((j10 & 1538) != 0) {
            this.f40368b.setProgressDrawable(drawable);
            xl.a.a(this.f40377i, Boolean.valueOf(z12));
            xl.a.a(this.f40378j, Boolean.valueOf(z11));
        }
        if ((j10 & 1600) != 0) {
            this.f40369c.setVisibility(i10);
        }
        if ((j10 & 1536) != 0) {
            xl.a.b(this.f40369c, bVar3, false);
            xl.a.c(this.f40373e, bVar);
            xl.a.b(this.f40373e, bVar2, false);
        }
        if ((1544 & j10) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f40374f, z10);
        }
        if ((1024 & j10) != 0) {
            CompoundButtonBindingAdapter.setListeners(this.f40374f, null, this.f40380l);
        }
        if ((1664 & j10) != 0) {
            wl.a.a(this.f40375g, str2, R.drawable.ic_video_default);
        }
        if ((1792 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40376h, str);
        }
        if ((1540 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40377i, str4);
        }
        if ((j10 & 1537) != 0) {
            TextViewBindingAdapter.setText(this.f40378j, str3);
        }
        if ((j10 & 1568) != 0) {
            TextViewBindingAdapter.setText(this.f40379k, str5);
        }
    }

    public final boolean f(ObservableField<Integer> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 16;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 1;
        }
        return true;
    }

    public final boolean h(ObservableField<Integer> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 2;
        }
        return true;
    }

    public final boolean i(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 32;
        }
        return true;
    }

    public final boolean j(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40381m |= 64;
        }
        return true;
    }

    public void k(@Nullable com.mgs.carparking.model.a aVar) {
        this.f40370d = aVar;
        synchronized (this) {
            this.f40381m |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g((ObservableField) obj, i11);
            case 1:
                return h((ObservableField) obj, i11);
            case 2:
                return c((ObservableField) obj, i11);
            case 3:
                return d((ObservableField) obj, i11);
            case 4:
                return f((ObservableField) obj, i11);
            case 5:
                return i((ObservableField) obj, i11);
            case 6:
                return j((ObservableBoolean) obj, i11);
            case 7:
                return b((ObservableField) obj, i11);
            case 8:
                return e((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
