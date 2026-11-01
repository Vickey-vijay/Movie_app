package org.seamless.xml;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public class ParserException extends Exception {
    public ParserException() {
    }

    public ParserException(String str) {
        super(str);
    }

    public ParserException(String str, Throwable th2) {
        super(str, th2);
    }

    public ParserException(Throwable th2) {
        super(th2);
    }

    public ParserException(SAXParseException sAXParseException) {
        super("(Line/Column: " + sAXParseException.getLineNumber() + StringUtils.PROCESS_POSTFIX_DELIMITER + sAXParseException.getColumnNumber() + ") " + sAXParseException.getMessage());
    }
}
