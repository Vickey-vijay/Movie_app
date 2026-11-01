package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Fc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc(Exception exc) {
        super("Missing Headers", exc);
        ck.p.j(exc, "e");
    }
}
