package com.yandex.div.json;

import ck.i;
import com.yandex.div.internal.util.JsonNode;

/* JADX INFO: compiled from: ParsingException.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ParsingException extends RuntimeException {
    private final String jsonSummary;
    private final ParsingExceptionReason reason;
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, JsonNode jsonNode, String str2, int i10, i iVar) {
        this(parsingExceptionReason, str, (i10 & 4) != 0 ? null : th2, (i10 & 8) != 0 ? null : jsonNode, (i10 & 16) != 0 ? null : str2);
    }

    public ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, JsonNode jsonNode, String str2) {
        super(str, th2);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }

    public String getJsonSummary() {
        return this.jsonSummary;
    }

    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    public JsonNode getSource() {
        return this.source;
    }
}
