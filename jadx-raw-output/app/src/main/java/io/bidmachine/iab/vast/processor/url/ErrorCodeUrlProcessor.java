package io.bidmachine.iab.vast.processor.url;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastRequest;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorCodeUrlProcessor implements UrlProcessor {
    @Override // io.bidmachine.iab.vast.processor.url.UrlProcessor
    @Nullable
    public String prepare(@Nullable String str, @Nullable Bundle bundle) {
        int i10;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey(VastRequest.PARAMS_ERROR_CODE) && (i10 = bundle.getInt(VastRequest.PARAMS_ERROR_CODE, -1)) > -1) {
            VastLog.d("VastAdUrlProcessor", "Before prepare url: %s", str);
            if (str.contains("[ERRORCODE]")) {
                str = str.replace("[ERRORCODE]", String.valueOf(i10));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i10));
            }
            VastLog.d("VastAdUrlProcessor", "After prepare url: %s", str);
        }
        return str;
    }
}
