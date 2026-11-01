package io.bidmachine.media3.extractor.text;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface Subtitle {
    List<Cue> getCues(long j10);

    long getEventTime(int i10);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j10);
}
