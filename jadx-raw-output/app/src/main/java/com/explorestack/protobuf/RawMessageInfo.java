package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes8.dex */
final class RawMessageInfo implements MessageInfo {
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    @Override // com.explorestack.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // com.explorestack.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return (this.flags & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // com.explorestack.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        String str2;
        Throwable e10;
        char cCharAt;
        this.defaultInstance = messageLite;
        this.info = str;
        this.objects = objArr;
        int i10 = 1;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    cCharAt = str3.charAt(0);
                    str = str3;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str3.length()];
                    str3.getChars(0, str3.length(), cArr, 0);
                    str2 = new String(cArr);
                    try {
                        cCharAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        e10 = e11;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    } catch (StringIndexOutOfBoundsException e12) {
                        e10 = e12;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e13) {
                str2 = str3;
                e10 = e13;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
            }
        }
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 >= 55296) {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i10 = i13;
            } else {
                this.flags = (cCharAt2 << i12) | i11;
                return;
            }
        }
    }
}
