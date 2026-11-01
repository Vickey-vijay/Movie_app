package yads;

import android.net.Uri;
import java.util.Map;
import yads.mq0;
import yads.rq0;

/* JADX INFO: loaded from: classes6.dex */
public interface rq0 {
    static /* synthetic */ mq0[] lambda$static$0() {
        return new mq0[0];
    }

    mq0[] createExtractors();

    static {
        new rq0() { // from class: cp.r9
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return rq0.lambda$static$0();
            }
        };
    }

    default mq0[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }
}
