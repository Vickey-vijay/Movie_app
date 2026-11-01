package javax.servlet;

import kj.i;

/* JADX INFO: loaded from: classes5.dex */
public class UnavailableException extends ServletException {
    private boolean permanent;
    private int seconds;
    private i servlet;

    public UnavailableException(i iVar, String str) {
        super(str);
        this.servlet = iVar;
        this.permanent = true;
    }

    public i getServlet() {
        return this.servlet;
    }

    public int getUnavailableSeconds() {
        if (this.permanent) {
            return -1;
        }
        return this.seconds;
    }

    public boolean isPermanent() {
        return this.permanent;
    }

    public UnavailableException(int i10, i iVar, String str) {
        super(str);
        this.servlet = iVar;
        if (i10 <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i10;
        }
        this.permanent = false;
    }

    public UnavailableException(String str) {
        super(str);
        this.permanent = true;
    }

    public UnavailableException(String str, int i10) {
        super(str);
        if (i10 <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i10;
        }
        this.permanent = false;
    }
}
