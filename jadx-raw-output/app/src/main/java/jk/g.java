package jk;

/* JADX INFO: compiled from: KFunction.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface g<R> extends b<R>, mj.e<R> {
    @Override // jk.b
    /* synthetic */ R call(Object... objArr);

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // jk.b
    boolean isSuspend();
}
