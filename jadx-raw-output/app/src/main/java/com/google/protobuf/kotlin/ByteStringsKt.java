package com.google.protobuf.kotlin;

import ck.p;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteStrings.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ByteStringsKt {
    public static final ByteString toByteString(byte[] bArr) {
        p.j(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        p.i(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final byte get(ByteString byteString, int i10) {
        p.j(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        p.j(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString byteString2) {
        p.j(byteString, "<this>");
        p.j(byteString2, "other");
        ByteString byteStringConcat = byteString.concat(byteString2);
        p.i(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        p.j(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        p.i(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        p.j(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        p.i(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }
}
