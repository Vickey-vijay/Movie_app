package javax.servlet;

/* JADX INFO: loaded from: classes4.dex */
public class ServletException extends Exception {
    private Throwable rootCause;

    public ServletException() {
    }

    public ServletException(String str) {
        super(str);
    }

    public Throwable getRootCause() {
        return this.rootCause;
    }

    public ServletException(String str, Throwable th2) {
        super(str, th2);
        this.rootCause = th2;
    }

    public ServletException(Throwable th2) {
        super(th2);
        this.rootCause = th2;
    }
}
