package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.TrackSelectionOverride;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final b componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;

    @Nullable
    private TrackSelectionListener listener;
    private final Map<TrackGroup, TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final List<Tracks.Group> trackGroups;

    @Nullable
    private Comparator<c> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z10, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public static final class c {
        public final Tracks.Group trackGroup;
        public final int trackIndex;

        public Format getFormat() {
            return this.trackGroup.getTrackFormat(this.trackIndex);
        }

        public c(Tracks.Group group, int i10) {
            this.trackGroup = group;
            this.trackIndex = i10;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        c cVar = (c) Assertions.checkNotNull(view.getTag());
        TrackGroup mediaTrackGroup = cVar.trackGroup.getMediaTrackGroup();
        int i10 = cVar.trackIndex;
        TrackSelectionOverride trackSelectionOverride = this.overrides.get(mediaTrackGroup);
        if (trackSelectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, ImmutableList.of(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(trackSelectionOverride.trackIndices);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(cVar.trackGroup);
        boolean z10 = zShouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.overrides.remove(mediaTrackGroup);
                return;
            } else {
                this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zShouldEnableAdaptiveSelection) {
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, ImmutableList.of(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.overrides.put(mediaTrackGroup, new TrackSelectionOverride(mediaTrackGroup, arrayList));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<TrackGroup, TrackSelectionOverride> filterOverrides(Map<TrackGroup, TrackSelectionOverride> map, List<Tracks.Group> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TrackSelectionOverride trackSelectionOverride = map.get(list.get(i10).getMediaTrackGroup());
            if (trackSelectionOverride != null && (z10 || map2.isEmpty())) {
                map2.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private boolean shouldEnableAdaptiveSelection(Tracks.Group group) {
        return this.allowAdaptiveSelections && group.isAdaptiveSupported();
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i10 = 0; i10 < this.trackViews.length; i10++) {
            TrackSelectionOverride trackSelectionOverride = this.overrides.get(this.trackGroups.get(i10).getMediaTrackGroup());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        this.trackViews[i10][i11].setChecked(trackSelectionOverride.trackIndices.contains(Integer.valueOf(((c) Assertions.checkNotNull(checkedTextViewArr[i11].getTag())).trackIndex)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public Map<TrackGroup, TrackSelectionOverride> getOverrides() {
        return this.overrides;
    }

    public void init(List<Tracks.Group> list, boolean z10, Map<TrackGroup, TrackSelectionOverride> map, @Nullable final Comparator<Format> comparator, @Nullable TrackSelectionListener trackSelectionListener) {
        this.isDisabled = z10;
        this.trackInfoComparator = comparator == null ? null : new Comparator() { // from class: io.bidmachine.media3.ui.r0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.lambda$init$0(comparator, (TrackSelectionView.c) obj, (TrackSelectionView.c) obj2);
            }
        };
        this.listener = trackSelectionListener;
        this.trackGroups.clear();
        this.trackGroups.addAll(list);
        this.overrides.clear();
        this.overrides.putAll(filterOverrides(map, list, this.allowMultipleOverrides));
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.allowAdaptiveSelections != z10) {
            this.allowAdaptiveSelections = z10;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.allowMultipleOverrides != z10) {
            this.allowMultipleOverrides = z10;
            if (!z10 && this.overrides.size() > 1) {
                Map<TrackGroup, TrackSelectionOverride> mapFilterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(mapFilterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.disableView.setVisibility(z10 ? 0 : 8);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        b bVar = new b();
        this.componentListener = bVar;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.trackGroups = new ArrayList();
        this.overrides = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.bm_exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$init$0(Comparator comparator, c cVar, c cVar2) {
        return comparator.compare(cVar.getFormat(), cVar2.getFormat());
    }

    private void updateViews() {
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.trackGroups.isEmpty()) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        this.trackViews = new CheckedTextView[this.trackGroups.size()][];
        boolean zShouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i11 = 0; i11 < this.trackGroups.size(); i11++) {
            Tracks.Group group = this.trackGroups.get(i11);
            boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(group);
            CheckedTextView[][] checkedTextViewArr = this.trackViews;
            int i12 = group.length;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < group.length; i13++) {
                cVarArr[i13] = new c(group, i13);
            }
            Comparator<c> comparator = this.trackInfoComparator;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 == 0) {
                    addView(this.inflater.inflate(R.layout.bm_exo_list_divider, (ViewGroup) this, false));
                }
                if (!zShouldEnableAdaptiveSelection && !zShouldEnableMultiGroupSelection) {
                    i10 = android.R.layout.simple_list_item_single_choice;
                } else {
                    i10 = android.R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.inflater.inflate(i10, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView.setText(this.trackNameProvider.getTrackName(cVarArr[i14].getFormat()));
                checkedTextView.setTag(cVarArr[i14]);
                if (group.isTrackSupported(i14)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.trackViews[i11][i14] = checkedTextView;
                addView(checkedTextView);
            }
        }
        updateViewStates();
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (TrackNameProvider) Assertions.checkNotNull(trackNameProvider);
        updateViews();
    }
}
