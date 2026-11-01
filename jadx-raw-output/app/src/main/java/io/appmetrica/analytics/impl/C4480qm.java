package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4480qm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4480qm[] f57578c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f57580b;

    public static C4480qm[] b() {
        if (f57578c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f57578c == null) {
                    f57578c = new C4480qm[0];
                }
            }
        }
        return f57578c;
    }

    public final C4480qm a() {
        this.f57579a = "";
        this.f57580b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57579a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57579a);
        }
        String[] strArr = this.f57580b;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f57580b;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4480qm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57579a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57579a);
        }
        String[] strArr = this.f57580b;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            int iComputeStringSizeNoTag = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f57580b;
                if (i10 < strArr2.length) {
                    String str = strArr2[i10];
                    if (str != null) {
                        i11++;
                        iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
                    }
                    i10++;
                } else {
                    return iComputeSerializedSize + iComputeStringSizeNoTag + i11;
                }
            }
        } else {
            return iComputeSerializedSize;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4480qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f57579a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f57580b;
                int length = strArr == null ? 0 : strArr.length;
                int i10 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i10];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i10 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f57580b = strArr2;
            }
        }
    }

    public static C4480qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4480qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4480qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4480qm) MessageNano.mergeFrom(new C4480qm(), bArr);
    }
}
