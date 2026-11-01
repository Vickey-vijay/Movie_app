package yads;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class aj1 {
    public static String a() {
        String lowerCase = lk.x.N(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
