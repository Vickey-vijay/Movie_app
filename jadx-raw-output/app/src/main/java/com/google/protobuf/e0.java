package com.google.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {
    private static final c0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final c0 LITE_SCHEMA = new d0();

    public static c0 full() {
        return FULL_SCHEMA;
    }

    public static c0 lite() {
        return LITE_SCHEMA;
    }

    private static c0 loadSchemaForFullRuntime() {
        try {
            return (c0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
