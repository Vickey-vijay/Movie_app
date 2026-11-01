package io.bidmachine.rendering.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck.p;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import lk.a0;
import lk.c;
import lk.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lio/bidmachine/rendering/utils/PrivacySheetParamsParser;", "", "", "json", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "parseJson", "typeName", "Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "a", "base64Png", "Landroid/graphics/Bitmap;", "b", "<init>", "()V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class PrivacySheetParamsParser {
    public static final PrivacySheetParamsParser INSTANCE = new PrivacySheetParamsParser();

    private PrivacySheetParamsParser() {
    }

    private final PrivacySheetParams.ActionType a(String typeName) {
        for (PrivacySheetParams.ActionType actionType : PrivacySheetParams.ActionType.values()) {
            if (x.E(actionType.name(), typeName, true)) {
                return actionType;
            }
        }
        return null;
    }

    private final Bitmap b(String base64Png) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            byte[] bytes = base64Png.getBytes(c.f63591b);
            p.i(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDecodeBase64$default = UtilsKt.decodeBase64$default(bytes, 0, 1, (Object) null);
            objM3458constructorimpl = Result.m3458constructorimpl(bArrDecodeBase64$default == null ? null : BitmapFactory.decodeByteArray(bArrDecodeBase64$default, 0, bArrDecodeBase64$default.length));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (Bitmap) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public static final PrivacySheetParams parseJson(String json) {
        Object objM3458constructorimpl;
        p.j(json, "json");
        PrivacySheetParamsParser privacySheetParamsParser = INSTANCE;
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = new JSONObject(json);
            String strOptString = jSONObject.optString("title");
            String strOptString2 = jSONObject.optString("subtitle");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            } else {
                p.i(jSONArrayOptJSONArray, "rootObject.optJSONArray(\"actions\") ?: JSONArray()");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                String strOptString3 = jSONObject2.optString("type");
                p.i(strOptString3, "actionObject.optString(\"type\")");
                PrivacySheetParams.ActionType actionTypeA = privacySheetParamsParser.a(strOptString3);
                if (actionTypeA != null) {
                    String strOptString4 = jSONObject2.optString("title");
                    String strOptString5 = jSONObject2.optString("data");
                    String strOptString6 = jSONObject2.optString("icon");
                    p.i(strOptString6, "it");
                    if (!(!a0.n0(strOptString6))) {
                        strOptString6 = null;
                    }
                    Bitmap bitmapB = strOptString6 != null ? privacySheetParamsParser.b(strOptString6) : null;
                    p.i(strOptString4, "actionTitle");
                    p.i(strOptString5, "data");
                    arrayList.add(new PrivacySheetParams.Action(actionTypeA, strOptString4, strOptString5, bitmapB));
                }
            }
            p.i(strOptString, "title");
            p.i(strOptString2, "subtitle");
            objM3458constructorimpl = Result.m3458constructorimpl(new PrivacySheetParams(strOptString, strOptString2, arrayList));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (PrivacySheetParams) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
