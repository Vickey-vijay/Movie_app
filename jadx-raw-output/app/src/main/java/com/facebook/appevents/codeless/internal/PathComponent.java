package com.facebook.appevents.codeless.internal;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PathComponent.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0003\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0010\u0010\u0005R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\r\u0010\u0005R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "className", "", "b", "I", "e", "()I", "index", "c", "d", "id", "h", "text", "g", "tag", InneractiveMediationDefs.GENDER_FEMALE, UnifiedMediationParams.KEY_DESCRIPTION, "hint", "matchBitmask", "Lorg/json/JSONObject;", "component", "<init>", "(Lorg/json/JSONObject;)V", "i", "MatchBitmaskType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class PathComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String className;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String text;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String tag;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String hint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int matchBitmask;

    /* JADX INFO: compiled from: PathComponent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", NativeAdContent.ViewTag.AD_DESCRIPTION, "HINT", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] matchBitmaskTypeArrValuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(matchBitmaskTypeArrValuesCustom, matchBitmaskTypeArrValuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }

        MatchBitmaskType(int i10) {
            this.value = i10;
        }
    }

    public PathComponent(JSONObject jSONObject) throws JSONException {
        p.j(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        p.i(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = jSONObject.optInt("index", -1);
        this.id = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        p.i(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.text = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        p.i(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.tag = strOptString2;
        String strOptString3 = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION);
        p.i(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        p.i(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.hint = strOptString4;
        this.matchBitmask = jSONObject.optInt("match_bitmask");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
