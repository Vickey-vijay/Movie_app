package yads;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public abstract class g43 {
    public static final String a(String str) {
        return new Regex("[^a-zA-Z0-9._-]").replace(str, "_");
    }
}
