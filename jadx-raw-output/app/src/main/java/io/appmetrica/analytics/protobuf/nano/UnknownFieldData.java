package io.appmetrica.analytics.protobuf.nano;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class UnknownFieldData {
    public final byte[] bytes;
    public final int tag;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnknownFieldData)) {
            return false;
        }
        UnknownFieldData unknownFieldData = (UnknownFieldData) obj;
        return this.tag == unknownFieldData.tag && Arrays.equals(this.bytes, unknownFieldData.bytes);
    }

    public int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + this.bytes.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes) + ((this.tag + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeRawVarint32(this.tag);
        codedOutputByteBufferNano.writeRawBytes(this.bytes);
    }

    public UnknownFieldData(int i10, byte[] bArr) {
        this.tag = i10;
        this.bytes = bArr;
    }
}
