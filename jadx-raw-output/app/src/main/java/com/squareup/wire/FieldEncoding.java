package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes7.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    public final int value;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45174a;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            f45174a = iArr;
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45174a[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45174a[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45174a[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FieldEncoding get(int i10) throws IOException {
        if (i10 == 0) {
            return VARINT;
        }
        if (i10 == 1) {
            return FIXED64;
        }
        if (i10 == 2) {
            return LENGTH_DELIMITED;
        }
        if (i10 == 5) {
            return FIXED32;
        }
        throw new ProtocolException("Unexpected FieldEncoding: " + i10);
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i10 = a.f45174a[ordinal()];
        if (i10 == 1) {
            return ProtoAdapter.f45187k;
        }
        if (i10 == 2) {
            return ProtoAdapter.f45184h;
        }
        if (i10 == 3) {
            return ProtoAdapter.f45189m;
        }
        if (i10 == 4) {
            return ProtoAdapter.f45194r;
        }
        throw new AssertionError();
    }

    FieldEncoding(int i10) {
        this.value = i10;
    }
}
