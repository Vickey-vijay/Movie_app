package kotlin.jvm.internal;

import jk.c;
import jk.f;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i10, f fVar, String str, String str2) {
        super(i10, CallableReference.NO_RECEIVER, ((ck.f) fVar).a(), str, str2, !(fVar instanceof c) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i10, Class cls, String str, String str2, int i11) {
        super(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public FunctionReferenceImpl(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }
}
