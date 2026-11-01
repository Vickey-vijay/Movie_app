package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;

/* JADX INFO: compiled from: JsonTemplateParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class JsonTemplateParserKt {
    public static final void suppressMissingValueOrThrow(ParsingException parsingException) {
        if (parsingException.getReason() == ParsingExceptionReason.MISSING_VALUE) {
        } else {
            throw parsingException;
        }
    }
}
