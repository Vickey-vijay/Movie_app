package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivPivotTemplate implements JSONSerializable, JsonTemplate<DivPivot> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48412a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPivotTemplate> f48413b = new bk.p<ParsingEnvironment, JSONObject, DivPivotTemplate>() { // from class: com.yandex.div2.DivPivotTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPivotTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPivotTemplate.a.b(DivPivotTemplate.f48412a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivPivotTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivPivotTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().U5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class b extends DivPivotTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPivotFixedTemplate f48414c;

        public b(DivPivotFixedTemplate divPivotFixedTemplate) {
            super(null);
            this.f48414c = divPivotFixedTemplate;
        }

        public final DivPivotFixedTemplate b() {
            return this.f48414c;
        }
    }

    /* JADX INFO: compiled from: DivPivotTemplate.kt */
    public static final class c extends DivPivotTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPivotPercentageTemplate f48415c;

        public c(DivPivotPercentageTemplate divPivotPercentageTemplate) {
            super(null);
            this.f48415c = divPivotPercentageTemplate;
        }

        public final DivPivotPercentageTemplate b() {
            return this.f48415c;
        }
    }

    public DivPivotTemplate() {
    }

    public /* synthetic */ DivPivotTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "pivot-fixed";
        }
        if (this instanceof c) {
            return "pivot-percentage";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
