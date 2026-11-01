package yads;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class nf extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nf f80671b = new nf();

    public nf() {
        super(0);
    }

    @Override // bk.a
    public final Object invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
