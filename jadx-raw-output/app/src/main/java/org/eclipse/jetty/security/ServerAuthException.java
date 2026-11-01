package org.eclipse.jetty.security;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes11.dex */
public class ServerAuthException extends GeneralSecurityException {
    public ServerAuthException() {
    }

    public ServerAuthException(String str) {
        super(str);
    }

    public ServerAuthException(String str, Throwable th2) {
        super(str, th2);
    }

    public ServerAuthException(Throwable th2) {
        super(th2);
    }
}
