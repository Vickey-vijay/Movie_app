package com.fyber.inneractive.sdk.mraid;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y {
    public abstract String a();

    public final String toString() {
        String strA = a();
        if (strA == null) {
            return "";
        }
        return strA.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
    }
}
