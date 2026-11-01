package com.mgs.carparking.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import ul.b;
import wl.a;

/* JADX INFO: loaded from: classes6.dex */
public class FragmentMineBindingImpl extends FragmentMineBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts D = null;

    @Nullable
    public static final SparseIntArray E;

    @NonNull
    public final RelativeLayout A;

    @NonNull
    public final RelativeLayout B;
    public long C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ScrollView f40250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final View f40258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final ImageView f40261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final TextView f40262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40263z;

    public FragmentMineBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, D, E));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.C = 512L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        i((MINEVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.vipBg, 20);
        sparseIntArray.put(R.id.tvTopVp, 21);
        sparseIntArray.put(R.id.tvBottomVp, 22);
        sparseIntArray.put(R.id.llRightLayout, 23);
        sparseIntArray.put(R.id.view_18, 24);
        sparseIntArray.put(R.id.swh_status, 25);
    }

    public FragmentMineBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (CircularImageView) objArr[2], (LinearLayout) objArr[19], (LinearLayout) objArr[23], (Switch) objArr[25], (LinearLayout) objArr[4], (TextView) objArr[22], (TextView) objArr[3], (TextView) objArr[21], (RelativeLayout) objArr[24], (ConstraintLayout) objArr[20]);
        this.C = -1L;
        this.f40239b.setTag(null);
        this.f40240c.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f40250m = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f40251n = constraintLayout;
        constraintLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[10];
        this.f40252o = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[11];
        this.f40253p = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[12];
        this.f40254q = relativeLayout3;
        relativeLayout3.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[13];
        this.f40255r = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[14];
        this.f40256s = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[15];
        this.f40257t = relativeLayout6;
        relativeLayout6.setTag(null);
        View view2 = (View) objArr[16];
        this.f40258u = view2;
        view2.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) objArr[17];
        this.f40259v = relativeLayout7;
        relativeLayout7.setTag(null);
        RelativeLayout relativeLayout8 = (RelativeLayout) objArr[18];
        this.f40260w = relativeLayout8;
        relativeLayout8.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.f40261x = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.f40262y = textView;
        textView.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[7];
        this.f40263z = constraintLayout2;
        constraintLayout2.setTag(null);
        RelativeLayout relativeLayout9 = (RelativeLayout) objArr[8];
        this.A = relativeLayout9;
        relativeLayout9.setTag(null);
        RelativeLayout relativeLayout10 = (RelativeLayout) objArr[9];
        this.B = relativeLayout10;
        relativeLayout10.setTag(null);
        this.f40243f.setTag(null);
        this.f40245h.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 64;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 128;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0208  */
    /* JADX WARN: Code duplicated, block: B:134:0x020b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0212  */
    /* JADX WARN: Code duplicated, block: B:138:0x0235  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:180:0x0301  */
    /* JADX WARN: Code duplicated, block: B:181:0x030d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0316  */
    /* JADX WARN: Code duplicated, block: B:187:0x035e  */
    /* JADX WARN: Code duplicated, block: B:190:0x036c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0379  */
    /* JADX WARN: Code duplicated, block: B:196:0x0387  */
    /* JADX WARN: Code duplicated, block: B:199:0x0395  */
    /* JADX WARN: Code duplicated, block: B:201:0x039e  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:89:0x0180  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Code duplicated, block: B:93:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0190  */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:99:0x0199  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int i10;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        Drawable drawable;
        b bVar5;
        b bVar6;
        b bVar7;
        b bVar8;
        b bVar9;
        b bVar10;
        String str;
        int i11;
        Drawable drawable2;
        Boolean bool;
        b bVar11;
        boolean z10;
        int i12;
        b bVar12;
        String string;
        b bVar13;
        b bVar14;
        long j11;
        long j12;
        boolean z11;
        int i13;
        ObservableField<String> observableField;
        b bVar15;
        b bVar16;
        b bVar17;
        b bVar18;
        b bVar19;
        b bVar20;
        b bVar21;
        b bVar22;
        b bVar23;
        b bVar24;
        b bVar25;
        int colorFromResource;
        Drawable drawable3;
        long j13;
        long j14;
        int i14;
        Drawable drawable4;
        long j15;
        Drawable drawable5;
        int i15;
        String str2;
        long j16;
        int i16;
        long j17;
        int i17;
        ObservableField<Boolean> observableField2;
        ObservableField<Boolean> observableField3;
        Boolean bool2;
        boolean zSafeUnbox;
        long j18;
        ObservableField<String> observableField4;
        ObservableField<Boolean> observableField5;
        Boolean bool3;
        boolean zSafeUnbox2;
        long j19;
        ObservableField<Boolean> observableField6;
        Boolean bool4;
        boolean zSafeUnbox3;
        Context context;
        int i18;
        long j20;
        long j21;
        long j22;
        TextView textView;
        int i19;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        MINEVIEWMODEL mineviewmodel = this.f40249l;
        if ((1023 & j10) != 0) {
            if ((j10 & 768) == 0 || mineviewmodel == null) {
                bVar15 = null;
                bVar16 = null;
                bVar17 = null;
                bVar18 = null;
                bVar19 = null;
                bVar20 = null;
                bVar21 = null;
                bVar22 = null;
                bVar23 = null;
                bVar24 = null;
                bVar25 = null;
            } else {
                bVar16 = mineviewmodel.B;
                bVar18 = mineviewmodel.G;
                bVar17 = mineviewmodel.f41301x;
                bVar19 = mineviewmodel.A;
                bVar20 = mineviewmodel.D;
                bVar21 = mineviewmodel.F;
                bVar22 = mineviewmodel.f41300w;
                bVar23 = mineviewmodel.f41303z;
                bVar24 = mineviewmodel.E;
                bVar25 = mineviewmodel.C;
                bVar15 = mineviewmodel.f41302y;
            }
            long j23 = j10 & 770;
            b bVar26 = bVar15;
            if (j23 != 0) {
                ObservableField<Boolean> observableField7 = mineviewmodel != null ? mineviewmodel.f41285h : null;
                updateRegistration(1, observableField7);
                boolean zSafeUnbox4 = ViewDataBinding.safeUnbox(observableField7 != null ? observableField7.get() : null);
                if (j23 != 0) {
                    j10 |= zSafeUnbox4 ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                }
                if (zSafeUnbox4) {
                    textView = this.f40262y;
                    i19 = R.color.color_9d5b00;
                } else {
                    textView = this.f40262y;
                    i19 = R.color.color_939393;
                }
                colorFromResource = ViewDataBinding.getColorFromResource(textView, i19);
            } else {
                bVar16 = bVar16;
                colorFromResource = 0;
            }
            if ((j10 & 773) != 0) {
                ObservableField<Boolean> observableField8 = mineviewmodel != null ? mineviewmodel.f41283f : null;
                updateRegistration(2, observableField8);
                boolean zSafeUnbox5 = ViewDataBinding.safeUnbox(observableField8 != null ? observableField8.get() : null);
                if ((j10 & 772) != 0) {
                    if (zSafeUnbox5) {
                        j21 = j10 | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        j22 = 2097152;
                    } else {
                        j21 = j10 | 16384;
                        j22 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    }
                    j10 = j21 | j22;
                }
                if ((j10 & 773) != 0) {
                    j10 = zSafeUnbox5 ? j10 | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : j10 | PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                }
                if ((j10 & 772) != 0) {
                    z10 = zSafeUnbox5;
                    j13 = 776;
                    drawable3 = zSafeUnbox5 ? AppCompatResources.getDrawable(this.f40243f.getContext(), R.drawable.ic_mine_top_vip_bg) : AppCompatResources.getDrawable(this.f40243f.getContext(), R.drawable.ic_mine_top_nologin_bg);
                    j10 = j10;
                } else {
                    z10 = zSafeUnbox5;
                    drawable3 = null;
                }
                j14 = j10 & j13;
                i14 = colorFromResource;
                if (j14 != 0) {
                    if (mineviewmodel != null) {
                        observableField6 = mineviewmodel.f41284g;
                    } else {
                        observableField6 = null;
                    }
                    updateRegistration(3, observableField6);
                    if (observableField6 != null) {
                        bool4 = observableField6.get();
                    } else {
                        bool4 = null;
                    }
                    zSafeUnbox3 = ViewDataBinding.safeUnbox(bool4);
                    if (j14 != 0) {
                        if (zSafeUnbox3) {
                            j20 = 8388608;
                        } else {
                            j20 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                        }
                        j10 |= j20;
                    }
                    if (zSafeUnbox3) {
                        context = this.f40261x.getContext();
                        i18 = R.drawable.ic_mine_login_vp;
                    } else {
                        context = this.f40261x.getContext();
                        i18 = R.drawable.ic_mine_nologin_vp;
                    }
                    drawable4 = AppCompatResources.getDrawable(context, i18);
                } else {
                    drawable3 = drawable3;
                    drawable4 = null;
                }
                j15 = j10 & 784;
                drawable5 = drawable4;
                if (j15 != 0) {
                    if (mineviewmodel != null) {
                        observableField5 = mineviewmodel.f41294q;
                    } else {
                        observableField5 = null;
                    }
                    updateRegistration(4, observableField5);
                    if (observableField5 != null) {
                        bool3 = observableField5.get();
                    } else {
                        bool3 = null;
                    }
                    zSafeUnbox2 = ViewDataBinding.safeUnbox(bool3);
                    if (j15 != 0) {
                        if (zSafeUnbox2) {
                            j19 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        } else {
                            j19 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        }
                        j10 |= j19;
                    }
                    if (zSafeUnbox2) {
                        i15 = 8;
                    }
                    if ((j10 & 800) == 0) {
                        str2 = null;
                    } else {
                        if (mineviewmodel != null) {
                            observableField4 = mineviewmodel.f41288k;
                        } else {
                            observableField4 = null;
                        }
                        updateRegistration(5, observableField4);
                        if (observableField4 != null) {
                            str2 = observableField4.get();
                        } else {
                            str2 = null;
                        }
                    }
                    j16 = j10 & 832;
                    i16 = i15;
                    if (j16 != 0) {
                        if (mineviewmodel != null) {
                            observableField3 = mineviewmodel.f41299v;
                        } else {
                            observableField3 = null;
                        }
                        updateRegistration(6, observableField3);
                        if (observableField3 != null) {
                            bool2 = observableField3.get();
                        } else {
                            bool2 = null;
                        }
                        zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                        if (j16 != 0) {
                            if (zSafeUnbox) {
                                j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                            } else {
                                j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                            }
                            j10 |= j18;
                        }
                        i17 = zSafeUnbox ? 0 : 8;
                        j17 = 896;
                    } else {
                        str2 = str2;
                        j17 = 896;
                        i17 = 0;
                    }
                    if ((j10 & j17) == 0) {
                        bVar2 = bVar24;
                        bVar = bVar26;
                        i12 = i17;
                        drawable2 = drawable5;
                        i10 = i16;
                        str = str2;
                        bVar9 = bVar19;
                        drawable = drawable3;
                        bVar11 = bVar18;
                        bVar4 = bVar22;
                        bVar7 = bVar17;
                        bVar3 = bVar23;
                        bVar8 = bVar25;
                        bVar10 = bVar20;
                        bVar5 = bVar21;
                        bVar6 = bVar16;
                        i11 = i14;
                        bool = null;
                    } else {
                        if (mineviewmodel != null) {
                            observableField2 = mineviewmodel.f41289l;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(7, observableField2);
                        if (observableField2 != null) {
                            bVar2 = bVar24;
                            bVar = bVar26;
                            i12 = i17;
                            drawable2 = drawable5;
                            str = str2;
                            bVar9 = bVar19;
                            drawable = drawable3;
                            bVar11 = bVar18;
                            bVar4 = bVar22;
                            bVar7 = bVar17;
                            bVar3 = bVar23;
                            bVar8 = bVar25;
                            bVar10 = bVar20;
                            bVar5 = bVar21;
                            bVar6 = bVar16;
                            i11 = i14;
                            bool = observableField2.get();
                            i10 = i16;
                        } else {
                            bVar2 = bVar24;
                            bVar = bVar26;
                            i12 = i17;
                            drawable2 = drawable5;
                            i10 = i16;
                            str = str2;
                            bVar9 = bVar19;
                            drawable = drawable3;
                            bVar11 = bVar18;
                            bVar4 = bVar22;
                            bVar7 = bVar17;
                            bVar3 = bVar23;
                            bVar8 = bVar25;
                            bVar10 = bVar20;
                            bVar5 = bVar21;
                            bVar6 = bVar16;
                            i11 = i14;
                            bool = null;
                        }
                    }
                } else {
                    z10 = z10;
                }
                i15 = 0;
                if ((j10 & 800) == 0) {
                    str2 = null;
                } else {
                    if (mineviewmodel != null) {
                        observableField4 = mineviewmodel.f41288k;
                    } else {
                        observableField4 = null;
                    }
                    updateRegistration(5, observableField4);
                    if (observableField4 != null) {
                        str2 = observableField4.get();
                    } else {
                        str2 = null;
                    }
                }
                j16 = j10 & 832;
                i16 = i15;
                if (j16 != 0) {
                    if (mineviewmodel != null) {
                        observableField3 = mineviewmodel.f41299v;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(6, observableField3);
                    if (observableField3 != null) {
                        bool2 = observableField3.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                    if (j16 != 0) {
                        if (zSafeUnbox) {
                            j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        } else {
                            j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        }
                        j10 |= j18;
                    }
                    if (zSafeUnbox) {
                    }
                    j17 = 896;
                } else {
                    str2 = str2;
                    j17 = 896;
                    i17 = 0;
                }
                if ((j10 & j17) == 0) {
                    bVar2 = bVar24;
                    bVar = bVar26;
                    i12 = i17;
                    drawable2 = drawable5;
                    i10 = i16;
                    str = str2;
                    bVar9 = bVar19;
                    drawable = drawable3;
                    bVar11 = bVar18;
                    bVar4 = bVar22;
                    bVar7 = bVar17;
                    bVar3 = bVar23;
                    bVar8 = bVar25;
                    bVar10 = bVar20;
                    bVar5 = bVar21;
                    bVar6 = bVar16;
                    i11 = i14;
                    bool = null;
                } else {
                    if (mineviewmodel != null) {
                        observableField2 = mineviewmodel.f41289l;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(7, observableField2);
                    if (observableField2 != null) {
                        bVar2 = bVar24;
                        bVar = bVar26;
                        i12 = i17;
                        drawable2 = drawable5;
                        str = str2;
                        bVar9 = bVar19;
                        drawable = drawable3;
                        bVar11 = bVar18;
                        bVar4 = bVar22;
                        bVar7 = bVar17;
                        bVar3 = bVar23;
                        bVar8 = bVar25;
                        bVar10 = bVar20;
                        bVar5 = bVar21;
                        bVar6 = bVar16;
                        i11 = i14;
                        bool = observableField2.get();
                        i10 = i16;
                    } else {
                        bVar2 = bVar24;
                        bVar = bVar26;
                        i12 = i17;
                        drawable2 = drawable5;
                        i10 = i16;
                        str = str2;
                        bVar9 = bVar19;
                        drawable = drawable3;
                        bVar11 = bVar18;
                        bVar4 = bVar22;
                        bVar7 = bVar17;
                        bVar3 = bVar23;
                        bVar8 = bVar25;
                        bVar10 = bVar20;
                        bVar5 = bVar21;
                        bVar6 = bVar16;
                        i11 = i14;
                        bool = null;
                    }
                }
            } else {
                drawable3 = null;
                z10 = false;
            }
            j13 = 776;
            j14 = j10 & j13;
            i14 = colorFromResource;
            if (j14 != 0) {
                if (mineviewmodel != null) {
                    observableField6 = mineviewmodel.f41284g;
                } else {
                    observableField6 = null;
                }
                updateRegistration(3, observableField6);
                if (observableField6 != null) {
                    bool4 = observableField6.get();
                } else {
                    bool4 = null;
                }
                zSafeUnbox3 = ViewDataBinding.safeUnbox(bool4);
                if (j14 != 0) {
                    if (zSafeUnbox3) {
                        j20 = 8388608;
                    } else {
                        j20 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    }
                    j10 |= j20;
                }
                if (zSafeUnbox3) {
                    context = this.f40261x.getContext();
                    i18 = R.drawable.ic_mine_login_vp;
                } else {
                    context = this.f40261x.getContext();
                    i18 = R.drawable.ic_mine_nologin_vp;
                }
                drawable4 = AppCompatResources.getDrawable(context, i18);
            } else {
                drawable3 = drawable3;
                drawable4 = null;
            }
            j15 = j10 & 784;
            drawable5 = drawable4;
            if (j15 != 0) {
                if (mineviewmodel != null) {
                    observableField5 = mineviewmodel.f41294q;
                } else {
                    observableField5 = null;
                }
                updateRegistration(4, observableField5);
                if (observableField5 != null) {
                    bool3 = observableField5.get();
                } else {
                    bool3 = null;
                }
                zSafeUnbox2 = ViewDataBinding.safeUnbox(bool3);
                if (j15 != 0) {
                    if (zSafeUnbox2) {
                        j19 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    } else {
                        j19 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    }
                    j10 |= j19;
                }
                if (zSafeUnbox2) {
                    i15 = 8;
                }
                if ((j10 & 800) == 0) {
                    str2 = null;
                } else {
                    if (mineviewmodel != null) {
                        observableField4 = mineviewmodel.f41288k;
                    } else {
                        observableField4 = null;
                    }
                    updateRegistration(5, observableField4);
                    if (observableField4 != null) {
                        str2 = observableField4.get();
                    } else {
                        str2 = null;
                    }
                }
                j16 = j10 & 832;
                i16 = i15;
                if (j16 != 0) {
                    if (mineviewmodel != null) {
                        observableField3 = mineviewmodel.f41299v;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(6, observableField3);
                    if (observableField3 != null) {
                        bool2 = observableField3.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                    if (j16 != 0) {
                        if (zSafeUnbox) {
                            j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        } else {
                            j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        }
                        j10 |= j18;
                    }
                    if (zSafeUnbox) {
                    }
                    j17 = 896;
                } else {
                    str2 = str2;
                    j17 = 896;
                    i17 = 0;
                }
                if ((j10 & j17) == 0) {
                    bVar2 = bVar24;
                    bVar = bVar26;
                    i12 = i17;
                    drawable2 = drawable5;
                    i10 = i16;
                    str = str2;
                    bVar9 = bVar19;
                    drawable = drawable3;
                    bVar11 = bVar18;
                    bVar4 = bVar22;
                    bVar7 = bVar17;
                    bVar3 = bVar23;
                    bVar8 = bVar25;
                    bVar10 = bVar20;
                    bVar5 = bVar21;
                    bVar6 = bVar16;
                    i11 = i14;
                    bool = null;
                } else {
                    if (mineviewmodel != null) {
                        observableField2 = mineviewmodel.f41289l;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(7, observableField2);
                    if (observableField2 != null) {
                        bVar2 = bVar24;
                        bVar = bVar26;
                        i12 = i17;
                        drawable2 = drawable5;
                        str = str2;
                        bVar9 = bVar19;
                        drawable = drawable3;
                        bVar11 = bVar18;
                        bVar4 = bVar22;
                        bVar7 = bVar17;
                        bVar3 = bVar23;
                        bVar8 = bVar25;
                        bVar10 = bVar20;
                        bVar5 = bVar21;
                        bVar6 = bVar16;
                        i11 = i14;
                        bool = observableField2.get();
                        i10 = i16;
                    } else {
                        bVar2 = bVar24;
                        bVar = bVar26;
                        i12 = i17;
                        drawable2 = drawable5;
                        i10 = i16;
                        str = str2;
                        bVar9 = bVar19;
                        drawable = drawable3;
                        bVar11 = bVar18;
                        bVar4 = bVar22;
                        bVar7 = bVar17;
                        bVar3 = bVar23;
                        bVar8 = bVar25;
                        bVar10 = bVar20;
                        bVar5 = bVar21;
                        bVar6 = bVar16;
                        i11 = i14;
                        bool = null;
                    }
                }
            } else {
                z10 = z10;
            }
            i15 = 0;
            if ((j10 & 800) == 0) {
                str2 = null;
            } else {
                if (mineviewmodel != null) {
                    observableField4 = mineviewmodel.f41288k;
                } else {
                    observableField4 = null;
                }
                updateRegistration(5, observableField4);
                if (observableField4 != null) {
                    str2 = observableField4.get();
                } else {
                    str2 = null;
                }
            }
            j16 = j10 & 832;
            i16 = i15;
            if (j16 != 0) {
                if (mineviewmodel != null) {
                    observableField3 = mineviewmodel.f41299v;
                } else {
                    observableField3 = null;
                }
                updateRegistration(6, observableField3);
                if (observableField3 != null) {
                    bool2 = observableField3.get();
                } else {
                    bool2 = null;
                }
                zSafeUnbox = ViewDataBinding.safeUnbox(bool2);
                if (j16 != 0) {
                    if (zSafeUnbox) {
                        j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    } else {
                        j18 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    j10 |= j18;
                }
                if (zSafeUnbox) {
                }
                j17 = 896;
            } else {
                str2 = str2;
                j17 = 896;
                i17 = 0;
            }
            if ((j10 & j17) == 0) {
                bVar2 = bVar24;
                bVar = bVar26;
                i12 = i17;
                drawable2 = drawable5;
                i10 = i16;
                str = str2;
                bVar9 = bVar19;
                drawable = drawable3;
                bVar11 = bVar18;
                bVar4 = bVar22;
                bVar7 = bVar17;
                bVar3 = bVar23;
                bVar8 = bVar25;
                bVar10 = bVar20;
                bVar5 = bVar21;
                bVar6 = bVar16;
                i11 = i14;
                bool = null;
            } else {
                if (mineviewmodel != null) {
                    observableField2 = mineviewmodel.f41289l;
                } else {
                    observableField2 = null;
                }
                updateRegistration(7, observableField2);
                if (observableField2 != null) {
                    bVar2 = bVar24;
                    bVar = bVar26;
                    i12 = i17;
                    drawable2 = drawable5;
                    str = str2;
                    bVar9 = bVar19;
                    drawable = drawable3;
                    bVar11 = bVar18;
                    bVar4 = bVar22;
                    bVar7 = bVar17;
                    bVar3 = bVar23;
                    bVar8 = bVar25;
                    bVar10 = bVar20;
                    bVar5 = bVar21;
                    bVar6 = bVar16;
                    i11 = i14;
                    bool = observableField2.get();
                    i10 = i16;
                } else {
                    bVar2 = bVar24;
                    bVar = bVar26;
                    i12 = i17;
                    drawable2 = drawable5;
                    i10 = i16;
                    str = str2;
                    bVar9 = bVar19;
                    drawable = drawable3;
                    bVar11 = bVar18;
                    bVar4 = bVar22;
                    bVar7 = bVar17;
                    bVar3 = bVar23;
                    bVar8 = bVar25;
                    bVar10 = bVar20;
                    bVar5 = bVar21;
                    bVar6 = bVar16;
                    i11 = i14;
                    bool = null;
                }
            }
        } else {
            i10 = 0;
            bVar = null;
            bVar2 = null;
            bVar3 = null;
            bVar4 = null;
            drawable = null;
            bVar5 = null;
            bVar6 = null;
            bVar7 = null;
            bVar8 = null;
            bVar9 = null;
            bVar10 = null;
            str = null;
            i11 = 0;
            drawable2 = null;
            bool = null;
            bVar11 = null;
            z10 = false;
            i12 = 0;
        }
        if ((j10 & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) != 0) {
            bVar12 = bVar7;
            if (mineviewmodel != null) {
                observableField = mineviewmodel.f41286i;
                i13 = 0;
            } else {
                i13 = 0;
                observableField = null;
            }
            updateRegistration(i13, observableField);
            string = observableField != null ? observableField.get() : null;
            if ((j10 & 16384) != 0 || mineviewmodel == null) {
                bVar13 = null;
            } else {
                bVar13 = mineviewmodel.H;
            }
            if ((j10 & PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) != 0 || mineviewmodel == null) {
                bVar14 = null;
            } else {
                bVar14 = mineviewmodel.J;
            }
            j11 = j10 & 772;
            if (j11 != 0) {
                bVar13 = null;
            } else if (z10) {
                bVar13 = bVar14;
            }
            j12 = j10 & 773;
            if (j12 != 0) {
                string = null;
            } else if (z10) {
                string = this.f40245h.getResources().getString(R.string.text_App_name);
            }
            if ((j10 & 512) != 0) {
                a.a(this.f40239b, null, R.drawable.ic_avatar_default);
            }
            if ((j10 & 784) != 0) {
                this.f40240c.setVisibility(i10);
            }
            if (j11 != 0) {
                z11 = false;
                xl.a.b(this.f40251n, bVar13, false);
                ViewBindingAdapter.setBackground(this.f40243f, drawable);
            } else {
                z11 = false;
            }
            if ((j10 & 768) != 0) {
                xl.a.b(this.f40252o, bVar2, z11);
                xl.a.b(this.f40253p, bVar9, z11);
                xl.a.b(this.f40254q, bVar4, z11);
                xl.a.b(this.f40255r, bVar8, z11);
                xl.a.b(this.f40256s, bVar6, z11);
                xl.a.b(this.f40257t, bVar3, z11);
                xl.a.b(this.f40259v, bVar5, z11);
                xl.a.b(this.f40260w, bVar10, z11);
                xl.a.b(this.f40263z, bVar, z11);
                xl.a.b(this.A, bVar12, z11);
                xl.a.b(this.B, bVar11, z11);
            }
            if ((896 & j10) != 0) {
                xl.a.a(this.f40258u, bool);
            }
            if ((776 & j10) != 0) {
                ViewBindingAdapter.setBackground(this.f40261x, drawable2);
            }
            if ((j10 & 770) != 0) {
                this.f40262y.setTextColor(i11);
            }
            if ((800 & j10) != 0) {
                TextViewBindingAdapter.setText(this.f40262y, str);
            }
            if ((j10 & 832) != 0) {
                this.B.setVisibility(i12);
            }
            if (j12 != 0) {
                TextViewBindingAdapter.setText(this.f40245h, string);
            }
        }
        bVar = bVar;
        bVar12 = bVar7;
        if ((j10 & 16384) != 0) {
            bVar13 = null;
        } else {
            bVar13 = null;
        }
        if ((j10 & PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) != 0) {
            bVar14 = null;
        } else {
            bVar14 = null;
        }
        j11 = j10 & 772;
        if (j11 != 0) {
            bVar13 = null;
        } else if (z10) {
            bVar13 = bVar14;
        }
        j12 = j10 & 773;
        if (j12 != 0) {
            string = null;
        } else if (z10) {
            string = this.f40245h.getResources().getString(R.string.text_App_name);
        }
        if ((j10 & 512) != 0) {
            a.a(this.f40239b, null, R.drawable.ic_avatar_default);
        }
        if ((j10 & 784) != 0) {
            this.f40240c.setVisibility(i10);
        }
        if (j11 != 0) {
            z11 = false;
            xl.a.b(this.f40251n, bVar13, false);
            ViewBindingAdapter.setBackground(this.f40243f, drawable);
        } else {
            z11 = false;
        }
        if ((j10 & 768) != 0) {
            xl.a.b(this.f40252o, bVar2, z11);
            xl.a.b(this.f40253p, bVar9, z11);
            xl.a.b(this.f40254q, bVar4, z11);
            xl.a.b(this.f40255r, bVar8, z11);
            xl.a.b(this.f40256s, bVar6, z11);
            xl.a.b(this.f40257t, bVar3, z11);
            xl.a.b(this.f40259v, bVar5, z11);
            xl.a.b(this.f40260w, bVar10, z11);
            xl.a.b(this.f40263z, bVar, z11);
            xl.a.b(this.A, bVar12, z11);
            xl.a.b(this.B, bVar11, z11);
        }
        if ((896 & j10) != 0) {
            xl.a.a(this.f40258u, bool);
        }
        if ((776 & j10) != 0) {
            ViewBindingAdapter.setBackground(this.f40261x, drawable2);
        }
        if ((j10 & 770) != 0) {
            this.f40262y.setTextColor(i11);
        }
        if ((800 & j10) != 0) {
            TextViewBindingAdapter.setText(this.f40262y, str);
        }
        if ((j10 & 832) != 0) {
            this.B.setVisibility(i12);
        }
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.f40245h, string);
        }
    }

    public final boolean f(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public final boolean g(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 32;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    public void i(@Nullable MINEVIEWMODEL mineviewmodel) {
        this.f40249l = mineviewmodel;
        synchronized (this) {
            this.C |= 256;
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
                return b((ObservableField) obj, i11);
            case 2:
                return c((ObservableField) obj, i11);
            case 3:
                return h((ObservableField) obj, i11);
            case 4:
                return a((ObservableField) obj, i11);
            case 5:
                return g((ObservableField) obj, i11);
            case 6:
                return d((ObservableField) obj, i11);
            case 7:
                return e((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
