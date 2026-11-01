package org.fourthline.cling.model;

import java.util.List;
import mn.k;

/* JADX INFO: loaded from: classes2.dex */
public class ValidationException extends Exception {
    public List<k> errors;

    public ValidationException(String str) {
        super(str);
    }

    public ValidationException(String str, Throwable th2) {
        super(str, th2);
    }

    public List<k> getErrors() {
        return this.errors;
    }

    public ValidationException(String str, List<k> list) {
        super(str);
        this.errors = list;
    }
}
