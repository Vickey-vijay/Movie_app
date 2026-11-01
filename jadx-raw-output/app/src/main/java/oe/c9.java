package oe;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivDownloadCallbacks;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSightAction.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface c9 {
    DivDownloadCallbacks a();

    Expression<String> b();

    Expression<Long> c();

    DivActionTyped d();

    String e();

    Expression<Uri> f();

    JSONObject getPayload();

    Expression<Uri> getUrl();

    Expression<Boolean> isEnabled();
}
