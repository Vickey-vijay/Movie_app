package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.ranklist.RankNumberNewViewModel;
import ul.b;
import xl.a;

/* JADX INFO: loaded from: classes5.dex */
public class FragmentRankNewBindingImpl extends FragmentRankNewBinding {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40286o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40287p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Button f40290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40292n;

    public FragmentRankNewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f40286o, f40287p));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40292n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40292n = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        c((RankNumberNewViewModel) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40287p = sparseIntArray;
        sparseIntArray.put(R.id.view_top, 4);
        sparseIntArray.put(R.id.tab_layout, 5);
        sparseIntArray.put(R.id.tabLine, 6);
        sparseIntArray.put(R.id.mRv, 7);
        sparseIntArray.put(R.id.vp_content, 8);
        sparseIntArray.put(R.id.tv_empty, 9);
        sparseIntArray.put(R.id.img_loading, 10);
    }

    public FragmentRankNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[10], (RecyclerView) objArr[7], (TabLayout) objArr[5], (View) objArr[6], (TextView) objArr[9], (View) objArr[4], (ViewPager) objArr[8]);
        this.f40292n = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f40288j = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[1];
        this.f40289k = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[2];
        this.f40290l = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[3];
        this.f40291m = relativeLayout3;
        relativeLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40292n |= 2;
        }
        return true;
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40292n |= 1;
        }
        return true;
    }

    public void c(@Nullable RankNumberNewViewModel rankNumberNewViewModel) {
        this.f40285i = rankNumberNewViewModel;
        synchronized (this) {
            this.f40292n |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        b bVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        synchronized (this) {
            j10 = this.f40292n;
            this.f40292n = 0L;
        }
        RankNumberNewViewModel rankNumberNewViewModel = this.f40285i;
        if ((15 & j10) != 0) {
            if ((j10 & 13) == 0) {
                bool3 = null;
            } else {
                ObservableField<Boolean> observableField = rankNumberNewViewModel != null ? rankNumberNewViewModel.f42177i : null;
                updateRegistration(0, observableField);
                if (observableField != null) {
                    bool3 = observableField.get();
                } else {
                    bool3 = null;
                }
            }
            if ((j10 & 14) == 0) {
                bool4 = null;
            } else {
                ObservableField<Boolean> observableField2 = rankNumberNewViewModel != null ? rankNumberNewViewModel.f42176h : null;
                updateRegistration(1, observableField2);
                if (observableField2 != null) {
                    bool4 = observableField2.get();
                } else {
                    bool4 = null;
                }
            }
            bVar = ((j10 & 12) == 0 || rankNumberNewViewModel == null) ? null : rankNumberNewViewModel.f42180l;
            Boolean bool5 = bool4;
            bool2 = bool3;
            bool = bool5;
        } else {
            bVar = null;
            bool = null;
            bool2 = null;
        }
        if ((13 & j10) != 0) {
            a.a(this.f40289k, bool2);
        }
        if ((12 & j10) != 0) {
            a.b(this.f40290l, bVar, false);
        }
        if ((j10 & 14) != 0) {
            a.a(this.f40291m, bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return a((ObservableField) obj, i11);
    }
}
