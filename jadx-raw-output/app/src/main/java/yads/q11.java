package yads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class q11 extends q30 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81676d;

    public q11() {
        super(a(2008, 1));
        this.f81676d = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public q11(IOException iOException, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.f81676d = i11;
    }

    public static q11 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && ki.a(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new p11(iOException);
        }
        return new q11(iOException, i11, i10);
    }

    public q11(String str, int i10) {
        super(a(i10, 1), str);
        this.f81676d = 1;
    }

    public q11(String str, IOException iOException, int i10) {
        super(str, iOException, a(i10, 1));
        this.f81676d = 1;
    }
}
