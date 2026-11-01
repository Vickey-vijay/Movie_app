package nh;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.ttml.TtmlStyle;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, String> imageMap;
    private final Map<String, c> regionMap;
    private final b root;

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j10) {
        return this.root.getCues(j10, this.globalStyles, this.regionMap, this.imageMap);
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public long getEventTime(int i10) {
        return this.eventTimesUs[i10];
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    @VisibleForTesting
    public Map<String, TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j10, false, false);
        if (iBinarySearchCeil < this.eventTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @VisibleForTesting
    public b getRoot() {
        return this.root;
    }

    public e(b bVar, Map<String, TtmlStyle> map, Map<String, c> map2, Map<String, String> map3) {
        Map<String, TtmlStyle> mapEmptyMap;
        this.root = bVar;
        this.regionMap = map2;
        this.imageMap = map3;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.globalStyles = mapEmptyMap;
        this.eventTimesUs = bVar.getEventTimesUs();
    }
}
