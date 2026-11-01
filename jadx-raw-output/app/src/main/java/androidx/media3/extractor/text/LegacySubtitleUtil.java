package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public class LegacySubtitleUtil {
    private LegacySubtitleUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z10;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs == -9223372036854775807L || startIndex >= subtitle.getEventTimeCount()) {
            z10 = false;
        } else {
            List<Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty()) {
                z10 = false;
            } else {
                long j10 = outputOptions.startTimeUs;
                if (j10 < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j10, eventTime - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = startIndex; i10 < subtitle.getEventTimeCount(); i10++) {
            outputSubtitleEvent(subtitle, i10, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z10) {
                startIndex--;
            }
            for (int i11 = 0; i11 < startIndex; i11++) {
                outputSubtitleEvent(subtitle, i11, consumer);
            }
            if (z10) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    private static void outputSubtitleEvent(Subtitle subtitle, int i10, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i10);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 != subtitle.getEventTimeCount() - 1) {
            long eventTime2 = subtitle.getEventTime(i10 + 1) - subtitle.getEventTime(i10);
            if (eventTime2 > 0) {
                consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static int getStartIndex(Subtitle subtitle, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j10) {
            return nextEventTimeIndex - 1;
        }
        return nextEventTimeIndex;
    }
}
