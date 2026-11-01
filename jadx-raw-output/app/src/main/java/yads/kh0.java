package yads;

import com.yandex.div2.DivExtension;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class kh0 {
    public static DivExtension a(oe.e2 e2Var, String str) {
        List<DivExtension> extensions = e2Var.getExtensions();
        if (extensions != null) {
            for (DivExtension divExtension : extensions) {
                if (ck.p.e(str, divExtension.f47095a)) {
                    return divExtension;
                }
            }
            return null;
        }
        return null;
    }
}
