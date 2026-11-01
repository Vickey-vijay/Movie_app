package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f18234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f18235b;

    static {
        k2 k2Var = null;
        try {
            k2Var = (k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18234a = k2Var;
        f18235b = new k2();
    }
}
