package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {
    public static FilterInputStream a(InputStream inputStream, boolean z10) {
        FilterInputStream bufferedInputStream;
        try {
            if (z10) {
                IAlog.a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                IAlog.a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    public static l a(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) throws b, q1 {
        try {
            l lVar = new l(filterInputStream, i10, str, map, str2);
            if (lVar.f16039a / 100 != 5) {
                return lVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(lVar.f16039a)));
        } catch (b e10) {
            IAlog.a("failed executing network request msg: %s", e10.getMessage());
            throw new b(e10);
        } catch (Exception e11) {
            IAlog.a("failed reading network response msg: %s", e11.getMessage());
            throw new q1(e11);
        }
    }
}
