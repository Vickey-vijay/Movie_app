package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4107c6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C4107c6[] f56461f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4055a6[] f56464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4107c6 f56465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4107c6[] f56466e;

    public static C4107c6[] b() {
        if (f56461f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f56461f == null) {
                    f56461f = new C4107c6[0];
                }
            }
        }
        return f56461f;
    }

    public final C4107c6 a() {
        this.f56462a = "";
        this.f56463b = "";
        this.f56464c = C4055a6.b();
        this.f56465d = null;
        this.f56466e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f56462a);
        if (!this.f56463b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f56463b);
        }
        C4055a6[] c4055a6Arr = this.f56464c;
        int i10 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56464c;
                if (i11 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i11];
                if (c4055a6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4055a6);
                }
                i11++;
            }
        }
        C4107c6 c4107c6 = this.f56465d;
        if (c4107c6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4107c6);
        }
        C4107c6[] c4107c6Arr = this.f56466e;
        if (c4107c6Arr != null && c4107c6Arr.length > 0) {
            while (true) {
                C4107c6[] c4107c6Arr2 = this.f56466e;
                if (i10 >= c4107c6Arr2.length) {
                    break;
                }
                C4107c6 c4107c7 = c4107c6Arr2[i10];
                if (c4107c7 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4107c7);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4107c6() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f56462a) + super.computeSerializedSize();
        if (!this.f56463b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f56463b);
        }
        C4055a6[] c4055a6Arr = this.f56464c;
        int i10 = 0;
        if (c4055a6Arr != null && c4055a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4055a6[] c4055a6Arr2 = this.f56464c;
                if (i11 >= c4055a6Arr2.length) {
                    break;
                }
                C4055a6 c4055a6 = c4055a6Arr2[i11];
                if (c4055a6 != null) {
                    iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(3, c4055a6);
                }
                i11++;
            }
        }
        C4107c6 c4107c6 = this.f56465d;
        if (c4107c6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c4107c6);
        }
        C4107c6[] c4107c6Arr = this.f56466e;
        if (c4107c6Arr != null && c4107c6Arr.length > 0) {
            while (true) {
                C4107c6[] c4107c6Arr2 = this.f56466e;
                if (i10 >= c4107c6Arr2.length) {
                    break;
                }
                C4107c6 c4107c7 = c4107c6Arr2[i10];
                if (c4107c7 != null) {
                    iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(5, c4107c7);
                }
                i10++;
            }
        }
        return iComputeStringSize;
    }

    public static C4107c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4107c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4107c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f56462a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f56463b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4055a6[] c4055a6Arr = this.f56464c;
                int length = c4055a6Arr == null ? 0 : c4055a6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C4055a6[] c4055a6Arr2 = new C4055a6[i10];
                if (length != 0) {
                    System.arraycopy(c4055a6Arr, 0, c4055a6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C4055a6 c4055a6 = new C4055a6();
                    c4055a6Arr2[length] = c4055a6;
                    codedInputByteBufferNano.readMessage(c4055a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4055a6 c4055a7 = new C4055a6();
                c4055a6Arr2[length] = c4055a7;
                codedInputByteBufferNano.readMessage(c4055a7);
                this.f56464c = c4055a6Arr2;
            } else if (tag == 34) {
                if (this.f56465d == null) {
                    this.f56465d = new C4107c6();
                }
                codedInputByteBufferNano.readMessage(this.f56465d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C4107c6[] c4107c6Arr = this.f56466e;
                int length2 = c4107c6Arr == null ? 0 : c4107c6Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C4107c6[] c4107c6Arr2 = new C4107c6[i11];
                if (length2 != 0) {
                    System.arraycopy(c4107c6Arr, 0, c4107c6Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C4107c6 c4107c6 = new C4107c6();
                    c4107c6Arr2[length2] = c4107c6;
                    codedInputByteBufferNano.readMessage(c4107c6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4107c6 c4107c7 = new C4107c6();
                c4107c6Arr2[length2] = c4107c7;
                codedInputByteBufferNano.readMessage(c4107c7);
                this.f56466e = c4107c6Arr2;
            }
        }
    }

    public static C4107c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4107c6) MessageNano.mergeFrom(new C4107c6(), bArr);
    }
}
