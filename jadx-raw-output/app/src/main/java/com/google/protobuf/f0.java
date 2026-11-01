package com.google.protobuf;

/* JADX INFO: compiled from: OneofInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f20846id;
    private final java.lang.reflect.Field valueField;

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f20846id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }

    public f0(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f20846id = i10;
        this.caseField = field;
        this.valueField = field2;
    }
}
