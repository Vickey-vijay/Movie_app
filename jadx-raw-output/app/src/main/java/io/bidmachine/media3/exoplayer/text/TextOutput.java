package io.bidmachine.media3.exoplayer.text;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface TextOutput {
    void onCues(CueGroup cueGroup);

    @Deprecated
    default void onCues(List<Cue> list) {
    }
}
