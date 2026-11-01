package yads;

import android.net.Uri;
import com.yandex.div2.DivExtension;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh0 f76677a;

    public /* synthetic */ di0() {
        this(new kh0());
    }

    public final ci0 a(oe.e2 e2Var) {
        Object objM3458constructorimpl;
        this.f76677a.getClass();
        DivExtension divExtensionA = kh0.a(e2Var, "click");
        if (divExtensionA == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = divExtensionA.f47096b;
            objM3458constructorimpl = Result.m3458constructorimpl(Uri.parse(jSONObject != null ? jSONObject.getString("url") : null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Uri uri = (Uri) objM3458constructorimpl;
        if (uri != null) {
            return new ci0(uri);
        }
        return null;
    }

    public di0(kh0 kh0Var) {
        this.f76677a = kh0Var;
    }
}
