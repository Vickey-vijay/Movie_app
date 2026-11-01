package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: compiled from: ExpressionResult.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33060b;

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public Object a() {
        Object obj = this.f33060b;
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof Integer ? String.valueOf(obj) : obj;
    }

    public boolean b() {
        return this.f33059a;
    }

    private a(boolean z10, Object obj) {
        this.f33059a = z10;
        this.f33060b = obj;
    }
}
