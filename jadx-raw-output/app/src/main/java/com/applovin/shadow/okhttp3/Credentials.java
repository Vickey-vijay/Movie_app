package com.applovin.shadow.okhttp3;

import ck.p;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okio.ByteString;
import com.ironsource.G5;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        p.j(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        p.j(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        p.j(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        p.j(str2, "password");
        p.j(charset, G5.M);
        return "Basic " + ByteString.Companion.encodeString(str + ':' + str2, charset).base64();
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            p.i(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
