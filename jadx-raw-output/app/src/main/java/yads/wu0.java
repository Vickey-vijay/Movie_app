package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class wu0 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wu0 f84315b = new wu0();

    public wu0() {
        super(1);
    }

    @Override // bk.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }
}
