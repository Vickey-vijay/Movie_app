package kotlin.jvm.internal;

import ck.m;
import ck.p;
import ck.s;
import jk.b;
import jk.g;

/* JADX INFO: loaded from: classes11.dex */
public class FunctionReference extends CallableReference implements m, g {
    private final int arity;
    private final int flags;

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && p.e(getBoundReceiver(), functionReference.getBoundReceiver()) && p.e(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof g) {
            return obj.equals(compute());
        }
        return false;
    }

    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // ck.m
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public g getReflected() {
        return (g) super.getReflected();
    }

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return s.a(this);
    }

    public int hashCode() {
        int iHashCode;
        if (getOwner() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getOwner().hashCode() * 31;
        }
        return ((iHashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // jk.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // jk.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // jk.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // jk.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, jk.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
