package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2[] f18322a;

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        for (b2 b2Var : this.f18322a) {
            if (b2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        for (b2 b2Var : this.f18322a) {
            if (b2Var.a(cls)) {
                return b2Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public w1(b2... b2VarArr) {
        this.f18322a = b2VarArr;
    }
}
