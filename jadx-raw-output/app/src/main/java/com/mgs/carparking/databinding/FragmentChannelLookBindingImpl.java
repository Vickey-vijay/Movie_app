package com.mgs.carparking.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;
import ul.b;
import w9.a2;
import w9.c2;
import w9.y1;

/* JADX INFO: loaded from: classes9.dex */
public class FragmentChannelLookBindingImpl extends FragmentChannelLookBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts B = null;

    @Nullable
    public static final SparseIntArray C;
    public long A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final Button f40136t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40137u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40141y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40142z;

    public FragmentChannelLookBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, B, C));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.A = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        k((LOOKCHANNELVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 13);
        sparseIntArray.put(R.id.collapsingToolbarLayout, 14);
        sparseIntArray.put(R.id.sortToolbar, 15);
        sparseIntArray.put(R.id.sortToolbar_title, 16);
        sparseIntArray.put(R.id.ll_top, 17);
        sparseIntArray.put(R.id.tv_name, 18);
        sparseIntArray.put(R.id.img_loading1, 19);
        sparseIntArray.put(R.id.refresh_layout, 20);
        sparseIntArray.put(R.id.header, 21);
        sparseIntArray.put(R.id.tv_empty, 22);
        sparseIntArray.put(R.id.img_loading, 23);
    }

    public FragmentChannelLookBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 10, (AppBarLayout) objArr[13], (RecyclerView) objArr[2], (RecyclerView) objArr[6], (CollapsingToolbarLayout) objArr[14], (WaterDropHeader) objArr[21], (ImageView) objArr[23], (ImageView) objArr[19], (LinearLayout) objArr[17], (SmartRefreshLayout) objArr[20], (RelativeLayout) objArr[1], (RecyclerView) objArr[3], (Toolbar) objArr[15], (TextView) objArr[16], (TextView) objArr[22], (TextView) objArr[18]);
        this.A = -1L;
        this.f40119c.setTag(null);
        this.f40120d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40134r = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[10];
        this.f40135s = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[11];
        this.f40136t = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[12];
        this.f40137u = relativeLayout3;
        relativeLayout3.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[4];
        this.f40138v = recyclerView;
        recyclerView.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[5];
        this.f40139w = recyclerView2;
        recyclerView2.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[7];
        this.f40140x = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[8];
        this.f40141y = relativeLayout5;
        relativeLayout5.setTag(null);
        RecyclerView recyclerView3 = (RecyclerView) objArr[9];
        this.f40142z = recyclerView3;
        recyclerView3.setTag(null);
        this.f40127k.setTag(null);
        this.f40128l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 256;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 512;
        }
        return true;
    }

    public final boolean e(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 16;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        Boolean bool;
        c<c2> cVar;
        ObservableList observableList;
        b bVar;
        b bVar2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        c<c2> cVar2;
        ObservableList observableList2;
        c<a2> cVar3;
        ObservableList observableList3;
        ObservableList observableList4;
        c<y1> cVar4;
        c<c2> cVar5;
        ObservableList observableList5;
        ObservableList observableList6;
        c<a2> cVar6;
        ObservableList observableList7;
        Object obj;
        ObservableList observableList8;
        c<c2> cVar7;
        ObservableList observableList9;
        c<c2> cVar8;
        ObservableList observableList10;
        ObservableList observableList11;
        c<y1> cVar9;
        b bVar3;
        b bVar4;
        b bVar5;
        Boolean bool5;
        c<c2> cVar10;
        ObservableList observableList12;
        c<c2> cVar11;
        Boolean bool6;
        ObservableField<Boolean> observableField;
        ObservableField<Boolean> observableField2;
        c<c2> cVar12;
        synchronized (this) {
            j10 = this.A;
            this.A = 0L;
        }
        LOOKCHANNELVIEWMODEL lookchannelviewmodel = this.f40133q;
        Object obj2 = null;
        if ((4095 & j10) != 0) {
            if ((j10 & 3200) != 0) {
                if (lookchannelviewmodel != null) {
                    cVar6 = lookchannelviewmodel.A;
                    observableList7 = lookchannelviewmodel.f41268z;
                } else {
                    cVar6 = null;
                    observableList7 = null;
                }
                updateRegistration(7, observableList7);
            } else {
                cVar6 = null;
                observableList7 = null;
            }
            if ((j10 & 3104) != 0) {
                if (lookchannelviewmodel != null) {
                    obj = lookchannelviewmodel.G;
                    observableList8 = lookchannelviewmodel.F;
                } else {
                    obj = null;
                    observableList8 = null;
                }
                updateRegistration(5, observableList8);
            } else {
                obj = null;
                observableList8 = null;
            }
            if ((j10 & 3074) != 0) {
                if (lookchannelviewmodel != null) {
                    cVar7 = lookchannelviewmodel.I;
                    observableList9 = lookchannelviewmodel.H;
                } else {
                    cVar7 = null;
                    observableList9 = null;
                }
                updateRegistration(1, observableList9);
            } else {
                cVar7 = null;
                observableList9 = null;
            }
            if ((j10 & 3073) == 0) {
                bool2 = null;
            } else {
                ObservableField<Boolean> observableField3 = lookchannelviewmodel != null ? lookchannelviewmodel.f41256n : null;
                updateRegistration(0, observableField3);
                if (observableField3 != null) {
                    bool2 = observableField3.get();
                } else {
                    bool2 = null;
                }
            }
            if ((j10 & 3080) != 0) {
                if (lookchannelviewmodel != null) {
                    cVar8 = lookchannelviewmodel.C;
                    observableList10 = lookchannelviewmodel.B;
                } else {
                    cVar8 = null;
                    observableList10 = null;
                }
                updateRegistration(3, observableList10);
            } else {
                cVar8 = null;
                observableList10 = null;
            }
            if ((j10 & 3136) != 0) {
                if (lookchannelviewmodel != null) {
                    cVar9 = lookchannelviewmodel.f41267y;
                    observableList11 = lookchannelviewmodel.f41266x;
                } else {
                    observableList11 = null;
                    cVar9 = null;
                }
                updateRegistration(6, observableList11);
            } else {
                observableList11 = null;
                cVar9 = null;
            }
            if ((j10 & 3072) == 0 || lookchannelviewmodel == null) {
                bVar3 = null;
                bVar4 = null;
            } else {
                bVar4 = lookchannelviewmodel.M;
                bVar3 = lookchannelviewmodel.L;
            }
            if ((j10 & 3076) != 0) {
                bVar5 = bVar3;
                ObservableField<Boolean> observableField4 = lookchannelviewmodel != null ? lookchannelviewmodel.f41258p : null;
                updateRegistration(2, observableField4);
                if (observableField4 != null) {
                    bool5 = observableField4.get();
                }
                if ((j10 & 3088) != 0) {
                    if (lookchannelviewmodel != null) {
                        observableList12 = lookchannelviewmodel.D;
                        cVar12 = lookchannelviewmodel.E;
                    } else {
                        observableList12 = null;
                        cVar12 = null;
                    }
                    updateRegistration(4, observableList12);
                    cVar10 = cVar12;
                } else {
                    bool5 = bool5;
                    cVar10 = null;
                    observableList12 = null;
                }
                if ((j10 & 3328) != 0) {
                    cVar11 = cVar10;
                    if (lookchannelviewmodel != null) {
                        observableField2 = lookchannelviewmodel.f41257o;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(8, observableField2);
                    if (observableField2 != null) {
                        bool6 = observableField2.get();
                    }
                    if ((j10 & 3584) != 0) {
                        if (lookchannelviewmodel != null) {
                            observableField = lookchannelviewmodel.f41255m;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(9, observableField);
                        if (observableField != null) {
                            obj2 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    observableList3 = observableList7;
                    cVar4 = cVar9;
                    cVar = cVar7;
                    observableList = observableList9;
                    observableList4 = observableList8;
                    cVar5 = cVar8;
                    observableList6 = observableList10;
                    bool = obj2;
                    observableList5 = observableList11;
                    bVar2 = bVar5;
                    bool3 = bool5;
                    cVar2 = cVar11;
                    bool4 = bool6;
                    obj2 = obj;
                    bVar = bVar4;
                    observableList2 = observableList12;
                } else {
                    cVar11 = cVar10;
                    observableList12 = observableList12;
                }
                bool6 = null;
                if ((j10 & 3584) != 0) {
                    if (lookchannelviewmodel != null) {
                        observableField = lookchannelviewmodel.f41255m;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(9, observableField);
                    if (observableField != null) {
                        obj2 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                observableList3 = observableList7;
                cVar4 = cVar9;
                cVar = cVar7;
                observableList = observableList9;
                observableList4 = observableList8;
                cVar5 = cVar8;
                observableList6 = observableList10;
                bool = obj2;
                observableList5 = observableList11;
                bVar2 = bVar5;
                bool3 = bool5;
                cVar2 = cVar11;
                bool4 = bool6;
                obj2 = obj;
                bVar = bVar4;
                observableList2 = observableList12;
            } else {
                bVar5 = bVar3;
                bVar4 = bVar4;
            }
            bool5 = null;
            if ((j10 & 3088) != 0) {
                if (lookchannelviewmodel != null) {
                    observableList12 = lookchannelviewmodel.D;
                    cVar12 = lookchannelviewmodel.E;
                } else {
                    observableList12 = null;
                    cVar12 = null;
                }
                updateRegistration(4, observableList12);
                cVar10 = cVar12;
            } else {
                bool5 = bool5;
                cVar10 = null;
                observableList12 = null;
            }
            if ((j10 & 3328) != 0) {
                cVar11 = cVar10;
                if (lookchannelviewmodel != null) {
                    observableField2 = lookchannelviewmodel.f41257o;
                } else {
                    observableField2 = null;
                }
                updateRegistration(8, observableField2);
                if (observableField2 != null) {
                    bool6 = observableField2.get();
                }
                if ((j10 & 3584) != 0) {
                    if (lookchannelviewmodel != null) {
                        observableField = lookchannelviewmodel.f41255m;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(9, observableField);
                    if (observableField != null) {
                        obj2 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                observableList3 = observableList7;
                cVar4 = cVar9;
                cVar = cVar7;
                observableList = observableList9;
                observableList4 = observableList8;
                cVar5 = cVar8;
                observableList6 = observableList10;
                bool = obj2;
                observableList5 = observableList11;
                bVar2 = bVar5;
                bool3 = bool5;
                cVar2 = cVar11;
                bool4 = bool6;
                obj2 = obj;
                bVar = bVar4;
                observableList2 = observableList12;
            } else {
                cVar11 = cVar10;
                observableList12 = observableList12;
            }
            bool6 = null;
            if ((j10 & 3584) != 0) {
                if (lookchannelviewmodel != null) {
                    observableField = lookchannelviewmodel.f41255m;
                } else {
                    observableField = null;
                }
                updateRegistration(9, observableField);
                if (observableField != null) {
                    obj2 = (Boolean) observableField.get();
                }
            }
            cVar3 = cVar6;
            observableList3 = observableList7;
            cVar4 = cVar9;
            cVar = cVar7;
            observableList = observableList9;
            observableList4 = observableList8;
            cVar5 = cVar8;
            observableList6 = observableList10;
            bool = obj2;
            observableList5 = observableList11;
            bVar2 = bVar5;
            bool3 = bool5;
            cVar2 = cVar11;
            bool4 = bool6;
            obj2 = obj;
            bVar = bVar4;
            observableList2 = observableList12;
        } else {
            bool = 0;
            cVar = null;
            observableList = null;
            bVar = null;
            bVar2 = null;
            bool2 = null;
            bool3 = null;
            bool4 = null;
            cVar2 = null;
            observableList2 = null;
            cVar3 = null;
            observableList3 = null;
            observableList4 = null;
            cVar4 = null;
            cVar5 = null;
            observableList5 = null;
            observableList6 = null;
        }
        if ((PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH & j10) != 0) {
            ViewAdapter.b(this.f40119c, a.c(0, false));
            ViewAdapter.b(this.f40120d, a.c(0, false));
            ViewAdapter.b(this.f40138v, a.c(0, false));
            ViewAdapter.b(this.f40139w, a.c(0, false));
            ViewAdapter.b(this.f40142z, a.a(4));
            ViewAdapter.b(this.f40128l, a.c(0, false));
        }
        if ((j10 & 3200) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40119c, cVar3, observableList3, null, null, null, null);
        }
        if ((j10 & 3074) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40120d, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 3584) != 0) {
            xl.a.a(this.f40135s, bool);
        }
        if ((j10 & 3072) != 0) {
            xl.a.b(this.f40136t, bVar, false);
            xl.a.b(this.f40127k, bVar2, false);
        }
        if ((j10 & 3073) != 0) {
            xl.a.a(this.f40137u, bool2);
        }
        if ((3088 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40138v, cVar2, observableList2, null, null, null, null);
        }
        if ((j10 & 3104) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40139w, obj2, observableList4, null, null, null, null);
        }
        if ((3076 & j10) != 0) {
            xl.a.a(this.f40140x, bool3);
        }
        if ((3328 & j10) != 0) {
            xl.a.a(this.f40141y, bool4);
        }
        if ((3136 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40142z, cVar4, observableList5, null, null, null, null);
        }
        if ((j10 & 3080) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40128l, cVar5, observableList6, null, null, null, null);
        }
    }

    public final boolean f(ObservableList<a2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 128;
        }
        return true;
    }

    public final boolean g(ObservableList<y1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 64;
        }
        return true;
    }

    public final boolean h(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 2;
        }
        return true;
    }

    public final boolean i(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 8;
        }
        return true;
    }

    public final boolean j(ObservableList<c2> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 32;
        }
        return true;
    }

    public void k(@Nullable LOOKCHANNELVIEWMODEL lookchannelviewmodel) {
        this.f40133q = lookchannelviewmodel;
        synchronized (this) {
            this.A |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return a((ObservableField) obj, i11);
            case 1:
                return h((ObservableList) obj, i11);
            case 2:
                return c((ObservableField) obj, i11);
            case 3:
                return i((ObservableList) obj, i11);
            case 4:
                return e((ObservableList) obj, i11);
            case 5:
                return j((ObservableList) obj, i11);
            case 6:
                return g((ObservableList) obj, i11);
            case 7:
                return f((ObservableList) obj, i11);
            case 8:
                return b((ObservableField) obj, i11);
            case 9:
                return d((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
