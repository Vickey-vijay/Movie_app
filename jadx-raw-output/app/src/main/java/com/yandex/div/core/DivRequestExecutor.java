package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;

/* JADX INFO: compiled from: DivRequestExecutor.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface DivRequestExecutor {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public interface Callback {
    }

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    LoadReference execute(Request request, Callback callback);

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Header {
        private final String name;
        private final String value;

        public Header(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Request {
        private final String body;
        private final List<Header> headers;
        private final String method;
        private final Uri url;

        public Request(Uri uri, String str, List<Header> list, String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }
    }
}
