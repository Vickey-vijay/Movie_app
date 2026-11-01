package io.bidmachine.media3.extractor.text.webvtt;

import android.text.TextUtils;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Consumer;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import io.bidmachine.media3.extractor.text.LegacySubtitleUtil;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import oh.a;
import oh.d;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class WebvttParser implements SubtitleParser {
    private static final String COMMENT_START = "NOTE";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final String STYLE_START = "STYLE";
    private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
    private final a cssParser = new a();

    private static int getNextEvent(ParsableByteArray parsableByteArray) {
        int position = 0;
        int i10 = -1;
        while (i10 == -1) {
            position = parsableByteArray.getPosition();
            String line = parsableByteArray.readLine();
            if (line == null) {
                i10 = 0;
            } else if (STYLE_START.equals(line)) {
                i10 = 2;
            } else {
                i10 = line.startsWith(COMMENT_START) ? 1 : 3;
            }
        }
        parsableByteArray.setPosition(position);
        return i10;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i10, int i11, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        WebvttCueInfo cue;
        this.parsableWebvttData.reset(bArr, i11 + i10);
        this.parsableWebvttData.setPosition(i10);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            while (!TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    LegacySubtitleUtil.toCuesWithTiming(new d(arrayList2), outputOptions, consumer);
                    return;
                }
                if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (cue = WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        super.parse(bArr, outputOptions, consumer);
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public /* bridge */ /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleParser
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private static void skipComment(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }
}
