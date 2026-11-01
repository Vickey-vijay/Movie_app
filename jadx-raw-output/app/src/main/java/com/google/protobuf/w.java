package com.google.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w {
    private static final u FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final u LITE_SCHEMA = new v();

    public static u full() {
        return FULL_SCHEMA;
    }

    public static u lite() {
        return LITE_SCHEMA;
    }

    private static u loadSchemaForFullRuntime() {
        try {
            return (u) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
