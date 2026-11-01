package com.google.protobuf;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public class a implements c {
        public final /* synthetic */ ByteString val$input;

        public a(ByteString byteString) {
            this.val$input = byteString;
        }

        @Override // com.google.protobuf.p0.c
        public byte byteAt(int i10) {
            return this.val$input.byteAt(i10);
        }

        @Override // com.google.protobuf.p0.c
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public class b implements c {
        public final /* synthetic */ byte[] val$input;

        public b(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.p0.c
        public byte byteAt(int i10) {
            return this.val$input[i10];
        }

        @Override // com.google.protobuf.p0.c
        public int size() {
            return this.val$input.length;
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public interface c {
        byte byteAt(int i10);

        int size();
    }

    private p0() {
    }

    public static String escapeBytes(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bByteAt = cVar.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeBytes(ByteString byteString) {
        return escapeBytes(new a(byteString));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new b(bArr));
    }
}
