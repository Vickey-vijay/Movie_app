package yads;

import android.content.Context;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes11.dex */
public final class u3 extends wo {
    public final void a(Context context) {
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setDisplayZoomControls(false);
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new r3(context));
        setWebViewClient(new s3(context));
    }

    public u3(Context context) {
        super(context);
        a(context);
    }
}
