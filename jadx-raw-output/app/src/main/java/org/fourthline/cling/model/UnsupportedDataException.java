package org.fourthline.cling.model;

/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedDataException extends RuntimeException {
    private static final long serialVersionUID = 661795454401413339L;
    public Object data;

    public UnsupportedDataException(String str) {
        super(str);
    }

    public UnsupportedDataException(String str, Throwable th2) {
        super(str, th2);
    }

    public Object getData() {
        return this.data;
    }

    public UnsupportedDataException(String str, Throwable th2, Object obj) {
        super(str, th2);
        this.data = obj;
    }
}
