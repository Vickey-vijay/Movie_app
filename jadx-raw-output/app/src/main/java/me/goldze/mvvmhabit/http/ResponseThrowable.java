package me.goldze.mvvmhabit.http;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable th2, int i10) {
        super(th2);
        this.code = i10;
    }
}
