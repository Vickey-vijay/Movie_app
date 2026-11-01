package org.fourthline.cling.registry;

import java.util.List;
import mn.k;

/* JADX INFO: loaded from: classes11.dex */
public class RegistrationException extends RuntimeException {
    public List<k> errors;

    public RegistrationException(String str) {
        super(str);
    }

    public RegistrationException(String str, Throwable th2) {
        super(str, th2);
    }

    public List<k> getErrors() {
        return this.errors;
    }

    public RegistrationException(String str, List<k> list) {
        super(str);
        this.errors = list;
    }
}
