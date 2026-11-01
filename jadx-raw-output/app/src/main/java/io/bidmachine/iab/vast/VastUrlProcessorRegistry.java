package io.bidmachine.iab.vast;

import android.os.Bundle;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.processor.url.ErrorCodeUrlProcessor;
import io.bidmachine.iab.vast.processor.url.UrlProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class VastUrlProcessorRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f59491a = new a();

    public interface OnUrlReadyCallback {
        void onUrlReady(@Nullable String str);
    }

    public class a extends ArrayList {
        public a() {
            add(new ErrorCodeUrlProcessor());
        }
    }

    @Nullable
    public static String processUrl(@Nullable String str, @Nullable Bundle bundle) {
        if (str == null) {
            return null;
        }
        Iterator it = f59491a.iterator();
        while (it.hasNext()) {
            str = ((UrlProcessor) it.next()).prepare(str, bundle);
        }
        return str;
    }

    public static void processUrls(@Nullable List<String> list, @Nullable Bundle bundle, @Nullable OnUrlReadyCallback onUrlReadyCallback) {
        if (list == null || list.isEmpty() || onUrlReadyCallback == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            onUrlReadyCallback.onUrlReady(processUrl(it.next(), bundle));
        }
    }

    public static void register(UrlProcessor urlProcessor) {
        f59491a.add(urlProcessor);
    }

    public static void unregister(UrlProcessor urlProcessor) {
        f59491a.remove(urlProcessor);
    }
}
