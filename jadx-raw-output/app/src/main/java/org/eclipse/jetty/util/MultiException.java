package org.eclipse.jetty.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MultiException extends Exception {
    private Object nested;

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        for (int i10 = 0; i10 < LazyList.size(this.nested); i10++) {
            ((Throwable) LazyList.get(this.nested, i10)).printStackTrace();
        }
    }

    public MultiException() {
        super("Multiple exceptions");
    }

    public void add(Throwable th2) {
        if (!(th2 instanceof MultiException)) {
            this.nested = LazyList.add(this.nested, th2);
            return;
        }
        MultiException multiException = (MultiException) th2;
        for (int i10 = 0; i10 < LazyList.size(multiException.nested); i10++) {
            this.nested = LazyList.add(this.nested, LazyList.get(multiException.nested, i10));
        }
    }

    public Throwable getThrowable(int i10) {
        return (Throwable) LazyList.get(this.nested, i10);
    }

    public List<Throwable> getThrowables() {
        return LazyList.getList(this.nested);
    }

    public void ifExceptionThrow() throws Exception {
        int size = LazyList.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                throw this;
            }
            Throwable th2 = (Throwable) LazyList.get(this.nested, 0);
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof Exception)) {
                throw this;
            }
            throw ((Exception) th2);
        }
    }

    public void ifExceptionThrowMulti() throws MultiException {
        if (LazyList.size(this.nested) > 0) {
            throw this;
        }
    }

    public void ifExceptionThrowRuntime() throws Error {
        int size = LazyList.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                throw new RuntimeException(this);
            }
            Throwable th2 = (Throwable) LazyList.get(this.nested, 0);
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException(th2);
            }
            throw ((RuntimeException) th2);
        }
    }

    public int size() {
        return LazyList.size(this.nested);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (LazyList.size(this.nested) > 0) {
            return MultiException.class.getSimpleName() + LazyList.getList(this.nested);
        }
        return MultiException.class.getSimpleName() + "[]";
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i10 = 0; i10 < LazyList.size(this.nested); i10++) {
            ((Throwable) LazyList.get(this.nested, i10)).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i10 = 0; i10 < LazyList.size(this.nested); i10++) {
            ((Throwable) LazyList.get(this.nested, i10)).printStackTrace(printWriter);
        }
    }
}
