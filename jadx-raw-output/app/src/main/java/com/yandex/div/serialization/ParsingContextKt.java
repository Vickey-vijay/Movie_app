package com.yandex.div.serialization;

import java.util.List;
import nj.s;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ParsingContextKt {
    public static final ParsingContext collectingErrors(ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    public static final List<Exception> getCollectedErrors(ParsingContext parsingContext) {
        if (parsingContext instanceof ErrorCollectingParsingContext) {
            return ((ErrorCollectingParsingContext) parsingContext).getErrors();
        }
        return parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : s.k();
    }

    public static final ParsingContext restrictPropertyOverride(ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
