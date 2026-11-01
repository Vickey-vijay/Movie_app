package com.yandex.div.evaluable;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: FunctionArgument.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FunctionArgument {
    private final boolean isVariadic;
    private final EvaluableType type;

    public FunctionArgument(EvaluableType evaluableType, boolean z10) {
        p.j(evaluableType, "type");
        this.type = evaluableType;
        this.isVariadic = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z10 = this.isVariadic;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }

    public final EvaluableType getType() {
        return this.type;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z10, int i10, i iVar) {
        this(evaluableType, (i10 & 2) != 0 ? false : z10);
    }
}
