package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$string;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import d5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f20025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f20026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f20027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f20028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f20029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f20032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f20033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.b.a f20034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TrackGroupArray f20036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public c f20038p;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.e(view);
        }
    }

    public interface c {
        void b(boolean z10, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int[] b(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i10;
        return iArrCopyOf;
    }

    public static int[] c(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void f() {
        this.f20037o = false;
        this.f20029g.clear();
    }

    public final void g() {
        this.f20037o = true;
        this.f20029g.clear();
    }

    public final void h(View view) {
        this.f20037o = false;
        Pair pair = (Pair) view.getTag();
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride = this.f20029g.get(iIntValue);
        g5.a.e(this.f20034l);
        if (selectionOverride == null) {
            if (!this.f20031i && this.f20029g.size() > 0) {
                this.f20029g.clear();
            }
            this.f20029g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2));
            return;
        }
        int i10 = selectionOverride.f19828d;
        int[] iArr = selectionOverride.f19827c;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zI = i(iIntValue);
        boolean z10 = zI || j();
        if (zIsChecked && z10) {
            if (i10 == 1) {
                this.f20029g.remove(iIntValue);
                return;
            } else {
                this.f20029g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, c(iArr, iIntValue2)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zI) {
            this.f20029g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, b(iArr, iIntValue2)));
        } else {
            this.f20029g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f20029g = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f20024b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f20025c = layoutInflaterFrom;
        b bVar = new b();
        this.f20028f = bVar;
        this.f20032j = new d5.a(getResources());
        this.f20036n = TrackGroupArray.f19434e;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20026d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20027e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public void d(com.google.android.exoplayer2.trackselection.b.a aVar, int i10, boolean z10, List<DefaultTrackSelector.SelectionOverride> list, @Nullable c cVar) {
        this.f20034l = aVar;
        this.f20035m = i10;
        this.f20037o = z10;
        this.f20038p = cVar;
        int size = this.f20031i ? list.size() : Math.min(list.size(), 1);
        for (int i11 = 0; i11 < size; i11++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i11);
            this.f20029g.put(selectionOverride.f19826b, selectionOverride);
        }
        l();
    }

    public final void e(View view) {
        if (view == this.f20026d) {
            g();
        } else if (view == this.f20027e) {
            f();
        } else {
            h(view);
        }
        k();
        c cVar = this.f20038p;
        if (cVar != null) {
            cVar.b(getIsDisabled(), getOverrides());
        }
    }

    public boolean getIsDisabled() {
        return this.f20037o;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f20029g.size());
        for (int i10 = 0; i10 < this.f20029g.size(); i10++) {
            arrayList.add(this.f20029g.valueAt(i10));
        }
        return arrayList;
    }

    public final boolean i(int i10) {
        return this.f20030h && this.f20036n.a(i10).f19431b > 1 && this.f20034l.a(this.f20035m, i10, false) != 0;
    }

    public final boolean j() {
        return this.f20031i && this.f20036n.f19435b > 1;
    }

    public final void k() {
        this.f20026d.setChecked(this.f20037o);
        this.f20027e.setChecked(!this.f20037o && this.f20029g.size() == 0);
        for (int i10 = 0; i10 < this.f20033k.length; i10++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.f20029g.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f20033k[i10];
                if (i11 < checkedTextViewArr.length) {
                    checkedTextViewArr[i11].setChecked(selectionOverride != null && selectionOverride.a(i11));
                    i11++;
                }
            }
        }
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f20030h != z10) {
            this.f20030h = z10;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f20031i != z10) {
            this.f20031i = z10;
            if (!z10 && this.f20029g.size() > 1) {
                for (int size = this.f20029g.size() - 1; size > 0; size--) {
                    this.f20029g.remove(size);
                }
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f20026d.setVisibility(z10 ? 0 : 8);
    }

    public final void l() {
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f20034l == null) {
            this.f20026d.setEnabled(false);
            this.f20027e.setEnabled(false);
            return;
        }
        this.f20026d.setEnabled(true);
        this.f20027e.setEnabled(true);
        TrackGroupArray trackGroupArrayE = this.f20034l.e(this.f20035m);
        this.f20036n = trackGroupArrayE;
        this.f20033k = new CheckedTextView[trackGroupArrayE.f19435b][];
        boolean zJ = j();
        int i11 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f20036n;
            if (i11 < trackGroupArray.f19435b) {
                TrackGroup trackGroupA = trackGroupArray.a(i11);
                boolean zI = i(i11);
                this.f20033k[i11] = new CheckedTextView[trackGroupA.f19431b];
                for (int i12 = 0; i12 < trackGroupA.f19431b; i12++) {
                    if (i12 == 0) {
                        addView(this.f20025c.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
                    }
                    if (!zI && !zJ) {
                        i10 = R.layout.simple_list_item_single_choice;
                    } else {
                        i10 = R.layout.simple_list_item_multiple_choice;
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f20025c.inflate(i10, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.f20024b);
                    checkedTextView.setText(this.f20032j.a(trackGroupA.a(i12)));
                    if (this.f20034l.f(this.f20035m, i11, i12) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setTag(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
                        checkedTextView.setOnClickListener(this.f20028f);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f20033k[i11][i12] = checkedTextView;
                    addView(checkedTextView);
                }
                i11++;
            } else {
                k();
                return;
            }
        }
    }

    public void setTrackNameProvider(d dVar) {
        this.f20032j = (d) g5.a.e(dVar);
        l();
    }
}
