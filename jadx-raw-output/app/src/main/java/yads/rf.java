package yads;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes11.dex */
public final class rf extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rf f82248b = new rf();

    public rf() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        return new Regex("^\"(.*)\"\\s+(.+?)?\\s*prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)$");
    }
}
