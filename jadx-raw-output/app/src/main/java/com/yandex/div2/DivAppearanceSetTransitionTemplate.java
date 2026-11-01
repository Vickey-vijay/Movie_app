package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceSetTransitionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivAppearanceSetTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceSetTransition> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46488b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransitionTemplate> f46489c = new bk.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceSetTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivAppearanceSetTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivAppearanceTransitionTemplate>> f46490a;

    /* JADX INFO: compiled from: DivAppearanceSetTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivAppearanceSetTransitionTemplate(Field<List<DivAppearanceTransitionTemplate>> field) {
        this.f46490a = field;
    }

    public /* synthetic */ DivAppearanceSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAppearanceSetTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivAppearanceSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
