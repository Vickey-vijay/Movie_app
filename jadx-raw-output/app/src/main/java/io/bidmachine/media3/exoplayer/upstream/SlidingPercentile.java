package io.bidmachine.media3.exoplayer.upstream;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<b> INDEX_COMPARATOR = new Comparator() { // from class: ug.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.lambda$static$0((SlidingPercentile.b) obj, (SlidingPercentile.b) obj2);
        }
    };
    private static final Comparator<b> VALUE_COMPARATOR = new Comparator() { // from class: ug.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.lambda$static$1((SlidingPercentile.b) obj, (SlidingPercentile.b) obj2);
        }
    };
    private final b[] recycledSamples = new b[5];
    private final ArrayList<b> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    public static class b {
        public int index;
        public float value;
        public int weight;

        private b() {
        }
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(b bVar, b bVar2) {
        return bVar.index - bVar2.index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(b bVar, b bVar2) {
        return Float.compare(bVar.value, bVar2.value);
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }

    public SlidingPercentile(int i10) {
        this.maxWeight = i10;
    }

    public void addSample(int i10, float f10) {
        b bVar;
        ensureSortedByIndex();
        int i11 = this.recycledSampleCount;
        if (i11 > 0) {
            b[] bVarArr = this.recycledSamples;
            int i12 = i11 - 1;
            this.recycledSampleCount = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.nextSampleIndex;
        this.nextSampleIndex = i13 + 1;
        bVar.index = i13;
        bVar.weight = i10;
        bVar.value = f10;
        this.samples.add(bVar);
        this.totalWeight += i10;
        while (true) {
            int i14 = this.totalWeight;
            int i15 = this.maxWeight;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.samples.get(0);
                int i17 = bVar2.weight;
                if (i17 <= i16) {
                    this.totalWeight -= i17;
                    this.samples.remove(0);
                    int i18 = this.recycledSampleCount;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.recycledSamples;
                        this.recycledSampleCount = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.weight = i17 - i16;
                    this.totalWeight -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f10) {
        ensureSortedByValue();
        float f11 = f10 * this.totalWeight;
        int i10 = 0;
        for (int i11 = 0; i11 < this.samples.size(); i11++) {
            b bVar = this.samples.get(i11);
            i10 += bVar.weight;
            if (i10 >= f11) {
                return bVar.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.samples;
        return arrayList.get(arrayList.size() - 1).value;
    }
}
