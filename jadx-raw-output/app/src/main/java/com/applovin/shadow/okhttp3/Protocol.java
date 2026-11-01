package com.applovin.shadow.okhttp3;

import ck.i;
import ck.p;
import java.io.IOException;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* JADX INFO: compiled from: Protocol.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            p.j(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!p.e(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!p.e(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!p.e(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!p.e(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!p.e(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!p.e(str, protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    Protocol(String str) {
        this.protocol = str;
    }
}
