package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;

/* JADX INFO: compiled from: TemplateParsingErrorLogger.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {
    private final ParsingErrorLogger logger;
    private final String templateId;

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(Exception exc) {
        this.logger.logTemplateError(exc, this.templateId);
    }

    public TemplateParsingErrorLogger(ParsingErrorLogger parsingErrorLogger, String str) {
        this.logger = parsingErrorLogger;
        this.templateId = str;
    }
}
