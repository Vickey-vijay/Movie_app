package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4209g5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f56794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56795b;

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy[] iExecutionPolicyArr = this.f56794a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        for (IExecutionPolicy iExecutionPolicy : iExecutionPolicyArr) {
            if (!iExecutionPolicy.canBeExecuted()) {
                if (iExecutionPolicy != null) {
                    return false;
                }
                return true;
            }
        }
        iExecutionPolicy = null;
        if (iExecutionPolicy != null) {
            return false;
        }
        return true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f56795b;
    }

    public C4209g5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f56794a = iExecutionPolicyArr;
        this.f56795b = "Composite of {" + nj.n.a0(iExecutionPolicyArr, ", ", null, null, 0, null, C4183f5.f56711a, 30, null) + '}';
    }
}
