package org.eclipse.jetty.io;

import java.io.EOFException;

/* JADX INFO: loaded from: classes11.dex */
public class EofException extends EOFException {
    public EofException() {
    }

    public EofException(String str) {
        super(str);
    }

    public EofException(Throwable th2) {
        if (th2 != null) {
            initCause(th2);
        }
    }
}
