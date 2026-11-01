package lh;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Subtitle {
    private final List<Cue> cues;

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j10) {
        return j10 >= 0 ? this.cues : Collections.emptyList();
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 == 0);
        return 0L;
    }

    public d(List<Cue> list) {
        this.cues = list;
    }
}
