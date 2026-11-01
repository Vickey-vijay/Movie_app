package com.inmobi.media;

import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2726ab extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2726ab(String str) {
        super(str);
        ck.p.j(str, "message");
    }
}
