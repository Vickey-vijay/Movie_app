package yads;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final class qf extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qf f81843b = new qf();

    public qf() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        return new Regex("at\\s+([^\\(]+)\\(([^:]+):(\\d+)\\)");
    }
}
