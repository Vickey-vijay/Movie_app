package com.bytedance.sdk.component.adexpress.yu;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class bly {

    public enum ouw {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        public String fkw;

        ouw(String str) {
            this.fkw = str;
        }
    }

    public static ouw ouw(String str) {
        ouw ouwVar = ouw.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        ouwVar = ouw.CSS;
                    } else if (path.endsWith(".js")) {
                        ouwVar = ouw.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        ouwVar = ouw.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return ouwVar;
    }
}
