package com.unity3d.ads.network.model;

import ck.p;

/* JADX INFO: compiled from: HttpBody.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface HttpBody {

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] bArr) {
            p.j(bArr, "content");
            this.content = bArr;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String str) {
            p.j(str, "content");
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
