package sg;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.extractor.text.CuesWithTiming;

/* JADX INFO: compiled from: CuesResolver.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    boolean addCues(CuesWithTiming cuesWithTiming, long j10);

    void clear();

    void discardCuesBeforeTimeUs(long j10);

    ImmutableList<Cue> getCuesAtTimeUs(long j10);

    long getNextCueChangeTimeUs(long j10);

    long getPreviousCueChangeTimeUs(long j10);
}
