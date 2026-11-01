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
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import fm.c;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.ViewAdapter;
import me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a;
import ul.b;
import w9.p0;
import w9.q0;
import w9.s0;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentChannelBindingImpl extends FragmentChannelBinding {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts H = null;

    @Nullable
    public static final SparseIntArray I;

    @NonNull
    public final RelativeLayout A;

    @NonNull
    public final ImageView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final RelativeLayout D;

    @NonNull
    public final RecyclerView E;

    @NonNull
    public final RecyclerView F;
    public long G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ImageView f40110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f40111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final Button f40116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40117z;

    public FragmentChannelBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.G = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        m((CHANNELVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 18);
        sparseIntArray.put(R.id.collapsingToolbarLayout, 19);
        sparseIntArray.put(R.id.sortToolbar, 20);
        sparseIntArray.put(R.id.rl_title, 21);
        sparseIntArray.put(R.id.sortToolbar_title, 22);
        sparseIntArray.put(R.id.ll_top, 23);
        sparseIntArray.put(R.id.tv_name, 24);
        sparseIntArray.put(R.id.img_loading1, 25);
        sparseIntArray.put(R.id.refresh_layout, 26);
        sparseIntArray.put(R.id.header, 27);
        sparseIntArray.put(R.id.tv_empty, 28);
        sparseIntArray.put(R.id.img_loading, 29);
    }

    public FragmentChannelBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, (AppBarLayout) objArr[18], (RecyclerView) objArr[6], (RecyclerView) objArr[10], (CollapsingToolbarLayout) objArr[19], (WaterDropHeader) objArr[27], (ImageView) objArr[29], (ImageView) objArr[25], (LinearLayout) objArr[23], (SmartRefreshLayout) objArr[26], (RelativeLayout) objArr[21], (RecyclerView) objArr[7], (Toolbar) objArr[20], (TextView) objArr[22], (TextView) objArr[28], (TextView) objArr[24]);
        this.G = -1L;
        this.f40094c.setTag(null);
        this.f40095d.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40109r = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f40110s = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.f40111t = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[12];
        this.f40112u = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[13];
        this.f40113v = relativeLayout3;
        relativeLayout3.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[14];
        this.f40114w = recyclerView;
        recyclerView.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[15];
        this.f40115x = relativeLayout4;
        relativeLayout4.setTag(null);
        Button button = (Button) objArr[16];
        this.f40116y = button;
        button.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[17];
        this.f40117z = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[2];
        this.A = relativeLayout6;
        relativeLayout6.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.B = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.C = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) objArr[5];
        this.D = relativeLayout7;
        relativeLayout7.setTag(null);
        RecyclerView recyclerView2 = (RecyclerView) objArr[8];
        this.E = recyclerView2;
        recyclerView2.setTag(null);
        RecyclerView recyclerView3 = (RecyclerView) objArr[9];
        this.F = recyclerView3;
        recyclerView3.setTag(null);
        this.f40103l.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1024;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 4;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    public final boolean e(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 32;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0195  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:108:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x01af  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        c<s0> cVar;
        ObservableList observableList;
        String str;
        Boolean bool;
        Object obj;
        b bVar2;
        String str2;
        Boolean bool2;
        b bVar3;
        Boolean bool3;
        c<p0> cVar2;
        ObservableList observableList2;
        ObservableList observableList3;
        c<q0> cVar3;
        ObservableList observableList4;
        c<s0> cVar4;
        c<s0> cVar5;
        ObservableList observableList5;
        ObservableList observableList6;
        c<q0> cVar6;
        ObservableList observableList7;
        c<s0> cVar7;
        ObservableList observableList8;
        c<s0> cVar8;
        ObservableList observableList9;
        Boolean bool4;
        c<s0> cVar9;
        ObservableList observableList10;
        b bVar4;
        b bVar5;
        ObservableList observableList11;
        Boolean bool5;
        String str3;
        Object obj2;
        Object obj3;
        String str4;
        Boolean bool6;
        ObservableField<Boolean> observableField;
        ObservableField<Boolean> observableField2;
        ObservableField<String> observableField3;
        Object obj4;
        ObservableField<String> observableField4;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        CHANNELVIEWMODEL channelviewmodel = this.f40108q;
        Object obj5 = null;
        if ((16383 & j10) != 0) {
            if ((j10 & 12800) != 0) {
                if (channelviewmodel != null) {
                    cVar6 = channelviewmodel.B;
                    observableList7 = channelviewmodel.A;
                } else {
                    cVar6 = null;
                    observableList7 = null;
                }
                updateRegistration(9, observableList7);
            } else {
                cVar6 = null;
                observableList7 = null;
            }
            if ((j10 & 12352) != 0) {
                if (channelviewmodel != null) {
                    cVar7 = channelviewmodel.H;
                    observableList8 = channelviewmodel.G;
                } else {
                    cVar7 = null;
                    observableList8 = null;
                }
                updateRegistration(6, observableList8);
            } else {
                cVar7 = null;
                observableList8 = null;
            }
            if ((j10 & 12290) != 0) {
                if (channelviewmodel != null) {
                    cVar8 = channelviewmodel.J;
                    observableList9 = channelviewmodel.I;
                } else {
                    cVar8 = null;
                    observableList9 = null;
                }
                updateRegistration(1, observableList9);
            } else {
                cVar8 = null;
                observableList9 = null;
            }
            if ((j10 & 12289) == 0) {
                bool4 = null;
            } else {
                ObservableField<Boolean> observableField5 = channelviewmodel != null ? channelviewmodel.f41082o : null;
                updateRegistration(0, observableField5);
                if (observableField5 != null) {
                    bool4 = observableField5.get();
                } else {
                    bool4 = null;
                }
            }
            if ((j10 & 12304) != 0) {
                if (channelviewmodel != null) {
                    cVar9 = channelviewmodel.D;
                    observableList10 = channelviewmodel.C;
                } else {
                    cVar9 = null;
                    observableList10 = null;
                }
                updateRegistration(4, observableList10);
            } else {
                cVar9 = null;
                observableList10 = null;
            }
            if ((j10 & 12288) == 0 || channelviewmodel == null) {
                bVar4 = null;
                bVar5 = null;
                bVar3 = null;
            } else {
                bVar3 = channelviewmodel.K;
                bVar4 = channelviewmodel.M;
                bVar5 = channelviewmodel.L;
            }
            if ((j10 & 12416) != 0) {
                if (channelviewmodel != null) {
                    cVar2 = channelviewmodel.f41093z;
                    observableList11 = channelviewmodel.f41092y;
                } else {
                    observableList11 = null;
                    cVar2 = null;
                }
                updateRegistration(7, observableList11);
            } else {
                bVar5 = bVar5;
                observableList11 = null;
                cVar2 = null;
            }
            if ((j10 & 12292) != 0) {
                ObservableField<Boolean> observableField6 = channelviewmodel != null ? channelviewmodel.f41084q : null;
                updateRegistration(2, observableField6);
                if (observableField6 != null) {
                    bool5 = observableField6.get();
                }
                if ((j10 & 12296) != 0) {
                    if (channelviewmodel != null) {
                        observableField4 = channelviewmodel.f41085r;
                    } else {
                        observableField4 = null;
                    }
                    updateRegistration(3, observableField4);
                    if (observableField4 != null) {
                        str3 = observableField4.get();
                    }
                    if ((j10 & 12320) != 0) {
                        if (channelviewmodel != null) {
                            observableList3 = channelviewmodel.E;
                            obj4 = channelviewmodel.F;
                        } else {
                            observableList3 = null;
                            obj4 = null;
                        }
                        updateRegistration(5, observableList3);
                        obj2 = obj4;
                    } else {
                        str3 = str3;
                        obj2 = null;
                        observableList3 = null;
                    }
                    if ((j10 & 12544) != 0) {
                        obj3 = obj2;
                        if (channelviewmodel != null) {
                            observableField3 = channelviewmodel.f41075h;
                        } else {
                            observableField3 = null;
                        }
                        updateRegistration(8, observableField3);
                        if (observableField3 != null) {
                            str4 = observableField3.get();
                        }
                        if ((j10 & 13312) != 0) {
                            if (channelviewmodel != null) {
                                observableField2 = channelviewmodel.f41083p;
                            } else {
                                observableField2 = null;
                            }
                            updateRegistration(10, observableField2);
                            if (observableField2 != null) {
                                bool6 = observableField2.get();
                            }
                            if ((j10 & 14336) != 0) {
                                if (channelviewmodel != null) {
                                    observableField = channelviewmodel.f41081n;
                                } else {
                                    observableField = null;
                                }
                                updateRegistration(11, observableField);
                                if (observableField != null) {
                                    obj5 = (Boolean) observableField.get();
                                }
                            }
                            cVar3 = cVar6;
                            cVar4 = cVar7;
                            observableList5 = observableList8;
                            cVar = cVar8;
                            observableList = observableList9;
                            bool = bool4;
                            cVar5 = cVar9;
                            observableList6 = observableList10;
                            observableList4 = observableList7;
                            obj = obj5;
                            bVar = bVar4;
                            bVar2 = bVar5;
                            observableList2 = observableList11;
                            bool2 = bool5;
                            str2 = str3;
                            obj5 = obj3;
                            str = str4;
                            bool3 = bool6;
                        } else {
                            str4 = str4;
                        }
                        bool6 = null;
                        if ((j10 & 14336) != 0) {
                            if (channelviewmodel != null) {
                                observableField = channelviewmodel.f41081n;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                obj5 = (Boolean) observableField.get();
                            }
                        }
                        cVar3 = cVar6;
                        cVar4 = cVar7;
                        observableList5 = observableList8;
                        cVar = cVar8;
                        observableList = observableList9;
                        bool = bool4;
                        cVar5 = cVar9;
                        observableList6 = observableList10;
                        observableList4 = observableList7;
                        obj = obj5;
                        bVar = bVar4;
                        bVar2 = bVar5;
                        observableList2 = observableList11;
                        bool2 = bool5;
                        str2 = str3;
                        obj5 = obj3;
                        str = str4;
                        bool3 = bool6;
                    } else {
                        obj3 = obj2;
                        observableList3 = observableList3;
                    }
                    str4 = null;
                    if ((j10 & 13312) != 0) {
                        if (channelviewmodel != null) {
                            observableField2 = channelviewmodel.f41083p;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                            bool6 = observableField2.get();
                        }
                        if ((j10 & 14336) != 0) {
                            if (channelviewmodel != null) {
                                observableField = channelviewmodel.f41081n;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                obj5 = (Boolean) observableField.get();
                            }
                        }
                        cVar3 = cVar6;
                        cVar4 = cVar7;
                        observableList5 = observableList8;
                        cVar = cVar8;
                        observableList = observableList9;
                        bool = bool4;
                        cVar5 = cVar9;
                        observableList6 = observableList10;
                        observableList4 = observableList7;
                        obj = obj5;
                        bVar = bVar4;
                        bVar2 = bVar5;
                        observableList2 = observableList11;
                        bool2 = bool5;
                        str2 = str3;
                        obj5 = obj3;
                        str = str4;
                        bool3 = bool6;
                    } else {
                        str4 = str4;
                    }
                    bool6 = null;
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    bool5 = bool5;
                }
                str3 = null;
                if ((j10 & 12320) != 0) {
                    if (channelviewmodel != null) {
                        observableList3 = channelviewmodel.E;
                        obj4 = channelviewmodel.F;
                    } else {
                        observableList3 = null;
                        obj4 = null;
                    }
                    updateRegistration(5, observableList3);
                    obj2 = obj4;
                } else {
                    str3 = str3;
                    obj2 = null;
                    observableList3 = null;
                }
                if ((j10 & 12544) != 0) {
                    obj3 = obj2;
                    if (channelviewmodel != null) {
                        observableField3 = channelviewmodel.f41075h;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(8, observableField3);
                    if (observableField3 != null) {
                        str4 = observableField3.get();
                    }
                    if ((j10 & 13312) != 0) {
                        if (channelviewmodel != null) {
                            observableField2 = channelviewmodel.f41083p;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                            bool6 = observableField2.get();
                        }
                        if ((j10 & 14336) != 0) {
                            if (channelviewmodel != null) {
                                observableField = channelviewmodel.f41081n;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                obj5 = (Boolean) observableField.get();
                            }
                        }
                        cVar3 = cVar6;
                        cVar4 = cVar7;
                        observableList5 = observableList8;
                        cVar = cVar8;
                        observableList = observableList9;
                        bool = bool4;
                        cVar5 = cVar9;
                        observableList6 = observableList10;
                        observableList4 = observableList7;
                        obj = obj5;
                        bVar = bVar4;
                        bVar2 = bVar5;
                        observableList2 = observableList11;
                        bool2 = bool5;
                        str2 = str3;
                        obj5 = obj3;
                        str = str4;
                        bool3 = bool6;
                    } else {
                        str4 = str4;
                    }
                    bool6 = null;
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    obj3 = obj2;
                    observableList3 = observableList3;
                }
                str4 = null;
                if ((j10 & 13312) != 0) {
                    if (channelviewmodel != null) {
                        observableField2 = channelviewmodel.f41083p;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                        bool6 = observableField2.get();
                    }
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    str4 = str4;
                }
                bool6 = null;
                if ((j10 & 14336) != 0) {
                    if (channelviewmodel != null) {
                        observableField = channelviewmodel.f41081n;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        obj5 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                cVar4 = cVar7;
                observableList5 = observableList8;
                cVar = cVar8;
                observableList = observableList9;
                bool = bool4;
                cVar5 = cVar9;
                observableList6 = observableList10;
                observableList4 = observableList7;
                obj = obj5;
                bVar = bVar4;
                bVar2 = bVar5;
                observableList2 = observableList11;
                bool2 = bool5;
                str2 = str3;
                obj5 = obj3;
                str = str4;
                bool3 = bool6;
            } else {
                observableList11 = observableList11;
            }
            bool5 = null;
            if ((j10 & 12296) != 0) {
                if (channelviewmodel != null) {
                    observableField4 = channelviewmodel.f41085r;
                } else {
                    observableField4 = null;
                }
                updateRegistration(3, observableField4);
                if (observableField4 != null) {
                    str3 = observableField4.get();
                }
                if ((j10 & 12320) != 0) {
                    if (channelviewmodel != null) {
                        observableList3 = channelviewmodel.E;
                        obj4 = channelviewmodel.F;
                    } else {
                        observableList3 = null;
                        obj4 = null;
                    }
                    updateRegistration(5, observableList3);
                    obj2 = obj4;
                } else {
                    str3 = str3;
                    obj2 = null;
                    observableList3 = null;
                }
                if ((j10 & 12544) != 0) {
                    obj3 = obj2;
                    if (channelviewmodel != null) {
                        observableField3 = channelviewmodel.f41075h;
                    } else {
                        observableField3 = null;
                    }
                    updateRegistration(8, observableField3);
                    if (observableField3 != null) {
                        str4 = observableField3.get();
                    }
                    if ((j10 & 13312) != 0) {
                        if (channelviewmodel != null) {
                            observableField2 = channelviewmodel.f41083p;
                        } else {
                            observableField2 = null;
                        }
                        updateRegistration(10, observableField2);
                        if (observableField2 != null) {
                            bool6 = observableField2.get();
                        }
                        if ((j10 & 14336) != 0) {
                            if (channelviewmodel != null) {
                                observableField = channelviewmodel.f41081n;
                            } else {
                                observableField = null;
                            }
                            updateRegistration(11, observableField);
                            if (observableField != null) {
                                obj5 = (Boolean) observableField.get();
                            }
                        }
                        cVar3 = cVar6;
                        cVar4 = cVar7;
                        observableList5 = observableList8;
                        cVar = cVar8;
                        observableList = observableList9;
                        bool = bool4;
                        cVar5 = cVar9;
                        observableList6 = observableList10;
                        observableList4 = observableList7;
                        obj = obj5;
                        bVar = bVar4;
                        bVar2 = bVar5;
                        observableList2 = observableList11;
                        bool2 = bool5;
                        str2 = str3;
                        obj5 = obj3;
                        str = str4;
                        bool3 = bool6;
                    } else {
                        str4 = str4;
                    }
                    bool6 = null;
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    obj3 = obj2;
                    observableList3 = observableList3;
                }
                str4 = null;
                if ((j10 & 13312) != 0) {
                    if (channelviewmodel != null) {
                        observableField2 = channelviewmodel.f41083p;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                        bool6 = observableField2.get();
                    }
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    str4 = str4;
                }
                bool6 = null;
                if ((j10 & 14336) != 0) {
                    if (channelviewmodel != null) {
                        observableField = channelviewmodel.f41081n;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        obj5 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                cVar4 = cVar7;
                observableList5 = observableList8;
                cVar = cVar8;
                observableList = observableList9;
                bool = bool4;
                cVar5 = cVar9;
                observableList6 = observableList10;
                observableList4 = observableList7;
                obj = obj5;
                bVar = bVar4;
                bVar2 = bVar5;
                observableList2 = observableList11;
                bool2 = bool5;
                str2 = str3;
                obj5 = obj3;
                str = str4;
                bool3 = bool6;
            } else {
                bool5 = bool5;
            }
            str3 = null;
            if ((j10 & 12320) != 0) {
                if (channelviewmodel != null) {
                    observableList3 = channelviewmodel.E;
                    obj4 = channelviewmodel.F;
                } else {
                    observableList3 = null;
                    obj4 = null;
                }
                updateRegistration(5, observableList3);
                obj2 = obj4;
            } else {
                str3 = str3;
                obj2 = null;
                observableList3 = null;
            }
            if ((j10 & 12544) != 0) {
                obj3 = obj2;
                if (channelviewmodel != null) {
                    observableField3 = channelviewmodel.f41075h;
                } else {
                    observableField3 = null;
                }
                updateRegistration(8, observableField3);
                if (observableField3 != null) {
                    str4 = observableField3.get();
                }
                if ((j10 & 13312) != 0) {
                    if (channelviewmodel != null) {
                        observableField2 = channelviewmodel.f41083p;
                    } else {
                        observableField2 = null;
                    }
                    updateRegistration(10, observableField2);
                    if (observableField2 != null) {
                        bool6 = observableField2.get();
                    }
                    if ((j10 & 14336) != 0) {
                        if (channelviewmodel != null) {
                            observableField = channelviewmodel.f41081n;
                        } else {
                            observableField = null;
                        }
                        updateRegistration(11, observableField);
                        if (observableField != null) {
                            obj5 = (Boolean) observableField.get();
                        }
                    }
                    cVar3 = cVar6;
                    cVar4 = cVar7;
                    observableList5 = observableList8;
                    cVar = cVar8;
                    observableList = observableList9;
                    bool = bool4;
                    cVar5 = cVar9;
                    observableList6 = observableList10;
                    observableList4 = observableList7;
                    obj = obj5;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    observableList2 = observableList11;
                    bool2 = bool5;
                    str2 = str3;
                    obj5 = obj3;
                    str = str4;
                    bool3 = bool6;
                } else {
                    str4 = str4;
                }
                bool6 = null;
                if ((j10 & 14336) != 0) {
                    if (channelviewmodel != null) {
                        observableField = channelviewmodel.f41081n;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        obj5 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                cVar4 = cVar7;
                observableList5 = observableList8;
                cVar = cVar8;
                observableList = observableList9;
                bool = bool4;
                cVar5 = cVar9;
                observableList6 = observableList10;
                observableList4 = observableList7;
                obj = obj5;
                bVar = bVar4;
                bVar2 = bVar5;
                observableList2 = observableList11;
                bool2 = bool5;
                str2 = str3;
                obj5 = obj3;
                str = str4;
                bool3 = bool6;
            } else {
                obj3 = obj2;
                observableList3 = observableList3;
            }
            str4 = null;
            if ((j10 & 13312) != 0) {
                if (channelviewmodel != null) {
                    observableField2 = channelviewmodel.f41083p;
                } else {
                    observableField2 = null;
                }
                updateRegistration(10, observableField2);
                if (observableField2 != null) {
                    bool6 = observableField2.get();
                }
                if ((j10 & 14336) != 0) {
                    if (channelviewmodel != null) {
                        observableField = channelviewmodel.f41081n;
                    } else {
                        observableField = null;
                    }
                    updateRegistration(11, observableField);
                    if (observableField != null) {
                        obj5 = (Boolean) observableField.get();
                    }
                }
                cVar3 = cVar6;
                cVar4 = cVar7;
                observableList5 = observableList8;
                cVar = cVar8;
                observableList = observableList9;
                bool = bool4;
                cVar5 = cVar9;
                observableList6 = observableList10;
                observableList4 = observableList7;
                obj = obj5;
                bVar = bVar4;
                bVar2 = bVar5;
                observableList2 = observableList11;
                bool2 = bool5;
                str2 = str3;
                obj5 = obj3;
                str = str4;
                bool3 = bool6;
            } else {
                str4 = str4;
            }
            bool6 = null;
            if ((j10 & 14336) != 0) {
                if (channelviewmodel != null) {
                    observableField = channelviewmodel.f41081n;
                } else {
                    observableField = null;
                }
                updateRegistration(11, observableField);
                if (observableField != null) {
                    obj5 = (Boolean) observableField.get();
                }
            }
            cVar3 = cVar6;
            cVar4 = cVar7;
            observableList5 = observableList8;
            cVar = cVar8;
            observableList = observableList9;
            bool = bool4;
            cVar5 = cVar9;
            observableList6 = observableList10;
            observableList4 = observableList7;
            obj = obj5;
            bVar = bVar4;
            bVar2 = bVar5;
            observableList2 = observableList11;
            bool2 = bool5;
            str2 = str3;
            obj5 = obj3;
            str = str4;
            bool3 = bool6;
        } else {
            bVar = null;
            cVar = null;
            observableList = null;
            str = null;
            bool = null;
            obj = null;
            bVar2 = null;
            str2 = null;
            bool2 = null;
            bVar3 = null;
            bool3 = null;
            cVar2 = null;
            observableList2 = null;
            observableList3 = null;
            cVar3 = null;
            observableList4 = null;
            cVar4 = null;
            cVar5 = null;
            observableList5 = null;
            observableList6 = null;
        }
        if ((j10 & PlaybackStateCompat.ACTION_PLAY_FROM_URI) != 0) {
            ViewAdapter.b(this.f40094c, a.c(0, false));
            ViewAdapter.b(this.f40095d, a.c(0, false));
            ViewAdapter.b(this.f40114w, a.a(3));
            ViewAdapter.b(this.E, a.c(0, false));
            ViewAdapter.b(this.F, a.c(0, false));
            ViewAdapter.b(this.f40103l, a.c(0, false));
        }
        if ((j10 & 12800) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40094c, cVar3, observableList4, null, null, null, null);
        }
        if ((j10 & 12290) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40095d, cVar, observableList, null, null, null, null);
        }
        if ((j10 & 12288) != 0) {
            xl.a.b(this.f40110s, bVar3, false);
            xl.a.b(this.f40116y, bVar, false);
            xl.a.b(this.A, bVar2, false);
            xl.a.b(this.B, bVar3, false);
            xl.a.b(this.D, bVar2, false);
        }
        if ((j10 & 12296) != 0) {
            TextViewBindingAdapter.setText(this.f40111t, str2);
        }
        if ((j10 & 12292) != 0) {
            xl.a.a(this.f40112u, bool2);
        }
        if ((13312 & j10) != 0) {
            xl.a.a(this.f40113v, bool3);
        }
        if ((12416 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40114w, cVar2, observableList2, null, null, null, null);
        }
        if ((14336 & j10) != 0) {
            xl.a.a(this.f40115x, obj);
        }
        if ((j10 & 12289) != 0) {
            xl.a.a(this.f40117z, bool);
        }
        if ((12544 & j10) != 0) {
            TextViewBindingAdapter.setText(this.C, str);
        }
        if ((12320 & j10) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.E, obj5, observableList3, null, null, null, null);
        }
        if ((j10 & 12352) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.F, cVar4, observableList5, null, null, null, null);
        }
        if ((j10 & 12304) != 0) {
            me.tatarka.bindingcollectionadapter2.a.a(this.f40103l, cVar5, observableList6, null, null, null, null);
        }
    }

    public final boolean f(ObservableList<q0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 512;
        }
        return true;
    }

    public final boolean g(ObservableList<p0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 128;
        }
        return true;
    }

    public final boolean h(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 2;
        }
        return true;
    }

    public final boolean i(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 16;
        }
        return true;
    }

    public final boolean j(ObservableList<s0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 64;
        }
        return true;
    }

    public final boolean k(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 256;
        }
        return true;
    }

    public final boolean l(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 8;
        }
        return true;
    }

    public void m(@Nullable CHANNELVIEWMODEL channelviewmodel) {
        this.f40108q = channelviewmodel;
        synchronized (this) {
            this.G |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
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
                return l((ObservableField) obj, i11);
            case 4:
                return i((ObservableList) obj, i11);
            case 5:
                return e((ObservableList) obj, i11);
            case 6:
                return j((ObservableList) obj, i11);
            case 7:
                return g((ObservableList) obj, i11);
            case 8:
                return k((ObservableField) obj, i11);
            case 9:
                return f((ObservableList) obj, i11);
            case 10:
                return b((ObservableField) obj, i11);
            case 11:
                return d((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
