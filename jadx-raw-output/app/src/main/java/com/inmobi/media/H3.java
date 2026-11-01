package com.inmobi.media;

import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H3 {
    public static final Object a(bk.a aVar) {
        ck.p.j(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(aVar.invoke());
        } catch (Error e10) {
            Result.a aVar3 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(e10));
        } catch (Exception e11) {
            Result.a aVar4 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(e11));
        }
    }

    public static final String a(String str, Map map) {
        ck.p.j(str, "url");
        ck.p.j(map, "macros");
        String strN = str;
        for (Map.Entry entry : map.entrySet()) {
            strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strN;
    }
}
